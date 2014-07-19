    package com.lom.lotsomobsentity;

    import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITargetNonTamed;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.lom.lotsomobsai.EntityDigAI;
import com.lom.lotsomobsinit.LotsOMobsItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

    public class EntityBullFrog extends EntityTameable
    {
        private int sheepTimer;
        public int digBlock;
    	
        private float field_70926_e;
        private float field_70924_f;

        /** true is the BullFrog is wet else false */
        private boolean isShaking;
        private boolean field_70928_h;

        /**
         * This time increases while BullFrog is shaking and emitting water particles.
         */
        private float timeBullFrogIsShaking;
        private float prevTimeBullFrogIsShaking;
        
        /** The dig AI task for this mob. */
        private EntityDigAI aiEatGrass = new EntityDigAI(this);
		public int textureID;

        public EntityBullFrog(World par1World)
        {
            super(par1World);
            this.textureID = rand.nextInt(5);
            this.setSize(0.6F, 0.8F);
            this.getNavigator().setAvoidsWater(true);
            this.tasks.addTask(0, new EntityAISwimming(this));
            this.tasks.addTask(2, this.aiSit);
            this.tasks.addTask(3, new EntityAILeapAtTarget(this, 0.4F));
            this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityFireFly.class, 1.0D, true));
            this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityFly.class, 1.0D, true));
            this.tasks.addTask(5, new EntityAIFollowOwner(this, 1.0D, 10.0F, 2.0F));
            this.tasks.addTask(6, new EntityAIMate(this, 1.0D));
            this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
            this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
            this.tasks.addTask(9, new EntityAILookIdle(this));
            this.targetTasks.addTask(4, new EntityAITargetNonTamed(this, EntityFly.class, 200, false));
            this.targetTasks.addTask(4, new EntityAITargetNonTamed(this, EntityFireFly.class, 200, false));
            this.tasks.addTask(1, this.aiEatGrass);
            this.setTamed(false);
        }
        
        protected void func_110147_ax()
        {
                super.applyEntityAttributes();
                if(this.isTamed())
                {
                    this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(8D);
                }
                else
                {
                    this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(5D);
                }
                this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.30000000298023224D);
        }

        /**
         * Returns true if the newer Entity AI code should be run
         */
        public boolean isAIEnabled()
        {
            return true;
        }

        protected void updateAITasks()
        {
            this.sheepTimer = this.aiEatGrass.getEatGrassTick();
            super.updateAITasks();
        }
        

        /**
         * Sets the active target the Task system uses for tracking
         */
        public void setAttackTarget(EntityLivingBase par1EntityLivingBase)
        {
            super.setAttackTarget(par1EntityLivingBase);

            if (par1EntityLivingBase == null)
            {
                this.setAngry(false);
            }
            else if (!this.isTamed())
            {
                this.setAngry(true);
            }
        }


        /**
         * Plays step sound at given x, y, z for the entity
         */
        protected void playStepSound(int par1, int par2, int par3, int par4)
        {
            this.playSound("mob.BullFrog.step", 0.15F, 1.0F);
        }

        /**
         * Returns the sound this mob makes while it's alive.
         */
        protected String getLivingSound()
        {
            return "lom:frog";
        }

        /**
         * Returns the sound this mob makes when it is hurt.
         */
        protected String getHurtSound()
        {
            return "lom:frog";
        }

        /**
         * Returns the sound this mob makes on death.
         */
        protected String getDeathSound()
        {
            return "lom:frog";
        }

        /**
         * Returns the volume for the sounds this mob makes.
         */
        protected float getSoundVolume()
        {
            return 0.4F;
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
         * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
         * use this to react to sunlight and start to burn.
         */
        public void onLivingUpdate()
        {
            super.onLivingUpdate();

            if (!this.worldObj.isRemote && this.isShaking && !this.field_70928_h && !this.hasPath() && this.onGround)
            {
                this.field_70928_h = true;
                this.timeBullFrogIsShaking = 0.0F;
                this.prevTimeBullFrogIsShaking = 0.0F;
                this.worldObj.setEntityState(this, (byte)8);
            }
            
            if (this.worldObj.isRemote)
            {
                this.sheepTimer = Math.max(0, this.sheepTimer - 1);
            }
        }

        /**
         * Called to update the entity's position/logic.
         */
        public void onUpdate()
        {
            super.onUpdate();
            this.field_70924_f = this.field_70926_e;




            if (this.isWet())
            {
                this.isShaking = true;
                this.field_70928_h = false;
                this.timeBullFrogIsShaking = 0.0F;
                this.prevTimeBullFrogIsShaking = 0.0F;
            }
            else if ((this.isShaking || this.field_70928_h) && this.field_70928_h)
            {
                if (this.timeBullFrogIsShaking == 0.0F)
                {
                    this.playSound("mob.BullFrog.shake", this.getSoundVolume(), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
                }

                this.prevTimeBullFrogIsShaking = this.timeBullFrogIsShaking;
                this.timeBullFrogIsShaking += 0.05F;

                if (this.prevTimeBullFrogIsShaking >= 2.0F)
                {
                    this.isShaking = false;
                    this.field_70928_h = false;
                    this.prevTimeBullFrogIsShaking = 0.0F;
                    this.timeBullFrogIsShaking = 0.0F;
                }

                if (this.timeBullFrogIsShaking > 0.4F)
                {
                    float f = (float)this.boundingBox.minY;
                    int i = (int)(MathHelper.sin((this.timeBullFrogIsShaking - 0.4F) * (float)Math.PI) * 7.0F);

                    for (int j = 0; j < i; ++j)
                    {
                        float f1 = (this.rand.nextFloat() * 2.0F - 1.0F) * this.width * 0.5F;
                        float f2 = (this.rand.nextFloat() * 2.0F - 1.0F) * this.width * 0.5F;
                        this.worldObj.spawnParticle("splash", this.posX + (double)f1, (double)(f + 0.8F), this.posZ + (double)f2, this.motionX, this.motionY, this.motionZ);
                    }
                }
            }
        }

        @SideOnly(Side.CLIENT)
        public boolean getBullFrogShaking()
        {
            return this.isShaking;
        }

        @SideOnly(Side.CLIENT)

        /**
         * Used when calculating the amount of shading to apply while the BullFrog is shaking.
         */
        public float getShadingWhileShaking(float par1)
        {
            return 0.75F + (this.prevTimeBullFrogIsShaking + (this.timeBullFrogIsShaking - this.prevTimeBullFrogIsShaking) * par1) / 2.0F * 0.25F;
        }

        @SideOnly(Side.CLIENT)
        public float getShakeAngle(float par1, float par2)
        {
            float f2 = (this.prevTimeBullFrogIsShaking + (this.timeBullFrogIsShaking - this.prevTimeBullFrogIsShaking) * par1 + par2) / 1.8F;

            if (f2 < 0.0F)
            {
                f2 = 0.0F;
            }
            else if (f2 > 1.0F)
            {
                f2 = 1.0F;
            }

            return MathHelper.sin(f2 * (float)Math.PI) * MathHelper.sin(f2 * (float)Math.PI * 11.0F) * 0.15F * (float)Math.PI;
        }

        @SideOnly(Side.CLIENT)
        public float getInterestedAngle(float par1)
        {
            return (this.field_70924_f + (this.field_70926_e - this.field_70924_f) * par1) * 0.15F * (float)Math.PI;
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
        public boolean attackEntityFrom(DamageSource par1DamageSource, float par2)
        {
            if (this.isEntityInvulnerable())
            {
                return false;
            }
            else
            {
                Entity entity = par1DamageSource.getEntity();
                this.aiSit.setSitting(false);

                if (entity != null && !(entity instanceof EntityPlayer) && !(entity instanceof EntityArrow))
                {
                    par2 = (par2 + 1.0F) / 2.0F;
                }

                return super.attackEntityFrom(par1DamageSource, par2);
            }
        }

        public boolean attackEntityAsMob(Entity par1Entity)
        {
            int i = this.isTamed() ? 0 : 0;
            return par1Entity.attackEntityFrom(DamageSource.causeMobDamage(this), (float)i);
        }

        public void setTamed(boolean par1)
        {
            super.setTamed(par1);

            if (par1)
            {
                this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
            }
            else
            {
                this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(8.0D);
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
                }

                if (this.func_152114_e(p_70085_1_) && !this.worldObj.isRemote && !this.isBreedingItem(itemstack))
                {
                    this.aiSit.setSitting(!this.isSitting());
                    this.isJumping = false;
                    this.setPathToEntity((PathEntity)null);
                    this.setTarget((Entity)null);
                    this.setAttackTarget((EntityLivingBase)null);
                }
            }
            else if (itemstack != null && itemstack.getItem() == LotsOMobsItems.SmashedBug && !this.isAngry())
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

            return super.interact(p_70085_1_);
        }

        @SideOnly(Side.CLIENT)
        public void handleHealthUpdate(byte par1)
        {
            if (par1 == 8)
            {
                this.field_70928_h = true;
                this.timeBullFrogIsShaking = 0.0F;
                this.prevTimeBullFrogIsShaking = 0.0F;
            }
            else
            {
                super.handleHealthUpdate(par1);
            }
        }

        /**
         * Will return how many at most can spawn in a chunk at once.
         */
        public int getMaxSpawnedInChunk()
        {
            return 8;
        }

        /**
         * Determines whether this BullFrog is angry or not.
         */
        public boolean isAngry()
        {
            return (this.dataWatcher.getWatchableObjectByte(16) & 2) != 0;
        }

        /**
         * Sets whether this BullFrog is angry or not.
         */
        public void setAngry(boolean par1)
        {
            byte b0 = this.dataWatcher.getWatchableObjectByte(16);

            if (par1)
            {
                this.dataWatcher.updateObject(16, Byte.valueOf((byte)(b0 | 2)));
            }
            else
            {
                this.dataWatcher.updateObject(16, Byte.valueOf((byte)(b0 & -3)));
            }
        }

        public boolean func_142018_a(EntityLivingBase p_142018_1_, EntityLivingBase p_142018_2_)
        {
            if (!(p_142018_1_ instanceof EntityCreeper) && !(p_142018_1_ instanceof EntityGhast))
            {
                if (p_142018_1_ instanceof EntityBullFrog)
                {
                    EntityBullFrog entityBullFrog = (EntityBullFrog)p_142018_1_;

                    if (entityBullFrog.isTamed() && entityBullFrog.getOwner() == p_142018_2_)
                    {
                        return false;
                    }
                }

                return p_142018_1_ instanceof EntityPlayer && p_142018_2_ instanceof EntityPlayer && !((EntityPlayer)p_142018_2_).canAttackPlayer((EntityPlayer)p_142018_1_) ? false : !(p_142018_1_ instanceof EntityHorse) || !((EntityHorse)p_142018_1_).isTame();
            }
            else
            {
                return false;
            }
        }

        /**
         * Returns true if the mob is currently able to mate with the specified mob.
         */
        public boolean canMateWith(EntityAnimal par1EntityAnimal)
        {
            if (par1EntityAnimal == this)
            {
                return false;
            }
            else if (!this.isTamed())
            {
                return false;
            }
            else if (!(par1EntityAnimal instanceof EntityBullFrog))
            {
                return false;
            }
            else
            {
                EntityBullFrog entityBullFrog = (EntityBullFrog)par1EntityAnimal;
                return !entityBullFrog.isTamed() ? false : (entityBullFrog.isSitting() ? false : this.isInLove() && entityBullFrog.isInLove());
            }
        }



        /**
         * Determines if an entity can be despawned, used on idle far away entities
         */
        protected boolean canDespawn()
        {
            return !this.isTamed() && this.ticksExisted > 2400;
        }

        public EntityBullFrog createChild(EntityAgeable p_90011_1_)
        {
            EntityBullFrog entityBullFrog = new EntityBullFrog(this.worldObj);
            String s = this.func_152113_b();

            if (s != null && s.trim().length() > 0)
            {
                entityBullFrog.func_152115_b(s);
                entityBullFrog.setTamed(true);
            }

            return entityBullFrog;
        }
        /**
         * Determines the size of the ant. 
         */
        
        public float spiderScaleAmount()    
        {
        	return 1.3F;    
        }
        
        @SideOnly(Side.CLIENT)
        public float func_70894_j(float par1)
        {
            return this.sheepTimer <= 0 ? 0.0F : (this.sheepTimer >= 4 && this.sheepTimer <= 36 ? 1.0F : (this.sheepTimer < 4 ? ((float)this.sheepTimer - par1) / 4.0F : -((float)(this.sheepTimer - 40) - par1) / 4.0F));
        }

        @SideOnly(Side.CLIENT)
        public float func_70890_k(float par1)
        {
            if (this.sheepTimer > 4 && this.sheepTimer <= 36)
            {
                float f1 = ((float)(this.sheepTimer - 4) - par1) / 32.0F;
                return ((float)Math.PI / 5F) + ((float)Math.PI * 7F / 100F) * MathHelper.sin(f1 * 28.7F);
            }
            else
            {
                return this.sheepTimer > 0 ? ((float)Math.PI / 5F) : this.rotationPitch / (180F / (float)Math.PI);
            }
        }
        public boolean canBreatheUnderwater()
        {
            return true;
        }
        public boolean isBreedingItem(ItemStack par1ItemStack)
        {
            return par1ItemStack.getItem() == Items.carrot;
        }

}