package com.grimalkinAspirant.minebent.items;

import com.grimalkinAspirant.minebent.MINEBENT;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.grimalkinAspirant.minebent.MINEBENT.BLOCKS;

public class MINEBENTItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MINEBENT.MODID);

    // Misc
    public static final DeferredItem<Item> CHITIN = ITEMS.register("chitin",
            () -> new Item(new Item.Properties()));
    // Food

    // Weapons

    // Blocks
    public static final DeferredBlock<Block> TROLLSTONE = BLOCKS.registerSimpleBlock("trollstone", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> TROLLSTONE_ITEM = ITEMS.registerSimpleBlockItem("trollstone", TROLLSTONE);
    public static final DeferredBlock<Block> COBBLED_TROLLSTONE = BLOCKS.registerSimpleBlock("cobbled_trollstone", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> COBBLED_TROLLSTONE_ITEM = ITEMS.registerSimpleBlockItem("cobbled_trollstone", COBBLED_TROLLSTONE);
    public static final DeferredBlock<Block> TROLLSTONE_BRICKS = BLOCKS.registerSimpleBlock("trollstone_bricks", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> TROLLSTONE_BRICKS_ITEM = ITEMS.registerSimpleBlockItem("trollstone_bricks", TROLLSTONE_BRICKS);
    public static final DeferredBlock<Block> CRACKED_TROLLSTONE_BRICKS = BLOCKS.registerSimpleBlock("cracked_trollstone_bricks", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> CRACKED_TROLLSTONE_BRICKS_ITEM = ITEMS.registerSimpleBlockItem("cracked_trollstone_bricks", CRACKED_TROLLSTONE_BRICKS);
    public static final DeferredBlock<Block> CHISELED_TROLLSTONE_BRICKS = BLOCKS.registerSimpleBlock("chiseled_trollstone_bricks", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> CHISELED_TROLLSTONE_BRICKS_ITEM = ITEMS.registerSimpleBlockItem("chiseled_trollstone_bricks", CHISELED_TROLLSTONE_BRICKS);
    public static final DeferredBlock<Block> MOSSY_COBBLED_TROLLSTONE = BLOCKS.registerSimpleBlock("mossy_cobbled_trollstone", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> MOSSY_COBBLED_TROLLSTONE_ITEM = ITEMS.registerSimpleBlockItem("mossy_cobbled_trollstone", MOSSY_COBBLED_TROLLSTONE);
    public static final DeferredBlock<Block> MOSSY_TROLLSTONE_BRICKS = BLOCKS.registerSimpleBlock("mossy_trollstone_bricks", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> MOSSY_TROLLSTONE_BRICKS_ITEM = ITEMS.registerSimpleBlockItem("mossy_trollstone_bricks", MOSSY_TROLLSTONE_BRICKS);
    //
public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        }
    }