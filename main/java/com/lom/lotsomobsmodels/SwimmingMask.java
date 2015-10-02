package com.lom.lotsomobsmodels;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Snorkel Mask.tcn - NotZeuX
 * Created using Tabula 4.1.1
 */
public class SwimmingMask extends ModelBiped {
    public ModelRenderer Shape1;
    public ModelRenderer Shape2;
    public ModelRenderer Shape3;
    public ModelRenderer Shape4;
    public ModelRenderer Shape5;
    public ModelRenderer Shape6;
    public ModelRenderer Shape7;
    public ModelRenderer Shape8;
    public ModelRenderer Shape9;
    public ModelRenderer Shape10;
    public ModelRenderer Shape11;
    public ModelRenderer Shape13;
    public ModelRenderer Shape17;
    public ModelRenderer Shape15;
    public ModelRenderer Shape16;
    public ModelRenderer Shape12;
    public ModelRenderer Shape14;
    public ModelRenderer Shape18;

    public SwimmingMask(float f) 
    {
  	  	super(f, 0, 64, 64);

  	  this.textureWidth = 64;
      this.textureHeight = 64;
      this.Shape2 = new ModelRenderer(this, 0, 33);
      this.Shape2.setRotationPoint(0.0F, 0.0F, 0.0F);
      this.Shape2.addBox(-2.3F, -3.0F, -5.0F, 3, 1, 1, 0.0F);
      this.setRotateAngle(Shape2, 0.0F, 0.0F, -0.3569198320328404F);
      this.Shape11 = new ModelRenderer(this, 0, 39);
      this.Shape11.setRotationPoint(0.0F, 0.0F, 0.0F);
      this.Shape11.addBox(4.0F, -3.5F, -4.0F, 1, 1, 8, 0.0F);
      this.Shape13 = new ModelRenderer(this, 0, 39);
      this.Shape13.setRotationPoint(0.0F, 0.0F, 0.0F);
      this.Shape13.addBox(-4.0F, -3.5F, 4.0F, 8, 1, 1, 0.0F);
      this.Shape8 = new ModelRenderer(this, 9, 57);
      this.Shape8.setRotationPoint(0.0F, 0.0F, 0.0F);
      this.Shape8.addBox(-3.5F, -4.0F, -4.5F, 3, 2, 0, 0.0F);
      this.Shape3 = new ModelRenderer(this, 0, 33);
      this.Shape3.setRotationPoint(0.0F, 0.0F, 0.0F);
      this.Shape3.addBox(-4.5F, -5.0F, -5.0F, 9, 1, 1, 0.0F);
      this.Shape15 = new ModelRenderer(this, 0, 33);
      this.Shape15.setRotationPoint(0.0F, 0.0F, 0.0F);
      this.Shape15.addBox(-0.5F, -1.0F, -5.5F, 1, 1, 1, 0.0F);
      this.Shape1 = new ModelRenderer(this, 0, 33);
      this.Shape1.setRotationPoint(0.0F, 0.0F, 0.0F);
      this.Shape1.addBox(2.4F, -2.0F, -5.0F, 2, 1, 1, 0.0F);
      this.Shape9 = new ModelRenderer(this, 0, 33);
      this.Shape9.setRotationPoint(0.0F, 0.0F, 0.0F);
      this.Shape9.addBox(-0.6F, -3.0F, -5.0F, 3, 1, 1, 0.0F);
      this.setRotateAngle(Shape9, 0.0F, 0.0F, 0.3569198320328404F);
      this.Shape18 = new ModelRenderer(this, 0, 33);
      this.Shape18.setRotationPoint(0.0F, 0.0F, 0.0F);
      this.Shape18.addBox(-0.5F, -1.0F, -6.5F, 2, 1, 1, 0.0F);
      this.Shape5 = new ModelRenderer(this, 0, 33);
      this.Shape5.setRotationPoint(0.0F, 0.0F, 0.0F);
      this.Shape5.addBox(-4.5F, -4.0F, -5.0F, 1, 2, 1, 0.0F);
      this.Shape16 = new ModelRenderer(this, 0, 33);
      this.Shape16.setRotationPoint(0.0F, 0.0F, 0.0F);
      this.Shape16.addBox(4.5F, -12.0F, -6.5F, 1, 11, 1, 0.0F);
      this.Shape4 = new ModelRenderer(this, -1, 33);
      this.Shape4.setRotationPoint(0.0F, 0.0F, 0.0F);
      this.Shape4.addBox(3.5F, -4.0F, -5.0F, 1, 3, 1, 0.0F);
      this.Shape17 = new ModelRenderer(this, 0, 52);
      this.Shape17.setRotationPoint(0.0F, 0.0F, 0.0F);
      this.Shape17.addBox(1.5F, -1.0F, -6.5F, 2, 1, 1, 0.0F);
      this.Shape14 = new ModelRenderer(this, 0, 33);
      this.Shape14.setRotationPoint(0.0F, 0.0F, 0.0F);
      this.Shape14.addBox(3.5F, -1.0F, -6.5F, 2, 1, 1, 0.0F);
      this.Shape12 = new ModelRenderer(this, 0, 39);
      this.Shape12.setRotationPoint(0.0F, 0.0F, 0.0F);
      this.Shape12.addBox(-5.0F, -3.5F, -4.0F, 1, 1, 8, 0.0F);
      this.Shape6 = new ModelRenderer(this, 0, 33);
      this.Shape6.setRotationPoint(0.0F, 0.0F, 0.0F);
      this.Shape6.addBox(-0.5F, -3.1F, -5.0F, 1, 1, 1, 0.0F);
      this.Shape7 = new ModelRenderer(this, 8, 57);
      this.Shape7.setRotationPoint(0.0F, 0.0F, 0.0F);
      this.Shape7.addBox(-0.5F, -4.0F, -4.5F, 4, 2, 0, 0.0F);
      this.Shape10 = new ModelRenderer(this, 0, 33);
      this.Shape10.setRotationPoint(0.0F, 0.0F, 0.0F);
      this.Shape10.addBox(-4.5F, -2.0F, -5.0F, 2, 1, 1, 0.0F);
        

       this.bipedHead.addChild(Shape1);
       this.bipedHead.addChild(Shape2);
       this.bipedHead.addChild(Shape3);
       this.bipedHead.addChild(Shape4);
       this.bipedHead.addChild(Shape5);
       this.bipedHead.addChild(Shape6);
       this.bipedHead.addChild(Shape7);
       this.bipedHead.addChild(Shape8);
       this.bipedHead.addChild(Shape9);
       this.bipedHead.addChild(Shape10);
       this.bipedHead.addChild(Shape11);
       this.bipedHead.addChild(Shape13);
       this.bipedHead.addChild(Shape17);
       this.bipedHead.addChild(Shape15);
       this.bipedHead.addChild(Shape16);
       this.bipedHead.addChild(Shape12);
       this.bipedHead.addChild(Shape14);
       this.bipedHead.addChild(Shape18);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
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
