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

public class EntityFishy extends EntityFriendlyWater {

   public int textureID;
   public EntityFishy(World var1) {
      super(var1);
      this.setSize(.7F, .7F);
      this.textureID = rand.nextInt(3);
   }

   protected void func_110147_ax() {
       super.applyEntityAttributes();
       this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(5.0D);
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

   protected Item getDropItemId() {
      return Items.fish;
   }

}
