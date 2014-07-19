package com.lom.lotsomobsrender;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsentity.EntityBird;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


@SideOnly(Side.CLIENT)
public class RenderBird extends RenderLiving
{

    public RenderBird(ModelBase modelbase, float f)
    {
        super(modelbase, f); 
    }

    public void func_177_a(EntityBird entityBird, double d, double d1, double d2, 
            float f, float f1)
    {
        super.doRender(entityBird, d, d1, d2, f, f1);
    }

    public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityBird)entityliving, d, d1, d2, f, f1);
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityBird)entity, d, d1, d2, f, f1);
    }

	private static final ResourceLocation Birdtexture = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Bird.png");
	 protected ResourceLocation func_110872_a(EntityBird par1Entity)
	    {
	        return Birdtexture;
	    }

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
        return this.func_110872_a((EntityBird)var1);
	}
}