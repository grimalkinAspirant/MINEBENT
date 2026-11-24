package com.grimalkinAspirant.minebent.items;

import com.grimalkinAspirant.minebent.MINEBENT;
import com.grimalkinAspirant.minebent.datagen.BENTDirectionalBlock;
import com.grimalkinAspirant.minebent.datagen.BENTDragonArmorFly;
import com.grimalkinAspirant.minebent.datagen.BENTMagicRangedRightClickEffect;
import com.grimalkinAspirant.minebent.datagen.BENTRocketArmorFly;
import com.mraof.minestuck.block.*;
import com.mraof.minestuck.item.MSItemProperties;
import com.mraof.minestuck.item.MSItemTypes;
import com.mraof.minestuck.item.MSItems;
import com.mraof.minestuck.item.armor.MSArmorItem;
import com.mraof.minestuck.item.weapon.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.grimalkinAspirant.minebent.MINEBENT.BLOCKS;
import static net.minecraft.world.level.block.state.BlockBehaviour.Properties.ofFullCopy;


public class MINEBENTBlocks {

    public static final DeferredBlock<Block> CHERUB_PORTAL = BLOCKS.registerSimpleBlock("cherub_portal", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> RUBY_BLOCK = BLOCKS.registerSimpleBlock("ruby_block", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED));
    public static final DeferredBlock<Block> RULERSTONE = BLOCKS.registerSimpleBlock("rulerstone", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK));
    public static final DeferredBlock<Block> FELTSTONE = BLOCKS.registerSimpleBlock("feltstone", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN));
    public static final DeferredBlock<Block> CARNIVAL_GROUND = BLOCKS.registerSimpleBlock("carnival_ground", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE));

    // Natural Blocks & Derivatives
    public static final DeferredBlock<Block> TROLLSTONE = BLOCKS.registerSimpleBlock("trollstone", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<StairBlock> TROLLSTONE_STAIRS = BLOCKS.register("trollstone_stairs", () -> new StairBlock(TROLLSTONE.get().defaultBlockState(), ofFullCopy(TROLLSTONE.get())));
    public static final DeferredBlock<SlabBlock> TROLLSTONE_SLAB = BLOCKS.register("trollstone_slab", () -> new SlabBlock(ofFullCopy(TROLLSTONE.get())));
    public static final DeferredBlock<ButtonBlock> TROLLSTONE_BUTTON = BLOCKS.register("trollstone_button", () -> new ButtonBlock(BlockSetType.STONE, 10, ofFullCopy(TROLLSTONE.get()).noCollission()));
    public static final DeferredBlock<PressurePlateBlock> TROLLSTONE_PRESSURE_PLATE = BLOCKS.register("trollstone_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, ofFullCopy(TROLLSTONE.get())));

    public static final DeferredBlock<Block> COBBLED_TROLLSTONE = BLOCKS.registerSimpleBlock("cobbled_trollstone", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<StairBlock> COBBLED_TROLLSTONE_STAIRS = BLOCKS.register("cobbled_trollstone_stairs", () -> new StairBlock(COBBLED_TROLLSTONE.get().defaultBlockState(), ofFullCopy(COBBLED_TROLLSTONE.get())));
    public static final DeferredBlock<SlabBlock> COBBLED_TROLLSTONE_SLAB = BLOCKS.register("cobbled_trollstone_slab", () -> new SlabBlock(ofFullCopy(COBBLED_TROLLSTONE.get())));
    public static final DeferredBlock<WallBlock> COBBLED_TROLLSTONE_WALL = BLOCKS.register("cobbled_trollstone_wall", () -> new WallBlock(ofFullCopy(COBBLED_TROLLSTONE.get())));

    public static final DeferredBlock<Block> TROLLSTONE_BRICKS = BLOCKS.registerSimpleBlock("trollstone_bricks", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<StairBlock> TROLLSTONE_BRICK_STAIRS = BLOCKS.register("trollstone_brick_stairs", () -> new StairBlock(TROLLSTONE_BRICKS.get().defaultBlockState(), ofFullCopy(TROLLSTONE_BRICKS.get())));
    public static final DeferredBlock<SlabBlock> TROLLSTONE_BRICK_SLAB = BLOCKS.register("trollstone_brick_slab", () -> new SlabBlock(ofFullCopy(TROLLSTONE_BRICKS.get())));
    public static final DeferredBlock<WallBlock> TROLLSTONE_BRICK_WALL = BLOCKS.register("trollstone_brick_wall", () -> new WallBlock(ofFullCopy(TROLLSTONE_BRICKS.get())));

    public static final DeferredBlock<Block> CRACKED_TROLLSTONE_BRICKS = BLOCKS.registerSimpleBlock("cracked_trollstone_bricks", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> CHISELED_TROLLSTONE_BRICKS = BLOCKS.registerSimpleBlock("chiseled_trollstone_bricks", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> MOSSY_COBBLED_TROLLSTONE = BLOCKS.registerSimpleBlock("mossy_cobbled_trollstone", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> MOSSY_TROLLSTONE_BRICKS = BLOCKS.registerSimpleBlock("mossy_trollstone_bricks", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));

    public static final DeferredBlock<Block> TROLLSLATE = BLOCKS.registerSimpleBlock("trollslate", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<StairBlock> TROLLSLATE_STAIRS = BLOCKS.register("trollslate_stairs", () -> new StairBlock(TROLLSLATE.get().defaultBlockState(), ofFullCopy(TROLLSLATE.get())));
    public static final DeferredBlock<SlabBlock> TROLLSLATE_SLAB = BLOCKS.register("trollslate_slab", () -> new SlabBlock(ofFullCopy(TROLLSLATE.get())));
    public static final DeferredBlock<ButtonBlock> TROLLSLATE_BUTTON = BLOCKS.register("trollslate_button", () -> new ButtonBlock(BlockSetType.STONE, 10, ofFullCopy(TROLLSLATE.get()).noCollission()));
    public static final DeferredBlock<PressurePlateBlock> TROLLSLATE_PRESSURE_PLATE = BLOCKS.register("trollslate_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, ofFullCopy(TROLLSLATE.get())));

    public static final DeferredBlock<Block> POLISHED_TROLLSLATE = BLOCKS.registerSimpleBlock("polished_trollslate", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<StairBlock> POLISHED_TROLLSLATE_STAIRS = BLOCKS.register("polished_trollslate_stairs", () -> new StairBlock(POLISHED_TROLLSLATE.get().defaultBlockState(), ofFullCopy(POLISHED_TROLLSLATE.get())));
    public static final DeferredBlock<SlabBlock> POLISHED_TROLLSLATE_SLAB = BLOCKS.register("polished_trollslate_slab", () -> new SlabBlock(ofFullCopy(POLISHED_TROLLSLATE.get())));
    public static final DeferredBlock<WallBlock> POLISHED_TROLLSLATE_WALL = BLOCKS.register("polished_trollslate_wall", () -> new WallBlock(ofFullCopy(POLISHED_TROLLSLATE.get())));

    public static final DeferredBlock<Block> COBBLED_TROLLSLATE = BLOCKS.registerSimpleBlock("cobbled_trollslate", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<StairBlock> COBBLED_TROLLSLATE_STAIRS = BLOCKS.register("cobbled_trollslate_stairs", () -> new StairBlock(COBBLED_TROLLSLATE.get().defaultBlockState(), ofFullCopy(COBBLED_TROLLSLATE.get())));
    public static final DeferredBlock<SlabBlock> COBBLED_TROLLSLATE_SLAB = BLOCKS.register("cobbled_trollslate_slab", () -> new SlabBlock(ofFullCopy(COBBLED_TROLLSLATE.get())));
    public static final DeferredBlock<WallBlock> COBBLED_TROLLSLATE_WALL = BLOCKS.register("cobbled_trollslate_wall", () -> new WallBlock(ofFullCopy(COBBLED_TROLLSLATE.get())));

    public static final DeferredBlock<Block> TROLLSLATE_BRICKS = BLOCKS.registerSimpleBlock("trollslate_bricks", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<StairBlock> TROLLSLATE_BRICK_STAIRS = BLOCKS.register("trollslate_brick_stairs", () -> new StairBlock(TROLLSLATE_BRICKS.get().defaultBlockState(), ofFullCopy(TROLLSLATE_BRICKS.get())));
    public static final DeferredBlock<SlabBlock> TROLLSLATE_BRICK_SLAB = BLOCKS.register("trollslate_brick_slab", () -> new SlabBlock(ofFullCopy(TROLLSLATE_BRICKS.get())));
    public static final DeferredBlock<WallBlock> TROLLSLATE_BRICK_WALL = BLOCKS.register("trollslate_brick_wall", () -> new WallBlock(ofFullCopy(TROLLSLATE_BRICKS.get())));

    public static final DeferredBlock<Block> TROLLSLATE_TILES = BLOCKS.registerSimpleBlock("trollslate_tiles", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<StairBlock> TROLLSLATE_TILE_STAIRS = BLOCKS.register("trollslate_tile_stairs", () -> new StairBlock(TROLLSLATE_TILES.get().defaultBlockState(), ofFullCopy(TROLLSLATE_TILES.get())));
    public static final DeferredBlock<SlabBlock> TROLLSLATE_TILE_SLAB = BLOCKS.register("trollslate_tile_slab", () -> new SlabBlock(ofFullCopy(TROLLSLATE_TILES.get())));
    public static final DeferredBlock<WallBlock> TROLLSLATE_TILE_WALL = BLOCKS.register("trollslate_tile_wall", () -> new WallBlock(ofFullCopy(TROLLSLATE_TILES.get())));

    public static final DeferredBlock<Block> CRACKED_TROLLSLATE_BRICKS = BLOCKS.registerSimpleBlock("cracked_trollslate_bricks", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> CRACKED_TROLLSLATE_TILES = BLOCKS.registerSimpleBlock("cracked_trollslate_tiles", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> CHISELED_TROLLSLATE = BLOCKS.registerSimpleBlock("chiseled_trollslate", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));

    public static final DeferredBlock<Block> FLUSHDESITE = BLOCKS.registerSimpleBlock("flushdesite", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<StairBlock> FLUSHDESITE_STAIRS = BLOCKS.register("flushdesite_stairs", () -> new StairBlock(FLUSHDESITE.get().defaultBlockState(), ofFullCopy(FLUSHDESITE.get())));
    public static final DeferredBlock<SlabBlock> FLUSHDESITE_SLAB = BLOCKS.register("flushdesite_slab", () -> new SlabBlock(ofFullCopy(FLUSHDESITE.get())));
    public static final DeferredBlock<WallBlock> FLUSHDESITE_WALL = BLOCKS.register("flushdesite_wall", () -> new WallBlock(ofFullCopy(FLUSHDESITE.get())));
    public static final DeferredBlock<Block> POLISHED_FLUSHDESITE = BLOCKS.registerSimpleBlock("polished_flushdesite", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<StairBlock> POLISHED_FLUSHDESITE_STAIRS = BLOCKS.register("polished_flushdesite_stairs", () -> new StairBlock(POLISHED_FLUSHDESITE.get().defaultBlockState(), ofFullCopy(POLISHED_FLUSHDESITE.get())));
    public static final DeferredBlock<SlabBlock> POLISHED_FLUSHDESITE_SLAB = BLOCKS.register("polished_flushdesite_slab", () -> new SlabBlock(ofFullCopy(POLISHED_FLUSHDESITE.get())));

    public static final DeferredBlock<Block> PALEORITE = BLOCKS.registerSimpleBlock("paleorite", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<StairBlock> PALEORITE_STAIRS = BLOCKS.register("paleorite_stairs", () -> new StairBlock(PALEORITE.get().defaultBlockState(), ofFullCopy(PALEORITE.get())));
    public static final DeferredBlock<SlabBlock> PALEORITE_SLAB = BLOCKS.register("paleorite_slab", () -> new SlabBlock(ofFullCopy(PALEORITE.get())));
    public static final DeferredBlock<WallBlock> PALEORITE_WALL = BLOCKS.register("paleorite_wall", () -> new WallBlock(ofFullCopy(PALEORITE.get())));
    public static final DeferredBlock<Block> POLISHED_PALEORITE = BLOCKS.registerSimpleBlock("polished_paleorite", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<StairBlock> POLISHED_PALEORITE_STAIRS = BLOCKS.register("polished_paleorite_stairs", () -> new StairBlock(POLISHED_PALEORITE.get().defaultBlockState(), ofFullCopy(POLISHED_PALEORITE.get())));
    public static final DeferredBlock<SlabBlock> POLISHED_PALEORITE_SLAB = BLOCKS.register("polished_paleorite_slab", () -> new SlabBlock(ofFullCopy(POLISHED_PALEORITE.get())));

    public static final DeferredBlock<Block> ASHENITE = BLOCKS.registerSimpleBlock("ashenite", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<StairBlock> ASHENITE_STAIRS = BLOCKS.register("ashenite_stairs", () -> new StairBlock(ASHENITE.get().defaultBlockState(), ofFullCopy(ASHENITE.get())));
    public static final DeferredBlock<SlabBlock> ASHENITE_SLAB = BLOCKS.register("ashenite_slab", () -> new SlabBlock(ofFullCopy(ASHENITE.get())));
    public static final DeferredBlock<WallBlock> ASHENITE_WALL = BLOCKS.register("ashenite_wall", () -> new WallBlock(ofFullCopy(ASHENITE.get())));
    public static final DeferredBlock<Block> POLISHED_ASHENITE = BLOCKS.registerSimpleBlock("polished_ashenite", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<StairBlock> POLISHED_ASHENITE_STAIRS = BLOCKS.register("polished_ashenite_stairs", () -> new StairBlock(POLISHED_ASHENITE.get().defaultBlockState(), ofFullCopy(POLISHED_ASHENITE.get())));
    public static final DeferredBlock<SlabBlock> POLISHED_ASHENITE_SLAB = BLOCKS.register("polished_ashenite_slab", () -> new SlabBlock(ofFullCopy(POLISHED_ASHENITE.get())));

    public static final DeferredBlock<Block> BROODSTONE = BLOCKS.registerSimpleBlock("broodstone", BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE));
    public static final DeferredBlock<StairBlock> BROODSTONE_STAIRS = BLOCKS.register("broodstone_stairs", () -> new StairBlock(BROODSTONE.get().defaultBlockState(), ofFullCopy(BROODSTONE.get())));
    public static final DeferredBlock<SlabBlock> BROODSTONE_SLAB = BLOCKS.register("broodstone_slab", () -> new SlabBlock(ofFullCopy(BROODSTONE.get())));
    public static final DeferredBlock<WallBlock> BROODSTONE_WALL = BLOCKS.register("broodstone_wall", () -> new WallBlock(ofFullCopy(BROODSTONE.get())));
    public static final DeferredBlock<Block> BROODSTONE_BRICKS = BLOCKS.registerSimpleBlock("broodstone_bricks", BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE));
    public static final DeferredBlock<StairBlock> BROODSTONE_BRICK_STAIRS = BLOCKS.register("broodstone_brick_stairs", () -> new StairBlock(BROODSTONE_BRICKS.get().defaultBlockState(), ofFullCopy(BROODSTONE_BRICKS.get())));
    public static final DeferredBlock<SlabBlock> BROODSTONE_BRICK_SLAB = BLOCKS.register("broodstone_brick_slab", () -> new SlabBlock(ofFullCopy(BROODSTONE_BRICKS.get())));
    public static final DeferredBlock<WallBlock> BROODSTONE_BRICK_WALL = BLOCKS.register("broodstone_brick_wall", () -> new WallBlock(ofFullCopy(BROODSTONE_BRICKS.get())));

    // Ores
    public static final DeferredBlock<Block> TROLLSTONE_COAL_ORE = BLOCKS.registerSimpleBlock("trollstone_coal_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> TROLLSTONE_COPPER_ORE = BLOCKS.registerSimpleBlock("trollstone_copper_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> TROLLSTONE_IRON_ORE = BLOCKS.registerSimpleBlock("trollstone_iron_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> TROLLSTONE_REDSTONE_ORE = BLOCKS.registerSimpleBlock("trollstone_redstone_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> TROLLSTONE_GOLD_ORE = BLOCKS.registerSimpleBlock("trollstone_gold_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> TROLLSTONE_LAPIS_ORE = BLOCKS.registerSimpleBlock("trollstone_lapis_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> TROLLSTONE_DIAMOND_ORE = BLOCKS.registerSimpleBlock("trollstone_diamond_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> TROLLSTONE_QUARTZ_ORE = BLOCKS.registerSimpleBlock("trollstone_quartz_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> TROLLSTONE_CRUXITE_ORE = BLOCKS.registerSimpleBlock("trollstone_cruxite_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> TROLLSTONE_URANIUM_ORE = BLOCKS.registerSimpleBlock("trollstone_uranium_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> TROLLSTONE_RUBY_ORE = BLOCKS.registerSimpleBlock("trollstone_ruby_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> TROLLSLATE_COAL_ORE = BLOCKS.registerSimpleBlock("trollslate_coal_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> TROLLSLATE_COPPER_ORE = BLOCKS.registerSimpleBlock("trollslate_copper_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> TROLLSLATE_IRON_ORE = BLOCKS.registerSimpleBlock("trollslate_iron_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> TROLLSLATE_REDSTONE_ORE = BLOCKS.registerSimpleBlock("trollslate_redstone_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> TROLLSLATE_GOLD_ORE = BLOCKS.registerSimpleBlock("trollslate_gold_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> TROLLSLATE_LAPIS_ORE = BLOCKS.registerSimpleBlock("trollslate_lapis_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> TROLLSLATE_DIAMOND_ORE = BLOCKS.registerSimpleBlock("trollslate_diamond_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> TROLLSLATE_URANIUM_ORE = BLOCKS.registerSimpleBlock("trollslate_uranium_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> TROLLSLATE_RUBY_ORE = BLOCKS.registerSimpleBlock("trollslate_ruby_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));

    // Blocks Frog Temple
    public static final DeferredBlock<Block> RED_STONE = BLOCKS.register("red_stone", () -> new Block(Block.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.5F, 7.0F)));
    public static final DeferredBlock<StairBlock> RED_STONE_STAIRS = BLOCKS.register("red_stone_stairs", () -> new StairBlock(RED_STONE.get().defaultBlockState(), ofFullCopy(RED_STONE.get())));
    public static final DeferredBlock<SlabBlock> RED_STONE_SLAB = BLOCKS.register("red_stone_slab", () -> new SlabBlock(ofFullCopy(RED_STONE.get())));
    public static final DeferredBlock<WallBlock> RED_STONE_WALL = BLOCKS.register("red_stone_wall", () -> new WallBlock(ofFullCopy(RED_STONE.get())));
    public static final DeferredBlock<ButtonBlock> RED_STONE_BUTTON = BLOCKS.register("red_stone_button", () -> new ButtonBlock(MSBlockSetType.GREEN_STONE, 10, ofFullCopy(RED_STONE.get()).noCollission()));
    public static final DeferredBlock<PressurePlateBlock> RED_STONE_PRESSURE_PLATE = BLOCKS.register("red_stone_pressure_plate", () -> new PressurePlateBlock(MSBlockSetType.GREEN_STONE, ofFullCopy(RED_STONE.get())));
    public static final DeferredBlock<Block> POLISHED_RED_STONE = BLOCKS.register("polished_red_stone", () -> new Block(ofFullCopy(RED_STONE.get())));
    public static final DeferredBlock<StairBlock> POLISHED_RED_STONE_STAIRS = BLOCKS.register("polished_red_stone_stairs", () -> new StairBlock(POLISHED_RED_STONE.get().defaultBlockState(), ofFullCopy(POLISHED_RED_STONE.get())));
    public static final DeferredBlock<SlabBlock> POLISHED_RED_STONE_SLAB = BLOCKS.register("polished_red_stone_slab", () -> new SlabBlock(ofFullCopy(POLISHED_RED_STONE.get())));
    public static final DeferredBlock<WallBlock> POLISHED_RED_STONE_WALL = BLOCKS.register("polished_red_stone_wall", () -> new WallBlock(ofFullCopy(POLISHED_RED_STONE.get())));
    public static final DeferredBlock<Block> RED_STONE_BRICKS = BLOCKS.register("red_stone_bricks", () -> new Block(ofFullCopy(RED_STONE.get())));
    public static final DeferredBlock<StairBlock> RED_STONE_BRICK_STAIRS = BLOCKS.register("red_stone_brick_stairs", () -> new StairBlock(RED_STONE_BRICKS.get().defaultBlockState(), ofFullCopy(RED_STONE_BRICKS.get())));
    public static final DeferredBlock<SlabBlock> RED_STONE_BRICK_SLAB = BLOCKS.register("red_stone_brick_slab", () -> new SlabBlock(ofFullCopy(RED_STONE_BRICKS.get())));
    public static final DeferredBlock<WallBlock> RED_STONE_BRICK_WALL = BLOCKS.register("red_stone_brick_wall", () -> new WallBlock(ofFullCopy(RED_STONE_BRICKS.get())));
    //    public static final DeferredBlock<Block> RED_STONE_COLUMN = BLOCKS.register("red_stone_column", () -> new RotatedPillarBlock(ofFullCopy(RED_STONE.get())));
    public static final DeferredBlock<Block> CHISELED_RED_STONE_BRICKS = BLOCKS.register("chiseled_red_stone_bricks", () -> new Block(ofFullCopy(RED_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> HORIZONTAL_RED_STONE_BRICKS = BLOCKS.register("horizontal_red_stone_bricks", () -> new Block(ofFullCopy(RED_STONE_BRICKS.get())));
    public static final DeferredBlock<StairBlock> HORIZONTAL_RED_STONE_BRICK_STAIRS = BLOCKS.register("horizontal_red_stone_brick_stairs", () -> new StairBlock(HORIZONTAL_RED_STONE_BRICKS.get().defaultBlockState(), ofFullCopy(HORIZONTAL_RED_STONE_BRICKS.get())));
    public static final DeferredBlock<SlabBlock> HORIZONTAL_RED_STONE_BRICK_SLAB = BLOCKS.register("horizontal_red_stone_brick_slab", () -> new SlabBlock(ofFullCopy(HORIZONTAL_RED_STONE_BRICKS.get())));
    public static final DeferredBlock<WallBlock> HORIZONTAL_RED_STONE_BRICK_WALL = BLOCKS.register("horizontal_red_stone_brick_wall", () -> new WallBlock(ofFullCopy(HORIZONTAL_RED_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> VERTICAL_RED_STONE_BRICKS = BLOCKS.register("vertical_red_stone_bricks", () -> new Block(ofFullCopy(RED_STONE_BRICKS.get())));
    public static final DeferredBlock<StairBlock> VERTICAL_RED_STONE_BRICK_STAIRS = BLOCKS.register("vertical_red_stone_brick_stairs", () -> new StairBlock(VERTICAL_RED_STONE_BRICKS.get().defaultBlockState(), ofFullCopy(VERTICAL_RED_STONE_BRICKS.get())));
    public static final DeferredBlock<SlabBlock> VERTICAL_RED_STONE_BRICK_SLAB = BLOCKS.register("vertical_red_stone_brick_slab", () -> new SlabBlock(ofFullCopy(VERTICAL_RED_STONE_BRICKS.get())));
    public static final DeferredBlock<WallBlock> VERTICAL_RED_STONE_BRICK_WALL = BLOCKS.register("vertical_red_stone_brick_wall", () -> new WallBlock(ofFullCopy(VERTICAL_RED_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> RED_STONE_BRICK_EMBEDDED_LADDER = BLOCKS.register("red_stone_brick_embedded_ladder", () -> new CustomShapeBlock(ofFullCopy(RED_STONE_BRICKS.get()), MSBlockShapes.EMBEDDED_STAIRS)); //uses the tag CLIMBABLE
    //    public static final DeferredBlock<Block> RED_STONE_BRICK_TRIM = BLOCKS.register("red_stone_brick_trim", () -> new RotatedPillarBlock(ofFullCopy(RED_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> RED_STONE_BRICK_FROG = BLOCKS.register("red_stone_brick_frog", () -> new HieroglyphBlock(ofFullCopy(RED_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> RED_STONE_BRICK_IGUANA_LEFT = BLOCKS.register("red_stone_brick_iguana_left", () -> new HieroglyphBlock(ofFullCopy(RED_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> RED_STONE_BRICK_IGUANA_RIGHT = BLOCKS.register("red_stone_brick_iguana_right", () -> new HieroglyphBlock(ofFullCopy(RED_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> RED_STONE_BRICK_LOTUS = BLOCKS.register("red_stone_brick_lotus", () -> new HieroglyphBlock(ofFullCopy(RED_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> RED_STONE_BRICK_NAK_LEFT = BLOCKS.register("red_stone_brick_nak_left", () -> new HieroglyphBlock(ofFullCopy(RED_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> RED_STONE_BRICK_NAK_RIGHT = BLOCKS.register("red_stone_brick_nak_right", () -> new HieroglyphBlock(ofFullCopy(RED_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> RED_STONE_BRICK_SALAMANDER_LEFT = BLOCKS.register("red_stone_brick_salamander_left", () -> new HieroglyphBlock(ofFullCopy(RED_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> RED_STONE_BRICK_SALAMANDER_RIGHT = BLOCKS.register("red_stone_brick_salamander_right", () -> new HieroglyphBlock(ofFullCopy(RED_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> RED_STONE_BRICK_SKAIA = BLOCKS.register("red_stone_brick_skaia", () -> new HieroglyphBlock(ofFullCopy(RED_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> RED_STONE_BRICK_TURTLE = BLOCKS.register("red_stone_brick_turtle", () -> new HieroglyphBlock(ofFullCopy(RED_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> STEEP_RED_STONE_BRICK_STAIRS_BASE = BLOCKS.register("steep_red_stone_brick_stairs_base", () -> new CustomShapeBlock(ofFullCopy(RED_STONE.get()), MSBlockShapes.STEEP_STAIRS_BASE));
    public static final DeferredBlock<Block> STEEP_RED_STONE_BRICK_STAIRS_TOP = BLOCKS.register("steep_red_stone_brick_stairs_top", () -> new CustomShapeBlock(ofFullCopy(RED_STONE.get()), MSBlockShapes.STEEP_STAIRS_TOP));
    public static final DeferredBlock<Block> BLUE_STONE = BLOCKS.register("blue_stone", () -> new Block(Block.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.5F, 7.0F)));
    public static final DeferredBlock<StairBlock> BLUE_STONE_STAIRS = BLOCKS.register("blue_stone_stairs", () -> new StairBlock(BLUE_STONE.get().defaultBlockState(), ofFullCopy(BLUE_STONE.get())));
    public static final DeferredBlock<SlabBlock> BLUE_STONE_SLAB = BLOCKS.register("blue_stone_slab", () -> new SlabBlock(ofFullCopy(BLUE_STONE.get())));
    public static final DeferredBlock<WallBlock> BLUE_STONE_WALL = BLOCKS.register("blue_stone_wall", () -> new WallBlock(ofFullCopy(BLUE_STONE.get())));
    public static final DeferredBlock<ButtonBlock> BLUE_STONE_BUTTON = BLOCKS.register("blue_stone_button", () -> new ButtonBlock(MSBlockSetType.GREEN_STONE, 10, ofFullCopy(BLUE_STONE.get()).noCollission()));
    public static final DeferredBlock<PressurePlateBlock> BLUE_STONE_PRESSURE_PLATE = BLOCKS.register("blue_stone_pressure_plate", () -> new PressurePlateBlock(MSBlockSetType.GREEN_STONE, ofFullCopy(BLUE_STONE.get())));
    public static final DeferredBlock<Block> POLISHED_BLUE_STONE = BLOCKS.register("polished_blue_stone", () -> new Block(ofFullCopy(BLUE_STONE.get())));
    public static final DeferredBlock<StairBlock> POLISHED_BLUE_STONE_STAIRS = BLOCKS.register("polished_blue_stone_stairs", () -> new StairBlock(POLISHED_BLUE_STONE.get().defaultBlockState(), ofFullCopy(POLISHED_BLUE_STONE.get())));
    public static final DeferredBlock<SlabBlock> POLISHED_BLUE_STONE_SLAB = BLOCKS.register("polished_blue_stone_slab", () -> new SlabBlock(ofFullCopy(POLISHED_BLUE_STONE.get())));
    public static final DeferredBlock<WallBlock> POLISHED_BLUE_STONE_WALL = BLOCKS.register("polished_blue_stone_wall", () -> new WallBlock(ofFullCopy(POLISHED_BLUE_STONE.get())));
    public static final DeferredBlock<Block> BLUE_STONE_BRICKS = BLOCKS.register("blue_stone_bricks", () -> new Block(ofFullCopy(BLUE_STONE.get())));
    public static final DeferredBlock<StairBlock> BLUE_STONE_BRICK_STAIRS = BLOCKS.register("blue_stone_brick_stairs", () -> new StairBlock(BLUE_STONE_BRICKS.get().defaultBlockState(), ofFullCopy(BLUE_STONE_BRICKS.get())));
    public static final DeferredBlock<SlabBlock> BLUE_STONE_BRICK_SLAB = BLOCKS.register("blue_stone_brick_slab", () -> new SlabBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
    public static final DeferredBlock<WallBlock> BLUE_STONE_BRICK_WALL = BLOCKS.register("blue_stone_brick_wall", () -> new WallBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
    //    public static final DeferredBlock<Block> BLUE_STONE_COLUMN = BLOCKS.register("blue_stone_column", () -> new RotatedPillarBlock(ofFullCopy(BLUE_STONE.get())));
    public static final DeferredBlock<Block> CHISELED_BLUE_STONE_BRICKS = BLOCKS.register("chiseled_blue_stone_bricks", () -> new Block(ofFullCopy(BLUE_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> HORIZONTAL_BLUE_STONE_BRICKS = BLOCKS.register("horizontal_blue_stone_bricks", () -> new Block(ofFullCopy(BLUE_STONE_BRICKS.get())));
    public static final DeferredBlock<StairBlock> HORIZONTAL_BLUE_STONE_BRICK_STAIRS = BLOCKS.register("horizontal_blue_stone_brick_stairs", () -> new StairBlock(HORIZONTAL_BLUE_STONE_BRICKS.get().defaultBlockState(), ofFullCopy(HORIZONTAL_BLUE_STONE_BRICKS.get())));
    public static final DeferredBlock<SlabBlock> HORIZONTAL_BLUE_STONE_BRICK_SLAB = BLOCKS.register("horizontal_blue_stone_brick_slab", () -> new SlabBlock(ofFullCopy(HORIZONTAL_BLUE_STONE_BRICKS.get())));
    public static final DeferredBlock<WallBlock> HORIZONTAL_BLUE_STONE_BRICK_WALL = BLOCKS.register("horizontal_blue_stone_brick_wall", () -> new WallBlock(ofFullCopy(HORIZONTAL_BLUE_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> VERTICAL_BLUE_STONE_BRICKS = BLOCKS.register("vertical_blue_stone_bricks", () -> new Block(ofFullCopy(BLUE_STONE_BRICKS.get())));
    public static final DeferredBlock<StairBlock> VERTICAL_BLUE_STONE_BRICK_STAIRS = BLOCKS.register("vertical_blue_stone_brick_stairs", () -> new StairBlock(VERTICAL_BLUE_STONE_BRICKS.get().defaultBlockState(), ofFullCopy(VERTICAL_BLUE_STONE_BRICKS.get())));
    public static final DeferredBlock<SlabBlock> VERTICAL_BLUE_STONE_BRICK_SLAB = BLOCKS.register("vertical_blue_stone_brick_slab", () -> new SlabBlock(ofFullCopy(VERTICAL_BLUE_STONE_BRICKS.get())));
    public static final DeferredBlock<WallBlock> VERTICAL_BLUE_STONE_BRICK_WALL = BLOCKS.register("vertical_blue_stone_brick_wall", () -> new WallBlock(ofFullCopy(VERTICAL_BLUE_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> BLUE_STONE_BRICK_EMBEDDED_LADDER = BLOCKS.register("blue_stone_brick_embedded_ladder", () -> new CustomShapeBlock(ofFullCopy(BLUE_STONE_BRICKS.get()), MSBlockShapes.EMBEDDED_STAIRS)); //uses the tag CLIMBABLE
    //    public static final DeferredBlock<Block> BLUE_STONE_BRICK_TRIM = BLOCKS.register("blue_stone_brick_trim", () -> new RotatedPillarBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> BLUE_STONE_BRICK_FROG = BLOCKS.register("blue_stone_brick_frog", () -> new HieroglyphBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> BLUE_STONE_BRICK_IGUANA_LEFT = BLOCKS.register("blue_stone_brick_iguana_left", () -> new HieroglyphBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> BLUE_STONE_BRICK_IGUANA_RIGHT = BLOCKS.register("blue_stone_brick_iguana_right", () -> new HieroglyphBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> BLUE_STONE_BRICK_LOTUS = BLOCKS.register("blue_stone_brick_lotus", () -> new HieroglyphBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> BLUE_STONE_BRICK_NAK_LEFT = BLOCKS.register("blue_stone_brick_nak_left", () -> new HieroglyphBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> BLUE_STONE_BRICK_NAK_RIGHT = BLOCKS.register("blue_stone_brick_nak_right", () -> new HieroglyphBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> BLUE_STONE_BRICK_SALAMANDER_LEFT = BLOCKS.register("blue_stone_brick_salamander_left", () -> new HieroglyphBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> BLUE_STONE_BRICK_SALAMANDER_RIGHT = BLOCKS.register("blue_stone_brick_salamander_right", () -> new HieroglyphBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> BLUE_STONE_BRICK_SKAIA = BLOCKS.register("blue_stone_brick_skaia", () -> new HieroglyphBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> BLUE_STONE_BRICK_TURTLE = BLOCKS.register("blue_stone_brick_turtle", () -> new HieroglyphBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> STEEP_BLUE_STONE_BRICK_STAIRS_BASE = BLOCKS.register("steep_blue_stone_brick_stairs_base", () -> new CustomShapeBlock(ofFullCopy(BLUE_STONE.get()), MSBlockShapes.STEEP_STAIRS_BASE));
    public static final DeferredBlock<Block> STEEP_BLUE_STONE_BRICK_STAIRS_TOP = BLOCKS.register("steep_blue_stone_brick_stairs_top", () -> new CustomShapeBlock(ofFullCopy(BLUE_STONE.get()), MSBlockShapes.STEEP_STAIRS_TOP));
}