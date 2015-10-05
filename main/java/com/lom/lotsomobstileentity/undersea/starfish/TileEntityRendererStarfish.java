package com.lom.lotsomobstileentity.undersea.starfish;

import org.lwjgl.opengl.GL11;

import com.lom.lotsomobscore.LotsOMobs;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class TileEntityRendererStarfish extends TileEntitySpecialRenderer
{
	
	public TileEntityRendererStarfish(){
		model = new ModelStarfish();
		}

		public void renderAModelAt(TileEntityStarfish tile, double d, double d1, double d2, float f) {
		float rotation = 0;
		float Scale = 1F;
		int textureID = 0;

		if(tile.getWorldObj() != null)
		{
			rotation = (float)tile.getBlockMetadata();
			rotation = rotation + 10*(tile.rotation + 1);
			Scale = tile.ScaleSize+1F;
			textureID = tile.textureID;
			System.out.println("TextureID " + textureID);

			switch(textureID)
			{
			case 1:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Blocks/StarFish.png"));	
				break;
			case 2:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Blocks/StarFish2.png"));	
				break;
			case 3:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Blocks/StarFish3.png"));
				break;
			case 0:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Blocks/StarFish4.png"));	
				break;
			}
		}
		else
		{
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Blocks/StarFish.png"));	

		}
		System.out.println("Rotation " + tile.rotation);
		System.out.println("MetaData " + tile.getBlockMetadata());

		GL11.glPushMatrix();
		GL11.glTranslatef((float)d + 0.5F, (float)d1+ (float)((Scale) * 1.5F), (float)d2 + 0.5F);
		GL11.glScalef(Scale, -Scale, -Scale);
		GL11.glRotatef(rotation *90, 0.0F, 1.0F, 0.0F);
		model.renderAll();
		GL11.glPopMatrix(); //end

		}

		private ModelStarfish model;

		public void renderTileEntityAt(TileEntity par1TileEntity, double par2, double par4, double par6, float par8)
		{
		this.renderAModelAt((TileEntityStarfish)par1TileEntity, par2, par4, par6, par8);
		}
}