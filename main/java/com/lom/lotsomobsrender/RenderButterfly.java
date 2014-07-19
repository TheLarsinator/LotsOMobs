package com.lom.lotsomobsrender;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsentity.EntityButterfly;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


@SideOnly(Side.CLIENT)
public class RenderButterfly extends RenderLiving
{

    public RenderButterfly(ModelBase modelbase, float f)
    {
        super(modelbase, f); 
    }

    public void func_177_a(EntityButterfly entityButterfly, double d, double d1, double d2, 
            float f, float f1)
    {
        super.doRender(entityButterfly, d, d1, d2, f, f1);
    }

    public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityButterfly)entityliving, d, d1, d2, f, f1);
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityButterfly)entity, d, d1, d2, f, f1);
    }
	private static final ResourceLocation Butterflytexture = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Butterfly.png");
	private static final ResourceLocation Butterflytexture1 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Butterfly1.png");
	private static final ResourceLocation Butterflytexture2 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Butterfly2.png");
	private static final ResourceLocation Butterflytexture3 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Butterfly3.png");
	 protected ResourceLocation func_110872_a(EntityButterfly par1Entity)
	    {
	    	int i = par1Entity.textureID;
	    	switch(i)
	    	{
	    	case 0:
	    		default:
	    		return Butterflytexture1;
	    	case 1:
	    		return Butterflytexture2;
	    	case 2:
	    		return Butterflytexture3;
	    	case 3:
	    		return Butterflytexture;
	    	}
	    }
	 @Override
	    protected ResourceLocation getEntityTexture(Entity par1Entity)
	    {
	        return this.func_110872_a((EntityButterfly)par1Entity);
	    }
}