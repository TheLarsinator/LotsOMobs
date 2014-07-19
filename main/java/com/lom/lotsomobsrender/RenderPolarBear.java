package com.lom.lotsomobsrender;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsentity.EntityPolarBear;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderPolarBear extends RenderLiving
{

    public RenderPolarBear(ModelBase modelbase, float f)
    {
        super(modelbase, f); 
    }

    public void func_177_a(EntityPolarBear entityPolarBear, double d, double d1, double d2, 
            float f, float f1)
    {
        super.doRender(entityPolarBear, d, d1, d2, f, f1);
    }

    public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityPolarBear)entityliving, d, d1, d2, f, f1);
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityPolarBear)entity, d, d1, d2, f, f1);
    }

    
	private static final ResourceLocation PolarBeartexture = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/IceBear.png");
	 protected ResourceLocation func_110872_a(EntityPolarBear par1Entity)
	    {
	        return PolarBeartexture;
	    }
	 @Override
	    protected ResourceLocation getEntityTexture(Entity par1Entity)
	    {
	        return this.func_110872_a((EntityPolarBear)par1Entity);
	    }
	 
	    /**
	     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
	     * entityLiving, partialTickTime
	     */
	    protected void scaleSpider(EntityPolarBear par1EntityPolarBear, float par2)
	    {
	    	float f = par1EntityPolarBear.spiderScaleAmount();
	        GL11.glScalef(f, f, f);
	    }
	    
	    
	    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
	    {
	        this.scaleSpider((EntityPolarBear)par1EntityLivingBase, par2);
	    }
}