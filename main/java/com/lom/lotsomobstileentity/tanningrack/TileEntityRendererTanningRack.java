package com.lom.lotsomobstileentity.tanningrack;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.lom.lotsomobsblocks.BlockTanningRack;
import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsmodels.ModelTanningRack;

public class TileEntityRendererTanningRack extends TileEntitySpecialRenderer
{
	
	public TileEntityRendererTanningRack(){
		model = new ModelTanningRack();
		}

		public void renderAModelAt(TileEntityTanningRack tile, double d, double d1, double d2, float f) {

		int rotation = 0;
		if(tile.getWorldObj() != null)
		{
		rotation = tile.getBlockMetadata();
		}
		if(tile.ElephantHide == true && tile.CleanHide == true)
		{
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Blocks/TanningRack_E.png"));
		}
		else if(tile.ElephantHide == true && tile.CleanHide == false)
		{
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Blocks/TanningRack_ED.png"));	
		}
		else if(tile.DeerHide == true && tile.CleanHide == false)
		{
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Blocks/TanningRack_DD.png"));
		}
		else if(tile.DeerHide == true && tile.CleanHide == true)
		{
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Blocks/TanningRack_D.png"));	
		}
		else
		{
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Blocks/TanningRack.png"));	
		}
		GL11.glPushMatrix();
		GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
		GL11.glScalef(1F, -1F, -1F);
		GL11.glRotatef(rotation*90, 0.0F, 1.0F, 0.0F);
		model.renderAll();
		GL11.glPopMatrix(); //end
		}

		private ModelTanningRack model;

		public void renderTileEntityAt(TileEntity par1TileEntity, double par2, double par4, double par6, float par8)
		{
		this.renderAModelAt((TileEntityTanningRack)par1TileEntity, par2, par4, par6, par8);
		}
}
    






