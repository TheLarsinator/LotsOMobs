package com.lom.lotsomobsitems;

import net.minecraft.item.Item;

import com.lom.lotsomobscore.LotsOMobs;

public class ItemDNA extends Item
{
    public ItemDNA()
    {
        super();
        this.maxStackSize = 5;
        this.setCreativeTab(LotsOMobs.LotsOMobsItemsTab);
        
    }

}