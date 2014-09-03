package com.lom.lotsomobsrender;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsentity.EntityMole;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderMole extends RenderLiving
{
	private static final ResourceLocation Moletexture = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Mole.png");
	private static final ResourceLocation MoletextureS = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/MoleSand.png");
	private static final ResourceLocation MoletextureRS = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/MoleRSand.png");
	 protected ResourceLocation func_110872_a(EntityMole Mole)
	    {
		 	if(Mole.worldObj.getBlock((int)Mole.posX, (int)Mole.posY - 1, (int)Mole.posZ) == Blocks.sand)
		 	{
	        return MoletextureS;
		 	}
		 	if(Mole.worldObj.getBlock((int)Mole.posX, (int)Mole.posY - 1, (int)Mole.posZ) == Blocks.sand || Mole.worldObj.getBlockMetadata((int)Mole.posX, (int)Mole.posY - 1, (int)Mole.posZ) == 1)
		 	{
		 	return MoletextureRS;
		 	}
		 	else
		 	{
		 	return Moletexture;
		 	}
	    }
	 @Override
	    protected ResourceLocation getEntityTexture(Entity par1Entity)
	    {
	        return this.func_110872_a((EntityMole)par1Entity);
	    }
	
    public RenderMole(ModelBase var1, float var2)
    {
        super(var1, var2);
    }

    public void renderMole(EntityMole var1, double var2, double var4, double var6, float var8, float var9)
    {
        super.doRender(var1, var2, var4, var6, var8, var9);
    }

    public void doRenderLiving(EntityLiving var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderMole((EntityMole)var1, var2, var4, var6, var8, var9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderMole((EntityMole)var1, var2, var4, var6, var8, var9);
    }
    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void scaleSpider(EntityMole par1EntityMole, float par2)
    {
    	float f = par1EntityMole.spiderScaleAmount();
        GL11.glScalef(f, f, f);
    }
    
    
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.scaleSpider((EntityMole)par1EntityLivingBase, par2);
    }
    

    
}