package com.lom.lotsomobsentity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIControlledByPlayer;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.lom.lotsomobsinit.LotsOMobsItems;

public class EntityCamel extends EntityAnimal
{
	
	    private final EntityAIControlledByPlayer aiControlledByPlayer;
	    private boolean field_70279_a;
	    private double field_70276_b;

	    /**
	     * Returns the Y offset from the entity's position for any entity riding this one.
	     */
	    public double getMountedYOffset()
	    {
	        return (double)this.height;
	    }

	    public void updateRiderPosition()
	    {
	        if (this.riddenByEntity != null)
	        {
	            this.riddenByEntity.setPosition(this.posX, this.posY + this.getMountedYOffset() + this.riddenByEntity.getYOffset(), this.posZ);
	        }
	    }

	    /**
	     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
	     */
	    public boolean interact(EntityPlayer var1)
	    {/*
	    	ItemStack itemstack = var1.getCurrentEquippedItem();
	    	if (itemstack != null && itemstack.itemID == LotsOMobsItems.CamelBag.itemID)
	    	{
	    	if (!worldObj.isRemote)
	    	{
	    	EntityCamelWBag entitycamelwbag = new EntityCamelWBag(worldObj);
	    	entitycamelwbag.setLocationAndAngles(posX, posY, posZ, rotationYaw, rotationPitch);
	    	worldObj.spawnEntityInWorld(entitycamelwbag);
	    	setDead();
	    	itemstack.stackSize--;
	    	}
	    	return true;
	    	}*/ if (this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlayer && this.riddenByEntity != var1)
	        {
	            return true;
	        }
	        else
	        {
	            if (!this.worldObj.isRemote)
	            {
	                var1.mountEntity(this);
	          //      ModLoader.getMinecraftInstance().thePlayer.addChatMessage("You are now riding a Camel"); 
	            }

	            return true;
	        }
	    }
	     

	    public EntityCamel(World var1)
	    {
	        super(var1);
	        this.setSize(1F, 2F);
	        this.tasks.addTask(0, new EntityAISwimming(this));
	        this.tasks.addTask(1, new EntityAIPanic(this, 0.38F));
	        this.tasks.addTask(2, new EntityAIMate(this, 0.2F));
	        this.tasks.addTask(4, new EntityAITempt(this, 0.3F, LotsOMobsItems.CactiOnAStick, true));
	        this.tasks.addTask(4, new EntityAITempt(this, 0.3F, Items.wheat, false));
	        this.tasks.addTask(5, new EntityAIWander(this, 0.2F));
	        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
	        this.tasks.addTask(7, new EntityAILookIdle(this));
	        this.tasks.addTask(8, this.aiControlledByPlayer = new EntityAIControlledByPlayer(this, 16.0F));
	        this.tasks.addTask(10, new EntityAITempt(this, 0.3F, LotsOMobsItems.CactiOnAStick, false));
	        this.field_70279_a = true;
	        this.field_70276_b = 0.07D;
	        this.height = 1.2F;
	    }

	    /**
	     * returns true if all the conditions for steering the entity are met. For pigs, this is true if it is being ridden
	     * by a player and the player is holding a carrot-on-a-stick
	     */
	    public boolean canBeSteered()
	    {
	        ItemStack var1 = ((EntityPlayer)this.riddenByEntity).getHeldItem();
	        return var1 != null && var1.getItem() == LotsOMobsItems.CactiOnAStick;
	    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }

    protected void func_110147_ax()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.20000000298023224D);
    }
    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "lom:camel";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "lom:camel";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "lom:camel";
    }

    /**
     * Returns the volume for the sounds this mob makes.
     */
    protected float getSoundVolume()
    {
        return 0.4F;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected Item getDropItem()
    {
        return Items.leather;
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
            this.dropItem( Items.leather, 1);
        }

        var3 = this.rand.nextInt(3) + 1 + this.rand.nextInt(1 + par2);

        for (var4 = 0; var4 < var3; ++var4)
        {
            if (this.isBurning())
            {
                this.dropItem(LotsOMobsItems.CamelMeat, 1);
            }
            else
            {
                this.dropItem(LotsOMobsItems.RawCamel, 1);
            }
        }
    }


	
    /**
     * Return the AI task for player control.
     */
    public EntityAIControlledByPlayer getAIControlledByPlayer()
    {
        return this.aiControlledByPlayer;
    }

    /**
     * This function is used when two same-species animals in 'love mode' breed to generate the new baby animal.
     */
    public EntityCamel spawnBabyAnimal(EntityAgeable par1EntityAgeable)
    {
        return new EntityCamel(this.worldObj);
    }

    public EntityAgeable createChild(EntityAgeable par1EntityAgeable)
    {
        return this.spawnBabyAnimal(par1EntityAgeable);
    }

}
