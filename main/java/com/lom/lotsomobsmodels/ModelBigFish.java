package com.lom.lotsomobsmodels;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Birgeria.tcn - NotZeuX
 * Created using Tabula 4.1.1
 */
public class ModelBigFish extends ModelBase {
    public ModelRenderer Shape1;
    public ModelRenderer Shape2;
    public ModelRenderer Shape3;
    public ModelRenderer Shape4;
    public ModelRenderer Shape5;
    public ModelRenderer Shape6;
    public ModelRenderer Shape11;
    public ModelRenderer Shape7;
    public ModelRenderer Shape8;
    public ModelRenderer Shape12;
    public ModelRenderer Shape91;
    public ModelRenderer Shape92;
    public ModelRenderer Shape93;
    public ModelRenderer Shape94;
    public ModelRenderer Shape101;
    public ModelRenderer Shape10;

    public ModelBigFish() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Shape2 = new ModelRenderer(this, 0, 0);
        this.Shape2.setRotationPoint(-0.10000000149011612F, 21.0F, -3.0F);
        this.Shape2.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(Shape2, 0.0F, -0.01884955592153876F, 0.0F);
        this.Shape5 = new ModelRenderer(this, 0, 15);
        this.Shape5.setRotationPoint(0.0F, 21.5F, 2.0F);
        this.Shape5.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Shape5, 0.0F, -0.01884955592153876F, 0.0F);
        this.Shape6 = new ModelRenderer(this, 0, 22);
        this.Shape6.setRotationPoint(0.0F, 21.5F, 3.5F);
        this.Shape6.addBox(0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F);
        this.setRotateAngle(Shape6, -0.5235987901687622F, -0.01884955592153876F, 0.0F);
        this.Shape91 = new ModelRenderer(this, 0, 24);
        this.Shape91.setRotationPoint(-0.7F, 23.7F, -3.0F);
        this.Shape91.addBox(0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F);
        this.setRotateAngle(Shape91, 0.6981317007977318F, -0.01884955592153876F, 0.5235987755982988F);
        this.Shape94 = new ModelRenderer(this, 0, 24);
        this.Shape94.setRotationPoint(0.5F, 23.5F, 0.0F);
        this.Shape94.addBox(0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F);
        this.setRotateAngle(Shape94, 0.6981317007977318F, -0.01884955592153876F, -0.5235987755982988F);
        this.Shape3 = new ModelRenderer(this, 0, 7);
        this.Shape3.setRotationPoint(0.0F, 23.600000381469727F, -4.0F);
        this.Shape3.addBox(-0.5F, -1.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Shape3, -0.13962633907794952F, -0.01884955592153876F, 0.0F);
        this.Shape4 = new ModelRenderer(this, 0, 11);
        this.Shape4.setRotationPoint(0.0F, 24.0F, -1.0F);
        this.Shape4.addBox(-0.5F, -1.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Shape4, 0.34906584024429316F, -0.01884955592153876F, 0.0F);
        this.Shape7 = new ModelRenderer(this, 0, 24);
        this.Shape7.setRotationPoint(0.0F, 21.0F, 1.0F);
        this.Shape7.addBox(0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F);
        this.setRotateAngle(Shape7, -0.6981316804885863F, -0.01884955592153876F, 0.0F);
        this.Shape12 = new ModelRenderer(this, 0, 0);
        this.Shape12.setRotationPoint(0.1F, 21.0F, -3.0F);
        this.Shape12.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(Shape12, 0.0F, -0.01884955592153876F, 0.0F);
        this.Shape8 = new ModelRenderer(this, 18, 0);
        this.Shape8.setRotationPoint(0.0F, 23.600000381469727F, -4.0F);
        this.Shape8.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F);
        this.setRotateAngle(Shape8, 0.5235987901687622F, -0.01884955592153876F, 0.0F);
        this.Shape101 = new ModelRenderer(this, 20, 0);
        this.Shape101.setRotationPoint(0.4F, 22.3F, -3.78F);
        this.Shape101.addBox(-1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Shape101, 0.0F, -0.01884955592153876F, 0.0F);
        this.Shape11 = new ModelRenderer(this, 0, 20);
        this.Shape11.setRotationPoint(0.0F, 21.5F, 3.0F);
        this.Shape11.addBox(0.0F, 0.0F, 0.0F, 0, 1, 3, 0.0F);
        this.setRotateAngle(Shape11, 0.5235987755982988F, -0.01884955592153876F, 0.0F);
        this.Shape10 = new ModelRenderer(this, 20, 0);
        this.Shape10.setRotationPoint(-0.4000000059604645F, 22.299999237060547F, -3.7799999713897705F);
        this.Shape10.addBox(0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Shape10, 0.0F, -0.01884955592153876F, 0.0F);
        this.Shape1 = new ModelRenderer(this, 12, 0);
        this.Shape1.setRotationPoint(0.0F, 21.0F, -3.0F);
        this.Shape1.addBox(-0.5F, 0.0F, -2.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(Shape1, 0.43633231520652765F, -0.01884955592153876F, 0.0F);
        this.Shape93 = new ModelRenderer(this, 0, 24);
        this.Shape93.setRotationPoint(-0.5F, 23.5F, 0.0F);
        this.Shape93.addBox(0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F);
        this.setRotateAngle(Shape93, 0.6981317007977318F, -0.01884955592153876F, 0.5235987755982988F);
        this.Shape92 = new ModelRenderer(this, 0, 24);
        this.Shape92.setRotationPoint(0.7F, 23.7F, -3.0F);
        this.Shape92.addBox(0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F);
        this.setRotateAngle(Shape92, 0.6981317007977318F, -0.01884955592153876F, -0.5235987755982988F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Shape2.render(f5);
        this.Shape5.render(f5);
        this.Shape6.render(f5);
        this.Shape91.render(f5);
        this.Shape94.render(f5);
        this.Shape3.render(f5);
        this.Shape4.render(f5);
        this.Shape7.render(f5);
        this.Shape12.render(f5);
        this.Shape8.render(f5);
        this.Shape101.render(f5);
        this.Shape11.render(f5);
        this.Shape10.render(f5);
        this.Shape1.render(f5);
        this.Shape93.render(f5);
        this.Shape92.render(f5);
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
