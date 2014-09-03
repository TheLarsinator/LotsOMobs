package com.lom.lotsomobsentity;

import java.util.Random;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityDirtPile extends EntityAnimal
{
	public static float size = 1F;
	
	public int counter;
    public EntityDirtPile(World par1World)
    {
        super(par1World);
        this.setSize(1F, 1F);
        this.getNavigator().setAvoidsWater(true);
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }
    
    
    public void readFromNBT(NBTTagCompound nbttag)
    {
        this.size = nbttag.getFloat("deer");
        this.counter = nbttag.getInteger("tid");
    }
 
    public void writeToNBT(NBTTagCompound nbttag)
    {
        nbttag.setInteger("tid", this.counter);      
        nbttag.setFloat("deer", this.size);          
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
    
    public void onLivingUpdate()
    {
    	counter = counter + 1;
    	
    	if(counter == 1)
    	{
    		size = 0.7F;
    	}
    	else if(counter == 2)
    	{
    		size = 0.6F;
    	}
    	else if(counter == 3)
    	{
    		size = 0.5F;
    	}
    	else if(counter == 4)
    	{
    		size = 0.3F;
    	}
    	else if(counter == 5)
    	{
    		size = 0.1F;
    	}
    	else if(counter == 6)
    	{
    		this.setDead();
    	}
    	
    }

    /**
     * This function is used when two same-species animals in 'love mode' breed to generate the new baby animal.
     */
    public EntityDirtPile spawnBabyAnimal(EntityAgeable par1EntityAgeable)
    {
        return null;
    }

    public EntityAgeable createChild(EntityAgeable par1EntityAgeable)
    {
        return null;
    }
    
    public boolean canBreatheUnderwater()
    {
        return false;
    }
}
