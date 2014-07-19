package com.lom.lotsomobsentity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.lom.lotsomobsai.EntityAIHop;
import com.lom.lotsomobsinit.LotsOMobsItems;

public class EntityPDFrog extends EntityAgeableMob implements IMob {
	public float field_70813_a;
	public float field_70811_b;
	public float field_70812_c;
	public int textureID;
	public int poisonduration;
	public int size;
	/** the time between each jump of the slime */
	private int slimeJumpDelay = 0;

	public EntityPDFrog(World par1World) {
		super(par1World);
		textureID = rand.nextInt(3);
		poisonduration = rand.nextInt(7) + 3;
		size = (rand.nextInt(3));
		int var2 = 1 << this.rand.nextInt(3);
		this.yOffset = 0.0F;
		this.slimeJumpDelay = this.rand.nextInt(20) + 10;
		this.setSlimeSize(var2);
		this.tasks.addTask(2, new EntityAIMate(this, var2));
		this.tasks.addTask(3, new EntityAITempt(this, 0.25F,
				Items.carrot, false));
        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityFly.class, 0.2D, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityFly.class, 10, true));
        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityFireFly.class, 0.2D, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityFireFly.class, 10, true));
		this.tasks.addTask(4, new EntityAIHop(this, 1.0f, 40, true));
	}

	public boolean isAIEnabled() {
		return true;
	}

	protected void entityInit() {
		super.entityInit();
		this.dataWatcher.addObject(16, new Byte((byte) 1));
	}

	protected void setSlimeSize(int par1) {
		this.dataWatcher.updateObject(16, new Byte((byte) par1));
		this.setSize(0.7F, 0.5F);
		this.setPosition(this.posX, this.posY, this.posZ);
		this.experienceValue = par1;
	}

	protected void func_110147_ax() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(4.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.20000000298023224D);
	}

	/**
	 * Gets the amount of time the slime needs to wait between jumps.
	 */
	protected int getJumpDelay() {
		return this.rand.nextInt(20) + 10;
	}

	protected EntityPDFrog createInstance() {
		return new EntityPDFrog(this.worldObj);
	}

	protected String getLivingSound() {
		return "lom:PDFrog";
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	protected String getHurtSound() {
		return "lom:PDFrog";
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	protected String getDeathSound() {
		return "lom:PDFrog";
	}

    /**
     * Drop 0-2 items of this living's type
     */
    protected void dropFewItems(boolean par1, int par2)
    {
        int var3 = this.rand.nextInt(3) + this.rand.nextInt(1 + par2);
        int var4;

        for (var4 = 0; var4 < var3; ++var4)
        {
            this.dropItem(Items.slime_ball, 1);
        }

        var3 = this.rand.nextInt(3) + 1 + this.rand.nextInt(1 + par2);

        for (var4 = 0; var4 < var3; ++var4)
        {
            if (this.isBurning())
            {
                this.dropItem(LotsOMobsItems.CookedFrog, 1);
            }
            else
            {
                this.dropItem(LotsOMobsItems.RawFrog, 1);
            }
        }
    }

	/**
	 * Returns the volume for the sounds this mob makes.
	 */
	protected float getSoundVolume() {
		return 0.4F;
	}

	/**
	 * The speed it takes to move the entityliving's rotationPitch through the
	 * faceEntity method. This is only currently use in wolves.
	 */
	public int getVerticalFaceSpeed() {
		return 0;
	}

	public int getSlimeSize() {
		return this.dataWatcher.getWatchableObjectByte(16);
	}

	protected void updateEntityActionState() {
		this.despawnEntity();
		EntityPlayer var1 = this.worldObj.getClosestVulnerablePlayerToEntity(
				this, 16.0D);

		if (var1 != null) {
			this.faceEntity(var1, 10.0F, 20.0F);
		}

		if (this.onGround && this.slimeJumpDelay-- <= 0) {
			this.slimeJumpDelay = this.getJumpDelay();

			if (var1 != null) {
				this.slimeJumpDelay /= 3;
			}

			this.isJumping = true;

			this.moveStrafing = 1.0F - this.rand.nextFloat() * 2.0F;
			this.moveForward = (float) (1 * this.getSlimeSize());
		} else {
			this.isJumping = false;

			if (this.onGround) {
				this.moveStrafing = this.moveForward = 0.0F;
			}
		}
	}

	/**
	 * This function is used when two same-species animals in 'love mode' breed
	 * to generate the new baby animal.
	 */
	public EntityPDFrog spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
		return new EntityPDFrog(this.worldObj);
	}

	public EntityAgeable createChild(EntityAgeable par1EntityAgeable) {
		return this.spawnBabyAnimal(par1EntityAgeable);
	}

	/**
	 * Checks if the parameter is an item which this animal can be fed to breed
	 * it (wheat, carrots or seeds depending on the animal type)
	 */
	public boolean isBreedingItem(ItemStack par1ItemStack) {
		return par1ItemStack.getItem() == Items.carrot;
	}


    public float spiderScaleAmount()    
    {
    	switch(this.size)
    	{
    	case 0:
    	return 0.6F;
    	case 1:
    	return 0.4F;
    	case 2:
    	return 0.5F;
    	default:
    	return 0.4F;
    	}
    }
    public void onCollideWithPlayer(EntityPlayer par1EntityPlayer)
    {
    	(par1EntityPlayer).addPotionEffect(new PotionEffect(Potion.poison.id, this.poisonduration * 20, 0));
    }
}
