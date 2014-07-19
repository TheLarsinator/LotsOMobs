package com.lom.lotsomobsrender;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsentity.EntityNarwal;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)

public class RenderNarwal extends RenderLiving
{

    public RenderNarwal(ModelBase modelbase, float f)
    {
        super(modelbase, f); 
    }

    public void func_177_a(EntityNarwal entityNarwal, double d, double d1, double d2, 
            float f, float f1)
    {
        super.doRender(entityNarwal, d, d1, d2, f, f1);
    }

    public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityNarwal)entityliving, d, d1, d2, f, f1);
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityNarwal)entity, d, d1, d2, f, f1);
    }
    
	private static final ResourceLocation Narwaltexture = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Narwal.png");
	 protected ResourceLocation func_110872_a(EntityNarwal par1Entity)
	    {
	        return Narwaltexture;
	    }
	 @Override
	    protected ResourceLocation getEntityTexture(Entity par1Entity)
	    {
	        return this.func_110872_a((EntityNarwal)par1Entity);
	    }
	    /**
	     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
	     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
	     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
	     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
	     */
	    /**
	     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
	     * entityLiving, partialTickTime
	     */
	    protected void scaleSpider(EntityNarwal par1EntityNarwal, float par2)
	    {
	    	float f = par1EntityNarwal.spiderScaleAmount();
	        GL11.glScalef(f, f, f);
	    }
	    
	    
	    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
	    {
	        this.scaleSpider((EntityNarwal)par1EntityLivingBase, par2);
	    }
}