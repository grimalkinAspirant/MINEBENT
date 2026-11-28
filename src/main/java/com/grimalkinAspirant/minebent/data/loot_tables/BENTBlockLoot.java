package com.grimalkinAspirant.minebent.data.loot_tables;

import com.grimalkinAspirant.minebent.items.MINEBENTBlocks;
import static com.grimalkinAspirant.minebent.items.MINEBENTBlocks.*;
import com.grimalkinAspirant.minebent.items.MINEBENTItems;
import com.mraof.minestuck.item.MSItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
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

        dropSelf(RUBY_BLOCK.get());
        dropWhenSilkTouch(TROLLSTONE_COAL_ORE.get());
        dropWhenSilkTouch(TROLLSTONE_COPPER_ORE.get());
        dropWhenSilkTouch(TROLLSTONE_IRON_ORE.get());
        dropWhenSilkTouch(TROLLSTONE_GOLD_ORE.get());
        dropWhenSilkTouch(TROLLSTONE_REDSTONE_ORE.get());
        dropWhenSilkTouch(TROLLSTONE_LAPIS_ORE.get());
        dropWhenSilkTouch(TROLLSTONE_DIAMOND_ORE.get());
        dropWhenSilkTouch(TROLLSTONE_RUBY_ORE.get());
        dropWhenSilkTouch(TROLLSTONE_QUARTZ_ORE.get());
        dropWhenSilkTouch(TROLLSTONE_CRUXITE_ORE.get());
        dropWhenSilkTouch(TROLLSTONE_URANIUM_ORE.get());
        dropWhenSilkTouch(TROLLSTONE.get());
        dropWhenSilkTouch(TROLLSLATE_COAL_ORE.get());
        dropWhenSilkTouch(TROLLSLATE_COPPER_ORE.get());
        dropWhenSilkTouch(TROLLSLATE_IRON_ORE.get());
        dropWhenSilkTouch(TROLLSLATE_GOLD_ORE.get());
        dropWhenSilkTouch(TROLLSLATE_REDSTONE_ORE.get());
        dropWhenSilkTouch(TROLLSLATE_LAPIS_ORE.get());
        dropWhenSilkTouch(TROLLSLATE_DIAMOND_ORE.get());
        dropWhenSilkTouch(TROLLSLATE_RUBY_ORE.get());
        dropWhenSilkTouch(TROLLSLATE_URANIUM_ORE.get());
        dropWhenSilkTouch(TROLLSLATE.get());

        add(TROLLSTONE_CRUXITE_ORE.get(), this::cruxiteOreDrop);
        add(TROLLSTONE_URANIUM_ORE.get(), this::uraniumOreDrop);
        add(TROLLSTONE_COAL_ORE.get(), this::coalOreDrop);
        add(TROLLSTONE_COPPER_ORE.get(), this::copperOreDrop);
        add(TROLLSTONE_IRON_ORE.get(), this::ironOreDrop);
        add(TROLLSTONE_GOLD_ORE.get(), this::goldOreDrop);
        add(TROLLSTONE_REDSTONE_ORE.get(), this::redstoneOreDrop);
        add(TROLLSTONE_QUARTZ_ORE.get(), this::quartzOreDrop);
        add(TROLLSTONE_LAPIS_ORE.get(), this::lapisOreDrop);
        add(TROLLSTONE_DIAMOND_ORE.get(), this::diamondOreDrop);
        add(TROLLSTONE_RUBY_ORE.get(), this::rubyOreDrop);
        add(TROLLSLATE_URANIUM_ORE.get(), this::uraniumOreDrop);
        add(TROLLSLATE_COAL_ORE.get(), this::coalOreDrop);
        add(TROLLSLATE_COPPER_ORE.get(), this::copperOreDrop);
        add(TROLLSLATE_IRON_ORE.get(), this::ironOreDrop);
        add(TROLLSLATE_GOLD_ORE.get(), this::goldOreDrop);
        add(TROLLSLATE_REDSTONE_ORE.get(), this::redstoneOreDrop);
        add(TROLLSLATE_LAPIS_ORE.get(), this::lapisOreDrop);
        add(TROLLSLATE_DIAMOND_ORE.get(), this::diamondOreDrop);
        add(TROLLSLATE_RUBY_ORE.get(), this::rubyOreDrop);
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
    public LootTable.Builder uraniumOreDrop(Block block)
    {
        return createOreDrop(block, MSItems.RAW_URANIUM.get());
    }
    private LootTable.Builder coalOreDrop(Block block)
    {
        return createOreDrop(block, Items.COAL);
    }
    private LootTable.Builder goldOreDrop(Block block)
    {
        return createOreDrop(block, Items.RAW_GOLD);
    }
    private LootTable.Builder ironOreDrop(Block block)
    {
        return createOreDrop(block, Items.RAW_IRON);
    }
    private LootTable.Builder copperOreDrop(Block block)
    {
        return createOreDrop(block, Items.RAW_COPPER);
    }
    private LootTable.Builder redstoneOreDrop(Block block)
    {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return createSilkTouchDispatchTable(block, applyExplosionDecay(block, LootItem.lootTableItem(Items.REDSTONE)
                .apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 5.0F)))
                .apply(ApplyBonusCount.addUniformBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }
    private LootTable.Builder quartzOreDrop(Block block)
    {
        return createOreDrop(block, Items.QUARTZ);
    }
    private LootTable.Builder lapisOreDrop(Block block)
    {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return createSilkTouchDispatchTable(block, applyExplosionDecay(block,
                LootItem.lootTableItem(Items.LAPIS_LAZULI)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 9.0F)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }
    private LootTable.Builder diamondOreDrop(Block block)
    {
        return createOreDrop(block, Items.DIAMOND);
    }
    private LootTable.Builder rubyOreDrop(Block block) { return createOreDrop(block, MINEBENTItems.RUBY.get()); }
}
