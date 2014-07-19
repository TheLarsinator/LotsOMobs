package com.lom.lotsomobsentity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

public class EntityHammerShark extends EntityHostileWater {

   public EntityHammerShark(World var1) {
      super(var1);
      this.setSize(3.0F, 1.0F);
   }

   protected void func_110147_ax() {
       super.applyEntityAttributes();
       this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(25.0D);
   }
   

   protected String getLivingSound() {
      return null;
   }

   protected String getHurtSound() {
      return null;
   }

   protected String getDeathSound() {
      return null;
   }

   protected Item getDropItem() {
      return Items.fish;
   }

   protected boolean canAttackEntity(Entity entity) 
   {
	   if(!(entity instanceof EntityHostileWater))
	   {
		   return entity instanceof EntityLiving || super.canAttackEntity(entity) || entity instanceof EntityPlayer;
	   }
	   else
	   {
		   return false;
	   }
   }

   protected int getAttackStrength() {
      return 12;
   }

public float spiderScaleAmount() {
	return 1F;
}

}
