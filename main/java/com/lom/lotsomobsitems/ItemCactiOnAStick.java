package com.lom.lotsomobsitems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsentity.EntityCamel;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemCactiOnAStick extends Item
{
    public ItemCactiOnAStick()
    {
        super();
        this.setCreativeTab(LotsOMobs.LotsOMobsItemsTab);
        this.setMaxStackSize(1);
        this.setMaxDamage(30);
    }

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    public boolean isFull3D()
    {
        return true;
    }

    /**
     * Returns true if this item should be rotated by 180 degrees around the Y axis when being held in an entities
     * hands.
     */
    public boolean shouldRotateAroundWhenRendering()
    {
        return true;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (par3EntityPlayer.isRiding() && par3EntityPlayer.ridingEntity instanceof EntityCamel)
        {
            EntityCamel var4 = (EntityCamel)par3EntityPlayer.ridingEntity;

            if (var4.getAIControlledByPlayer().isControlledByPlayer() && par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() >= 7)
            {
                var4.getAIControlledByPlayer().boostSpeed();
                par1ItemStack.damageItem(7, par3EntityPlayer);

                if (par1ItemStack.stackSize == 0)
                {
                    ItemStack var5 = new ItemStack(Items.fishing_rod);
                    var5.setTagCompound(par1ItemStack.stackTagCompound);
                    return var5;
                }
            }
        }

        return par1ItemStack;
    }
}
