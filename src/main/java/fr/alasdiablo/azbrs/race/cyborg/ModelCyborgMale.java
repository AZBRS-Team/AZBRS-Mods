package fr.alasdiablo.azbrs.race.cyborg;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCyborgMale extends ModelBiped {

    ModelRenderer antena1;
    ModelRenderer antena2;
    ModelRenderer headset1;
    ModelRenderer headset2;
    ModelRenderer headset3;
    ModelRenderer cyborgleftleg1;
    ModelRenderer cyborgrightleg1;
    ModelRenderer gasmask1;
    ModelRenderer gasmask2;
    ModelRenderer gasmask3;
    ModelRenderer glass1;
    ModelRenderer glass2;
    ModelRenderer glass3;
    ModelRenderer glass4;
    ModelRenderer glass5;
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;

    public ModelCyborgMale(float scale) {
        super(scale, 0, 128, 64);

        textureWidth = 128;
        textureHeight = 64;

        antena1 = new ModelRenderer(this, 64, 32);
        antena1.addBox(4F, -11F, -2F, 1, 5, 1);
        antena1.setRotationPoint(0F, 0F, 0F);
        antena1.setTextureSize(64, 64);
        antena1.mirror = false;
        setRotation(antena1, -0.2792527F, 0F, 0F);
        antena2 = new ModelRenderer(this, 64, 32);
        antena2.addBox(-5F, -11F, -2F, 1, 5, 1);
        antena2.setRotationPoint(0F, 0F, 0F);
        antena2.setTextureSize(64, 64);
        antena2.mirror = true;
        setRotation(antena2, -0.2792527F, 0F, 0F);
        headset1 = new ModelRenderer(this, 4 + 64, 32);
        headset1.addBox(-5F, -6F, -1F, 1, 3, 3);
        headset1.setRotationPoint(0F, 0F, 0F);
        headset1.setTextureSize(64, 64);
        headset1.mirror = true;
        setRotation(headset1, 0F, 0F, 0F);
        headset2 = new ModelRenderer(this, 4 + 64, 32);
        headset2.addBox(4F, -6F, -1F, 1, 3, 3);
        headset2.setRotationPoint(0F, 0F, 0F);
        headset2.setTextureSize(64, 64);
        headset2.mirror = false;
        setRotation(headset2, 0F, 0F, 0F);
        headset3 = new ModelRenderer(this, 64, 38);
        headset3.addBox(-5F, -3F, -5F, 1, 1, 5);
        headset3.setRotationPoint(0F, 0F, 0F);
        headset3.setTextureSize(64, 64);
        headset3.mirror = true;
        setRotation(headset3, 0.2792527F, 0F, 0F);
        cyborgleftleg1 = new ModelRenderer(this, 64, 44);
        cyborgleftleg1.addBox(-1F, 6F, 2F, 2, 6, 1);
        cyborgleftleg1.setRotationPoint(0F, 0F, 0F);
        cyborgleftleg1.setTextureSize(64, 64);
        cyborgleftleg1.mirror = true;
        setRotation(cyborgleftleg1, 0F, 0F, 0F);
        cyborgrightleg1 = new ModelRenderer(this, 64, 44);
        cyborgrightleg1.addBox(-1F, 6F, 2F, 2, 6, 1);
        cyborgrightleg1.setRotationPoint(0F, 0F, 0F);
        cyborgrightleg1.setTextureSize(64, 64);
        cyborgrightleg1.mirror = true;
        setRotation(cyborgrightleg1, 0F, 0F, 0F);
        gasmask1 = new ModelRenderer(this, 64, 51);
        gasmask1.addBox(-2F, -2F, -5F, 4, 2, 1);
        gasmask1.setRotationPoint(0F, 0F, 0F);
        gasmask1.setTextureSize(64, 64);
        gasmask1.mirror = true;
        setRotation(gasmask1, 0F, 0F, 0F);
        gasmask2 = new ModelRenderer(this, 64, 54);
        gasmask2.addBox(-1F, -3F, -5F, 2, 1, 1);
        gasmask2.setRotationPoint(0F, 0F, 0F);
        gasmask2.setTextureSize(64, 64);
        gasmask2.mirror = true;
        setRotation(gasmask2, 0F, 0F, 0F);
        gasmask3 = new ModelRenderer(this, 64, 56);
        gasmask3.addBox(-2F, 0F, -5F, 4, 1, 3);
        gasmask3.setRotationPoint(0F, 0F, 0F);
        gasmask3.setTextureSize(64, 64);
        gasmask3.mirror = true;
        setRotation(gasmask3, 0F, 0F, 0F);
        glass1 = new ModelRenderer(this, 12 + 64, 32);
        glass1.addBox(-3F, -6F, -5F, 6, 3, 1);
        glass1.setRotationPoint(0F, 0F, 0F);
        glass1.setTextureSize(64, 64);
        glass1.mirror = true;
        setRotation(glass1, 0F, 0F, 0F);
        glass2 = new ModelRenderer(this, 12 + 64, 36);
        glass2.addBox(-5F, -5F, -4F, 1, 1, 3);
        glass2.setRotationPoint(0F, 0F, 0F);
        glass2.setTextureSize(64, 64);
        glass2.mirror = true;
        setRotation(glass2, 0F, 0F, 0F);
        glass3 = new ModelRenderer(this, 26 + 64, 32);
        glass3.addBox(-4F, -5F, -5F, 1, 1, 1);
        glass3.setRotationPoint(0F, 0F, 0F);
        glass3.setTextureSize(64, 64);
        glass3.mirror = true;
        setRotation(glass3, 0F, 0F, 0F);
        glass4 = new ModelRenderer(this, 12 + 64, 36);
        glass4.addBox(4F, -5F, -4F, 1, 1, 3);
        glass4.setRotationPoint(0F, 0F, 0F);
        glass4.setTextureSize(64, 64);
        glass4.mirror = true;
        setRotation(glass4, 0F, 0F, 0F);
        glass5 = new ModelRenderer(this, 26 + 64, 32);
        glass5.addBox(3F, -5F, -5F, 1, 1, 1);
        glass5.setRotationPoint(0F, 0F, 0F);
        glass5.setTextureSize(64, 64);
        glass5.mirror = true;
        setRotation(glass5, 0F, 0F, 0F);
        head = new ModelRenderer(this, 64, 0);
        head.addBox(-4F, -8F, -4F, 8, 8, 8);
        head.setRotationPoint(0F, 0F, 0F);
        head.setTextureSize(64, 64);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        body = new ModelRenderer(this, 16 + 64, 16);
        body.addBox(-4F, 0F, -2F, 8, 12, 4);
        body.setRotationPoint(0F, 0F, 0F);
        body.setTextureSize(64, 64);
        body.mirror = true;
        setRotation(body, 0F, 0F, 0F);
        rightarm = new ModelRenderer(this, 40 + 64, 16);
        rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
        rightarm.setRotationPoint(0F, 0F, 0F);
        rightarm.setTextureSize(64, 64);
        rightarm.mirror = false;
        setRotation(rightarm, 0F, 0F, 0F);
        leftarm = new ModelRenderer(this, 40 + 64, 16);
        leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
        leftarm.setRotationPoint(0F, 0F, 0F);
        leftarm.setTextureSize(64, 64);
        leftarm.mirror = false;
        setRotation(leftarm, 0F, 0F, 0F);
        rightleg = new ModelRenderer(this, 64, 16);
        rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
        rightleg.setRotationPoint(0F, 0F, 0F);
        rightleg.setTextureSize(64, 64);
        rightleg.mirror = false;
        setRotation(rightleg, 0F, 0F, 0F);
        leftleg = new ModelRenderer(this, 64, 16);
        leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
        leftleg.setRotationPoint(0F, 0F, 0F);
        leftleg.setTextureSize(64, 64);
        leftleg.mirror = false;
        setRotation(leftleg, 0F, 0F, 0F);

        bipedHeadwear.showModel = false;

        bipedBody.addChild(body);
        bipedHead.addChild(antena1);
        bipedHead.addChild(antena2);
        bipedHead.addChild(gasmask1);
        bipedHead.addChild(gasmask2);
        bipedHead.addChild(gasmask3);
        bipedHead.addChild(headset1);
        bipedHead.addChild(headset2);
        bipedHead.addChild(headset3);
        bipedHead.addChild(head);
        bipedHead.addChild(glass1);
        bipedHead.addChild(glass2);
        bipedHead.addChild(glass3);
        bipedHead.addChild(glass4);
        bipedHead.addChild(glass5);
        bipedLeftArm.addChild(leftarm);
        bipedRightArm.addChild(rightarm);
        bipedLeftLeg.addChild(leftleg);
        bipedLeftLeg.addChild(cyborgleftleg1);
        bipedRightLeg.addChild(rightleg);
        bipedRightLeg.addChild(cyborgrightleg1);

    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);

    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
