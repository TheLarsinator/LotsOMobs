package com.lom.lotsomobsentity;

import java.util.Random;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.world.World;

public class EntityShell extends EntityAnimal
{
    public EntityShell(World par1World)
    {
        super(par1World);
        this.setSize(0.5F, 0.5F);
        this.getNavigator().setAvoidsWater(true);
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(80.0D);
        if(this.onGround == true)
        {
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.0D);
        }
        else
        {
            this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.0D);
        }
        //this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(5.0D);
    }
        
    /**
     * Returns the volume for the sounds this mob makes.
     */
    protected float getSoundVolume()
    {
        return 0.4F;
    }

    protected void dropFewItems(boolean par1, int par2)
    {

        
            this.dropItem(Items.fish, 2);
        
    }

    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */
    public boolean interact(EntityPlayer par1EntityPlayer)
    {
    	if (!worldObj.isRemote)
    	{
    	EntityHermitCrab entityHermitCrab = new EntityHermitCrab(worldObj);
    	entityHermitCrab.setLocationAndAngles(posX, posY, posZ, rotationYaw, rotationPitch);
    	worldObj.spawnEntityInWorld(entityHermitCrab);
    	setDead();
    	}
    	return true;
    }
    
    public void onLivingUpdate()
    {
    	Random rand = new Random();
    	int a = rand.nextInt(500)+1;
    	
    	if(a==10)
    	{
        	if (!worldObj.isRemote)
        	{
        	EntityHermitCrab entityHermitCrab = new EntityHermitCrab(worldObj);
        	entityHermitCrab.setLocationAndAngles(posX, posY, posZ, rotationYaw, rotationPitch);
        	worldObj.spawnEntityInWorld(entityHermitCrab);
        	setDead();
        	}
    	}
    }

    /**
     * This function is used when two same-species animals in 'love mode' breed to generate the new baby animal.
     */
    public EntityShell spawnBabyAnimal(EntityAgeable par1EntityAgeable)
    {
        return null;
    }

    public EntityAgeable createChild(EntityAgeable par1EntityAgeable)
    {
        return null;
    }
    
    public boolean canBreatheUnderwater()
    {
        return true;
    }
}
