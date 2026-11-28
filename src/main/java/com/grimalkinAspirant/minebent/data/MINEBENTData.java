package com.grimalkinAspirant.minebent.data;

import com.grimalkinAspirant.minebent.MINEBENT;
import com.grimalkinAspirant.minebent.data.recipe.BENTRecipeProvider;
import com.grimalkinAspirant.minebent.data.tag.BENTBlockTagsProvider;
import com.grimalkinAspirant.minebent.data.tag.BENTItemTagsProvider;
import com.mraof.minestuck.data.MinestuckEnUsLanguageProvider;
import com.mraof.minestuck.data.dialogue.*;
import com.mraof.minestuck.data.tag.MinestuckBlockTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = MINEBENT.MODID, bus = EventBusSubscriber.Bus.MOD)
public final class MINEBENTData {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator gen = event.getGenerator();
        PackOutput output = gen.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        var builtinEntries = gen.addProvider(event.includeServer(), new DatapackBuiltinEntriesProvider(output, event.getLookupProvider(), registrySetBuilder(), Set.of(MINEBENT.MODID)));
        CompletableFuture<HolderLookup.Provider> lookupProvider = builtinEntries.getRegistryProvider();

        var blockTags = gen.addProvider(event.includeServer(), new BENTBlockTagsProvider(output, lookupProvider, fileHelper));

        gen.addProvider(event.includeClient(), new BENTBlockstateProvider(output, fileHelper));
        gen.addProvider(event.includeServer(), new BENTItemTagsProvider(output, event.getLookupProvider(), blockTags.contentsGetter(), fileHelper));
        gen.addProvider(event.includeServer(), new BENTRecipeProvider(output, event.getLookupProvider()));
        gen.addProvider(event.includeClient(), new BENTItemModelProvider(output, fileHelper));
        var enUsLanguageProvider = gen.addProvider(event.includeClient(), new MINEBENTEnUsLanguageProvider(output));
        gen.addProvider(event.includeServer(), ConsortDialogue.create(output, enUsLanguageProvider, lookupProvider));
        gen.addProvider(event.includeServer(), ShadyConsortDialogue.create(output, enUsLanguageProvider, lookupProvider));
        gen.addProvider(event.includeServer(), ConsortFoodMerchantDialogue.create(output, enUsLanguageProvider, lookupProvider));
        gen.addProvider(event.includeServer(), ConsortGeneralMerchantDialogue.create(output, enUsLanguageProvider, lookupProvider));
        gen.addProvider(event.includeServer(), CarapacianSoldierDialogue.create(output, enUsLanguageProvider, lookupProvider));
        gen.addProvider(event.includeServer(), IndividualizedDialogue.create(output, enUsLanguageProvider, lookupProvider));


//        generator.addProvider(event.includeServer(),
//                (DataProvider.Factory<BENTLootTableProvider>) ((o) -> new BENTLootTableProvider(o, lookupProvider,
//                        List.of(
//                                new LootTableProvider.SubProviderEntry(BENTBlockLoot::new, LootContextParamSets.BLOCK)
//                ))));

        gen.addProvider(event.includeServer(), new BENTBetterCombatCompat(output));
    }

    private static RegistrySetBuilder registrySetBuilder()
    {
        return new RegistrySetBuilder();
                //.add(Registries.TRIM_MATERIAL, BENTArmorTrimMaterials::bootstrap);
    }
}
