package com.lom.lotsomobsitems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

import com.lom.lotsomobscore.LotsOMobs;

public class ItemMyShovel extends ItemSpade
{

	public ItemMyShovel(Item.ToolMaterial par2EnumToolMaterial) 
	{
		super(par2EnumToolMaterial);
		this.setCreativeTab(LotsOMobs.LotsOMobsCombatTab);
	}
	
}