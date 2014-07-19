package com.lom.lotsomobsentity;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.lom.lotsomobsinit.LotsOMobsItems;

public class EntityWhale extends EntityFriendlyWater {

   public int textureID;
   public EntityWhale(World var1) {
      super(var1);
      this.setSize(4F, 3F);
      this.textureID = rand.nextInt(3);
   }

   protected void func_110147_ax() {
       super.applyEntityAttributes();
       this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(15.0D);
   }

   protected Item getDropItemId() {
      return Items.fish;
   }
   
    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "lom:whale";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "lom:whale";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "lom:whale";
    }

    /**
     * Returns the volume for the sounds this mob makes.
     */
    protected float getSoundVolume()
    {
        return 1.0F;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected Item getDropItem()
    {
        return LotsOMobsItems.Ivory;
    }

    /**
     * Drop 0-2 items of this living's type
     */
    protected void dropFewItems(boolean par1, int par2)
    {
        {
            this.entityDropItem(new ItemStack(LotsOMobsItems.RawWhale, 1, 0), 0.0F);
        }
    }

	public float spiderScaleAmount() {
		// TODO Auto-generated method stub
		return 2;
	}
}