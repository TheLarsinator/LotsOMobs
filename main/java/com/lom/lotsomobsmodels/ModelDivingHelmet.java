package com.lom.lotsomobsmodels;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelBiped - Either Mojang or a mod author
 * Created using Tabula 4.1.1
 */
public class ModelDivingHelmet extends ModelBiped {
    public ModelRenderer GlassHelmet;

    public ModelDivingHelmet(float f) 
    {
  	  	super(f, 0, 64, 64);
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.GlassHelmet = new ModelRenderer(this, 0, 33);
        this.GlassHelmet.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.GlassHelmet.addBox(-5.0F, -10.0F, -5.0F, 10, 10, 10, 0.0F);
        
        this.bipedHead.addChild(GlassHelmet);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
