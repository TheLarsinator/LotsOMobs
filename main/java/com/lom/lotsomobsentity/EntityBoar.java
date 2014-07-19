package com.lom.lotsomobsentity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.AchievementList;
import net.minecraft.world.World;

import com.lom.lotsomobsinit.LotsOMobsItems;

public class EntityBoar extends EntityAnimal
{
	
	
	public EntityBoar(World par1World)
	    {
	        super(par1World);
	        this.setSize(0.9F, 0.9F);
	        this.getNavigator().setAvoidsWater(true);
	        float var2 = 0.25F;
	        this.tasks.addTask(0, new EntityAISwimming(this));
	        this.tasks.addTask(1, new EntityAIPanic(this, 0.38F));
	        this.tasks.addTask(2, new EntityAIMate(this, var2));
	        this.tasks.addTask(3, new EntityAITempt(this, 0.25F, Items.carrot, false));
	        this.tasks.addTask(4, new EntityAIFollowParent(this, 0.28F));
	        this.tasks.addTask(5, new EntityAIWander(this, var2));
	        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
	        this.tasks.addTask(7, new EntityAILookIdle(this));
	    }

	    /**
	     * Returns true if the newer Entity AI code should be run
	     */
	    public boolean isAIEnabled()
	    {
	        return true;
	    }
	 /*   protected void dropRareDrop(int par1)
	    {
	        this.dropItem(LotsOMobsItems.BoarHead.blockID, 1);
	    }
*/
	    protected void func_110147_ax()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(13.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
	    }

	    protected void entityInit()
	    {
	        super.entityInit();
	        this.dataWatcher.addObject(16, Byte.valueOf((byte)0));
	    }

	    /**
	     * (abstract) Protected helper method to write subclass entity data to NBT.
	     */
	    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
	    {
	        super.writeEntityToNBT(par1NBTTagCompound);
	        par1NBTTagCompound.setBoolean("Saddle", this.getSaddled());
	    }

	    /**
	     * (abstract) Protected helper method to read subclass entity data from NBT.
	     */
	    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
	    {
	        super.readEntityFromNBT(par1NBTTagCompound);
	        this.setSaddled(par1NBTTagCompound.getBoolean("Saddle"));
	    }

	    /**
	     * Returns the sound this mob makes while it's alive.
	     */
	    protected String getLivingSound()
	    {
	        return "mob.pig.say";
	    }

	    /**
	     * Returns the sound this mob makes when it is hurt.
	     */
	    protected String getHurtSound()
	    {
	        return "mob.pig.say";
	    }

	    /**
	     * Returns the sound this mob makes on death.
	     */
	    protected String getDeathSound()
	    {
	        return "mob.pig.death";
	    }

	    /**
	     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
	     */
	    public boolean interact(EntityPlayer par1EntityPlayer)
	    {
	        if (super.interact(par1EntityPlayer))
	        {
	            return true;
	        }
	        else if (this.getSaddled() && !this.worldObj.isRemote && (this.riddenByEntity == null || this.riddenByEntity == par1EntityPlayer))
	        {
	            par1EntityPlayer.mountEntity(this);
	            return true;
	        }
	        else
	        {
	            return false;
	        }
	    }

	    /**
	     * Returns the item ID for the item the mob drops on death.
	     */
	    protected Item getDropItemId()
	    {
	        return this.isBurning() ? LotsOMobsItems.BoarMeat : LotsOMobsItems.RawBoar;
	    }

	    /**
	     * Drop 0-2 items of this living's type
	     */
	    protected void dropFewItems(boolean par1, int par2)
	    {
	        int var3 = this.rand.nextInt(3) + 1 + this.rand.nextInt(1 + par2);

	        for (int var4 = 0; var4 < var3; ++var4)
	        {
	            if (this.isBurning())
	            {
	                this.dropItem(LotsOMobsItems.BoarMeat, 1);
	            }
	            else
	            {
	                this.dropItem(LotsOMobsItems.RawBoar, 1);
	            }
	        }
	    }

	    /**
	     * Returns true if the pig is saddled.
	     */
	    public boolean getSaddled()
	    {
	        return (this.dataWatcher.getWatchableObjectByte(16) & 1) != 0;
	    }

	    /**
	     * Set or remove the saddle of the pig.
	     */
	    public void setSaddled(boolean par1)
	    {
	        if (par1)
	        {
	            this.dataWatcher.updateObject(16, Byte.valueOf((byte)1));
	        }
	        else
	        {
	            this.dataWatcher.updateObject(16, Byte.valueOf((byte)0));
	        }
	    }

	    /**
	     * Called when a lightning bolt hits the entity.
	     */
	    public void onStruckByLightning(EntityLightningBolt par1EntityLightningBolt)
	    {
	        if (!this.worldObj.isRemote)
	        {
	            EntityPigZombie var2 = new EntityPigZombie(this.worldObj);
	            var2.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
	            this.worldObj.spawnEntityInWorld(var2);
	            this.setDead();
	        }
	    }

	    /**
	     * Called when the mob is falling. Calculates and applies fall damage.
	     */
	    protected void fall(float par1)
	    {
	        super.fall(par1);

	        if (par1 > 5.0F && this.riddenByEntity instanceof EntityPlayer)
	        {
	            ((EntityPlayer)this.riddenByEntity).triggerAchievement(AchievementList.flyPig);
	        }
	    }

	    /**
	     * This function is used when two same-species animals in 'love mode' breed to generate the new baby animal.
	     */
	    public EntityBoar spawnBabyAnimal(EntityAgeable par1EntityAgeable)
	    {
	        return new EntityBoar(this.worldObj);
	    }

	    public EntityAgeable createChild(EntityAgeable par1EntityAgeable)
	    {
	   	    return this.spawnBabyAnimal(par1EntityAgeable);
	    }
	    public boolean isBreedingItem(ItemStack par1ItemStack)
	    {
	        return par1ItemStack.getItem() == Items.carrot;
	    }
	}



