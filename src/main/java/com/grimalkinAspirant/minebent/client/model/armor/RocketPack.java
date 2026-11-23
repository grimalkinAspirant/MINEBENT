package com.grimalkinAspirant.minebent.client.model.armor;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public abstract class RocketPack{
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    //public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "RocketPack"), "main");
    private final ModelPart bb_main;

    public RocketPack(ModelPart root) {
        this.bb_main = root.getChild("bb_main");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -23.0F, 2.0F, 10.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(24, 28).addBox(-1.5F, -32.0F, 2.0F, 3.0F, 10.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(24, 16).addBox(-5.0F, -30.75F, 2.0F, 10.0F, 9.0F, 3.0F, new CubeDeformation(-0.1F))
                .texOffs(0, 16).addBox(-4.0F, -23.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.5F))
                .texOffs(28, 0).addBox(-7.0F, -15.5F, 3.5F, 14.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(28, 4).addBox(-4.5F, -11.0F, 2.5F, 9.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}