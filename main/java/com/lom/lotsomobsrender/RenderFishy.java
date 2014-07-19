package com.lom.lotsomobsrender;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsentity.EntityFishy;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


@SideOnly(Side.CLIENT)
public class RenderFishy extends RenderLiving
{

    public RenderFishy(ModelBase modelbase, float f)
    {
        super(modelbase, f); 
    }

    public void func_177_a(EntityFishy entityFishy, double d, double d1, double d2, 
            float f, float f1)
    {
        super.doRender(entityFishy, d, d1, d2, f, f1);
    }

    public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityFishy)entityliving, d, d1, d2, f, f1);
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityFishy)entity, d, d1, d2, f, f1);
    }
	
	private static final ResourceLocation Fishytexture = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Fish_blue.png");
	private static final ResourceLocation Fishytexture2 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Fish_red.png");
	private static final ResourceLocation Fishytexture3 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Fish_yellow.png");
	 protected ResourceLocation func_110872_a(EntityFishy par1Entity)
	    {
	    	int i = par1Entity.textureID;
	    	switch(i)
	    	{
	    	case 0:
	    		default:
	    		return Fishytexture;
	    	case 1:
	    		return Fishytexture2;
	    	case 2:
	    		return Fishytexture3;
	    	}
	    }
	 @Override
	    protected ResourceLocation getEntityTexture(Entity par1Entity)
	    {
	        return this.func_110872_a((EntityFishy)par1Entity);
	    }

	
}
