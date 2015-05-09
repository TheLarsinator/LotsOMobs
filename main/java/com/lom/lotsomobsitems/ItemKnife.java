package com.lom.lotsomobsitems;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobscore.handler.ConfigHandler;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemKnife extends Item
{
    public ItemKnife()
    {
        super();
        this.maxStackSize = 64;
        this.setMaxDamage(ConfigHandler.knifeDamage);
        this.setCreativeTab(LotsOMobs.LotsOMobsItemsTab);
        
    }
}