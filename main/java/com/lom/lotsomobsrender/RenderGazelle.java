package com.lom.lotsomobsrender;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsentity.EntityGazelle;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGazelle extends RenderLiving
{

    public RenderGazelle(ModelBase modelbase, float f)
    {
        super(modelbase, f); 
    }

    public void func_177_a(EntityGazelle entityGazelle, double d, double d1, double d2, 
            float f, float f1)
    {
        super.doRender(entityGazelle, d, d1, d2, f, f1);
    }

    public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityGazelle)entityliving, d, d1, d2, f, f1);
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityGazelle)entity, d, d1, d2, f, f1);
    }
/*
	private static final ResourceLocation field_110887_f = new ResourceLocation("/LotsOMobs/Mobs/Gazelle.png");
	
	@Override
	protected ResourceLocation func_110775_a(Entity entity) {
		 return field_110887_f;
	}
	*/
	private static final ResourceLocation Gazelletexture = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Gazelle.png");
	 protected ResourceLocation func_110872_a(EntityGazelle par1Entity)
	    {
	        return Gazelletexture;
	    }
	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
        return this.func_110872_a((EntityGazelle)var1);
	}
}