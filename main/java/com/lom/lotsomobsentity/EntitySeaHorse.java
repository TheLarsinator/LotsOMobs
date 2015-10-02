package com.lom.lotsomobsentity;

import com.lom.lotsomobsinit.LotsOMobsItems;

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

public class EntitySeaHorse extends EntityFriendlyWater {

   public int textureID;
   public float scales;
   
   public EntitySeaHorse(World var1) {
      super(var1);
      this.setSize(0.5F, 0.5F);
      this.textureID = rand.nextInt(4)+1;
      this.scales = ((float)(rand.nextInt(5)+2))/10;
      System.out.println(textureID);
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
   
   /**
    * Drop 0-2 items of this living's type
    */
   protected void dropFewItems(boolean par1, int par2)
   {
       int var3 = 1;
       
       this.dropItem(Items.fish, var3);

   }
   
   public float scaleAmount()
   {
	   //System.out.println("Scales in entitiy:" + scales);

	   return scales;
   }
}
