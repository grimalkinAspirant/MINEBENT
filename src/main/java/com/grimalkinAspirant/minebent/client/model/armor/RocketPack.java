package com.grimalkinAspirant.minebent.client.model.armor;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.LayerDefinitions;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public abstract class RocketPack<T extends Entity> extends EntityModel<T> {
    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = HumanoidModel.createMesh(LayerDefinitions.OUTER_ARMOR_DEFORMATION, 0);
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0,0,0));
        PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(0,0,0));
        PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(0,0,0));

        PartDefinition bb_model = body.addOrReplaceChild("bb_model", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -24.0F, 2.0F, 10.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(24, 28).addBox(-1.5F, -33.0F, 2.0F, 3.0F, 10.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(24, 16).addBox(-5.0F, -31.75F, 2.0F, 10.0F, 9.0F, 3.0F, new CubeDeformation(-0.1F))
                .texOffs(0, 16).addBox(-4.0F, -24.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.5F))
                .texOffs(28, 0).addBox(-7.0F, -16.5F, 3.5F, 14.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(28, 4).addBox(-4.5F, -12.0F, 2.5F, 9.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}