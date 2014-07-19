package com.lom.lotsomobsmodels;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelHammerShark extends ModelBase
{
  //fields
    ModelRenderer Head1;
    ModelRenderer RightEye;
    ModelRenderer LeftEye;
    ModelRenderer Head2;
    ModelRenderer Jaw;
    ModelRenderer Neck;
    ModelRenderer Body;
    ModelRenderer RightFin;
    ModelRenderer LeftFin;
    ModelRenderer BackFin1;
    ModelRenderer Tail1;
    ModelRenderer BackLeftFin;
    ModelRenderer BackRightFin;
    ModelRenderer Tail2;
    ModelRenderer BackFin2;
    ModelRenderer BottomFin;
    ModelRenderer Tail3;
    ModelRenderer TailBottom;
    ModelRenderer TailTop;
  
  public ModelHammerShark()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      Head1 = new ModelRenderer(this, 54, 122);
      Head1.addBox(-7F, 0F, -15F, 14, 1, 4);
      Head1.setRotationPoint(0F, 19.5F, -5F);
      Head1.setTextureSize(128, 128);
      Head1.mirror = true;
      setRotation(Head1, 0F, 0F, 0F);
      RightEye = new ModelRenderer(this, 49, 115);
      RightEye.addBox(-7F, -0.5F, -15F, 1, 1, 4);
      RightEye.setRotationPoint(0F, 19.5F, -5F);
      RightEye.setTextureSize(128, 128);
      RightEye.mirror = true;
      setRotation(RightEye, 0F, 0F, 0F);
      LeftEye = new ModelRenderer(this, 87, 115);
      LeftEye.addBox(6F, -0.5F, -15F, 1, 1, 4);
      LeftEye.setRotationPoint(0F, 19.5F, -5F);
      LeftEye.setTextureSize(128, 128);
      LeftEye.mirror = true;
      setRotation(LeftEye, 0F, 0F, 0F);
      Head2 = new ModelRenderer(this, 61, 110);
      Head2.addBox(-2.5F, 0F, -13F, 5, 2, 7);
      Head2.setRotationPoint(0F, 18.5F, -5F);
      Head2.setTextureSize(128, 128);
      Head2.mirror = true;
      setRotation(Head2, 0F, 0F, 0F);
      Jaw = new ModelRenderer(this, 66, 103);
      Jaw.addBox(-1.5F, 0F, -10F, 3, 1, 4);
      Jaw.setRotationPoint(0F, 20.5F, -5F);
      Jaw.setTextureSize(128, 128);
      Jaw.mirror = true;
      setRotation(Jaw, 0F, 0F, 0F);
      Neck = new ModelRenderer(this, 61, 89);
      Neck.addBox(-3F, 0F, -6F, 6, 5, 6);
      Neck.setRotationPoint(0F, 17F, -5F);
      Neck.setTextureSize(128, 128);
      Neck.mirror = true;
      setRotation(Neck, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 55, 69);
      Body.addBox(-4F, -2F, -5F, 8, 7, 11);
      Body.setRotationPoint(0F, 17.5F, 0F);
      Body.setTextureSize(128, 128);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      RightFin = new ModelRenderer(this, 25, 81);
      RightFin.addBox(-9F, 0F, 0F, 9, 1, 4);
      RightFin.setRotationPoint(-4F, 21F, -5F);
      RightFin.setTextureSize(128, 128);
      RightFin.mirror = true;
      setRotation(RightFin, 0.2974216F, 0.3490659F, -0.074351F);
      LeftFin = new ModelRenderer(this, 97, 81);
      LeftFin.addBox(0F, 0F, 0F, 9, 1, 4);
      LeftFin.setRotationPoint(4F, 21F, -5F);
      LeftFin.setTextureSize(128, 128);
      LeftFin.mirror = true;
      setRotation(LeftFin, 0.2974289F, -0.3490659F, 0.0743572F);
      BackFin1 = new ModelRenderer(this, 53, 67);
      BackFin1.addBox(-0.5F, -6F, 0F, 1, 6, 4);
      BackFin1.setRotationPoint(0F, 15.5F, -2.5F);
      BackFin1.setTextureSize(128, 128);
      BackFin1.mirror = true;
      setRotation(BackFin1, -0.5235988F, 0F, 0F);
      Tail1 = new ModelRenderer(this, 59, 51);
      Tail1.addBox(-3F, 0F, 0F, 6, 6, 9);
      Tail1.setRotationPoint(0F, 16F, 6F);
      Tail1.setTextureSize(128, 128);
      Tail1.mirror = true;
      setRotation(Tail1, 0F, 0F, 0F);
      BackLeftFin = new ModelRenderer(this, 92, 57);
      BackLeftFin.addBox(0F, 0F, 0F, 3, 1, 2);
      BackLeftFin.setRotationPoint(3F, 20.5F, 12.5F);
      BackLeftFin.setTextureSize(128, 128);
      BackLeftFin.mirror = true;
      setRotation(BackLeftFin, 0F, -0.4712389F, 0F);
      BackRightFin = new ModelRenderer(this, 45, 57);
      BackRightFin.addBox(-3F, 0F, 0F, 3, 1, 2);
      BackRightFin.setRotationPoint(-3F, 20.5F, 12.5F);
      BackRightFin.setTextureSize(128, 128);
      BackRightFin.mirror = true;
      setRotation(BackRightFin, 0F, 0.4712389F, 0F);
      Tail2 = new ModelRenderer(this, 62, 37);
      Tail2.addBox(-2F, 0F, 9F, 4, 4, 8);
      Tail2.setRotationPoint(0F, 17.5F, 6F);
      Tail2.setTextureSize(128, 128);
      Tail2.mirror = true;
      setRotation(Tail2, 0F, 0F, 0F);
      BackFin2 = new ModelRenderer(this, 61, 37);
      BackFin2.addBox(-0.5F, -9F, 10F, 1, 2, 2);
      BackFin2.setRotationPoint(0F, 17.5F, 6F);
      BackFin2.setTextureSize(128, 128);
      BackFin2.mirror = true;
      setRotation(BackFin2, -0.6108652F, 0F, 0F);
      BottomFin = new ModelRenderer(this, 81, 37);
      BottomFin.addBox(-0.5F, 7F, 10F, 1, 2, 2);
      BottomFin.setRotationPoint(0F, 21.5F, 6F);
      BottomFin.setTextureSize(128, 128);
      BottomFin.mirror = true;
      setRotation(BottomFin, 0.6108652F, 0F, 0F);
      Tail3 = new ModelRenderer(this, 67, 28);
      Tail3.addBox(-1.5F, 0F, 17F, 3, 3, 4);
      Tail3.setRotationPoint(0F, 18F, 6F);
      Tail3.setTextureSize(128, 128);
      Tail3.mirror = true;
      setRotation(Tail3, 0F, 0F, 0F);
      TailBottom = new ModelRenderer(this, 79, 20);
      TailBottom.addBox(-0.5F, 12F, 15F, 1, 5, 4);
      TailBottom.setRotationPoint(0F, 20F, 6F);
      TailBottom.setTextureSize(128, 128);
      TailBottom.mirror = true;
      setRotation(TailBottom, 0.6457718F, 0F, 0F);
      TailTop = new ModelRenderer(this, 57, 14);
      TailTop.addBox(-0.5F, -22F, 15F, 1, 10, 4);
      TailTop.setRotationPoint(0F, 18F, 6F);
      TailTop.setTextureSize(128, 128);
      TailTop.mirror = true;
      setRotation(TailTop, -0.6981317F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Head1.render(f5);
    RightEye.render(f5);
    LeftEye.render(f5);
    Head2.render(f5);
    Jaw.render(f5);
    Neck.render(f5);
    Body.render(f5);
    RightFin.render(f5);
    LeftFin.render(f5);
    BackFin1.render(f5);
    Tail1.render(f5);
    BackLeftFin.render(f5);
    BackRightFin.render(f5);
    Tail2.render(f5);
    BackFin2.render(f5);
    BottomFin.render(f5);
    Tail3.render(f5);
    TailBottom.render(f5);
    TailTop.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    
    //TAIL
    this.Tail1.rotateAngleY = MathHelper.cos(f * 0.3332F) * 0.6F * f1;
    this.BackLeftFin.rotateAngleY = MathHelper.cos(f * 0.3332F) * 0.6F * f1;
    this.BackRightFin.rotateAngleY = MathHelper.cos(f * 0.3332F) * 0.6F * f1;
    
    this.Tail2.rotateAngleY = MathHelper.cos(f * 0.3332F) * 0.8F * f1;
    this.BackFin2.rotateAngleY = MathHelper.cos(f * 0.3332F) * 0.8F * f1;
    this.BottomFin.rotateAngleY = MathHelper.cos(f * 0.3332F) * 0.8F * f1;    
    
    this.Tail3.rotateAngleY = MathHelper.cos(f * 0.3332F) * 0.95F * f1;
    
    this.TailTop.rotateAngleY = MathHelper.cos(f * 0.3332F) * 1.1F * f1;
    this.TailBottom.rotateAngleY = MathHelper.cos(f * 0.3332F) * 1.1F * f1;
    
    //HEAD
    this.Neck.rotateAngleY = MathHelper.cos(f * 0.3332F) * 0.3F * f1;
    
    this.Head2.rotateAngleY = MathHelper.cos(f * 0.3332F) * 0.4F * f1;
    this.Jaw.rotateAngleY = MathHelper.cos(f * 0.3332F) * 0.4F * f1;
    
    this.Head1.rotateAngleY = MathHelper.cos(f * 0.3332F) * 0.5F * f1;
    this.RightEye.rotateAngleY = MathHelper.cos(f * 0.3332F) * 0.5F * f1;
    this.LeftEye.rotateAngleY = MathHelper.cos(f * 0.3332F) * 0.5F * f1;
    
    //FINS
    this.LeftFin.rotateAngleY = MathHelper.cos(f * 0.3332F) * .4F * f1;
    this.RightFin.rotateAngleY = MathHelper.cos(f * 0.3332F + (float)Math.PI) * .4F * f1;

  }

}
