package com.lom.lotsomobsentity;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget.Sorter;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.stats.StatList;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public abstract class EntityFriendlyWater extends EntityWaterMob {

   private float factor1 = 0.0F;
   private float factor2 = 0.0F;
   private float randomSpeed = 0.0F;
   private float randomVecX = 0.0F;
   private float randomVecY = 0.0F;
   private float randomVecZ = 0.0F;
   protected int mobInterval = 30;
   protected float mobSpeed = 0.2F;


   public EntityFriendlyWater(World var1) {
      super(var1);
      this.factor2 = 1.0F / (this.rand.nextFloat() + 1.0F) * 0.2F;
   }

   protected int getAttackStrength() {
      return 0;
   }

   protected boolean canAttackEntity(Entity var1) {
      return var1 instanceof EntityLiving && this.width > var1.width && this.height >= var1.height;
   }

   protected Entity findEntityToAttack() {
      List var1 = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(10.0D, 6.0D, 10.0D));
      Collections.sort(var1, new Sorter(this));
      Iterator var2 = var1.iterator();

      Entity var3;
      do {
         if(!var2.hasNext()) {
            return null;
         }

         var3 = (Entity)var2.next();
      } while(!var3.isInWater() || !this.canAttackEntity(var3));

      return var3;
   }

   public void collideWithEntity(Entity var1) {
      super.collideWithEntity(var1);
      if(this.entityToAttack == var1 && this.getAttackStrength() != 0) {
         this.attackTime = 30;
         this.entityToAttack.attackEntityFrom(DamageSource.causeMobDamage(this), (float)this.getAttackStrength());
      }

   }

   public void onLivingUpdate() {
      super.onLivingUpdate();
      this.factor1 += this.factor2;
      if(this.factor1 > 6.2831855F) {
         this.factor1 -= 6.2831855F;
         if(this.rand.nextInt(10) == 0) {
            this.factor2 = 1.0F / (this.rand.nextFloat() + 1.0F) * 0.2F;
         }
      }

      if(this.isInWater()) {
         float var1;
         if(this.factor1 < 3.1415927F) {
            var1 = this.factor1 / 3.1415927F;
            if((double)var1 > 0.75D) {
               this.randomSpeed = 1.0F;
            }
         } else {
            this.randomSpeed *= 0.95F;
         }

         if(!this.worldObj.isRemote) {
            this.motionX = (double)(this.randomVecX * this.randomSpeed);
            this.motionY = (double)(this.randomVecY * this.randomSpeed);
            this.motionZ = (double)(this.randomVecZ * this.randomSpeed);
         }

         this.renderYawOffset += (-((float)Math.atan2(this.motionX, this.motionZ)) * 180.0F / 3.1415927F - this.renderYawOffset) * 0.1F;
         this.rotationYaw = this.renderYawOffset;
         var1 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
         if(var1 > 0.07F) {
            this.rotationPitch = (float)Math.atan2(this.motionY, (double)var1) * 180.0F / 3.1415927F;
         }
      } else {
         this.motionX = 0.0D;
         this.motionY -= 0.08D;
         this.motionY *= 0.9800000190734863D;
         this.motionZ = 0.0D;
         if(!this.isInWater()) {
            this.rotationPitch = 0.0F;
            if(this.onGround && this.rand.nextInt(30) == 0) {
               this.motionY = 0.30000001192092896D;
               this.motionX = (double)(-0.4F + this.rand.nextFloat() * 0.8F);
               this.motionZ = (double)(-0.4F + this.rand.nextFloat() * 0.8F);
            }
         }
      }

   }
   
   protected void updateEntityActionState() {
      ++this.entityAge;
      if(this.entityAge > 100) {
         this.randomVecX = this.randomVecY = this.randomVecZ = 0.0F;
      } else if(this.rand.nextInt(this.mobInterval) == 0 || !this.inWater || this.isCollided || this.randomVecX == 0.0F && this.randomVecY == 0.0F && this.randomVecZ == 0.0F) {
         if(this.entityToAttack != null && this.attackTime <= 0) {
            if(this.entityToAttack != null) {
               if(!this.entityToAttack.isDead && this.entityToAttack.isInWater() && this.getDistanceToEntity(this.entityToAttack) <= 10.0F && this.attackTime <= 0) {
                  this.randomVecX = (float)Math.signum(this.entityToAttack.posX - this.posX) * this.mobSpeed;
                  this.randomVecY = (float)Math.signum(this.entityToAttack.posY - this.posY) * 0.1F;
                  this.randomVecZ = (float)Math.signum(this.entityToAttack.posZ - this.posZ) * this.mobSpeed;
                  if(!(this.entityToAttack instanceof EntityLiving)) {
                     this.randomVecY -= 0.12F;
                     if(this.entityToAttack instanceof EntityFishHook && this.getDistanceToEntity(this.entityToAttack) < 1.0F) {
                        EntityFishHook var2 = (EntityFishHook)this.entityToAttack;
                        this.entityToAttack = null;
                        if(var2.field_146043_c == null) {
                           this.attackEntityFrom(DamageSource.causeThrownDamage(var2, var2.field_146042_b), 0.0F);
                           var2.field_146043_c = this;
                           var2.field_146042_b.addStat(StatList.field_151183_A, 1);
                        }
                     }
                  }
               } else {
                  this.entityToAttack = null;
               }
            }
         } else {
            float var1 = this.rand.nextFloat() * 3.1415927F * 2.0F;
            this.randomVecX = MathHelper.cos(var1) * this.mobSpeed;
            this.randomVecY = -0.1F + this.rand.nextFloat() * 0.2F;
            this.randomVecZ = MathHelper.sin(var1) * this.mobSpeed;
            if(this.getAttackStrength() > 0) {
               this.entityToAttack = this.findEntityToAttack();
            }
         }
      }

      this.despawnEntity();
   }
}
