package com.lom.lotsomobsmodels;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

/**
 * ModelBison - Either Mojang or a mod author
 * Created using Tabula 4.1.1
 */
public class ModelBison extends ModelBase {
    public ModelRenderer thingy1;
    public ModelRenderer thingy2;
    public ModelRenderer horn2;
    public ModelRenderer horn1;
    public ModelRenderer thingy3;
    public ModelRenderer thingy4;
    public ModelRenderer head;
    public ModelRenderer foot1;
    public ModelRenderer headtop;
    public ModelRenderer foot5;
    public ModelRenderer foot2;
    public ModelRenderer foot4;
    public ModelRenderer horn4;
    public ModelRenderer bodymain;
    public ModelRenderer bodypart;
    public ModelRenderer horn3;
    public ModelRenderer tail;

    public ModelBison() {
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.bodymain = new ModelRenderer(this, 0, 0);
        this.bodymain.setRotationPoint(-8.0F, 0.0F, -8.0F);
        this.bodymain.addBox(0.0F, -1.0F, 0.0F, 16, 16, 16, 0.0F);
        this.thingy1 = new ModelRenderer(this, 110, 0);
        this.thingy1.setRotationPoint(4.5F, 12.0F, 14.5F);
        this.thingy1.addBox(0.0F, -3.0F, 0.0F, 4, 10, 5, 0.0F);
        this.horn1 = new ModelRenderer(this, 90, 0);
        this.horn1.setRotationPoint(-7.0F, 2.0F, -13.0F);
        this.horn1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.thingy2 = new ModelRenderer(this, 145, 0);
        this.thingy2.setRotationPoint(-7.5F, 17.0F, -6.0F);
        this.thingy2.addBox(0.0F, -4.0F, 0.0F, 4, 6, 5, 0.0F);
        this.foot2 = new ModelRenderer(this, 130, 0);
        this.foot2.setRotationPoint(4.0F, 16.0F, 14.0F);
        this.foot2.addBox(1.0F, 3.0F, 2.0F, 3, 5, 3, 0.0F);
        this.thingy3 = new ModelRenderer(this, 110, 0);
        this.thingy3.setRotationPoint(-8.5F, 12.0F, 14.5F);
        this.thingy3.addBox(0.0F, -3.0F, 0.0F, 4, 10, 5, 0.0F);
        this.bodypart = new ModelRenderer(this, 0, 40);
        this.bodypart.setRotationPoint(-7.5F, 0.0F, 5.0F);
        this.bodypart.addBox(0.0F, 0.0F, 0.0F, 15, 14, 16, 0.0F);
        this.horn3 = new ModelRenderer(this, 90, 0);
        this.horn3.setRotationPoint(5.0F, 2.0F, -13.0F);
        this.horn3.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.tail = new ModelRenderer(this, 75, 50);
        this.tail.setRotationPoint(-1.0F, 3.0F, 21.0F);
        this.tail.addBox(0.0F, 0.0F, 0.0F, 2, 1, 9, 0.0F);
        this.setRotateAngle(tail, -1.259429588239108F, 0.0F, 0.0F);
        this.foot1 = new ModelRenderer(this, 130, 0);
        this.foot1.setRotationPoint(-8.0F, 16.0F, 15.0F);
        this.foot1.addBox(0.0F, 3.0F, 0.0F, 3, 5, 3, 0.0F);
        this.horn2 = new ModelRenderer(this, 75, 0);
        this.horn2.setRotationPoint(-9.0F, -1.0F, -13.0F);
        this.horn2.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.foot4 = new ModelRenderer(this, 165, 0);
        this.foot4.setRotationPoint(-7.0F, 17.0F, -6.0F);
        this.foot4.addBox(0.0F, 2.0F, 1.0F, 3, 5, 3, 0.0F);
        this.headtop = new ModelRenderer(this, 0, 95);
        this.headtop.setRotationPoint(-5.0F, 1.0F, -17.0F);
        this.headtop.addBox(0.0F, 0.0F, 0.0F, 10, 4, 9, 0.0F);
        this.head = new ModelRenderer(this, 0, 75);
        this.head.setRotationPoint(-4.0F, 4.0F, -16.0F);
        this.head.addBox(0.0F, 0.0F, 0.0F, 8, 8, 8, 0.0F);
        this.thingy4 = new ModelRenderer(this, 145, 0);
        this.thingy4.setRotationPoint(3.5F, 17.0F, -6.0F);
        this.thingy4.addBox(0.0F, -4.0F, 0.0F, 4, 6, 5, 0.0F);
        this.horn4 = new ModelRenderer(this, 75, 0);
        this.horn4.setRotationPoint(7.0F, -1.0F, -13.0F);
        this.horn4.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.foot5 = new ModelRenderer(this, 165, 0);
        this.foot5.setRotationPoint(3.0F, 17.0F, -6.0F);
        this.foot5.addBox(1.0F, 2.0F, 1.0F, 3, 5, 3, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) 
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5);

        this.bodymain.render(f5);
        this.thingy1.render(f5);
        this.horn1.render(f5);
        this.thingy2.render(f5);
        this.foot2.render(f5);
        this.thingy3.render(f5);
        this.bodypart.render(f5);
        this.horn3.render(f5);
        this.tail.render(f5);
        this.foot1.render(f5);
        this.horn2.render(f5);
        this.foot4.render(f5);
        this.headtop.render(f5);
        this.head.render(f5);
        this.thingy4.render(f5);
        this.horn4.render(f5);
        this.foot5.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
    foot1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    thingy3.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    foot5.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    thingy4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    foot2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    thingy1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    thingy2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    foot4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    }
}
