package com.lom.lotsomobsrender;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsentity.EntityCamel;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderCamel extends RenderLiving
{

    public RenderCamel(ModelBase modelbase, float f)
    {
        super(modelbase, f); 
    }

    public void func_177_a(EntityCamel entityCamel, double d, double d1, double d2, 
            float f, float f1)
    {
        super.doRender(entityCamel, d, d1, d2, f, f1);
    }

    public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityCamel)entityliving, d, d1, d2, f, f1);
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityCamel)entity, d, d1, d2, f, f1);
    }
	private static final ResourceLocation Cameltexture = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Camel.png");
	 protected ResourceLocation func_110872_a(EntityCamel par1Entity)
	    {
	        return Cameltexture;
	    }
	 @Override
	    protected ResourceLocation getEntityTexture(Entity par1Entity)
	    {
	        return this.func_110872_a((EntityCamel)par1Entity);
	    }
}