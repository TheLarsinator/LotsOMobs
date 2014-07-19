package com.lom.lotsomobsrender;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsentity.EntityMammoth;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderMammoth extends RenderLiving
{

    public RenderMammoth(ModelBase modelbase, float f)
    {
        super(modelbase, f); 
    }

    public void func_177_a(EntityMammoth entityMammoth, double d, double d1, double d2, 
            float f, float f1)
    {
        super.doRender(entityMammoth, d, d1, d2, f, f1);
    }

    public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityMammoth)entityliving, d, d1, d2, f, f1);
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityMammoth)entity, d, d1, d2, f, f1);
    }
    
    
	private static final ResourceLocation Mammothtexture = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Mammoth.png");
	 protected ResourceLocation func_110872_a(EntityMammoth par1Entity)
	    {
	        return Mammothtexture;
	    }
	 @Override
	    protected ResourceLocation getEntityTexture(Entity par1Entity)
	    {
	        return this.func_110872_a((EntityMammoth)par1Entity);
	    }
	 
	    /**
	     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
	     * entityLiving, partialTickTime
	     */
	    protected void scaleSpider(EntityMammoth par1EntityMammoth, float par2)
	    {
	    	float f = par1EntityMammoth.spiderScaleAmount();
	        GL11.glScalef(f, f, f);
	    }
	    
	    
	    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
	    {
	        this.scaleSpider((EntityMammoth)par1EntityLivingBase, par2);
	    }
}
