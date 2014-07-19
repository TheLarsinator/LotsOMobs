package com.lom.lotsomobsmodels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
@SideOnly(Side.CLIENT)
public class ModelLOMBase extends ModelBase {
 /** Adds a child part to a parent part to keep them together. E.G A snout on a boars head.  **/
 protected void addChildTo(ModelRenderer child, ModelRenderer parent){
  // Move the child to a position that is relative to the parent 
  child.rotationPointX -= parent.rotationPointX;
  child.rotationPointY -= parent.rotationPointY;
  child.rotationPointZ -= parent.rotationPointZ;
  
  child.rotateAngleX -= parent.rotateAngleX;
  child.rotateAngleY -= parent.rotateAngleY;
  child.rotateAngleZ -= parent.rotateAngleZ;
  // Actually add it
  parent.addChild(child);
 }
}