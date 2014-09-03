package com.lom.lotsomobsentity;

import java.util.Random;

import net.minecraft.block.BlockCrops;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class EntityMole extends EntityAnimal
{
    public EntityMole(World par1World)
    {
        super(par1World);
        this.setSize(1F, 1F);
        this.getNavigator().setAvoidsWater(true);
        float var2 = 0.25F;
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 0.38F));
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
    /**
     * main AI tick function, replaces updateEntityActionState
     */
    public void updateAITick()
    {
    	if(this.moveForward != 0 || this.moveStrafing != 0)
    	{
    	this.setSprinting(true);
    	}
    	else
    	{
    	this.setSprinting(false);
    	}
    }

    public void onLivingUpdate()
    {
        super.onLivingUpdate();
    	if((this.moveForward != 0 || this.moveStrafing != 0) && this.onGround && (this.worldObj.getBlock((int)this.posX,(int) this.posY - 1, (int)this.posZ) == Blocks.dirt || this.worldObj.getBlock((int)this.posX, (int)this.posY - 1, (int)this.posZ) == Blocks.grass || this.worldObj.getBlock((int)this.posX, (int)this.posY - 1, (int)this.posZ) == Blocks.sand))
    	{
        	if(!this.worldObj.isRemote)
        	{
            	EntityDirtPile entityDirtPile = new EntityDirtPile(worldObj);
            	entityDirtPile.setLocationAndAngles(posX, posY, posZ, rotationYaw, rotationPitch);
            	worldObj.spawnEntityInWorld(entityDirtPile);
        	}
    	}
        	if(worldObj.getBlock((int)this.posX, (int)this.posY - 1, (int)this.posZ) == Blocks.grass)
        	{
        		worldObj.setBlock((int)this.posX, (int)this.posY - 1, (int)this.posZ, Blocks.dirt);
        	}
        	
        	if(worldObj.getBlock((int)this.posX, (int)this.posY, (int)this.posZ) instanceof BlockCrops && new Random().nextInt(30) == 1)
        	{
        		worldObj.setBlockToAir((int)this.posX, (int)this.posY, (int)this.posZ);
        	}
    }

	protected void func_110147_ax()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(2.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.15D);
    }

    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, Byte.valueOf((byte)0));
    }
    /**
     * This function is used when two same-species animals in 'love mode' breed to generate the new baby animal.
     */
    public EntityMole spawnBabyAnimal(EntityAgeable par1EntityAgeable)
    {
        return new EntityMole(this.worldObj);
    }

    public EntityAgeable createChild(EntityAgeable par1EntityAgeable)
    {
   	    return this.spawnBabyAnimal(par1EntityAgeable);
    }

	public float spiderScaleAmount() {
		// TODO Auto-generated method stub
		return 1.1F;
	}
}
