// Date: 11/20/2018 1:34:30 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package fr.alasdiablo.azbrs.race.zombie;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelZombieMale extends ModelBiped {
    //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftleg;
    ModelRenderer armsLeft1;
    ModelRenderer armsLeft2;
    ModelRenderer armsLeft3;
    ModelRenderer armsLeft4;
    ModelRenderer armsLeft5;
    ModelRenderer rightLeg1;
    ModelRenderer rightLeg2;
    ModelRenderer rightLeg3;
    ModelRenderer rightLeg4;

    public ModelZombieMale(float scale) {
        super(scale, 0, 192, 64);
        textureWidth = 192;
        textureHeight = 64;

        head = new ModelRenderer(this,  64, 0);
        head.addBox(-4F, -8F, -4F, 8, 8, 8);
        head.setRotationPoint(0F, 0F, 0F);
        head.setTextureSize(128, 64);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        body = new ModelRenderer(this, 16 + 64, 16);
        body.addBox(-4F, 0F, -2F, 8, 12, 4);
        body.setRotationPoint(0F, 0F, 0F);
        body.setTextureSize(128, 64);
        body.mirror = true;
        setRotation(body, 0F, 0F, 0F);
        rightarm = new ModelRenderer(this, 40 + 64, 16);
        rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
        rightarm.setRotationPoint(0F, 0F, 0F);
        rightarm.setTextureSize(128, 64);
        rightarm.mirror = true;
        setRotation(rightarm, 0F, 0F, 0F);
        leftleg = new ModelRenderer(this, 64, 16);
        leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
        leftleg.setRotationPoint(0F, 0F, 0F);
        leftleg.setTextureSize(128, 64);
        leftleg.mirror = true;
        setRotation(leftleg, 0F, 0F, 0F);
        armsLeft1 = new ModelRenderer(this, 40 + 64, 16);
        armsLeft1.addBox(-1F, -2F, -2F, 4, 7, 4);
        armsLeft1.setRotationPoint(0F, 0F, 0F);
        armsLeft1.setTextureSize(128, 64);
        armsLeft1.mirror = true;
        setRotation(armsLeft1, 0F, 0F, 0F);
        armsLeft2 = new ModelRenderer(this, 64 + 64, 0);
        armsLeft2.addBox(0F, 5F, -1F, 2, 3, 2);
        armsLeft2.setRotationPoint(0F, 0F, 0F);
        armsLeft2.setTextureSize(128, 64);
        armsLeft2.mirror = true;
        setRotation(armsLeft2, 0F, 0F, 0F);
        armsLeft3 = new ModelRenderer(this, 64 + 64, 5);
        armsLeft3.addBox(1F, 7F, -1F, 2, 2, 2);
        armsLeft3.setRotationPoint(0F, 0F, 0F);
        armsLeft3.setTextureSize(128, 64);
        armsLeft3.mirror = true;
        setRotation(armsLeft3, 0F, 0F, 0F);
        armsLeft4 = new ModelRenderer(this, 64 + 64, 9);
        armsLeft4.addBox(-1F, 7F, -1F, 1, 2, 2);
        armsLeft4.setRotationPoint(0F, 0F, 0F);
        armsLeft4.setTextureSize(128, 64);
        armsLeft4.mirror = true;
        setRotation(armsLeft4, 0F, 0F, 0F);
        armsLeft5 = new ModelRenderer(this, 90 + 64, 4);
        armsLeft5.addBox(-1F, 5F, -2F, 3, 1, 3);
        armsLeft5.setRotationPoint(0F, 0F, 0F);
        armsLeft5.setTextureSize(128, 64);
        armsLeft5.mirror = true;
        setRotation(armsLeft5, 0F, 0F, 0F);
        rightLeg1 = new ModelRenderer(this, 64, 16);
        rightLeg1.addBox(-2F, 0F, -2F, 4, 6, 4);
        rightLeg1.setRotationPoint(0F, 0F, 0F);
        rightLeg1.setTextureSize(128, 64);
        rightLeg1.mirror = true;
        setRotation(rightLeg1, 0F, 0F, 0F);
        rightLeg2 = new ModelRenderer(this, 72 + 64, 0);
        rightLeg2.addBox(-1F, 6F, 0F, 2, 5, 1);
        rightLeg2.setRotationPoint(0F, 0F, 0F);
        rightLeg2.setTextureSize(128, 64);
        rightLeg2.mirror = true;
        setRotation(rightLeg2, 0F, 0F, 0F);
        rightLeg3 = new ModelRenderer(this, 78 + 64, 0);
        rightLeg3.addBox(-1F, 6F, -1F, 1, 6, 1);
        rightLeg3.setRotationPoint(0F, 0F, 0F);
        rightLeg3.setTextureSize(128, 64);
        rightLeg3.mirror = true;
        setRotation(rightLeg3, 0F, 0F, 0F);
        rightLeg4 = new ModelRenderer(this, 90 + 64, 0);
        rightLeg4.addBox(-2F, 6F, -2F, 3, 1, 3);
        rightLeg4.setRotationPoint(0F, 0F, 0F);
        rightLeg4.setTextureSize(128, 64);
        rightLeg4.mirror = true;
        setRotation(rightLeg4, 0F, 0F, 0F);

        bipedHeadwear.showModel = false;

        bipedHead.addChild(head);
        bipedBody.addChild(body);
        bipedRightArm.addChild(rightarm);
        bipedLeftArm.addChild(armsLeft1);
        bipedLeftArm.addChild(armsLeft2);
        bipedLeftArm.addChild(armsLeft3);
        bipedLeftArm.addChild(armsLeft4);
        bipedLeftArm.addChild(armsLeft5);
        bipedRightLeg.addChild(rightLeg1);
        bipedRightLeg.addChild(rightLeg2);
        bipedRightLeg.addChild(rightLeg3);
        bipedRightLeg.addChild(rightLeg4);
        bipedLeftLeg.addChild(leftleg);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
