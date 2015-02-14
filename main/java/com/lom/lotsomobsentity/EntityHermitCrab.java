package com.lom.lotsomobsentity;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityHermitCrab extends EntityMobBase
{
    private static final UUID field_110189_bq = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
    private static final AttributeModifier field_110190_br = (new AttributeModifier(field_110189_bq, "Attacking speed boost", 0.45D, 0)).setSaved(false);

    /** Above zero if this PigZombie is Angry. */
    private int angerLevel;

    /** A random delay until this PigZombie next makes a sound. */
    private int randomSoundDelay;
    private Entity field_110191_bu;

    public EntityHermitCrab(World par1World)
    {
        super(par1World);
        this.isImmuneToFire = false;
        this.setSize(0.5F, 0.5F);

    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1.0D);
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    protected boolean isAIEnabled()
    {
        return false;
    }
    /**
     * Returns the volume for the sounds this mob makes.
     */
    protected float getSoundVolume()
    {
        return 0.0F;
    }


    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        if (this.field_110191_bu != this.entityToAttack && !this.worldObj.isRemote)
        {
            IAttributeInstance attributeinstance = this.getEntityAttribute(SharedMonsterAttributes.movementSpeed);
            attributeinstance.removeModifier(field_110190_br);

            if (this.entityToAttack != null)
            {
                attributeinstance.applyModifier(field_110190_br);
            }
        }

        this.field_110191_bu = this.entityToAttack;

        if (this.randomSoundDelay > 0 && --this.randomSoundDelay == 0)
        {
            this.playSound("mob.zombiepig.zpigangry", this.getSoundVolume() * 2.0F, ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F) * 1.8F);
        }
        
    	Random rand = new Random();
    	int a = rand.nextInt(5000)+1;
    	
    	if(a==10)
    	{
        	if (!worldObj.isRemote)
        	{
        	EntityShell entityShell = new EntityShell(worldObj);
        	entityShell.setLocationAndAngles(posX, posY, posZ, rotationYaw, rotationPitch);
        	worldObj.spawnEntityInWorld(entityShell);
        	setDead();
        	}
    	}

        super.onUpdate();
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeEntityToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setShort("Anger", (short)this.angerLevel);
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.readEntityFromNBT(par1NBTTagCompound);
        this.angerLevel = par1NBTTagCompound.getShort("Anger");
    }

    /**
     * Finds the closest player within 16 blocks to attack, or null if this Entity isn't interested in attacking
     * (Animals, Spiders at day, peaceful PigZombies).
     */
    protected Entity findPlayerToAttack()
    {
        return this.angerLevel == 0 ? null : super.findPlayerToAttack();
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource par1DamageSource, float par2)
    {
        if (this.isEntityInvulnerable())
        {
            return false;
        }
        else
        {
        	Random rand = new Random();
        	int h = rand.nextInt(20);
        	
        	if(h>15)
        	{
            	if (!worldObj.isRemote)
            	{
            		if(this.onGround == true)
            		{
                    	EntityShell entityShell = new EntityShell(worldObj);
                    	entityShell.setLocationAndAngles(posX, posY, posZ, rotationYaw, rotationPitch);
                    	worldObj.spawnEntityInWorld(entityShell);
                    	setDead();
            		}

            	}
        	}
        	else
        	{
            Entity entity = par1DamageSource.getEntity();

            if (entity instanceof EntityPlayer)
            {
                List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(32.0D, 32.0D, 32.0D));

                for (int i = 0; i < list.size(); ++i)
                {
                    Entity entity1 = (Entity)list.get(i);

                    if (entity1 instanceof EntityHermitCrab)
                    {
                        EntityHermitCrab entitypigzombie = (EntityHermitCrab)entity1;
                        entitypigzombie.becomeAngryAt(entity);
                    }
                }

                this.becomeAngryAt(entity);
            }
        	}
            return super.attackEntityFrom(par1DamageSource, par2);
        }
    }

    /**
     * Causes this PigZombie to become angry at the supplied Entity (which will be a player).
     */
    private void becomeAngryAt(Entity par1Entity)
    {
        this.entityToAttack = par1Entity;
        this.angerLevel = 400 + this.rand.nextInt(400);
        this.randomSoundDelay = this.rand.nextInt(40);
    }

    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    protected void dropFewItems(boolean par1, int par2)
    {

        
            this.dropItem(Items.fish, 2);
        
    }

    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */
    public boolean interact(EntityPlayer par1EntityPlayer)
    {
        return false;
    }


    
    public boolean canBreatheUnderwater()
    {
        return true;
    }
}