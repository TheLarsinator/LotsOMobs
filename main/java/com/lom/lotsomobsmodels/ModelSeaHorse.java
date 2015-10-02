package com.lom.lotsomobsmodels;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Seahorse.tcn - NotZeuX
 * Created using Tabula 4.1.1
 */
public class ModelSeaHorse extends ModelBase {
    public ModelRenderer Shape2;
    public ModelRenderer Shape3;
    public ModelRenderer Shape21;
    public ModelRenderer Shape22;
    public ModelRenderer Shape23;
    public ModelRenderer Shape41;
    public ModelRenderer Shape42;
    public ModelRenderer Shape5;
    public ModelRenderer Shape4;
    public ModelRenderer Shape1;

    public ModelSeaHorse() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.Shape5 = new ModelRenderer(this, 0, 7);
        this.Shape5.setRotationPoint(1.5F, 17.0F, 0.5F);
        this.Shape5.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(Shape5, 0.0F, 0.0F, 0.17453292012214658F);
        this.Shape22 = new ModelRenderer(this, 6, 6);
        this.Shape22.setRotationPoint(-1.1F, 22.0F, 0.5F);
        this.Shape22.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Shape22, 0.0F, 0.0F, -0.33161255787892263F);
        this.Shape3 = new ModelRenderer(this, 0, 0);
        this.Shape3.setRotationPoint(-1.5F, 18.0F, 0.0F);
        this.Shape3.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(Shape3, 0.0F, 0.0F, -0.01745329238474369F);
        this.Shape23 = new ModelRenderer(this, 8, 0);
        this.Shape23.setRotationPoint(-1.4F, 21.0F, 0.5F);
        this.Shape23.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Shape23, 0.0F, 0.0F, -0.3141592653589793F);
        this.Shape41 = new ModelRenderer(this, 0, 5);
        this.Shape41.setRotationPoint(-2.0F, 20.0F, 1.0F);
        this.Shape41.addBox(0.0F, -1.0F, 0.0F, 1, 2, 0, 0.0F);
        this.Shape2 = new ModelRenderer(this, 0, 9);
        this.Shape2.setRotationPoint(0.0F, 17.0F, 0.5F);
        this.Shape2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Shape2, 0.0F, 0.0F, 0.3141592741012573F);
        this.Shape1 = new ModelRenderer(this, 12, 0);
        this.Shape1.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.Shape1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.Shape21 = new ModelRenderer(this, 0, 9);
        this.Shape21.setRotationPoint(0.0F, 17.0F, 0.5F);
        this.Shape21.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Shape21, 0.0F, 0.0F, 0.8203047484373349F);
        this.Shape4 = new ModelRenderer(this, 0, 12);
        this.Shape4.setRotationPoint(0.0F, 15.0F, 1.0F);
        this.Shape4.addBox(0.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F);
        this.setRotateAngle(Shape4, 0.0F, 0.0F, 0.5235987901687622F);
        this.Shape42 = new ModelRenderer(this, 0, 5);
        this.Shape42.setRotationPoint(-2.0F, 20.73F, 1.0F);
        this.Shape42.addBox(0.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F);
        this.setRotateAngle(Shape42, 0.0F, 0.0F, -0.3141592653589793F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Shape5.render(f5);
        this.Shape22.render(f5);
        this.Shape3.render(f5);
        this.Shape23.render(f5);
        this.Shape41.render(f5);
        this.Shape2.render(f5);
        this.Shape1.render(f5);
        this.Shape21.render(f5);
        this.Shape4.render(f5);
        this.Shape42.render(f5);
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
