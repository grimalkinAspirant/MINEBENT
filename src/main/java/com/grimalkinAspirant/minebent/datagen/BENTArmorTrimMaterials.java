package com.grimalkinAspirant.minebent.datagen;

import com.grimalkinAspirant.minebent.MINEBENT;
import com.grimalkinAspirant.minebent.items.MINEBENTItems;
import com.mraof.minestuck.item.MSItems;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;

import java.util.Map;

public class BENTArmorTrimMaterials {

    public static final ResourceKey<TrimMaterial> RUBY = ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(MINEBENT.MODID, "ruby"));

    public static void bootstrap(BootstrapContext<TrimMaterial> context){
        register(context, RUBY, MINEBENTItems.RUBY.get(), Style.EMPTY.withColor(TextColor.parseColor("#f20000").getOrThrow()),0.71f);
    }

    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> trimKey, Item item,
                                 Style style, float itemModelIndex){
        TrimMaterial trimMaterial = TrimMaterial.create(trimKey.location().getPath(), item, itemModelIndex,
                Component.translatable(Util.makeDescriptionId("trim_material", trimKey.location())).withStyle(style), Map.of());
        context.register(trimKey, trimMaterial);
    }

}
