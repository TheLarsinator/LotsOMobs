package com.lom.lotsomobsitems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsentity.EntityTRex;

public class ItemTRexSpawner extends Item
{
    public ItemTRexSpawner()
    {
        super();
        this.maxStackSize = 1;
        this.setCreativeTab(LotsOMobs.LotsOMobsItemsTab);
        this.setMaxDamage(20);      
    }
	

public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par5Entity)
{
	if(par2World.isRemote)
	{
	EntityTRex trex = new EntityTRex(par2World);
	trex.setLocationAndAngles(par5Entity.posX, par5Entity.posY, par5Entity.posZ, 0, 0);
	par2World.spawnEntityInWorld(trex);
	par5Entity.inventory.consumeInventoryItem(this);
    return par1ItemStack;
	}
	else
	{
	    return par1ItemStack;
	}
}
}