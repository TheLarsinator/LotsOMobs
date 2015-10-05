package com.lom.lotsomobsmodels;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Flippers - Lars
 * Created using Tabula 4.1.1
 */
public class ModelFlippers extends ModelBiped {
    public ModelRenderer Right1;
    public ModelRenderer Right2;
    public ModelRenderer Right3;
    public ModelRenderer Left1;
    public ModelRenderer Left2;
    public ModelRenderer Left3;

    public ModelFlippers(float f) 
    {
  	  	super(f, 0, 64, 64);
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Left3 = new ModelRenderer(this, 0, 33);
        this.Left3.setRotationPoint(0F, 0F, 0.0F);
        this.Left3.addBox(-1.1999999999999997F, 11.0F, -8.0F, 2, 1, 8, 0.0F);
        this.setRotateAngle(Left3, 0.0F, -6.3111105752114955F, 0.0F);
        this.Left1 = new ModelRenderer(this, 0, 33);
        this.Left1.setRotationPoint(0F, 0F, 0.0F);
        this.Left1.addBox(-0.2F, 11.0F, -7.8F, 2, 1, 8, 0.0F);
        this.setRotateAngle(Left1, 0.0F, -6.433981754551897F, 0.0F);
        this.Right1 = new ModelRenderer(this, 0, 33);
        this.Right1.setRotationPoint(0F, 0F, 0.0F);
        this.Right1.addBox(-0.6F, 11.0F, -7.8F, 2, 1, 8, 0.0F);
        this.setRotateAngle(Right1, 0.0F, -6.433981754551897F, 0.0F);
        this.Right3 = new ModelRenderer(this, 0, 33);
        this.Right3.setRotationPoint(0F, 0F, 0.0F);
        this.Right3.addBox(-1.5999999999999996F, 11.0F, -8.0F, 2, 1, 8, 0.0F);
        this.setRotateAngle(Right3, 0.0F, -6.3111105752114804F, 0.0F);
        this.Right2 = new ModelRenderer(this, 0, 33);
        this.Right2.setRotationPoint(0F, 0F, 0.0F);
        this.Right2.addBox(-1.5999999999999996F, 11.0F, -8.0F, 2, 1, 8, 0.0F);
        this.setRotateAngle(Right2, 0.0F, -6.069731539660665F, 0.0F);
        this.Left2 = new ModelRenderer(this, 0, 33);
        this.Left2.setRotationPoint(0F, 0F, 0.0F);
        this.Left2.addBox(-1.1999999999999997F, 11.0F, -8.0F, 2, 1, 8, 0.0F);
        this.setRotateAngle(Left2, 0.0F, -6.06973153966068F, 0.0F);
        
        this.bipedRightLeg.addChild(Right1);
        this.bipedRightLeg.addChild(Right2);
        this.bipedRightLeg.addChild(Right3);
        this.bipedLeftLeg.addChild(Left1);
        this.bipedLeftLeg.addChild(Left2);
        this.bipedLeftLeg.addChild(Left3);
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
