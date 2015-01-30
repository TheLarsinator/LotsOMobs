package com.lom.lotsomobsentity;

import com.lom.lotsomobsinit.LotsOMobsItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBeg;
import net.minecraft.entity.ai.EntityAIControlledByPlayer;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIOwnerHurtByTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITargetNonTamed;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityTriceratops extends EntityTameable
{
    private float field_70926_e;
    private float field_70924_f;
    /** true is the wolf is wet else false */
    private boolean isShaking;
    private boolean field_70928_h;
    /**
     * This time increases while wolf is shaking and emitting water particles.
     */
    private float timeWolfIsShaking;
    private float prevTimeWolfIsShaking;
    private static final String __OBFID = "CL_00001654";
    
    /** AI task for player control. */
    private final EntityAIControlledByPlayer aiControlledByPlayer;
	private float SitLevel;

    public EntityTriceratops(World p_i1696_1_)
    {
        super(p_i1696_1_);
        this.setSize(2.6F, 2.8F);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(2, this.aiSit);
        this.tasks.addTask(3, new EntityAILeapAtTarget(this, 0.4F));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, 1.0D, true));
        this.tasks.addTask(5, new EntityAIFollowOwner(this, 1.0D, 10.0F, 2.0F));
        this.tasks.addTask(6, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(2, this.aiControlledByPlayer = new EntityAIControlledByPlayer(this, 0.5F));
        this.tasks.addTask(4, new EntityAITempt(this, 1.2D, LotsOMobsItems.CactiOnAStick, false));
        this.tasks.addTask(4, new EntityAITempt(this, 1.2D, Items.carrot, false));
        this.tasks.addTask(9, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIOwnerHurtByTarget(this));
        this.targetTasks.addTask(2, new EntityAIOwnerHurtTarget(this));
        this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(4, new EntityAITargetNonTamed(this, EntitySheep.class, 200, false));
        this.setTamed(false);
        this.SitLevel = 3.3F;
    }
    public void updateRiderPosition()
    {
        if (this.riddenByEntity instanceof EntityPlayer)
        {
            this.riddenByEntity.setPosition(this.posX, this.posY + this.SitLevel + this.riddenByEntity.getYOffset(), this.posZ);
        }
    }
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.30000001192092896D);

        if (this.isTamed())
        {
            this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200.0D);
        }
        else
        {
            this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(80.0D);
        }
    }
    
    protected void updateAITasks()
    {
        super.updateAITasks();
    }

    /**
     * returns true if all the conditions for steering the entity are met. For pigs, this is true if it is being ridden
     * by a player and the player is holding a carrot-on-a-stick
     */
    public boolean canBeSteered()
    {
        ItemStack itemstack = ((EntityPlayer)this.riddenByEntity).getHeldItem();
        return itemstack != null && itemstack.getItem() == LotsOMobsItems.CactiOnAStick;
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }

    /**
     * Sets the active target the Task system uses for tracking
     */
    public void setAttackTarget(EntityLivingBase p_70624_1_)
    {
        super.setAttackTarget(p_70624_1_);

        if (p_70624_1_ == null)
        {
            this.setAngry(false);
        }
        else if (!this.isTamed())
        {
            this.setAngry(true);
        }
    }

    /**
     * main AI tick function, replaces updateEntityActionState
     */
    protected void updateAITick()
    {
        this.dataWatcher.updateObject(18, Float.valueOf(this.getHealth()));
    }

    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(18, new Float(this.getHealth()));
        this.dataWatcher.addObject(19, new Byte((byte)0));
        this.dataWatcher.addObject(20, new Byte((byte)BlockColored.func_150032_b(1)));
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound p_70014_1_)
    {
        super.writeEntityToNBT(p_70014_1_);
        p_70014_1_.setBoolean("Angry", this.isAngry());
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound p_70037_1_)
    {
        super.readEntityFromNBT(p_70037_1_);
        this.setAngry(p_70037_1_.getBoolean("Angry"));
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return this.isAngry() ? "lom:triceratops" : (this.rand.nextInt(3) == 0 ? (this.isTamed() && this.dataWatcher.getWatchableObjectFloat(18) < 10.0F ? "mob.wolf.whine" : "mob.wolf.panting") : "mob.wolf.bark");
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "lom:triceratops";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "lom:triceratops";
    }

    /**
     * Returns the volume for the sounds this mob makes.
     */
    protected float getSoundVolume()
    {
        return 0.4F;
    }

    protected Item getDropItem()
    {
        return Item.getItemById(-1);
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        super.onLivingUpdate();

        if (!this.worldObj.isRemote && this.isShaking && !this.field_70928_h && !this.hasPath() && this.onGround)
        {
            this.field_70928_h = true;
            this.timeWolfIsShaking = 0.0F;
            this.prevTimeWolfIsShaking = 0.0F;
            this.worldObj.setEntityState(this, (byte)8);
        }
    }

    public float getEyeHeight()
    {
        return this.height * 0.8F;
    }

    /**
     * The speed it takes to move the entityliving's rotationPitch through the faceEntity method. This is only currently
     * use in wolves.
     */
    public int getVerticalFaceSpeed()
    {
        return this.isSitting() ? 20 : super.getVerticalFaceSpeed();
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_)
    {
        if (this.isEntityInvulnerable())
        {
            return false;
        }
        else
        {
            Entity entity = p_70097_1_.getEntity();
            this.aiSit.setSitting(false);

            if (entity != null && !(entity instanceof EntityPlayer) && !(entity instanceof EntityArrow))
            {
                p_70097_2_ = (p_70097_2_ + 1.0F) / 2.0F;
            }

            return super.attackEntityFrom(p_70097_1_, p_70097_2_);
        }
    }

    public boolean attackEntityAsMob(Entity p_70652_1_)
    {
        int i = this.isTamed() ? 25 : 20;
        return p_70652_1_.attackEntityFrom(DamageSource.causeMobDamage(this), (float)i);
    }

    public void setTamed(boolean p_70903_1_)
    {
        super.setTamed(p_70903_1_);

        if (p_70903_1_)
        {
            this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200.0D);
        }
        else
        {
            this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(80.0D);
        }
    }

    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */
    public boolean interact(EntityPlayer p_70085_1_)
    {
        ItemStack itemstack = p_70085_1_.inventory.getCurrentItem();

        if (this.isTamed())
        {
            if (itemstack != null)
            {
                if (itemstack.getItem() instanceof ItemFood)
                {
                    ItemFood itemfood = (ItemFood)itemstack.getItem();

                    if (itemfood.isWolfsFavoriteMeat() && this.dataWatcher.getWatchableObjectFloat(18) < 20.0F)
                    {
                        if (!p_70085_1_.capabilities.isCreativeMode)
                        {
                            --itemstack.stackSize;
                        }

                        this.heal((float)itemfood.func_150905_g(itemstack));

                        if (itemstack.stackSize <= 0)
                        {
                            p_70085_1_.inventory.setInventorySlotContents(p_70085_1_.inventory.currentItem, (ItemStack)null);
                        }

                        return true;
                    }
                }
                else if (itemstack.getItem() != null && itemstack.getItem() == LotsOMobsItems.CactiOnAStick && !this.worldObj.isRemote && (this.riddenByEntity == null || this.riddenByEntity == p_70085_1_) && !this.isSitting())
                {
                    p_70085_1_.mountEntity(this);
                    return true;
                }

                else if ((this.func_152114_e(p_70085_1_) && !this.worldObj.isRemote && itemstack.getItem() != Items.carrot) || (this.func_152114_e(p_70085_1_) && !this.worldObj.isRemote && itemstack.getItem() == null))
            {
                this.aiSit.setSitting(!this.isSitting());
                this.isJumping = false;
                this.setPathToEntity((PathEntity)null);
                this.setTarget((Entity)null);
                this.setAttackTarget((EntityLivingBase)null);
            }
            }
        }
        else if (itemstack != null && itemstack.getItem() == Items.carrot && !this.isAngry())
        {
            if (!p_70085_1_.capabilities.isCreativeMode)
            {
                --itemstack.stackSize;
            }

            if (itemstack.stackSize <= 0)
            {
                p_70085_1_.inventory.setInventorySlotContents(p_70085_1_.inventory.currentItem, (ItemStack)null);
            }

            if (!this.worldObj.isRemote)
            {
                if (this.rand.nextInt(3) == 0)
                {
                    this.setTamed(true);
                    this.setPathToEntity((PathEntity)null);
                    this.setAttackTarget((EntityLivingBase)null);
                    this.aiSit.setSitting(true);
                    this.setHealth(20.0F);
                    this.func_152115_b(p_70085_1_.getUniqueID().toString());
                    this.playTameEffect(true);
                    this.worldObj.setEntityState(this, (byte)7);
                }
                else
                {
                    this.playTameEffect(false);
                    this.worldObj.setEntityState(this, (byte)6);
                }
            }

            return true;
        }
        else
        {
        	return false;
        }

        return super.interact(p_70085_1_);
    }

    @SideOnly(Side.CLIENT)
    public void handleHealthUpdate(byte p_70103_1_)
    {
        if (p_70103_1_ == 8)
        {
            this.field_70928_h = true;
            this.timeWolfIsShaking = 0.0F;
            this.prevTimeWolfIsShaking = 0.0F;
        }
        else
        {
            super.handleHealthUpdate(p_70103_1_);
        }
    }

    @SideOnly(Side.CLIENT)
    public float getTailRotation()
    {
        return this.isAngry() ? 1.5393804F : (this.isTamed() ? (0.55F - (20.0F - this.dataWatcher.getWatchableObjectFloat(18)) * 0.02F) * (float)Math.PI : ((float)Math.PI / 5F));
    }

    /**
     * Will return how many at most can spawn in a chunk at once.
     */
    public int getMaxSpawnedInChunk()
    {
        return 8;
    }

    /**
     * Determines whether this wolf is angry or not.
     */
    public boolean isAngry()
    {
        return (this.dataWatcher.getWatchableObjectByte(16) & 2) != 0;
    }

    /**
     * Sets whether this wolf is angry or not.
     */
    public void setAngry(boolean p_70916_1_)
    {
        byte b0 = this.dataWatcher.getWatchableObjectByte(16);

        if (p_70916_1_)
        {
            this.dataWatcher.updateObject(16, Byte.valueOf((byte)(b0 | 2)));
        }
        else
        {
            this.dataWatcher.updateObject(16, Byte.valueOf((byte)(b0 & -3)));
        }
    }

    public EntityTriceratops createChild(EntityAgeable p_90011_1_)
    {
        EntityTriceratops EntityTriceratops = new EntityTriceratops(this.worldObj);
        String s = this.func_152113_b();

        if (s != null && s.trim().length() > 0)
        {
        	EntityTriceratops.func_152115_b(s);
        	EntityTriceratops.setTamed(true);
        }

        return EntityTriceratops;
    }

    public void func_70918_i(boolean p_70918_1_)
    {
        if (p_70918_1_)
        {
            this.dataWatcher.updateObject(19, Byte.valueOf((byte)1));
        }
        else
        {
            this.dataWatcher.updateObject(19, Byte.valueOf((byte)0));
        }
    }

    /**
     * Returns true if the mob is currently able to mate with the specified mob.
     */
    public boolean canMateWith(EntityAnimal p_70878_1_)
    {
        if (p_70878_1_ == this)
        {
            return false;
        }
        else if (!this.isTamed())
        {
            return false;
        }
        else if (!(p_70878_1_ instanceof EntityTriceratops))
        {
            return false;
        }
        else
        {
            EntityTriceratops EntityTriceratops = (EntityTriceratops)p_70878_1_;
            return !EntityTriceratops.isTamed() ? false : (EntityTriceratops.isSitting() ? false : this.isInLove() && EntityTriceratops.isInLove());
        }
    }

    public boolean func_70922_bv()
    {
        return this.dataWatcher.getWatchableObjectByte(19) == 1;
    }

    /**
     * Determines if an entity can be despawned, used on idle far away entities
     */
    protected boolean canDespawn()
    {
        return !this.isTamed() && this.ticksExisted > 2400;
    }
    
    /**
     * Return the AI task for player control.
     */
    public EntityAIControlledByPlayer getAIControlledByPlayer()
    {
        return this.aiControlledByPlayer;
    }

	public float spiderScaleAmount() {
		// TODO Auto-generated method stub
		return 1.5F;
	}

}