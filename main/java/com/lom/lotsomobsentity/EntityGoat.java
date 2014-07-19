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
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import com.lom.lotsomobsinit.LotsOMobsItems;

public class EntityGoat extends EntityAnimal
{
	public boolean hasFur;
    public EntityGoat(World par1World)
    {
        super(par1World);
        this.setSize(0.4F, .3F);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
        this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(3, new EntityAITempt(this, 1.25D, Items.wheat, false));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
        this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
    }
    public void setHasFur(boolean hasHide){
	this.hasFur=hasHide;
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
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(8.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
    }
    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound nbttag)
    {
        super.writeEntityToNBT(nbttag);
        nbttag.setBoolean("Hide", hasFur);
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound nbttag)
    {
        super.readEntityFromNBT(nbttag);
        nbttag.getBoolean("Hide");
    }
    
    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
    	int G = rand.nextInt(999);
    	if(G == 1)
    	{
    		this.setHasFur(true);
    	}
        super.onLivingUpdate();
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.sheep.say";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.sheep.say";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.sheep.say";
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
       //     this.dropItem(LotsOMobsItems.DeerFur.itemID, 1);
    }

    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */
    public boolean interact(EntityPlayer par1EntityPlayer)
    {
    	System.out.println(this.hasFur);
        ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();

        if (var2 != null && var2.getItem() == Items.bucket)
        {
            if (--var2.stackSize <= 0)
            {
                par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, new ItemStack(Items.milk_bucket));
            }
            else if (!par1EntityPlayer.inventory.addItemStackToInventory(new ItemStack(Items.milk_bucket)))
            {
                par1EntityPlayer.dropItem(Items.bucket, 1);
            }

            return true;
        }
    	
    	if(this.hasFur == true)
    	{
            if (var2 != null && var2.getItem() == Items.shears)
            {
            	if(worldObj.isRemote == false)
            	{
            		if(this.isChild()==true)
            		{
            		entityDropItem(new ItemStack(LotsOMobsItems.AngoraWool, 1), 1);
            		}
            		else
            		{
            			int A = rand.nextInt(3)+1;
            			entityDropItem(new ItemStack(LotsOMobsItems.AngoraWool, A), 1);
            		} 
            	}
                this.worldObj.playSoundAtEntity(this, "mob.sheep.say", 1.0F, 1.0F);
                this.worldObj.playSoundAtEntity(this, "mob.sheep.shear", 1.2F, 1.2F);
                this.worldObj.playSoundAtEntity(this, "mob.sheep.shear", 1.2F, 1.2F);
                this.worldObj.playSoundAtEntity(this, "mob.sheep.shear", 1.2F, 1.2F);
            	
                this.setHasFur(false);
            	var2.damageItem(1, par1EntityPlayer);
            	
                return true;
                
            }
            else
            {
            	return super.interact(par1EntityPlayer);
            }
    	}
    
		return false;
    }
    

    /**
     * This function is used when two same-species animals in 'love mode' breed to generate the new baby animal.
     */
    public EntityGoat spawnBabyAnimal(EntityAgeable par1EntityAgeable)
    {
        return new EntityGoat(this.worldObj);
    }

    public EntityAgeable createChild(EntityAgeable par1EntityAgeable)
    {
        return this.spawnBabyAnimal(par1EntityAgeable);
    }
}
