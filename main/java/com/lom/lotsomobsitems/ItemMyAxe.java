package com.lom.lotsomobsitems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

import com.lom.lotsomobscore.LotsOMobs;

public class ItemMyAxe extends ItemAxe
{

	public ItemMyAxe(Item.ToolMaterial par2EnumToolMaterial) 
	{
		super(par2EnumToolMaterial);
		this.setCreativeTab(LotsOMobs.LotsOMobsCombatTab);
	}

}