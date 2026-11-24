package com.grimalkinAspirant.minebent.data;

import com.grimalkinAspirant.minebent.MINEBENT;
import com.grimalkinAspirant.minebent.data.loot_tables.BENTBlockLoot;
import com.grimalkinAspirant.minebent.data.loot_tables.chest_loot.BENTLootTableProvider;
import com.grimalkinAspirant.minebent.data.recipe.BENTRecipeProvider;
import com.grimalkinAspirant.minebent.data.tag.BENTBlockTagsProvider;
import com.grimalkinAspirant.minebent.data.tag.BENTItemTagsProvider;
import com.grimalkinAspirant.minebent.datagen.BENTArmorTrimMaterials;
import com.mraof.minestuck.data.tag.MinestuckBlockTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = MINEBENT.MODID, bus = EventBusSubscriber.Bus.MOD)
public final class MINEBENTData {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput pOutput = generator.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        var builtinEntries = generator.addProvider(event.includeServer(), new DatapackBuiltinEntriesProvider(pOutput, event.getLookupProvider(), registrySetBuilder(), Set.of(MINEBENT.MODID)));
        CompletableFuture<HolderLookup.Provider> lookupProvider = builtinEntries.getRegistryProvider();

        var blockTags = generator.addProvider(event.includeServer(), new MinestuckBlockTagsProvider(pOutput, lookupProvider, fileHelper));

        generator.addProvider(event.includeClient(), new BENTBlockstateProvider(pOutput, fileHelper));
        generator.addProvider(event.includeServer(), new BENTItemTagsProvider(pOutput, event.getLookupProvider(), blockTags.contentsGetter(), fileHelper));
        generator.addProvider(event.includeServer(), new BENTBlockTagsProvider(pOutput, event.getLookupProvider(), fileHelper));
        generator.addProvider(event.includeServer(), new BENTRecipeProvider(pOutput, event.getLookupProvider()));
        generator.addProvider(event.includeClient(), new BENTItemModelProvider(pOutput, fileHelper));

//        generator.addProvider(event.includeServer(),
//                (DataProvider.Factory<BENTLootTableProvider>) ((o) -> new BENTLootTableProvider(o, lookupProvider,
//                        List.of(
//                                new LootTableProvider.SubProviderEntry(BENTBlockLoot::new, LootContextParamSets.BLOCK)
//                ))));

        generator.addProvider(event.includeServer(), new BENTBetterCombatCompat(pOutput));
    }

    private static RegistrySetBuilder registrySetBuilder()
    {
        return new RegistrySetBuilder()
                .add(Registries.TRIM_MATERIAL, BENTArmorTrimMaterials::bootstrap);
    }
}
