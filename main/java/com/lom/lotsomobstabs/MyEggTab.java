package com.lom.lotsomobstabs;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.lom.lotsomobsinit.LotsOMobsBlocks;

public class MyEggTab extends CreativeTabs
{
	public MyEggTab(int i, String label) {
		super(label);

	}

	@Override
	public Item getTabIconItem() {
		return Items.egg;
	}
}
