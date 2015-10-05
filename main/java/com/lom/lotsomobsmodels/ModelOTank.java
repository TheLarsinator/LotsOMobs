package com.lom.lotsomobsmodels;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelBiped - Either Mojang or a mod author
 * Created using Tabula 4.1.1
 */
public class ModelOTank extends ModelBiped {
    public ModelRenderer Bottle2;
    public ModelRenderer Bottle1;
    public ModelRenderer Connector2;
    public ModelRenderer Connector1;
    public ModelRenderer Pipe3;
    public ModelRenderer Pipe4;
    public ModelRenderer Pipe1;
    public ModelRenderer Pipe2;
    public ModelRenderer Vest4;
    public ModelRenderer Vest2;
    public ModelRenderer Vest3;
    public ModelRenderer Vest7;
    public ModelRenderer Vest1;
    public ModelRenderer Vest5;
    public ModelRenderer Vest6;

    public ModelOTank(float f) 
    {
  	  	super(f, 0, 64, 64);
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Connector1 = new ModelRenderer(this, 0, 53);
        this.Connector1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Connector1.addBox(1.5F, 0.5F, 4.0F, 1, 1, 1, 0.0F);
        this.Vest7 = new ModelRenderer(this, 0, 33);
        this.Vest7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Vest7.addBox(-4.5F, 8.0F, -2.5F, 9, 1, 1, 0.0F);
        this.Vest5 = new ModelRenderer(this, 0, 33);
        this.Vest5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Vest5.addBox(3.5F, 2.0F, -2.5F, 1, 1, 5, 0.0F);
        this.Vest2 = new ModelRenderer(this, 0, 33);
        this.Vest2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Vest2.addBox(-4.5F, 2.0F, -2.5F, 1, 1, 5, 0.0F);
        this.Bottle1 = new ModelRenderer(this, 52, 33);
        this.Bottle1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Bottle1.addBox(0.5F, 1.5F, 3.0F, 3, 10, 3, 0.0F);
        this.Vest4 = new ModelRenderer(this, 0, 33);
        this.Vest4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Vest4.addBox(-4.5F, 8.0F, -2.5F, 1, 1, 5, 0.0F);
        this.Vest1 = new ModelRenderer(this, 0, 33);
        this.Vest1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Vest1.addBox(-4.5F, 0.0F, 2.0F, 9, 12, 1, 0.0F);
        this.Bottle2 = new ModelRenderer(this, 52, 33);
        this.Bottle2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Bottle2.addBox(-3.5F, 1.5F, 3.0F, 3, 10, 3, 0.0F);
        this.Pipe1 = new ModelRenderer(this, 0, 53);
        this.Pipe1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Pipe1.addBox(-2.5F, 0.0F, 4.9F, 5, 1, 1, 0.0F);
        this.Pipe4 = new ModelRenderer(this, 0, 58);
        this.Pipe4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Pipe4.addBox(-0.5F, -0.15F, 3.1F, 1, 4, 1, 0.0F);
        this.setRotateAngle(Pipe4, 1.4114477660878142F, 0.0F, 0.0F);
        this.Vest3 = new ModelRenderer(this, 0, 33);
        this.Vest3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Vest3.addBox(3.5F, 8.0F, -2.5F, 1, 1, 5, 0.0F);
        this.Pipe3 = new ModelRenderer(this, 0, 58);
        this.Pipe3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Pipe3.addBox(-0.5F, -0.4F, 4.6F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Pipe3, 0.5811946409141118F, 0.0F, 0.0F);
        this.Connector2 = new ModelRenderer(this, 0, 53);
        this.Connector2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Connector2.addBox(-2.5F, 0.5F, 4.0F, 1, 1, 1, 0.0F);
        this.Vest6 = new ModelRenderer(this, 0, 33);
        this.Vest6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Vest6.addBox(-4.5F, 2.0F, -2.5F, 9, 1, 1, 0.0F);
        this.Pipe2 = new ModelRenderer(this, 0, 58);
        this.Pipe2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Pipe2.addBox(-0.5F, -0.5F, 4.8F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Pipe2, 0.22759093446006054F, 0.0F, 0.0F);
        
        this.bipedBody.addChild(Bottle2);
        this.bipedBody.addChild(Bottle1);
        this.bipedBody.addChild(Connector2);
        this.bipedBody.addChild(Connector1);
        this.bipedBody.addChild(Pipe3);
        this.bipedBody.addChild(Pipe4);
        this.bipedBody.addChild(Pipe1);
        this.bipedBody.addChild(Pipe2);
        this.bipedBody.addChild(Vest4);
        this.bipedBody.addChild(Vest2);
        this.bipedBody.addChild(Vest3);
        this.bipedBody.addChild(Vest7);
        this.bipedBody.addChild(Vest1);
        this.bipedBody.addChild(Vest5);
        this.bipedBody.addChild(Vest6);
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
