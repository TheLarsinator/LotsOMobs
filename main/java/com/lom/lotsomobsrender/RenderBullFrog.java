package com.lom.lotsomobsrender;

import java.util.Random;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsentity.EntityBullFrog;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderBullFrog extends RenderLiving
{
//	public static int i;
    public RenderBullFrog(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    public void renderBullFrog(EntityBullFrog par1EntityBullFrog, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRender(par1EntityBullFrog, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderBullFrog((EntityBullFrog)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderBullFrog((EntityBullFrog)par1Entity, par2, par4, par6, par8, par9);
    }
    
    
	private static final ResourceLocation BullFrogtexture1 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/BullFrog.png");
	protected Random rand = new Random();

	
	
    protected ResourceLocation func_110849_a(EntityBullFrog par1EntityBullFrog)
    {
    		return BullFrogtexture1;
    }

    
    
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
    	return this.func_110849_a((EntityBullFrog)par1Entity);

    }
    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void scaleSpider(EntityBullFrog par1EntityBullFrog, float par2)
    {
    	float f = par1EntityBullFrog.spiderScaleAmount();
        GL11.glScalef(f, f, f);
    }
    
    
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.scaleSpider((EntityBullFrog)par1EntityLivingBase, par2);
    }
    

}
