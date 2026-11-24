package com.grimalkinAspirant.minebent.data.loot_tables;

import com.grimalkinAspirant.minebent.items.MINEBENTBlocks;
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

        dropSelf(MINEBENTBlocks.RUBY_BLOCK.get());
        dropWhenSilkTouch(MINEBENTBlocks.TROLLSTONE_COAL_ORE.get());
        dropWhenSilkTouch(MINEBENTBlocks.TROLLSTONE_COPPER_ORE.get());
        dropWhenSilkTouch(MINEBENTBlocks.TROLLSTONE_IRON_ORE.get());
        dropWhenSilkTouch(MINEBENTBlocks.TROLLSTONE_GOLD_ORE.get());
        dropWhenSilkTouch(MINEBENTBlocks.TROLLSTONE_REDSTONE_ORE.get());
        dropWhenSilkTouch(MINEBENTBlocks.TROLLSTONE_LAPIS_ORE.get());
        dropWhenSilkTouch(MINEBENTBlocks.TROLLSTONE_DIAMOND_ORE.get());
        dropWhenSilkTouch(MINEBENTBlocks.TROLLSTONE_RUBY_ORE.get());
        dropWhenSilkTouch(MINEBENTBlocks.TROLLSTONE_QUARTZ_ORE.get());
        dropWhenSilkTouch(MINEBENTBlocks.TROLLSTONE_CRUXITE_ORE.get());
        dropWhenSilkTouch(MINEBENTBlocks.TROLLSTONE_URANIUM_ORE.get());
        dropWhenSilkTouch(MINEBENTBlocks.TROLLSTONE.get());
        dropWhenSilkTouch(MINEBENTBlocks.TROLLSLATE_COAL_ORE.get());
        dropWhenSilkTouch(MINEBENTBlocks.TROLLSLATE_COPPER_ORE.get());
        dropWhenSilkTouch(MINEBENTBlocks.TROLLSLATE_IRON_ORE.get());
        dropWhenSilkTouch(MINEBENTBlocks.TROLLSLATE_GOLD_ORE.get());
        dropWhenSilkTouch(MINEBENTBlocks.TROLLSLATE_REDSTONE_ORE.get());
        dropWhenSilkTouch(MINEBENTBlocks.TROLLSLATE_LAPIS_ORE.get());
        dropWhenSilkTouch(MINEBENTBlocks.TROLLSLATE_DIAMOND_ORE.get());
        dropWhenSilkTouch(MINEBENTBlocks.TROLLSLATE_RUBY_ORE.get());
        dropWhenSilkTouch(MINEBENTBlocks.TROLLSLATE_URANIUM_ORE.get());
    }

    //@Override
    //protected Iterable<Block> getKnownBlocks() {
        //return MINEBENTBlocks.ITEMS.getEntries().stream().map(e -> (Block) e.value()).toList();
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
