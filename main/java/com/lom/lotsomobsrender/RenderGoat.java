package com.lom.lotsomobsrender;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsentity.EntityGoat;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


@SideOnly(Side.CLIENT)
public class RenderGoat extends RenderLiving
{

    public RenderGoat(ModelBase modelbase, float f)
    {
        super(modelbase, f); 
    }

    public void func_177_a(EntityGoat entityGoat, double d, double d1, double d2, 
            float f, float f1)
    {
        super.doRender(entityGoat, d, d1, d2, f, f1);
    }

    public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityGoat)entityliving, d, d1, d2, f, f1);
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityGoat)entity, d, d1, d2, f, f1);
    }
	private static final ResourceLocation texture = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Goat.png");
	private static final ResourceLocation texture1 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Goat1.png");
	private static final ResourceLocation texture2 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Goat3.png");
	private static final ResourceLocation texture3 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Goat4.png");
	 protected ResourceLocation func_110872_a(EntityGoat par1Entity)
	    {
		if(par1Entity.hasFur == true)
		{
			return texture;
		}
		else
		{
			return texture2;
		}
	    }
	 @Override
	    protected ResourceLocation getEntityTexture(Entity par1Entity)
	    {
	        return this.func_110872_a((EntityGoat)par1Entity);
	    }
}