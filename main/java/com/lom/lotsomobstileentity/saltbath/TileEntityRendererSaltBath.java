package com.lom.lotsomobstileentity.saltbath;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsmodels.ModelSaltBath;

public class TileEntityRendererSaltBath extends TileEntitySpecialRenderer
{
	
	public TileEntityRendererSaltBath(){
		model = new ModelSaltBath();
		}

		public void renderAModelAt(TileEntitySaltBath tile, double d, double d1, double d2, float f) {

		int rotation = 0;
		if(tile.getWorldObj() != null)
		{
		rotation = tile.getBlockMetadata();
		}
		if(tile.SaltContent == true)
		{
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Blocks/SaltBath.png"));
		}
		else
		{
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Blocks/SaltBathEmpty.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
		GL11.glScalef(1F, -1F, -1F);
		GL11.glRotatef(rotation*90, 0.0F, 1.0F, 0.0F);
		model.renderAll();
		GL11.glPopMatrix(); //end
		}

		private ModelSaltBath model;

		public void renderTileEntityAt(TileEntity par1TileEntity, double par2, double par4, double par6, float par8)
		{
		this.renderAModelAt((TileEntitySaltBath)par1TileEntity, par2, par4, par6, par8);
		}
}
    






