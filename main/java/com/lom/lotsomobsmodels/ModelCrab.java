package com.lom.lotsomobsmodels;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelCrab extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Eye_1;
    ModelRenderer Eye_2;
    ModelRenderer Arm_1;
    ModelRenderer Claw_1;
    ModelRenderer Claw_2;
    ModelRenderer Claw_4;
    ModelRenderer Claw_3;
    ModelRenderer Arm_2;
    ModelRenderer Foot5;
    ModelRenderer Foot6;
    ModelRenderer Foot8;
    ModelRenderer Foot7;
    ModelRenderer Foot1;
    ModelRenderer Foot2;
    ModelRenderer Foot3;
    ModelRenderer Foot4;
  
  public ModelCrab()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Body = new ModelRenderer(this, 15, 27);
      Body.addBox(0F, -1F, 0F, 8, 3, 8);
      Body.setRotationPoint(-4F, 20F, 4F);
      Body.setTextureSize(64, 64);
      Body.mirror = true;
      setRotation(Body, 0F, 1.570796F, 0F);
      Eye_1 = new ModelRenderer(this, 19, 21);
      Eye_1.addBox(-0.5F, 0F, -3.5F, 1, 1, 3);
      Eye_1.setRotationPoint(-2.5F, 20F, -2F);
      Eye_1.setTextureSize(64, 64);
      Eye_1.mirror = true;
      setRotation(Eye_1, -0.2617994F, 1.570796F, 0F);
      Eye_2 = new ModelRenderer(this, 35, 21);
      Eye_2.addBox(-0.5F, 0F, -3.5F, 1, 1, 3);
      Eye_2.setRotationPoint(-2.5F, 20F, 2F);
      Eye_2.setTextureSize(64, 64);
      Eye_2.mirror = true;
      setRotation(Eye_2, -0.2617994F, 1.570796F, 0F);
      Arm_1 = new ModelRenderer(this, 46, 23);
      Arm_1.addBox(-0.5F, 0F, -0.5F, 4, 1, 1);
      Arm_1.setRotationPoint(-4F, 21.5F, 4F);
      Arm_1.setTextureSize(64, 64);
      Arm_1.mirror = true;
      setRotation(Arm_1, 0F, -2.443461F, 0F);
      Claw_1 = new ModelRenderer(this, 52, 15);
      Claw_1.addBox(-1F, -1F, -4F, 1, 2, 4);
      Claw_1.setRotationPoint(-6F, 22F, 6F);
      Claw_1.setTextureSize(64, 64);
      Claw_1.mirror = true;
      setRotation(Claw_1, 0F, 1.570796F, 0F);
      Claw_2 = new ModelRenderer(this, 43, 15);
      Claw_2.addBox(0F, 0F, -3F, 1, 1, 3);
      Claw_2.setRotationPoint(-6F, 21.5F, 6F);
      Claw_2.setTextureSize(64, 64);
      Claw_2.mirror = true;
      setRotation(Claw_2, 0F, 1.570796F, 0F);
      Claw_4 = new ModelRenderer(this, 43, 15);
      Claw_4.addBox(-1F, 0F, -3F, 1, 1, 3);
      Claw_4.setRotationPoint(-6F, 21.5F, -6F);
      Claw_4.setTextureSize(64, 64);
      Claw_4.mirror = true;
      setRotation(Claw_4, 0F, 1.570796F, 0F);
      Claw_3 = new ModelRenderer(this, 52, 15);
      Claw_3.addBox(0F, -1F, -4F, 1, 2, 4);
      Claw_3.setRotationPoint(-6F, 22F, -5.9F);
      Claw_3.setTextureSize(64, 64);
      Claw_3.mirror = true;
      setRotation(Claw_3, 0F, 1.570796F, 0F);
      Arm_2 = new ModelRenderer(this, 46, 23);
      Arm_2.addBox(-0.5F, 0F, -0.5F, 4, 1, 1);
      Arm_2.setRotationPoint(-4F, 21.5F, -4F);
      Arm_2.setTextureSize(64, 64);
      Arm_2.mirror = true;
      setRotation(Arm_2, 0F, 2.443461F, 0F);
      Foot5 = new ModelRenderer(this, 7, 0);
      Foot5.addBox(0F, 0F, 0F, 1, 4, 1);
      Foot5.setRotationPoint(2F, 21F, -3.7F);
      Foot5.setTextureSize(64, 64);
      Foot5.mirror = true;
      setRotation(Foot5, -0.8922867F, -0.4089647F, 0F);
      Foot6 = new ModelRenderer(this, 7, 0);
      Foot6.addBox(0F, 0F, 0F, 1, 4, 1);
      Foot6.setRotationPoint(1F, 21F, -3.7F);
      Foot6.setTextureSize(64, 64);
      Foot6.mirror = true;
      setRotation(Foot6, -0.8922867F, 0F, 0F);
      Foot8 = new ModelRenderer(this, 7, 0);
      Foot8.addBox(-2F, 0F, 0F, 1, 4, 1);
      Foot8.setRotationPoint(-1F, 21F, -3.7F);
      Foot8.setTextureSize(64, 64);
      Foot8.mirror = true;
      setRotation(Foot8, -0.8179294F, 0.0371786F, 0F);
      Foot7 = new ModelRenderer(this, 7, 0);
      Foot7.addBox(-2F, 0F, 0F, 1, 4, 1);
      Foot7.setRotationPoint(1F, 21F, -3.7F);
      Foot7.setTextureSize(64, 64);
      Foot7.mirror = true;
      setRotation(Foot7, -0.8922867F, -0.1115358F, 0F);
      Foot1 = new ModelRenderer(this, 0, 0);
      Foot1.addBox(0F, 0F, 0F, 1, 4, 1);
      Foot1.setRotationPoint(2F, 22F, 3.3F);
      Foot1.setTextureSize(64, 64);
      Foot1.mirror = true;
      setRotation(Foot1, 1.041001F, 0.3717861F, 0F);
      Foot2 = new ModelRenderer(this, 0, 0);
      Foot2.addBox(0F, 0F, 0F, 1, 4, 1);
      Foot2.setRotationPoint(1F, 22F, 3.3F);
      Foot2.setTextureSize(64, 64);
      Foot2.mirror = true;
      setRotation(Foot2, 1.041001F, 0F, 0F);
      Foot3 = new ModelRenderer(this, 0, 0);
      Foot3.addBox(-2F, 0F, 0F, 1, 4, 1);
      Foot3.setRotationPoint(1F, 22F, 3.3F);
      Foot3.setTextureSize(64, 64);
      Foot3.mirror = true;
      setRotation(Foot3, 1.041001F, 0F, 0F);
      Foot4 = new ModelRenderer(this, 0, 0);
      Foot4.addBox(-2F, 0F, 0F, 1, 4, 1);
      Foot4.setRotationPoint(-1F, 22F, 3.9F);
      Foot4.setTextureSize(64, 64);
      Foot4.mirror = true;
      setRotation(Foot4, 1.041001F, -0.3717861F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Body.render(f5);
    Eye_1.render(f5);
    Eye_2.render(f5);
    Arm_1.render(f5);
    Claw_1.render(f5);
    Claw_2.render(f5);
    Claw_4.render(f5);
    Claw_3.render(f5);
    Arm_2.render(f5);
    Foot5.render(f5);
    Foot6.render(f5);
    Foot8.render(f5);
    Foot7.render(f5);
    Foot1.render(f5);
    Foot2.render(f5);
    Foot3.render(f5);
    Foot4.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
    Foot1.rotateAngleZ = MathHelper.cos(f * 0.6662F) * 1.2F * f1;
    Foot2.rotateAngleZ = MathHelper.cos(f * 0.6662F) * 1.2F * f1;
    Foot3.rotateAngleZ = MathHelper.cos(f * 0.6662F) * 1.2F * f1;
    Foot4.rotateAngleZ = MathHelper.cos(f * 0.6662F) * 1.2F * f1;
    Foot7.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.2F * f1;
    Foot8.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.2F * f1;
    Foot6.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.2F * f1;
    Foot5.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.2F * f1;
  }

}
