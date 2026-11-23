package com.grimalkinAspirant.minebent.data.loot_tables.chest_loot;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class BENTLootTableProvider extends LootTableProvider {
    public BENTLootTableProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries,
                                 List<SubProviderEntry> subProviders) {
        super(output, Set.of(), subProviders, registries);
    }
}
