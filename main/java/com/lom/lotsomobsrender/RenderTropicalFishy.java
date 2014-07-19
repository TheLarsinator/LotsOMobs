package com.lom.lotsomobsrender;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsentity.EntityTropicalFishy;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


@SideOnly(Side.CLIENT)
public class RenderTropicalFishy extends RenderLiving
{

    public RenderTropicalFishy(ModelBase modelbase, float f)
    {
        super(modelbase, f); 
    }

    public void func_177_a(EntityTropicalFishy entityTropicalFishy, double d, double d1, double d2, 
            float f, float f1)
    {
        super.doRender(entityTropicalFishy, d, d1, d2, f, f1);
    }

    public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityTropicalFishy)entityliving, d, d1, d2, f, f1);
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityTropicalFishy)entity, d, d1, d2, f, f1);
    }
	
	private static final ResourceLocation TropicalFishytexture = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Fish1.png");
	private static final ResourceLocation TropicalFishytexture2 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Fish2.png");
	private static final ResourceLocation TropicalFishytexture3 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Fish3.png");
	private static final ResourceLocation TropicalFishytexture4 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Fish4.png");
	private static final ResourceLocation TropicalFishytexture5 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Fish5.png");
	private static final ResourceLocation TropicalFishytexture6 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Fish6.png");
	 protected ResourceLocation func_110872_a(EntityTropicalFishy par1Entity)
	    {
	    	int i = par1Entity.textureID;
	    	switch(i)
	    	{
	    	case 0:
	    		default:
	    		return TropicalFishytexture;
	    	case 1:
	    		return TropicalFishytexture2;
	    	case 2:
	    		return TropicalFishytexture3;
	    	case 3:
	    		return TropicalFishytexture4;
	    	case 4:
	    		return TropicalFishytexture5;
	    	case 5:
	    		return TropicalFishytexture6;
	    	
	    	}
	    }
	 @Override
	    protected ResourceLocation getEntityTexture(Entity par1Entity)
	    {
	        return this.func_110872_a((EntityTropicalFishy)par1Entity);
	    }
	
}
