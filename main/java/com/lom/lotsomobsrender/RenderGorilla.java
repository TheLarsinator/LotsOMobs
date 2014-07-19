package com.lom.lotsomobsrender;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsentity.EntityGorilla;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


@SideOnly(Side.CLIENT)
public class RenderGorilla extends RenderLiving
{

    public RenderGorilla(ModelBase modelbase, float f)
    {
        super(modelbase, f); 
    }

    public void func_177_a(EntityGorilla entityGorilla, double d, double d1, double d2, 
            float f, float f1)
    {
        super.doRender(entityGorilla, d, d1, d2, f, f1);
    }

    public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityGorilla)entityliving, d, d1, d2, f, f1);
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityGorilla)entity, d, d1, d2, f, f1);
    }
    
	private static final ResourceLocation Gorillatexture = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Gorilla.png");
	 protected ResourceLocation func_110872_a(EntityGorilla par1Entity)
	    {
	        return Gorillatexture;
	    }
	 @Override
	    protected ResourceLocation getEntityTexture(Entity par1Entity)
	    {
	        return this.func_110872_a((EntityGorilla)par1Entity);
	    }
}