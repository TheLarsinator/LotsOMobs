package com.lom.lotsomobscore.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.lom.lotsomobsdna.ContainerDNAExtractor;
import com.lom.lotsomobsdna.GUIDNAExtractor;
import com.lom.lotsomobsdna.TileEntityDNAExtractor;

import cpw.mods.fml.common.network.IGuiHandler;


public class GuiHandler implements IGuiHandler {
	
	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world,int x, int y, int z) {
		TileEntity tileEntity = world.getTileEntity(x, y, z);
		switch(id) {
		case 1:
			if (tileEntity != null && tileEntity instanceof TileEntityDNAExtractor) {
				return new ContainerDNAExtractor(player.inventory, (TileEntityDNAExtractor) tileEntity);
			}
			break;
		}
		return null;
	}

	public Object getClientGuiElement(int id, EntityPlayer player, World world,int x, int y, int z) {		
		TileEntity tileEntity = world.getTileEntity(x, y, z);
		
		switch(id) {
		case 1:
			if (tileEntity != null && tileEntity instanceof TileEntity) {

				return new GUIDNAExtractor(player.inventory, (TileEntityDNAExtractor) tileEntity);
			}
			break;
		}

		return null;

	}
}