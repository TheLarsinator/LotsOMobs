package com.lom.lotsomobsitems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

import com.lom.lotsomobscore.LotsOMobs;

public class ItemMyPickaxe extends ItemPickaxe
{

	public ItemMyPickaxe(Item.ToolMaterial par2EnumToolMaterial) 
	{
		super(par2EnumToolMaterial);
		this.setCreativeTab(LotsOMobs.LotsOMobsCombatTab);
	}

	
}