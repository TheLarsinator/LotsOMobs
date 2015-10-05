package com.lom.lotsomobsrender;

import org.lwjgl.opengl.GL11;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsentity.EntityBigFishy;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
@SideOnly(Side.CLIENT)
public class RenderBigFish extends RenderLiving
{
	private static final ResourceLocation texture1 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/BigFish1.png");
	private static final ResourceLocation texture2 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/BigFish2.png");
	private static final ResourceLocation texture3 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/BigFish3.png");
	private static final ResourceLocation texture4 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/BigFish4.png");
	
	protected ResourceLocation func_110872_a(EntityBigFishy par1Entity)
	    {
			switch(par1Entity.textureID)
			{
			default:
			case 1:
				return texture1;
			case 2:
				return texture2;
			case 3:
				return texture3;
			case 4:
				return texture4;
			}
	    }
	 @Override
	    protected ResourceLocation getEntityTexture(Entity par1Entity)
	    {
	        return this.func_110872_a((EntityBigFishy)par1Entity);
	    }
	
    public RenderBigFish(ModelBase var1, float var2)
    {
        super(var1, var2);
    }

    public void renderBigFishy(EntityBigFishy var1, double var2, double var4, double var6, float var8, float var9)
    {
        super.doRender(var1, var2, var4, var6, var8, var9);
    }

    public void doRenderLiving(EntityLiving var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderBigFishy((EntityBigFishy)var1, var2, var4, var6, var8, var9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderBigFishy((EntityBigFishy)var1, var2, var4, var6, var8, var9);
    }
    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void scaleSpider(EntityBigFishy par1EntityBigFishy, float par2)
    {
    	float f = 1 + par1EntityBigFishy.scaleAmount();
        GL11.glScalef(f, f, f);
    }
    
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.scaleSpider((EntityBigFishy)par1EntityLivingBase, par2);
    }
    

    
}