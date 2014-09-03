package com.lom.lotsomobsentity.particle;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import static org.lwjgl.opengl.GL11.*;


public class EntityDirtFX extends EntityFX{

	private static final ResourceLocation texture = new ResourceLocation("lom", "textures/particle/dirtparticle.png");
	
	public EntityDirtFX(World world, double i, double j, double k) {
		super(world, i, j, k);
		setGravity(-1F);
		setMaxAge(10000);
		setScale(2.0F);
	}

	public void renderParticle(Tessellator tess, float particleTicks, float par3, float par4, float par5, float par6, float par7)
	{
		Minecraft.getMinecraft().renderEngine.bindTexture(texture);
		
		glDepthMask(false);
		glEnable(GL_BLEND);
		glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
		glAlphaFunc(GL_GREATER, 0.03921569F);
		tess.startDrawingQuads();
		tess.setBrightness(getBrightnessForRender(particleTicks));
		float scale = 0.1F*particleScale;
		float x = (float)(prevPosX + (posX - prevPosX) * particleTicks - interpPosX);
		float y = (float)(prevPosY + (posX - prevPosY) * particleTicks - interpPosY);
		float z = (float)(prevPosZ + (posX - prevPosZ) * particleTicks - interpPosZ);
		tess.addVertexWithUV(x - par3 * scale - par6 * scale, y - par4 * scale, z - par5 * scale - par7 * scale, 0, 0);
		tess.addVertexWithUV(x - par3 * scale + par6 * scale, y + par4 * scale, z - par5 * scale + par7 * scale, 1, 0);
		tess.addVertexWithUV(x + par3 * scale + par6 * scale, y + par4 * scale, z + par5 * scale + par7 * scale, 1, 1);
		tess.addVertexWithUV(x + par3 * scale - par6 * scale, y - par4 * scale, z + par5 * scale - par7 * scale, 0, 1);
		tess.draw();
		glDisable(GL_BLEND);
		glDepthMask(true);
		glAlphaFunc(GL_GREATER, 0.1F);
	}
	
	public int getFXLayer()
	{
		return 3;
	}
	
	public EntityDirtFX setMaxAge(int maxAge)
	{
		particleMaxAge = maxAge;
		return this;
	}
	
	public EntityDirtFX setGravity(float gravity)
	{
		particleGravity = gravity;
		return this;
	}
	
	public EntityDirtFX setScale(float scale)
	{
		particleScale = scale;
		return this;
	}
}
