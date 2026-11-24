package com.grimalkinAspirant.minebent.datagen;

import com.grimalkinAspirant.minebent.items.MINEBENTBlocks;
import com.grimalkinAspirant.minebent.items.MINEBENTItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;

import java.util.Set;

public class MINEBENTBlockLootTableProvider extends BlockLootSubProvider {
    protected MINEBENTBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }
    @Override
    protected void generate() {
        dropSelf(MINEBENTBlocks.RUBY_BLOCK.get());
        add(MINEBENTBlocks.TROLLSTONE_RUBY_ORE.get(),
                block -> createOreDrop(MINEBENTBlocks.TROLLSTONE_RUBY_ORE.get(), MINEBENTItems.RUBY.get()));
        add(MINEBENTBlocks.TROLLSLATE_RUBY_ORE.get(),
                block -> createOreDrop(MINEBENTBlocks.TROLLSLATE_RUBY_ORE.get(), MINEBENTItems.RUBY.get()));
    }
}
