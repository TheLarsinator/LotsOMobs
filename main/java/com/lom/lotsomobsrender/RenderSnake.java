package com.lom.lotsomobsrender;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsentity.EntitySnake;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderSnake extends RenderLiving
{

    public RenderSnake(ModelBase modelbase, float f)
    {
        super(modelbase, f); 
    }

    public void func_177_a(EntitySnake entitySnake, double d, double d1, double d2, 
            float f, float f1)
    {
        super.doRender(entitySnake, d, d1, d2, f, f1);
    }

    public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntitySnake)entityliving, d, d1, d2, f, f1);
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntitySnake)entity, d, d1, d2, f, f1);
    }
    
	private static final ResourceLocation Snaketexture = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Snake.png");
	 protected ResourceLocation func_110872_a(EntitySnake par1Entity)
	    {
	        return Snaketexture;
	    }
	 @Override
	    protected ResourceLocation getEntityTexture(Entity par1Entity)
	    {
	        return this.func_110872_a((EntitySnake)par1Entity);
	    }
}