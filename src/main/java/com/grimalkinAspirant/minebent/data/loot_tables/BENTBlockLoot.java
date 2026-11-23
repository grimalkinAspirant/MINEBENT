package com.grimalkinAspirant.minebent.data.loot_tables;

import com.grimalkinAspirant.minebent.items.MINEBENTItems;
import com.mraof.minestuck.item.MSItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class BENTBlockLoot extends BlockLootSubProvider {

    public BENTBlockLoot(HolderLookup.Provider holder) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), holder);
    }

    @Override
    protected void generate() {

        dropSelf(MINEBENTItems.RUBY_BLOCK.get());
        dropWhenSilkTouch(MINEBENTItems.TROLLSTONE_COAL_ORE.get());
        dropWhenSilkTouch(MINEBENTItems.TROLLSTONE_COPPER_ORE.get());
        dropWhenSilkTouch(MINEBENTItems.TROLLSTONE_IRON_ORE.get());
        dropWhenSilkTouch(MINEBENTItems.TROLLSTONE_GOLD_ORE.get());
        dropWhenSilkTouch(MINEBENTItems.TROLLSTONE_REDSTONE_ORE.get());
        dropWhenSilkTouch(MINEBENTItems.TROLLSTONE_LAPIS_ORE.get());
        dropWhenSilkTouch(MINEBENTItems.TROLLSTONE_DIAMOND_ORE.get());
        dropWhenSilkTouch(MINEBENTItems.TROLLSTONE_RUBY_ORE.get());
        dropWhenSilkTouch(MINEBENTItems.TROLLSTONE_QUARTZ_ORE.get());
        dropWhenSilkTouch(MINEBENTItems.TROLLSTONE_CRUXITE_ORE.get());
        dropWhenSilkTouch(MINEBENTItems.TROLLSTONE_URANIUM_ORE.get());
        dropWhenSilkTouch(MINEBENTItems.TROLLSTONE.get());
        dropWhenSilkTouch(MINEBENTItems.TROLLSLATE_COAL_ORE.get());
        dropWhenSilkTouch(MINEBENTItems.TROLLSLATE_COPPER_ORE.get());
        dropWhenSilkTouch(MINEBENTItems.TROLLSLATE_IRON_ORE.get());
        dropWhenSilkTouch(MINEBENTItems.TROLLSLATE_GOLD_ORE.get());
        dropWhenSilkTouch(MINEBENTItems.TROLLSLATE_REDSTONE_ORE.get());
        dropWhenSilkTouch(MINEBENTItems.TROLLSLATE_LAPIS_ORE.get());
        dropWhenSilkTouch(MINEBENTItems.TROLLSLATE_DIAMOND_ORE.get());
        dropWhenSilkTouch(MINEBENTItems.TROLLSLATE_RUBY_ORE.get());
        dropWhenSilkTouch(MINEBENTItems.TROLLSLATE_URANIUM_ORE.get());
    }

    //@Override
    //protected Iterable<Block> getKnownBlocks() {
        //return MINEBENTItems.ITEMS.getEntries().stream().map(e -> (Block) e.value()).toList();
    //}

    public LootTable.Builder cruxiteOreDrop(Block block)
    {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return createSilkTouchDispatchTable(block, applyExplosionDecay(block,
                LootItem.lootTableItem(MSItems.RAW_CRUXITE.get())
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

}
