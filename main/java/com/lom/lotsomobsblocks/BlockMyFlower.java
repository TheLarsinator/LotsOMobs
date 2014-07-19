package com.lom.lotsomobsblocks;

import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IIconRegister;

import com.lom.lotsomobscore.LotsOMobs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMyFlower extends BlockFlower
{

	public BlockMyFlower(int par1) {
		super(par1);
		this.setCreativeTab(LotsOMobs.LotsOMobsBlockTab);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{

	    blockIcon = iconRegister.registerIcon(LotsOMobs.modid + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
}