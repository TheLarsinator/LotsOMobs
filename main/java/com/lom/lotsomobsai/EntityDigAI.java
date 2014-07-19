package com.lom.lotsomobsai;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityDigAI extends EntityAIBase
{
	    private EntityLiving theEntity;
	    private World theWorld;

	    /** A decrementing tick used for the sheep's head offset and animation. */
	    int eatGrassTick;

	    public EntityDigAI(EntityLiving par1EntityLiving)
	    {
	        this.theEntity = par1EntityLiving;
	        this.theWorld = par1EntityLiving.worldObj;
	        this.setMutexBits(7);
	    }

	    /**
	     * Returns whether the EntityAIBase should begin execution.
	     */
	    public boolean shouldExecute()
	    {
	        if (this.theEntity.getRNG().nextInt(this.theEntity.isChild() ? 50 : 1000) != 0)
	        {
	            return false;
	        }
	        else
	        {
	            int i = MathHelper.floor_double(this.theEntity.posX);
	            int j = MathHelper.floor_double(this.theEntity.posY);
	            int k = MathHelper.floor_double(this.theEntity.posZ);
	            return 
	            		this.theWorld.getBlock(i, j-1, k) == Blocks.grass ||
	            		this.theWorld.getBlock(i, j-1, k) == Blocks.sand||
	            		this.theWorld.getBlock(i, j-1, k) == Blocks.dirt||
	            		this.theWorld.getBlock(i, j, k+1) == Blocks.gravel||
	            		this.theWorld.getBlock(i, j, k-1) == Blocks.gravel||
	            		this.theWorld.getBlock(i+1, j, k) == Blocks.gravel||
	            		this.theWorld.getBlock(i-1, j, k) == Blocks.gravel;
	        }
	    }
	    /**
	     * Execute a one shot task or start executing a continuous task
	     */
	    public void startExecuting()
	    {
	        this.eatGrassTick = 2;
	        this.theWorld.setEntityState(this.theEntity, (byte)10);
	        this.theEntity.getNavigator().clearPathEntity();
	    }

	    /**
	     * Resets the task
	     */
	    public void resetTask()
	    {
	        this.eatGrassTick = 0;
	    }

	    /**
	     * Returns whether an in-progress EntityAIBase should continue executing
	     */
	    public boolean continueExecuting()
	    {
	        return this.eatGrassTick > 0;
	    }

	    public int getEatGrassTick()
	    {
	        return this.eatGrassTick;
	    }

	    /**
	     * Updates the task
	     */
	    public void updateTask()
	    {
	        this.eatGrassTick = Math.max(0, this.eatGrassTick - 1);

	        if (this.eatGrassTick == 0)
	        {
	            int i = MathHelper.floor_double(this.theEntity.posX);
	            int j = MathHelper.floor_double(this.theEntity.posY);
	            int k = MathHelper.floor_double(this.theEntity.posZ);

	            if (this.theWorld.getBlock(i, j-1, k) == Blocks.grass || this.theWorld.getBlock(i, j-1, k) == Blocks.dirt)
	            {
	            	if (this.theWorld.getBlock(i - 1, j-1, k) == Blocks.water)
	            	{
	                this.theWorld.setBlockToAir(i, j-1, k);
	            	}
	            	if (this.theWorld.getBlock(i + 1, j-1, k) == Blocks.water)
	            	{
	                this.theWorld.setBlockToAir(i, j-1, k);
	            	}
	            	if (this.theWorld.getBlock(i, j-1, k - 1) == Blocks.water)
	            	{
	                this.theWorld.setBlockToAir(i, j-1, k);
	            	}
	            	if (this.theWorld.getBlock(i, j-1, k + 1) == Blocks.water)
	            	{
	                this.theWorld.setBlockToAir(i, j-1, k);
	            	}
	            }
	            else if (this.theWorld.getBlock(i, j, k+1) == Blocks.gravel)
	            {
	                this.theWorld.setBlockToAir(i, j, k+1);
	                
	            }
	            else if (this.theWorld.getBlock(i, j, k-1) == Blocks.gravel)
	            {
	                this.theWorld.setBlockToAir(i, j, k-1);
	                
	            }
	            else if (this.theWorld.getBlock(i+1, j, k) == Blocks.gravel)
	            {
	                this.theWorld.setBlockToAir(i+1, j, k);
	                
	            }
	            else if (this.theWorld.getBlock(i-1, j, k) == Blocks.gravel)
	            {
	                this.theWorld.setBlockToAir(i-1, j, k);
	                
	            }
	            else if (this.theWorld.getBlock(i, j, k+1) == Blocks.sand)
	            {
	                this.theWorld.setBlockToAir(i, j, k+1);
	            }

	            
	        }
	    }
	}
