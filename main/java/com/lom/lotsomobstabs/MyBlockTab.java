package com.lom.lotsomobstabs;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.lom.lotsomobsinit.LotsOMobsBlocks;

public class MyBlockTab extends CreativeTabs
{
	public MyBlockTab(int i, String label) {
		super(label);

	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(LotsOMobsBlocks.EasterEgg1);
	}
}
