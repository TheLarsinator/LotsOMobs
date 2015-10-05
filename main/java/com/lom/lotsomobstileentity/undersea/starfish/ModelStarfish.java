package com.lom.lotsomobstileentity.undersea.starfish;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Starfish - Lars
 * Created using Tabula 4.1.1
 */
public class ModelStarfish extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer shape2;
    public ModelRenderer shape4;
    public ModelRenderer shape5;
    public ModelRenderer shape3;
    public ModelRenderer shape7;
    public ModelRenderer shape8;

    public ModelStarfish() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.shape3 = new ModelRenderer(this, 0, 0);
        this.shape3.setRotationPoint(0.0F, 23.0F, 0.0F);
        this.shape3.addBox(-3.8F, 0.0F, -0.4F, 3, 1, 1, 0.0F);
        this.setRotateAngle(shape3, 0.0F, 0.40980330836826856F, 0.0F);
        this.shape8 = new ModelRenderer(this, 0, 11);
        this.shape8.setRotationPoint(-0.5F, 22.9F, -0.4F);
        this.shape8.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape1 = new ModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(0.0F, 23.0F, 0.0F);
        this.shape1.addBox(-1.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F);
        this.shape4 = new ModelRenderer(this, 0, 0);
        this.shape4.setRotationPoint(0.0F, 23.0F, 0.0F);
        this.shape4.addBox(0.4F, 0.0F, -0.1F, 3, 1, 1, 0.0F);
        this.setRotateAngle(shape4, 0.0F, 1.1383037381507017F, 0.0F);
        this.shape5 = new ModelRenderer(this, 0, 0);
        this.shape5.setRotationPoint(0.0F, 23.0F, 0.0F);
        this.shape5.addBox(-3.6F, 0.0F, -0.2F, 3, 1, 1, 0.0F);
        this.setRotateAngle(shape5, 0.0F, -0.8651597102135892F, 0.0F);
        this.shape2 = new ModelRenderer(this, 0, 0);
        this.shape2.setRotationPoint(0.0F, 23.0F, 0.0F);
        this.shape2.addBox(0.7F, 0.0F, -0.4F, 3, 1, 1, 0.0F);
        this.setRotateAngle(shape2, 0.0F, -0.40980330836826856F, 0.0F);
        this.shape7 = new ModelRenderer(this, 0, 0);
        this.shape7.setRotationPoint(-0.5F, 23.0F, 0.4F);
        this.shape7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(shape7, 0.0F, -0.18203784098300857F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape3.render(f5);
        this.shape8.render(f5);
        this.shape1.render(f5);
        this.shape4.render(f5);
        this.shape5.render(f5);
        this.shape2.render(f5);
        this.shape7.render(f5);
    }
    
    public void renderAll() 
    {
    	float f5 = 0.0625F;
        this.shape3.render(f5);
        this.shape8.render(f5);
        this.shape1.render(f5);
        this.shape4.render(f5);
        this.shape5.render(f5);
        this.shape2.render(f5);
        this.shape7.render(f5);
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
