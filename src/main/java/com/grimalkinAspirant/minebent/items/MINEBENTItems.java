package com.grimalkinAspirant.minebent.items;

import com.grimalkinAspirant.minebent.MINEBENT;
import com.mraof.minestuck.block.*;
import com.mraof.minestuck.item.MSItemProperties;
import com.mraof.minestuck.item.MSItemTypes;
import com.mraof.minestuck.item.weapon.MSToolType;
import com.mraof.minestuck.item.weapon.OnHitEffect;
import com.mraof.minestuck.item.weapon.WeaponItem;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

import static com.grimalkinAspirant.minebent.MINEBENT.BLOCKS;
import static net.minecraft.world.level.block.state.BlockBehaviour.Properties.ofFullCopy;


public class MINEBENTItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MINEBENT.MODID);

    // Misc
    public static final DeferredItem<Item> TROLLLOGO_FAKEITEM = ITEMS.register("trolllogo_fakeitem",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHITIN = ITEMS.register("chitin",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MIRTHFUL_ESSENCE = ITEMS.register("mirthful_essence",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MIRTHFUL_SCRIPTURES = ITEMS.register("mirthful_scriptures",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    // Food

    // Weapons and Tools
    public static final DeferredItem<Item> AHABS_CROSSHAIRS = ITEMS.register("ahabs_crosshairs",
            () -> new WeaponItem(new WeaponItem.Builder(MSItemTypes.ZILLY_TIER, -2, -2.0f).efficiency(1.0f).set(MSItemTypes.WAND_TOOL).set(BENTMagicRangedRightClickEffect.AHAB),
                    new Item.Properties().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> MIRTHFUL_CLUB = ITEMS.register("mirthful_club",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.NETHERITE, 6, -2.8F).efficiency(2.0F).set(MSItemTypes.CLUB_TOOL),
                    new Item.Properties().rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> UMBRELLA = ITEMS.register("umbrella",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.WOOD, 7, -2.4F).efficiency(15.0F).set(MSItemTypes.SWORD_TOOL).add(OnHitEffect.SWEEP),
                    new Item.Properties().rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> CHERUB_KEY = ITEMS.register("cherub_key",
            () -> new WeaponItem(new WeaponItem.Builder(MSItemTypes.ZILLY_TIER, -1, -1.0F).efficiency(1.0F).set(MSItemTypes.KEY_TOOL),
                    new Item.Properties().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> MIRTHFUL_SWORD = ITEMS.register("mirthful_sword",
            () -> new SwordItem(Tiers.NETHERITE, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.NETHERITE, 4.0F, -2.4F))));
    public static final DeferredItem<Item> MIRTHFUL_AXE = ITEMS.register("mirthful_axe",
            () -> new AxeItem(Tiers.NETHERITE, new Item.Properties().attributes(AxeItem.createAttributes(Tiers.NETHERITE, 6.0F, -3.0F))));
    public static final DeferredItem<Item> MIRTHFUL_PICKAXE = ITEMS.register("mirthful_pickaxe",
            () -> new PickaxeItem(Tiers.NETHERITE, new Item.Properties().attributes(PickaxeItem.createAttributes(Tiers.NETHERITE, 2.0F, -2.8F))));
    public static final DeferredItem<Item> MIRTHFUL_SHOVEL = ITEMS.register("mirthful_shovel",
            () -> new ShovelItem(Tiers.NETHERITE, new Item.Properties().attributes(ShovelItem.createAttributes(Tiers.NETHERITE, 2.5F, -3.0F))));
    public static final DeferredItem<Item> MIRTHFUL_HOE = ITEMS.register("mirthful_hoe",
            () -> new HoeItem(Tiers.NETHERITE, new Item.Properties().attributes(HoeItem.createAttributes(Tiers.NETHERITE, -3.0F, 0.0F))));

    // Armor
    public static final DeferredItem<ArmorItem> ROCKET_SHOES = ITEMS.register("rocket_shoes",
            () -> new ArmorItem(ArmorMaterials.GOLD, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(0))));
    public static final DeferredItem<ArmorItem> ROCKET_PACK = ITEMS.register("rocket_pack",
            () -> new ArmorItem(ArmorMaterials.GOLD, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(0))));
    public static final DeferredItem<ArmorItem> ROCKET_WINGPACK = ITEMS.register("rocket_wingpack",
            () -> new ArmorItem(ArmorMaterials.GOLD, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(0))));
    public static final DeferredItem<ArmorItem> CHITIN_HELMET = ITEMS.register("chitin_helmet",
            () -> new ArmorItem(ArmorMaterials.CHAIN, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(0))));
    public static final DeferredItem<ArmorItem> CHITIN_CHESTPLATE = ITEMS.register("chitin_chestplate",
            () -> new ArmorItem(ArmorMaterials.CHAIN, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(0))));
    public static final DeferredItem<ArmorItem> CHITIN_LEGGINGS = ITEMS.register("chitin_leggings",
            () -> new ArmorItem(ArmorMaterials.CHAIN, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(0))));
    public static final DeferredItem<ArmorItem> CHITIN_BOOTS = ITEMS.register("chitin_boots",
            () -> new ArmorItem(ArmorMaterials.CHAIN, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(0))));
    public static final DeferredItem<ArmorItem> MIRTHFUL_MASQUE = ITEMS.register("mirthful_masque",
            () -> new ArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(0))));
    public static final DeferredItem<ArmorItem> MIRTHFUL_CHESTPLATE = ITEMS.register("mirthful_chestplate",
            () -> new ArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(0))));
    public static final DeferredItem<ArmorItem> MIRTHFUL_LEGGINGS = ITEMS.register("mirthful_leggings",
            () -> new ArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(0))));
    public static final DeferredItem<ArmorItem> MIRTHFUL_BOOTS = ITEMS.register("mirthful_boots",
            () -> new ArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(0))));
    public static final DeferredItem<ArmorItem> UMBRELLA_HAT = ITEMS.register("umbrella_hat",
            () -> new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(0))));

    // Blocks
    public static final DeferredBlock<Block> CHERUB_PORTAL = BLOCKS.registerSimpleBlock("cherub_portal", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> CHERUB_PORTAL_ITEM = ITEMS.registerSimpleBlockItem("cherub_portal", CHERUB_PORTAL);
    public static final DeferredBlock<Block> RUBY_BLOCK = BLOCKS.registerSimpleBlock("ruby_block", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED));
    public static final DeferredItem<BlockItem> RUBY_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("ruby_block", RUBY_BLOCK);

    // Natural Blocks & Derivatives
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
    public static final DeferredBlock<Block> BROODSTONE = BLOCKS.registerSimpleBlock("broodstone", BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE));
    public static final DeferredItem<BlockItem> BROODSTONE_ITEM = ITEMS.registerSimpleBlockItem("broodstone", BROODSTONE);
    public static final DeferredBlock<Block> BROODSTONE_BRICKS = BLOCKS.registerSimpleBlock("broodstone_bricks", BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE));
    public static final DeferredItem<BlockItem> BROODSTONE_BRICKS_ITEM = ITEMS.registerSimpleBlockItem("broodstone_bricks", BROODSTONE_BRICKS);

    // Blocks Frog Temple
    public static final DeferredBlock<Block> RED_STONE = BLOCKS.register("red_stone", () -> new Block(Block.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.5F, 7.0F)));
    public static final DeferredBlock<StairBlock> RED_STONE_STAIRS = BLOCKS.register("red_stone_stairs", () -> new StairBlock(RED_STONE.get().defaultBlockState(), ofFullCopy(RED_STONE.get())));
    public static final DeferredBlock<SlabBlock> RED_STONE_SLAB = BLOCKS.register("red_stone_slab", () -> new SlabBlock(ofFullCopy(RED_STONE.get())));
    public static final DeferredBlock<WallBlock> RED_STONE_WALL = BLOCKS.register("red_stone_wall", () -> new WallBlock(ofFullCopy(RED_STONE.get())));
    public static final DeferredBlock<ButtonBlock> RED_STONE_BUTTON = BLOCKS.register("red_stone_button", () -> new ButtonBlock(BENTBlockSetType.RED_STONE, 10, ofFullCopy(RED_STONE.get()).noCollission()));
    public static final DeferredBlock<PressurePlateBlock> RED_STONE_PRESSURE_PLATE = BLOCKS.register("red_stone_pressure_plate", () -> new PressurePlateBlock(BENTBlockSetType.RED_STONE, ofFullCopy(RED_STONE.get())));
    public static final DeferredBlock<Block> POLISHED_RED_STONE = BLOCKS.register("polished_red_stone", () -> new Block(ofFullCopy(RED_STONE.get())));
    public static final DeferredBlock<StairBlock> POLISHED_RED_STONE_STAIRS = BLOCKS.register("polished_red_stone_stairs", () -> new StairBlock(POLISHED_RED_STONE.get().defaultBlockState(), ofFullCopy(POLISHED_RED_STONE.get())));
    public static final DeferredBlock<SlabBlock> POLISHED_RED_STONE_SLAB = BLOCKS.register("polished_red_stone_slab", () -> new SlabBlock(ofFullCopy(POLISHED_RED_STONE.get())));
    public static final DeferredBlock<WallBlock> POLISHED_RED_STONE_WALL = BLOCKS.register("polished_red_stone_wall", () -> new WallBlock(ofFullCopy(POLISHED_RED_STONE.get())));
    public static final DeferredBlock<Block> RED_STONE_BRICKS = BLOCKS.register("red_stone_bricks", () -> new Block(ofFullCopy(RED_STONE.get())));
    public static final DeferredBlock<StairBlock> RED_STONE_BRICK_STAIRS = BLOCKS.register("red_stone_brick_stairs", () -> new StairBlock(RED_STONE_BRICKS.get().defaultBlockState(), ofFullCopy(RED_STONE_BRICKS.get())));
    public static final DeferredBlock<SlabBlock> RED_STONE_BRICK_SLAB = BLOCKS.register("red_stone_brick_slab", () -> new SlabBlock(ofFullCopy(RED_STONE_BRICKS.get())));
    public static final DeferredBlock<WallBlock> RED_STONE_BRICK_WALL = BLOCKS.register("red_stone_brick_wall", () -> new WallBlock(ofFullCopy(RED_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> RED_STONE_COLUMN = BLOCKS.register("red_stone_column", () -> new BENTDirectionalBlock(ofFullCopy(RED_STONE.get())));
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
    public static final DeferredBlock<Block> RED_STONE_BRICK_TRIM = BLOCKS.register("red_stone_brick_trim", () -> new BENTDirectionalBlock(ofFullCopy(RED_STONE_BRICKS.get())));
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
    public static final DeferredItem<BlockItem> RED_STONE_ITEM = ITEMS.registerSimpleBlockItem("red_stone", RED_STONE);
    public static final DeferredItem<BlockItem> RED_STONE_WALL_ITEM = ITEMS.registerSimpleBlockItem("red_stone_wall", RED_STONE_WALL);
    public static final DeferredItem<BlockItem> RED_STONE_BUTTON_ITEM = ITEMS.registerSimpleBlockItem("red_stone_button", RED_STONE_BUTTON);
    public static final DeferredItem<BlockItem> RED_STONE_PRESSURE_PLATE_ITEM = ITEMS.registerSimpleBlockItem("red_stone_pressure_plate", RED_STONE_PRESSURE_PLATE);
    public static final DeferredItem<BlockItem> RED_STONE_BRICKS_ITEM = ITEMS.registerSimpleBlockItem("red_stone_bricks", RED_STONE_BRICKS);
    public static final DeferredItem<BlockItem> RED_STONE_BRICK_WALL_ITEM = ITEMS.registerSimpleBlockItem("red_stone_brick_wall", RED_STONE_BRICK_WALL);
    public static final DeferredItem<BlockItem> RED_STONE_COLUMN_ITEM = ITEMS.registerSimpleBlockItem("red_stone_column", RED_STONE_COLUMN);
    public static final DeferredItem<BlockItem> POLISHED_RED_STONE_ITEM = ITEMS.registerSimpleBlockItem("polished_red_stone", POLISHED_RED_STONE);
    public static final DeferredItem<BlockItem> POLISHED_RED_STONE_STAIRS_ITEM = ITEMS.registerSimpleBlockItem("polished_red_stone_stairs", POLISHED_RED_STONE_STAIRS);
    public static final DeferredItem<BlockItem> POLISHED_RED_STONE_SLAB_ITEM = ITEMS.registerSimpleBlockItem("polished_red_stone_slab", POLISHED_RED_STONE_SLAB);
    public static final DeferredItem<BlockItem> POLISHED_RED_STONE_WALL_ITEM = ITEMS.registerSimpleBlockItem("polished_red_stone_wall", POLISHED_RED_STONE_WALL);
    public static final DeferredItem<BlockItem> CHISELED_RED_STONE_BRICKS_ITEM = ITEMS.registerSimpleBlockItem("chiseled_red_stone", CHISELED_RED_STONE_BRICKS);
    public static final DeferredItem<BlockItem> HORIZONTAL_RED_STONE_BRICKS_ITEM = ITEMS.registerSimpleBlockItem("horizontal_red_stone", HORIZONTAL_RED_STONE_BRICKS);
    public static final DeferredItem<BlockItem> HORIZONTAL_RED_STONE_BRICK_STAIRS_ITEM = ITEMS.registerSimpleBlockItem("horizontal_red_stone_stairs", HORIZONTAL_RED_STONE_BRICK_STAIRS);
    public static final DeferredItem<BlockItem> HORIZONTAL_RED_STONE_BRICK_SLAB_ITEM = ITEMS.registerSimpleBlockItem("horizontal_red_stone_slab", HORIZONTAL_RED_STONE_BRICK_SLAB);
    public static final DeferredItem<BlockItem> HORIZONTAL_RED_STONE_BRICK_WALL_ITEM = ITEMS.registerSimpleBlockItem("horizontal_red_stone_wall", HORIZONTAL_RED_STONE_BRICK_WALL);
    public static final DeferredItem<BlockItem> VERTICAL_RED_STONE_BRICKS_ITEM = ITEMS.registerSimpleBlockItem("vertical_red_stone", VERTICAL_RED_STONE_BRICKS);
    public static final DeferredItem<BlockItem> VERTICAL_RED_STONE_BRICK_STAIRS_ITEM = ITEMS.registerSimpleBlockItem("vertical_red_stone_stairs", VERTICAL_RED_STONE_BRICK_STAIRS);
    public static final DeferredItem<BlockItem> VERTICAL_RED_STONE_BRICK_SLAB_ITEM = ITEMS.registerSimpleBlockItem("vertical_red_stone_slab", VERTICAL_RED_STONE_BRICK_SLAB);
    public static final DeferredItem<BlockItem> VERTICAL_RED_STONE_BRICK_WALL_ITEM = ITEMS.registerSimpleBlockItem("vertical_red_stone_wall", VERTICAL_RED_STONE_BRICK_WALL);
    public static final DeferredItem<BlockItem> RED_STONE_BRICK_EMBEDDED_LADDER_ITEM = ITEMS.registerSimpleBlockItem("red_stone_brick_embedded_ladder", RED_STONE_BRICK_EMBEDDED_LADDER);
    public static final DeferredItem<BlockItem> RED_STONE_BRICK_TRIM_ITEM = ITEMS.registerSimpleBlockItem("red_stone_brick_trim", RED_STONE_BRICK_TRIM);
    public static final DeferredItem<BlockItem> RED_STONE_BRICK_FROG_ITEM = ITEMS.registerSimpleBlockItem("red_stone_brick_frog", RED_STONE_BRICK_FROG);
    public static final DeferredItem<BlockItem> RED_STONE_BRICK_IGUANA_LEFT_ITEM = ITEMS.registerSimpleBlockItem("red_stone_brick_iguana_left", RED_STONE_BRICK_IGUANA_LEFT);
    public static final DeferredItem<BlockItem> RED_STONE_BRICK_IGUANA_RIGHT_ITEM = ITEMS.registerSimpleBlockItem("red_stone_brick_iguana_right", RED_STONE_BRICK_IGUANA_RIGHT);
    public static final DeferredItem<BlockItem> RED_STONE_BRICK_LOTUS_ITEM = ITEMS.registerSimpleBlockItem("red_stone_brick_lotus", RED_STONE_BRICK_LOTUS);
    public static final DeferredItem<BlockItem> RED_STONE_BRICK_NAK_LEFT_ITEM = ITEMS.registerSimpleBlockItem("red_stone_brick_nak_left", RED_STONE_BRICK_NAK_LEFT);
    public static final DeferredItem<BlockItem> RED_STONE_BRICK_NAK_RIGHT_ITEM = ITEMS.registerSimpleBlockItem("red_stone_brick_nak_right", RED_STONE_BRICK_NAK_RIGHT);
    public static final DeferredItem<BlockItem> RED_STONE_BRICK_SALAMANDER_LEFT_ITEM = ITEMS.registerSimpleBlockItem("red_stone_brick_salamander_left", RED_STONE_BRICK_SALAMANDER_LEFT);
    public static final DeferredItem<BlockItem> RED_STONE_BRICK_SALAMANDER_RIGHT_ITEM = ITEMS.registerSimpleBlockItem("red_stone_brick_salamander_right", RED_STONE_BRICK_SALAMANDER_RIGHT);
    public static final DeferredItem<BlockItem> RED_STONE_BRICK_SKAIA_ITEM = ITEMS.registerSimpleBlockItem("red_stone_brick_skaia_", RED_STONE_BRICK_SKAIA);
    public static final DeferredItem<BlockItem> RED_STONE_BRICK_TURTLE_ITEM = ITEMS.registerSimpleBlockItem("red_stone_brick_turtle", RED_STONE_BRICK_TURTLE);
    public static final DeferredBlock<Block> BLUE_STONE = BLOCKS.register("blue_stone", () -> new Block(Block.Properties.of().mapColor(MapColor.COLOR_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.5F, 7.0F)));
    public static final DeferredBlock<StairBlock> BLUE_STONE_STAIRS = BLOCKS.register("blue_stone_stairs", () -> new StairBlock(BLUE_STONE.get().defaultBlockState(), ofFullCopy(BLUE_STONE.get())));
    public static final DeferredBlock<SlabBlock> BLUE_STONE_SLAB = BLOCKS.register("blue_stone_slab", () -> new SlabBlock(ofFullCopy(BLUE_STONE.get())));
    public static final DeferredBlock<WallBlock> BLUE_STONE_WALL = BLOCKS.register("blue_stone_wall", () -> new WallBlock(ofFullCopy(BLUE_STONE.get())));
    public static final DeferredBlock<ButtonBlock> BLUE_STONE_BUTTON = BLOCKS.register("blue_stone_button", () -> new ButtonBlock(BENTBlockSetType.BLUE_STONE, 10, ofFullCopy(BLUE_STONE.get()).noCollission()));
    public static final DeferredBlock<PressurePlateBlock> BLUE_STONE_PRESSURE_PLATE = BLOCKS.register("blue_stone_pressure_plate", () -> new PressurePlateBlock(BENTBlockSetType.BLUE_STONE, ofFullCopy(BLUE_STONE.get())));
    public static final DeferredBlock<Block> POLISHED_BLUE_STONE = BLOCKS.register("polished_blue_stone", () -> new Block(ofFullCopy(BLUE_STONE.get())));
    public static final DeferredBlock<StairBlock> POLISHED_BLUE_STONE_STAIRS = BLOCKS.register("polished_blue_stone_stairs", () -> new StairBlock(POLISHED_BLUE_STONE.get().defaultBlockState(), ofFullCopy(POLISHED_BLUE_STONE.get())));
    public static final DeferredBlock<SlabBlock> POLISHED_BLUE_STONE_SLAB = BLOCKS.register("polished_blue_stone_slab", () -> new SlabBlock(ofFullCopy(POLISHED_BLUE_STONE.get())));
    public static final DeferredBlock<WallBlock> POLISHED_BLUE_STONE_WALL = BLOCKS.register("polished_blue_stone_wall", () -> new WallBlock(ofFullCopy(POLISHED_BLUE_STONE.get())));
    public static final DeferredBlock<Block> BLUE_STONE_BRICKS = BLOCKS.register("blue_stone_bricks", () -> new Block(ofFullCopy(BLUE_STONE.get())));
    public static final DeferredBlock<StairBlock> BLUE_STONE_BRICK_STAIRS = BLOCKS.register("blue_stone_brick_stairs", () -> new StairBlock(BLUE_STONE_BRICKS.get().defaultBlockState(), ofFullCopy(BLUE_STONE_BRICKS.get())));
    public static final DeferredBlock<SlabBlock> BLUE_STONE_BRICK_SLAB = BLOCKS.register("blue_stone_brick_slab", () -> new SlabBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
    public static final DeferredBlock<WallBlock> BLUE_STONE_BRICK_WALL = BLOCKS.register("blue_stone_brick_wall", () -> new WallBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
    public static final DeferredBlock<Block> BLUE_STONE_COLUMN = BLOCKS.register("blue_stone_column", () -> new BENTDirectionalBlock(ofFullCopy(BLUE_STONE.get())));
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
    public static final DeferredBlock<Block> BLUE_STONE_BRICK_TRIM = BLOCKS.register("blue_stone_brick_trim", () -> new BENTDirectionalBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
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
    public static final DeferredItem<BlockItem> BLUE_STONE_ITEM = ITEMS.registerSimpleBlockItem("blue_stone", BLUE_STONE);
    public static final DeferredItem<BlockItem> BLUE_STONE_WALL_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_wall", BLUE_STONE_WALL);
    public static final DeferredItem<BlockItem> BLUE_STONE_BUTTON_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_button", BLUE_STONE_BUTTON);
    public static final DeferredItem<BlockItem> BLUE_STONE_PRESSURE_PLATE_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_pressure_plate", BLUE_STONE_PRESSURE_PLATE);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICKS_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_bricks", BLUE_STONE_BRICKS);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_WALL_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_brick_wall", BLUE_STONE_BRICK_WALL);
    public static final DeferredItem<BlockItem> BLUE_STONE_COLUMN_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_column", BLUE_STONE_COLUMN);
    public static final DeferredItem<BlockItem> POLISHED_BLUE_STONE_ITEM = ITEMS.registerSimpleBlockItem("polished_blue_stone", POLISHED_BLUE_STONE);
    public static final DeferredItem<BlockItem> POLISHED_BLUE_STONE_STAIRS_ITEM = ITEMS.registerSimpleBlockItem("polished_blue_stone_stairs", POLISHED_BLUE_STONE_STAIRS);
    public static final DeferredItem<BlockItem> POLISHED_BLUE_STONE_SLAB_ITEM = ITEMS.registerSimpleBlockItem("polished_blue_stone_slab", POLISHED_BLUE_STONE_SLAB);
    public static final DeferredItem<BlockItem> POLISHED_BLUE_STONE_WALL_ITEM = ITEMS.registerSimpleBlockItem("polished_blue_stone_wall", POLISHED_BLUE_STONE_WALL);
    public static final DeferredItem<BlockItem> CHISELED_BLUE_STONE_BRICKS_ITEM = ITEMS.registerSimpleBlockItem("chiseled_blue_stone", CHISELED_BLUE_STONE_BRICKS);
    public static final DeferredItem<BlockItem> HORIZONTAL_BLUE_STONE_BRICKS_ITEM = ITEMS.registerSimpleBlockItem("horizontal_blue_stone", HORIZONTAL_BLUE_STONE_BRICKS);
    public static final DeferredItem<BlockItem> HORIZONTAL_BLUE_STONE_BRICK_STAIRS_ITEM = ITEMS.registerSimpleBlockItem("horizontal_blue_stone_stairs", HORIZONTAL_BLUE_STONE_BRICK_STAIRS);
    public static final DeferredItem<BlockItem> HORIZONTAL_BLUE_STONE_BRICK_SLAB_ITEM = ITEMS.registerSimpleBlockItem("horizontal_blue_stone_slab", HORIZONTAL_BLUE_STONE_BRICK_SLAB);
    public static final DeferredItem<BlockItem> HORIZONTAL_BLUE_STONE_BRICK_WALL_ITEM = ITEMS.registerSimpleBlockItem("horizontal_blue_stone_wall", HORIZONTAL_BLUE_STONE_BRICK_WALL);
    public static final DeferredItem<BlockItem> VERTICAL_BLUE_STONE_BRICKS_ITEM = ITEMS.registerSimpleBlockItem("vertical_blue_stone", VERTICAL_BLUE_STONE_BRICKS);
    public static final DeferredItem<BlockItem> VERTICAL_BLUE_STONE_BRICK_STAIRS_ITEM = ITEMS.registerSimpleBlockItem("vertical_blue_stone_stairs", VERTICAL_BLUE_STONE_BRICK_STAIRS);
    public static final DeferredItem<BlockItem> VERTICAL_BLUE_STONE_BRICK_SLAB_ITEM = ITEMS.registerSimpleBlockItem("vertical_blue_stone_slab", VERTICAL_BLUE_STONE_BRICK_SLAB);
    public static final DeferredItem<BlockItem> VERTICAL_BLUE_STONE_BRICK_WALL_ITEM = ITEMS.registerSimpleBlockItem("vertical_blue_stone_wall", VERTICAL_BLUE_STONE_BRICK_WALL);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_EMBEDDED_LADDER_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_brick_embedded_ladder", BLUE_STONE_BRICK_EMBEDDED_LADDER);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_TRIM_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_brick_trim", BLUE_STONE_BRICK_TRIM);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_FROG_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_brick_frog", BLUE_STONE_BRICK_FROG);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_IGUANA_LEFT_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_brick_iguana_left", BLUE_STONE_BRICK_IGUANA_LEFT);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_IGUANA_RIGHT_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_brick_iguana_right", BLUE_STONE_BRICK_IGUANA_RIGHT);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_LOTUS_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_brick_lotus", BLUE_STONE_BRICK_LOTUS);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_NAK_LEFT_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_brick_nak_left", BLUE_STONE_BRICK_NAK_LEFT);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_NAK_RIGHT_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_brick_nak_right", BLUE_STONE_BRICK_NAK_RIGHT);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_SALAMANDER_LEFT_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_brick_salamander_left", BLUE_STONE_BRICK_SALAMANDER_LEFT);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_SALAMANDER_RIGHT_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_brick_salamander_right", BLUE_STONE_BRICK_SALAMANDER_RIGHT);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_SKAIA_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_brick_skaia_", BLUE_STONE_BRICK_SKAIA);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_TURTLE_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_brick_turtle", BLUE_STONE_BRICK_TURTLE);

    //
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        }
    }