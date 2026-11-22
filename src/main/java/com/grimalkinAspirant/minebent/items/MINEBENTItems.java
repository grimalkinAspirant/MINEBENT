package com.grimalkinAspirant.minebent.items;

import com.grimalkinAspirant.minebent.MINEBENT;
import com.grimalkinAspirant.minebent.datagen.BENTDragonArmorFly;
import com.grimalkinAspirant.minebent.datagen.BENTMagicRangedRightClickEffect;
import com.grimalkinAspirant.minebent.datagen.BENTRocketArmorFly;
import com.mraof.minestuck.item.MSFoods;
import com.mraof.minestuck.item.MSItemProperties;
import com.mraof.minestuck.item.MSItemTypes;
import com.mraof.minestuck.item.MSItems;
import com.mraof.minestuck.item.weapon.*;
import com.mraof.minestuck.item.weapon.projectiles.ConsumableProjectileWeaponItem;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

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
    public static final DeferredItem<Item> TROLL_HORN = ITEMS.register("troll_horn",
            () -> new Item(new Item.Properties()));
    // Food
    public static final DeferredItem<Item> SMALL_GRUB = ITEMS.register("small_grub",
            () -> new Item(new Item.Properties().food(MINEBENTItems.SMALL_GRUB_PROP)));
    public static final DeferredItem<Item> BIG_GRUB = ITEMS.register("big_grub",
            () -> new Item(new Item.Properties().food(MINEBENTItems.BIG_GRUB_PROP)));
    public static final DeferredItem<Item> BUG_MEAT = ITEMS.register("bug_meat",
            () -> new Item(new Item.Properties().food(MINEBENTItems.BUG_MEAT_PROP)));
    public static final DeferredItem<Item> COOKED_SMALL_GRUB = ITEMS.register("cooked_small_grub",
            () -> new Item(new Item.Properties().food(MINEBENTItems.COOKED_SMALL_GRUB_PROP)));
    public static final DeferredItem<Item> COOKED_BIG_GRUB = ITEMS.register("cooked_big_grub",
            () -> new Item(new Item.Properties().food(MINEBENTItems.COOKED_BIG_GRUB_PROP)));
    public static final DeferredItem<Item> COOKED_BUG_MEAT = ITEMS.register("cooked_bug_meat",
            () -> new Item(new Item.Properties().food(MINEBENTItems.COOKED_BUG_MEAT_PROP)));
    // Food Properties
    public static final FoodProperties SMALL_GRUB_PROP = (new FoodProperties.Builder()).nutrition(3).saturationModifier(0.1F).effect(
            () -> new MobEffectInstance(MobEffects.INFESTED, 600, 3), 0.7F).effect(
            () -> new MobEffectInstance(MobEffects.HUNGER, 600, 3), 0.7F).build();
    public static final FoodProperties BIG_GRUB_PROP = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.1F).effect(
            () -> new MobEffectInstance(MobEffects.INFESTED, 600, 3), 0.7F).effect(
            () -> new MobEffectInstance(MobEffects.HUNGER, 600, 3), 0.7F).build();
    public static final FoodProperties BUG_MEAT_PROP = (new FoodProperties.Builder()).nutrition(5).saturationModifier(0.1F).effect(
            () -> new MobEffectInstance(MobEffects.INFESTED, 600, 3), 0.7F).effect(
            () -> new MobEffectInstance(MobEffects.HUNGER, 600, 3), 0.7F).build();
    public static final FoodProperties COOKED_SMALL_GRUB_PROP = (new FoodProperties.Builder()).nutrition(6).saturationModifier(0.2F).build();
    public static final FoodProperties COOKED_BIG_GRUB_PROP = (new FoodProperties.Builder()).nutrition(8).saturationModifier(0.3F).build();
    public static final FoodProperties COOKED_BUG_MEAT_PROP = (new FoodProperties.Builder()).nutrition(10).saturationModifier(0.4F).build();
    // Weapons and Tools
    public static final DeferredItem<Item> AHABS_CROSSHAIRS = ITEMS.register("ahabs_crosshairs",
            () -> new WeaponItem(new WeaponItem.Builder(MSItemTypes.ZILLY_TIER, -2, -2.0f).efficiency(1.0f).set(MSItemTypes.WAND_TOOL).set(BENTMagicRangedRightClickEffect.AHAB),
                    new Item.Properties().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> EMPIRICISTS_WAND = ITEMS.register("empiricists_wand",
            () -> new WeaponItem(new WeaponItem.Builder(MSItemTypes.DENIZEN_TIER, -2, -2.0f).efficiency(1.0f).set(MSItemTypes.WAND_TOOL).set(MagicRangedRightClickEffect.ECHIDNA_MAGIC),
                    new Item.Properties().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> MIRTHFUL_CLUB = ITEMS.register("mirthful_club",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.NETHERITE, 5, -2.8F).efficiency(2.0F).set(MSItemTypes.CLUB_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> OPEN_UMBRELLA = ITEMS.register("open_umbrella",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.WOOD, 0, -3.0F).efficiency(1.0F).set(ItemRightClickEffect.switchTo(MSItems.UMBRELLA))
                    .set(MSItemTypes.CANE_TOOL).add(InventoryTickEffect.BREATH_SLOW_FALLING), new MSItemProperties().durability(350)));
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
    public static final DeferredItem<Item> STONE_LANCE = ITEMS.register("stone_lance",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.STONE, 4, -2.8F).efficiency(2.0F).set(MSItemTypes.LANCE_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> GOLD_LANCE = ITEMS.register("gold_lance",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.GOLD, 4, -2.8F).efficiency(2.0F).set(MSItemTypes.LANCE_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_LANCE = ITEMS.register("diamond_lance",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 4, -2.8F).efficiency(2.0F).set(MSItemTypes.LANCE_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> MIRTHFUL_LANCE = ITEMS.register("mirthful_lance",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.NETHERITE, 5, -2.8F).efficiency(2.0F).set(MSItemTypes.LANCE_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> WOODEN_SICKLE = ITEMS.register("wooden_sickle",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.WOOD, 2, -2.2F).efficiency(1.5F).disableShield().set(MSItemTypes.SICKLE_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> STONE_SICKLE = ITEMS.register("stone_sickle",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.STONE, 2, -2.2F).efficiency(1.5F).disableShield().set(MSItemTypes.SICKLE_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> GOLD_SICKLE = ITEMS.register("gold_sickle",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.GOLD, 2, -2.2F).efficiency(1.5F).disableShield().set(MSItemTypes.SICKLE_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_SICKLE = ITEMS.register("diamond_sickle",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 2, -2.2F).efficiency(1.5F).disableShield().set(MSItemTypes.SICKLE_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> MIRTHFUL_SICKLE = ITEMS.register("mirthful_sickle",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.NETHERITE, 3, -2.2F).efficiency(1.5F).disableShield().set(MSItemTypes.SICKLE_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> WOODEN_CLAWS_DRAWN = ITEMS.register("wooden_claws_drawn",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.WOOD, 1, -1.5F).efficiency(10.0F).set(MSItemTypes.CLAWS_TOOL).set(ItemRightClickEffect.switchTo(MINEBENTItems.WOODEN_CLAWS_SHEATHED)), new MSItemProperties().durability(200)));
    public static final DeferredItem<Item> WOODEN_CLAWS_SHEATHED = ITEMS.register("wooden_claws_sheathed",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.WOOD, -1, -1.0F).efficiency(10.0F).set(ItemRightClickEffect.switchTo(MINEBENTItems.WOODEN_CLAWS_DRAWN)), new MSItemProperties().durability(200)));
    public static final DeferredItem<Item> GOLD_CLAWS_DRAWN = ITEMS.register("gold_claws_drawn",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.GOLD, 1, -1.5F).efficiency(10.0F).set(MSItemTypes.CLAWS_TOOL).set(ItemRightClickEffect.switchTo(MINEBENTItems.GOLD_CLAWS_SHEATHED)), new MSItemProperties().durability(200)));
    public static final DeferredItem<Item> GOLD_CLAWS_SHEATHED = ITEMS.register("gold_claws_sheathed",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.GOLD, -1, -1.0F).efficiency(10.0F).set(ItemRightClickEffect.switchTo(MINEBENTItems.GOLD_CLAWS_DRAWN)), new MSItemProperties().durability(200)));
    public static final DeferredItem<Item> COPPER_CLAWS_DRAWN = ITEMS.register("copper_claws_drawn",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.IRON, 1, -1.5F).efficiency(10.0F).set(MSItemTypes.CLAWS_TOOL).set(ItemRightClickEffect.switchTo(MINEBENTItems.COPPER_CLAWS_SHEATHED)), new MSItemProperties().durability(200)));
    public static final DeferredItem<Item> COPPER_CLAWS_SHEATHED = ITEMS.register("copper_claws_sheathed",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.IRON, -1, -1.0F).efficiency(10.0F).set(ItemRightClickEffect.switchTo(MINEBENTItems.COPPER_CLAWS_DRAWN)), new MSItemProperties().durability(200)));
    public static final DeferredItem<Item> MIRTHFUL_CLAWS_DRAWN = ITEMS.register("mirthful_claws_drawn",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.NETHERITE, 2, -1.5F).efficiency(10.0F).set(MSItemTypes.CLAWS_TOOL).set(ItemRightClickEffect.switchTo(MINEBENTItems.MIRTHFUL_CLAWS_SHEATHED)), new MSItemProperties().durability(200)));
    public static final DeferredItem<Item> MIRTHFUL_CLAWS_SHEATHED = ITEMS.register("mirthful_claws_sheathed",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.NETHERITE, -1, -1.0F).efficiency(10.0F).set(ItemRightClickEffect.switchTo(MINEBENTItems.MIRTHFUL_CLAWS_DRAWN)), new MSItemProperties().durability(200)));
    public static final DeferredItem<Item> WOODEN_LIPSTICK_CHAINSAW = ITEMS.register("wooden_lipstick_chainsaw",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.WOOD, 2, -1.5F).efficiency(10.0F).set(MSItemTypes.CHAINSAW_TOOL).set(ItemRightClickEffect.switchTo(MINEBENTItems.SAWDUST_LIPSTICK)), new MSItemProperties().durability(250)));
    public static final DeferredItem<Item> SAWDUST_LIPSTICK = ITEMS.register("sawdust_lipstick",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.WOOD, -1, -0.5F).efficiency(10.0F).set(ItemRightClickEffect.switchTo(MINEBENTItems.WOODEN_LIPSTICK_CHAINSAW)), new MSItemProperties().durability(250)));
    public static final DeferredItem<Item> STONE_LIPSTICK_CHAINSAW = ITEMS.register("stone_lipstick_chainsaw",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.STONE, 2, -1.5F).efficiency(10.0F).set(MSItemTypes.CHAINSAW_TOOL).set(ItemRightClickEffect.switchTo(MINEBENTItems.CHALKY_LIPSTICK)), new MSItemProperties().durability(250)));
    public static final DeferredItem<Item> CHALKY_LIPSTICK = ITEMS.register("chalky_lipstick",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.WOOD, -1, -0.5F).efficiency(10.0F).set(ItemRightClickEffect.switchTo(MINEBENTItems.STONE_LIPSTICK_CHAINSAW)), new MSItemProperties().durability(250)));
    public static final DeferredItem<Item> GOLD_LIPSTICK_CHAINSAW = ITEMS.register("gold_lipstick_chainsaw",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.GOLD, 2, -1.5F).efficiency(10.0F).set(MSItemTypes.CHAINSAW_TOOL).set(ItemRightClickEffect.switchTo(MINEBENTItems.SIX_KARAT_LIPSTICK)), new MSItemProperties().durability(250)));
    public static final DeferredItem<Item> SIX_KARAT_LIPSTICK = ITEMS.register("six_karat_lipstick",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.WOOD, -1, -0.5F).efficiency(10.0F).set(ItemRightClickEffect.switchTo(MINEBENTItems.GOLD_LIPSTICK_CHAINSAW)), new MSItemProperties().durability(250)));
    public static final DeferredItem<Item> DIAMOND_LIPSTICK_CHAINSAW = ITEMS.register("diamond_lipstick_chainsaw",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 2, -1.5F).efficiency(10.0F).set(MSItemTypes.CHAINSAW_TOOL).set(ItemRightClickEffect.switchTo(MINEBENTItems.ICED_LIPSTICK)), new MSItemProperties().durability(250)));
    public static final DeferredItem<Item> ICED_LIPSTICK = ITEMS.register("iced_lipstick",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.WOOD, -1, -0.5F).efficiency(10.0F).set(ItemRightClickEffect.switchTo(MINEBENTItems.DIAMOND_LIPSTICK_CHAINSAW)), new MSItemProperties().durability(250)));
    public static final DeferredItem<Item> STONE_CANE = ITEMS.register("stone_cane",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.STONE, 2, -2.0F).efficiency(1.0F).set(MSItemTypes.CANE_TOOL), new MSItemProperties().durability(100)));
    public static final DeferredItem<Item> GOLD_CANE = ITEMS.register("gold_cane",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.GOLD, 2, -2.0F).efficiency(1.0F).set(MSItemTypes.CANE_TOOL), new MSItemProperties().durability(100)));
    public static final DeferredItem<Item> DIAMOND_CANE = ITEMS.register("diamond_cane",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 2, -2.0F).efficiency(1.0F).set(MSItemTypes.CANE_TOOL), new MSItemProperties().durability(100)));
    public static final DeferredItem<Item> MIRTHFUL_CANE = ITEMS.register("mirthful_cane",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.NETHERITE, 3, -2.0F).efficiency(1.0F).set(MSItemTypes.CANE_TOOL), new MSItemProperties().durability(100)));
    public static final DeferredItem<Item> WOODEN_CLUB = ITEMS.register("wooden_club",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.WOOD, 4, -2.8F).efficiency(2.0F).set(MSItemTypes.CLUB_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> STONE_CLUB = ITEMS.register("stone_club",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.STONE, 4, -2.8F).efficiency(2.0F).set(MSItemTypes.CLUB_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> GOLD_CLUB = ITEMS.register("gold_club",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.GOLD, 4, -2.8F).efficiency(2.0F).set(MSItemTypes.CLUB_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_CLUB = ITEMS.register("diamond_club",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 4, -2.8F).efficiency(2.0F).set(MSItemTypes.CLUB_TOOL), new Item.Properties()));

    // Armor
    public static final DeferredItem<ArmorItem> ROCKET_SHOES = ITEMS.register("rocket_shoes",
            () -> new BENTRocketArmorFly(MINEBENTMaterials.ROCKET_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(32))));
    public static final DeferredItem<ArmorItem> ROCKET_PACK = ITEMS.register("rocket_pack",
            () -> new BENTRocketArmorFly(MINEBENTMaterials.ROCKET_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(32))));
    public static final DeferredItem<ArmorItem> DRAGON_PACK = ITEMS.register("dragon_pack",
            () -> new BENTDragonArmorFly(MINEBENTMaterials.ROCKET_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(32))));
    public static final DeferredItem<ArmorItem> CHITIN_HELMET = ITEMS.register("chitin_helmet",
            () -> new ArmorItem(MINEBENTMaterials.CHITIN_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(0))));
    public static final DeferredItem<ArmorItem> CHITIN_CHESTPLATE = ITEMS.register("chitin_chestplate",
            () -> new ArmorItem(MINEBENTMaterials.CHITIN_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(0))));
    public static final DeferredItem<ArmorItem> CHITIN_LEGGINGS = ITEMS.register("chitin_leggings",
            () -> new ArmorItem(MINEBENTMaterials.CHITIN_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(0))));
    public static final DeferredItem<ArmorItem> CHITIN_BOOTS = ITEMS.register("chitin_boots",
            () -> new ArmorItem(MINEBENTMaterials.CHITIN_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(0))));
    public static final DeferredItem<ArmorItem> MIRTHFUL_MASQUE = ITEMS.register("mirthful_masque",
            () -> new ArmorItem(MINEBENTMaterials.MIRTHFUL_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(42))));
    public static final DeferredItem<ArmorItem> MIRTHFUL_CHESTPLATE = ITEMS.register("mirthful_chestplate",
            () -> new ArmorItem(MINEBENTMaterials.MIRTHFUL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(42))));
    public static final DeferredItem<ArmorItem> MIRTHFUL_LEGGINGS = ITEMS.register("mirthful_leggings",
            () -> new ArmorItem(MINEBENTMaterials.MIRTHFUL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(42))));
    public static final DeferredItem<ArmorItem> MIRTHFUL_BOOTS = ITEMS.register("mirthful_boots",
            () -> new ArmorItem(MINEBENTMaterials.MIRTHFUL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(42))));
    public static final DeferredItem<ArmorItem> SUNHAT = ITEMS.register("sunhat",
            () -> new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(0))));

    // Blocks
    public static final DeferredBlock<Block> CHERUB_PORTAL = BLOCKS.registerSimpleBlock("cherub_portal", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> CHERUB_PORTAL_ITEM = ITEMS.registerSimpleBlockItem("cherub_portal", CHERUB_PORTAL);
    public static final DeferredBlock<Block> RUBY_BLOCK = BLOCKS.registerSimpleBlock("ruby_block", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED));
    public static final DeferredItem<BlockItem> RUBY_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("ruby_block", RUBY_BLOCK);
    public static final DeferredBlock<Block> RULERSTONE = BLOCKS.registerSimpleBlock("rulerstone", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK));
    public static final DeferredBlock<Block> FELTSTONE = BLOCKS.registerSimpleBlock("feltstone", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN));
    public static final DeferredBlock<Block> CARNIVAL_GROUND = BLOCKS.registerSimpleBlock("carnival_ground", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE));

    // Natural Blocks & Derivatives
    public static final DeferredBlock<Block> TROLLSTONE = BLOCKS.registerSimpleBlock("trollstone", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> TROLLSTONE_ITEM = ITEMS.registerSimpleBlockItem("trollstone", TROLLSTONE);
    public static final DeferredBlock<StairBlock> TROLLSTONE_STAIRS = BLOCKS.register("trollstone_stairs", () -> new StairBlock(MINEBENTItems.TROLLSTONE.get().defaultBlockState(), ofFullCopy(TROLLSTONE.get())));
    public static final DeferredItem<BlockItem> TROLLSTONE_STAIRS_ITEM = ITEMS.registerSimpleBlockItem("trollstone_stairs", TROLLSTONE_STAIRS);
    public static final DeferredBlock<SlabBlock> TROLLSTONE_SLAB = BLOCKS.register("trollstone_slab", () -> new SlabBlock(ofFullCopy(TROLLSTONE.get())));
    public static final DeferredItem<BlockItem> TROLLSTONE_SLAB_ITEM = ITEMS.registerSimpleBlockItem("trollstone_slab", TROLLSTONE_SLAB);
    public static final DeferredBlock<ButtonBlock> TROLLSTONE_BUTTON = BLOCKS.register("trollstone_button", () -> new ButtonBlock(BlockSetType.STONE, 10, ofFullCopy(TROLLSTONE.get()).noCollission()));
    public static final DeferredItem<BlockItem> TROLLSTONE_BUTTON_ITEM = ITEMS.registerSimpleBlockItem("trollstone_button", TROLLSTONE_BUTTON);
    public static final DeferredBlock<PressurePlateBlock> TROLLSTONE_PRESSURE_PLATE = BLOCKS.register("trollstone_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, ofFullCopy(TROLLSTONE.get())));
    public static final DeferredItem<BlockItem> TROLLSTONE_PRESSURE_PLATE_ITEM = ITEMS.registerSimpleBlockItem("trollstone_pressure_plate", TROLLSTONE_PRESSURE_PLATE);

    public static final DeferredBlock<Block> COBBLED_TROLLSTONE = BLOCKS.registerSimpleBlock("cobbled_trollstone", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> COBBLED_TROLLSTONE_ITEM = ITEMS.registerSimpleBlockItem("cobbled_trollstone", COBBLED_TROLLSTONE);
    public static final DeferredBlock<StairBlock> COBBLED_TROLLSTONE_STAIRS = BLOCKS.register("cobbled_trollstone_stairs", () -> new StairBlock(COBBLED_TROLLSTONE.get().defaultBlockState(), ofFullCopy(COBBLED_TROLLSTONE.get())));
    public static final DeferredItem<BlockItem> COBBLED_TROLLSTONE_STAIRS_ITEM = ITEMS.registerSimpleBlockItem("cobbled_trollstone_stairs", COBBLED_TROLLSTONE_STAIRS);
    public static final DeferredBlock<SlabBlock> COBBLED_TROLLSTONE_SLAB = BLOCKS.register("cobbled_trollstone_slab", () -> new SlabBlock(ofFullCopy(COBBLED_TROLLSTONE.get())));
    public static final DeferredItem<BlockItem> COBBLED_TROLLSTONE_SLAB_ITEM = ITEMS.registerSimpleBlockItem("cobbled_trollstone_slab", COBBLED_TROLLSTONE_SLAB);
    public static final DeferredBlock<WallBlock> COBBLED_TROLLSTONE_WALL = BLOCKS.register("cobbled_trollstone_wall", () -> new WallBlock(ofFullCopy(COBBLED_TROLLSTONE.get())));
    public static final DeferredItem<BlockItem> COBBLED_TROLLSTONE_WALL_ITEM = ITEMS.registerSimpleBlockItem("cobbled_trollstone_wall", COBBLED_TROLLSTONE_WALL);

    public static final DeferredBlock<Block> TROLLSTONE_BRICKS = BLOCKS.registerSimpleBlock("trollstone_bricks", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> TROLLSTONE_BRICKS_ITEM = ITEMS.registerSimpleBlockItem("trollstone_bricks", TROLLSTONE_BRICKS);
    public static final DeferredBlock<StairBlock> TROLLSTONE_BRICK_STAIRS = BLOCKS.register("trollstone_brick_stairs", () -> new StairBlock(TROLLSTONE_BRICKS.get().defaultBlockState(), ofFullCopy(TROLLSTONE_BRICKS.get())));
    public static final DeferredItem<BlockItem> TROLLSTONE_BRICK_STAIRS_ITEM = ITEMS.registerSimpleBlockItem("trollstone_brick_stairs", TROLLSTONE_BRICK_STAIRS);
    public static final DeferredBlock<SlabBlock> TROLLSTONE_BRICK_SLAB = BLOCKS.register("trollstone_brick_slab", () -> new SlabBlock(ofFullCopy(TROLLSTONE_BRICKS.get())));
    public static final DeferredItem<BlockItem> TROLLSTONE_BRICK_SLAB_ITEM = ITEMS.registerSimpleBlockItem("trollstone_brick_slab", TROLLSTONE_BRICK_SLAB);
    public static final DeferredBlock<WallBlock> TROLLSTONE_BRICK_WALL = BLOCKS.register("trollstone_brick_wall", () -> new WallBlock(ofFullCopy(TROLLSTONE_BRICKS.get())));
    public static final DeferredItem<BlockItem> TROLLSTONE_BRICK_WALL_ITEM = ITEMS.registerSimpleBlockItem("trollstone_brick_wall", TROLLSTONE_BRICK_WALL);

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
    public static final DeferredBlock<StairBlock> BROODSTONE_STAIRS = BLOCKS.register("broodstone_stairs", () -> new StairBlock(BROODSTONE.get().defaultBlockState(), ofFullCopy(BROODSTONE.get())));
    public static final DeferredItem<BlockItem> BROODSTONE_STAIRS_ITEM = ITEMS.registerSimpleBlockItem("broodstone_stairs", BROODSTONE_STAIRS);
    public static final DeferredBlock<SlabBlock> BROODSTONE_SLAB = BLOCKS.register("broodstone_slab", () -> new SlabBlock(ofFullCopy(BROODSTONE.get())));
    public static final DeferredItem<BlockItem> BROODSTONE_SLAB_ITEM = ITEMS.registerSimpleBlockItem("broodstone_slab", BROODSTONE_SLAB);
    public static final DeferredBlock<WallBlock> BROODSTONE_WALL = BLOCKS.register("broodstone_wall", () -> new WallBlock(ofFullCopy(BROODSTONE.get())));
    public static final DeferredItem<BlockItem> BROODSTONE_WALL_ITEM = ITEMS.registerSimpleBlockItem("broodstone_wall", BROODSTONE_WALL);
    public static final DeferredBlock<Block> BROODSTONE_BRICKS = BLOCKS.registerSimpleBlock("broodstone_bricks", BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE));
    public static final DeferredItem<BlockItem> BROODSTONE_BRICKS_ITEM = ITEMS.registerSimpleBlockItem("broodstone_bricks", BROODSTONE_BRICKS);
    public static final DeferredBlock<StairBlock> BROODSTONE_BRICK_STAIRS = BLOCKS.register("broodstone_brick_stairs", () -> new StairBlock(BROODSTONE_BRICKS.get().defaultBlockState(), ofFullCopy(BROODSTONE_BRICKS.get())));
    public static final DeferredItem<BlockItem> BROODSTONE_BRICK_STAIRS_ITEM = ITEMS.registerSimpleBlockItem("broodstone_brick_stairs", BROODSTONE_BRICK_STAIRS);
    public static final DeferredBlock<SlabBlock> BROODSTONE_BRICK_SLAB = BLOCKS.register("broodstone_brick_slab", () -> new SlabBlock(ofFullCopy(BROODSTONE_BRICKS.get())));
    public static final DeferredItem<BlockItem> BROODSTONE_BRICK_SLAB_ITEM = ITEMS.registerSimpleBlockItem("broodstone_brick_slab", BROODSTONE_BRICK_SLAB);
    public static final DeferredBlock<WallBlock> BROODSTONE_BRICK_WALL = BLOCKS.register("broodstone_brick_wall", () -> new WallBlock(ofFullCopy(BROODSTONE_BRICKS.get())));
    public static final DeferredItem<BlockItem> BROODSTONE_BRICK_WALL_ITEM = ITEMS.registerSimpleBlockItem("broodstone_brick_wall", BROODSTONE_BRICK_WALL);

    // Ores
    public static final DeferredBlock<Block> TROLLSTONE_COAL_ORE = BLOCKS.registerSimpleBlock("trollstone_coal_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> TROLLSTONE_COPPER_ORE = BLOCKS.registerSimpleBlock("trollstone_copper_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> TROLLSTONE_IRON_ORE = BLOCKS.registerSimpleBlock("trollstone_iron_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> TROLLSTONE_REDSTONE_ORE = BLOCKS.registerSimpleBlock("trollstone_redstone_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> TROLLSTONE_GOLD_ORE = BLOCKS.registerSimpleBlock("trollstone_gold_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
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
    public static final DeferredBlock<Block> TROLLSLATE_DIAMOND_ORE = BLOCKS.registerSimpleBlock("trollslate_diamond_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> TROLLSLATE_QUARTZ_ORE = BLOCKS.registerSimpleBlock("trollslate_quartz_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> TROLLSLATE_CRUXITE_ORE = BLOCKS.registerSimpleBlock("trollslate_cruxite_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> TROLLSLATE_URANIUM_ORE = BLOCKS.registerSimpleBlock("trollslate_uranium_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredBlock<Block> TROLLSLATE_RUBY_ORE = BLOCKS.registerSimpleBlock("trollslate_ruby_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> TROLLSTONE_COAL_ORE_ITEM = ITEMS.registerSimpleBlockItem("trollstone_coal_ore", TROLLSTONE_COAL_ORE);
    public static final DeferredItem<BlockItem> TROLLSTONE_COPPER_ORE_ITEM = ITEMS.registerSimpleBlockItem("trollstone_copper_ore", TROLLSTONE_COPPER_ORE);
    public static final DeferredItem<BlockItem> TROLLSTONE_IRON_ORE_ITEM = ITEMS.registerSimpleBlockItem("trollstone_iron_ore", TROLLSTONE_IRON_ORE);
    public static final DeferredItem<BlockItem> TROLLSTONE_REDSTONE_ORE_ITEM = ITEMS.registerSimpleBlockItem("trollstone_redstone_ore", TROLLSTONE_REDSTONE_ORE);
    public static final DeferredItem<BlockItem> TROLLSTONE_GOLD_ORE_ITEM = ITEMS.registerSimpleBlockItem("trollstone_gold_ore", TROLLSTONE_GOLD_ORE);
    public static final DeferredItem<BlockItem> TROLLSTONE_DIAMOND_ORE_ITEM = ITEMS.registerSimpleBlockItem("trollstone_diamond_ore", TROLLSTONE_DIAMOND_ORE);
    public static final DeferredItem<BlockItem> TROLLSTONE_QUARTZ_ORE_ITEM = ITEMS.registerSimpleBlockItem("trollstone_quartz_ore", TROLLSTONE_QUARTZ_ORE);
    public static final DeferredItem<BlockItem> TROLLSTONE_CRUXITE_ORE_ITEM = ITEMS.registerSimpleBlockItem("trollstone_cruxite_ore", TROLLSTONE_CRUXITE_ORE);
    public static final DeferredItem<BlockItem> TROLLSTONE_URANIUM_ORE_ITEM = ITEMS.registerSimpleBlockItem("trollstone_uranium_ore", TROLLSTONE_URANIUM_ORE);
    public static final DeferredItem<BlockItem> TROLLSTONE_RUBY_ORE_ITEM = ITEMS.registerSimpleBlockItem("trollstone_ruby_ore", TROLLSTONE_RUBY_ORE);
    public static final DeferredItem<BlockItem> TROLLSLATE_COAL_ORE_ITEM = ITEMS.registerSimpleBlockItem("trollslate_coal_ore", TROLLSLATE_COAL_ORE);
    public static final DeferredItem<BlockItem> TROLLSLATE_COPPER_ORE_ITEM = ITEMS.registerSimpleBlockItem("trollslate_copper_ore", TROLLSLATE_COPPER_ORE);
    public static final DeferredItem<BlockItem> TROLLSLATE_IRON_ORE_ITEM = ITEMS.registerSimpleBlockItem("trollslate_iron_ore", TROLLSLATE_IRON_ORE);
    public static final DeferredItem<BlockItem> TROLLSLATE_REDSTONE_ORE_ITEM = ITEMS.registerSimpleBlockItem("trollslate_redstone_ore", TROLLSLATE_REDSTONE_ORE);
    public static final DeferredItem<BlockItem> TROLLSLATE_GOLD_ORE_ITEM = ITEMS.registerSimpleBlockItem("trollslate_gold_ore", TROLLSLATE_GOLD_ORE);
    public static final DeferredItem<BlockItem> TROLLSLATE_DIAMOND_ORE_ITEM = ITEMS.registerSimpleBlockItem("trollslate_diamond_ore", TROLLSLATE_DIAMOND_ORE);
    public static final DeferredItem<BlockItem> TROLLSLATE_QUARTZ_ORE_ITEM = ITEMS.registerSimpleBlockItem("trollslate_quartz_ore", TROLLSLATE_QUARTZ_ORE);
    public static final DeferredItem<BlockItem> TROLLSLATE_CRUXITE_ORE_ITEM = ITEMS.registerSimpleBlockItem("trollslate_cruxite_ore", TROLLSLATE_CRUXITE_ORE);
    public static final DeferredItem<BlockItem> TROLLSLATE_URANIUM_ORE_ITEM = ITEMS.registerSimpleBlockItem("trollslate_uranium_ore", TROLLSLATE_URANIUM_ORE);
    public static final DeferredItem<BlockItem> TROLLSLATE_RUBY_ORE_ITEM = ITEMS.registerSimpleBlockItem("trollslate_ruby_ore", TROLLSLATE_RUBY_ORE);

    // Blocks Frog Temple
//    public static final DeferredBlock<Block> RED_STONE = BLOCKS.register("red_stone", () -> new Block(Block.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.5F, 7.0F)));
//    public static final DeferredBlock<StairBlock> RED_STONE_STAIRS = BLOCKS.register("red_stone_stairs", () -> new StairBlock(RED_STONE.get().defaultBlockState(), ofFullCopy(RED_STONE.get())));
//    public static final DeferredBlock<SlabBlock> RED_STONE_SLAB = BLOCKS.register("red_stone_slab", () -> new SlabBlock(ofFullCopy(RED_STONE.get())));
//    public static final DeferredBlock<WallBlock> RED_STONE_WALL = BLOCKS.register("red_stone_wall", () -> new WallBlock(ofFullCopy(RED_STONE.get())));
//    public static final DeferredBlock<ButtonBlock> RED_STONE_BUTTON = BLOCKS.register("red_stone_button", () -> new ButtonBlock(BENTBlockSetType.RED_STONE, 10, ofFullCopy(RED_STONE.get()).noCollission()));
//    public static final DeferredBlock<PressurePlateBlock> RED_STONE_PRESSURE_PLATE = BLOCKS.register("red_stone_pressure_plate", () -> new PressurePlateBlock(BENTBlockSetType.RED_STONE, ofFullCopy(RED_STONE.get())));
//    public static final DeferredBlock<Block> POLISHED_RED_STONE = BLOCKS.register("polished_red_stone", () -> new Block(ofFullCopy(RED_STONE.get())));
//    public static final DeferredBlock<StairBlock> POLISHED_RED_STONE_STAIRS = BLOCKS.register("polished_red_stone_stairs", () -> new StairBlock(POLISHED_RED_STONE.get().defaultBlockState(), ofFullCopy(POLISHED_RED_STONE.get())));
//    public static final DeferredBlock<SlabBlock> POLISHED_RED_STONE_SLAB = BLOCKS.register("polished_red_stone_slab", () -> new SlabBlock(ofFullCopy(POLISHED_RED_STONE.get())));
//    public static final DeferredBlock<WallBlock> POLISHED_RED_STONE_WALL = BLOCKS.register("polished_red_stone_wall", () -> new WallBlock(ofFullCopy(POLISHED_RED_STONE.get())));
//    public static final DeferredBlock<Block> RED_STONE_BRICKS = BLOCKS.register("red_stone_bricks", () -> new Block(ofFullCopy(RED_STONE.get())));
//    public static final DeferredBlock<StairBlock> RED_STONE_BRICK_STAIRS = BLOCKS.register("red_stone_brick_stairs", () -> new StairBlock(RED_STONE_BRICKS.get().defaultBlockState(), ofFullCopy(RED_STONE_BRICKS.get())));
//    public static final DeferredBlock<SlabBlock> RED_STONE_BRICK_SLAB = BLOCKS.register("red_stone_brick_slab", () -> new SlabBlock(ofFullCopy(RED_STONE_BRICKS.get())));
//    public static final DeferredBlock<WallBlock> RED_STONE_BRICK_WALL = BLOCKS.register("red_stone_brick_wall", () -> new WallBlock(ofFullCopy(RED_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> RED_STONE_COLUMN = BLOCKS.register("red_stone_column", () -> new BENTDirectionalBlock(ofFullCopy(RED_STONE.get())));
//    public static final DeferredBlock<Block> CHISELED_RED_STONE_BRICKS = BLOCKS.register("chiseled_red_stone_bricks", () -> new Block(ofFullCopy(RED_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> HORIZONTAL_RED_STONE_BRICKS = BLOCKS.register("horizontal_red_stone_bricks", () -> new Block(ofFullCopy(RED_STONE_BRICKS.get())));
//    public static final DeferredBlock<StairBlock> HORIZONTAL_RED_STONE_BRICK_STAIRS = BLOCKS.register("horizontal_red_stone_brick_stairs", () -> new StairBlock(HORIZONTAL_RED_STONE_BRICKS.get().defaultBlockState(), ofFullCopy(HORIZONTAL_RED_STONE_BRICKS.get())));
//    public static final DeferredBlock<SlabBlock> HORIZONTAL_RED_STONE_BRICK_SLAB = BLOCKS.register("horizontal_red_stone_brick_slab", () -> new SlabBlock(ofFullCopy(HORIZONTAL_RED_STONE_BRICKS.get())));
//    public static final DeferredBlock<WallBlock> HORIZONTAL_RED_STONE_BRICK_WALL = BLOCKS.register("horizontal_red_stone_brick_wall", () -> new WallBlock(ofFullCopy(HORIZONTAL_RED_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> VERTICAL_RED_STONE_BRICKS = BLOCKS.register("vertical_red_stone_bricks", () -> new Block(ofFullCopy(RED_STONE_BRICKS.get())));
//    public static final DeferredBlock<StairBlock> VERTICAL_RED_STONE_BRICK_STAIRS = BLOCKS.register("vertical_red_stone_brick_stairs", () -> new StairBlock(VERTICAL_RED_STONE_BRICKS.get().defaultBlockState(), ofFullCopy(VERTICAL_RED_STONE_BRICKS.get())));
//    public static final DeferredBlock<SlabBlock> VERTICAL_RED_STONE_BRICK_SLAB = BLOCKS.register("vertical_red_stone_brick_slab", () -> new SlabBlock(ofFullCopy(VERTICAL_RED_STONE_BRICKS.get())));
//    public static final DeferredBlock<WallBlock> VERTICAL_RED_STONE_BRICK_WALL = BLOCKS.register("vertical_red_stone_brick_wall", () -> new WallBlock(ofFullCopy(VERTICAL_RED_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> RED_STONE_BRICK_EMBEDDED_LADDER = BLOCKS.register("red_stone_brick_embedded_ladder", () -> new CustomShapeBlock(ofFullCopy(RED_STONE_BRICKS.get()), MSBlockShapes.EMBEDDED_STAIRS)); //uses the tag CLIMBABLE
//    public static final DeferredBlock<Block> RED_STONE_BRICK_TRIM = BLOCKS.register("red_stone_brick_trim", () -> new BENTDirectionalBlock(ofFullCopy(RED_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> RED_STONE_BRICK_FROG = BLOCKS.register("red_stone_brick_frog", () -> new HieroglyphBlock(ofFullCopy(RED_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> RED_STONE_BRICK_IGUANA_LEFT = BLOCKS.register("red_stone_brick_iguana_left", () -> new HieroglyphBlock(ofFullCopy(RED_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> RED_STONE_BRICK_IGUANA_RIGHT = BLOCKS.register("red_stone_brick_iguana_right", () -> new HieroglyphBlock(ofFullCopy(RED_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> RED_STONE_BRICK_LOTUS = BLOCKS.register("red_stone_brick_lotus", () -> new HieroglyphBlock(ofFullCopy(RED_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> RED_STONE_BRICK_NAK_LEFT = BLOCKS.register("red_stone_brick_nak_left", () -> new HieroglyphBlock(ofFullCopy(RED_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> RED_STONE_BRICK_NAK_RIGHT = BLOCKS.register("red_stone_brick_nak_right", () -> new HieroglyphBlock(ofFullCopy(RED_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> RED_STONE_BRICK_SALAMANDER_LEFT = BLOCKS.register("red_stone_brick_salamander_left", () -> new HieroglyphBlock(ofFullCopy(RED_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> RED_STONE_BRICK_SALAMANDER_RIGHT = BLOCKS.register("red_stone_brick_salamander_right", () -> new HieroglyphBlock(ofFullCopy(RED_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> RED_STONE_BRICK_SKAIA = BLOCKS.register("red_stone_brick_skaia", () -> new HieroglyphBlock(ofFullCopy(RED_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> RED_STONE_BRICK_TURTLE = BLOCKS.register("red_stone_brick_turtle", () -> new HieroglyphBlock(ofFullCopy(RED_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> STEEP_RED_STONE_BRICK_STAIRS_BASE = BLOCKS.register("steep_red_stone_brick_stairs_base", () -> new CustomShapeBlock(ofFullCopy(RED_STONE.get()), MSBlockShapes.STEEP_STAIRS_BASE));
//    public static final DeferredBlock<Block> STEEP_RED_STONE_BRICK_STAIRS_TOP = BLOCKS.register("steep_red_stone_brick_stairs_top", () -> new CustomShapeBlock(ofFullCopy(RED_STONE.get()), MSBlockShapes.STEEP_STAIRS_TOP));
//    public static final DeferredItem<BlockItem> RED_STONE_ITEM = ITEMS.registerSimpleBlockItem("red_stone", RED_STONE);
//    public static final DeferredItem<BlockItem> RED_STONE_WALL_ITEM = ITEMS.registerSimpleBlockItem("red_stone_wall", RED_STONE_WALL);
//    public static final DeferredItem<BlockItem> RED_STONE_BUTTON_ITEM = ITEMS.registerSimpleBlockItem("red_stone_button", RED_STONE_BUTTON);
//    public static final DeferredItem<BlockItem> RED_STONE_PRESSURE_PLATE_ITEM = ITEMS.registerSimpleBlockItem("red_stone_pressure_plate", RED_STONE_PRESSURE_PLATE);
//    public static final DeferredItem<BlockItem> RED_STONE_BRICKS_ITEM = ITEMS.registerSimpleBlockItem("red_stone_bricks", RED_STONE_BRICKS);
//    public static final DeferredItem<BlockItem> RED_STONE_BRICK_WALL_ITEM = ITEMS.registerSimpleBlockItem("red_stone_brick_wall", RED_STONE_BRICK_WALL);
//    public static final DeferredItem<BlockItem> RED_STONE_COLUMN_ITEM = ITEMS.registerSimpleBlockItem("red_stone_column", RED_STONE_COLUMN);
//    public static final DeferredItem<BlockItem> POLISHED_RED_STONE_ITEM = ITEMS.registerSimpleBlockItem("polished_red_stone", POLISHED_RED_STONE);
//    public static final DeferredItem<BlockItem> POLISHED_RED_STONE_STAIRS_ITEM = ITEMS.registerSimpleBlockItem("polished_red_stone_stairs", POLISHED_RED_STONE_STAIRS);
//    public static final DeferredItem<BlockItem> POLISHED_RED_STONE_SLAB_ITEM = ITEMS.registerSimpleBlockItem("polished_red_stone_slab", POLISHED_RED_STONE_SLAB);
//    public static final DeferredItem<BlockItem> POLISHED_RED_STONE_WALL_ITEM = ITEMS.registerSimpleBlockItem("polished_red_stone_wall", POLISHED_RED_STONE_WALL);
//    public static final DeferredItem<BlockItem> CHISELED_RED_STONE_BRICKS_ITEM = ITEMS.registerSimpleBlockItem("chiseled_red_stone", CHISELED_RED_STONE_BRICKS);
//    public static final DeferredItem<BlockItem> HORIZONTAL_RED_STONE_BRICKS_ITEM = ITEMS.registerSimpleBlockItem("horizontal_red_stone", HORIZONTAL_RED_STONE_BRICKS);
//    public static final DeferredItem<BlockItem> HORIZONTAL_RED_STONE_BRICK_STAIRS_ITEM = ITEMS.registerSimpleBlockItem("horizontal_red_stone_stairs", HORIZONTAL_RED_STONE_BRICK_STAIRS);
//    public static final DeferredItem<BlockItem> HORIZONTAL_RED_STONE_BRICK_SLAB_ITEM = ITEMS.registerSimpleBlockItem("horizontal_red_stone_slab", HORIZONTAL_RED_STONE_BRICK_SLAB);
//    public static final DeferredItem<BlockItem> HORIZONTAL_RED_STONE_BRICK_WALL_ITEM = ITEMS.registerSimpleBlockItem("horizontal_red_stone_wall", HORIZONTAL_RED_STONE_BRICK_WALL);
//    public static final DeferredItem<BlockItem> VERTICAL_RED_STONE_BRICKS_ITEM = ITEMS.registerSimpleBlockItem("vertical_red_stone", VERTICAL_RED_STONE_BRICKS);
//    public static final DeferredItem<BlockItem> VERTICAL_RED_STONE_BRICK_STAIRS_ITEM = ITEMS.registerSimpleBlockItem("vertical_red_stone_stairs", VERTICAL_RED_STONE_BRICK_STAIRS);
//    public static final DeferredItem<BlockItem> VERTICAL_RED_STONE_BRICK_SLAB_ITEM = ITEMS.registerSimpleBlockItem("vertical_red_stone_slab", VERTICAL_RED_STONE_BRICK_SLAB);
//    public static final DeferredItem<BlockItem> VERTICAL_RED_STONE_BRICK_WALL_ITEM = ITEMS.registerSimpleBlockItem("vertical_red_stone_wall", VERTICAL_RED_STONE_BRICK_WALL);
//    public static final DeferredItem<BlockItem> RED_STONE_BRICK_EMBEDDED_LADDER_ITEM = ITEMS.registerSimpleBlockItem("red_stone_brick_embedded_ladder", RED_STONE_BRICK_EMBEDDED_LADDER);
//    public static final DeferredItem<BlockItem> RED_STONE_BRICK_TRIM_ITEM = ITEMS.registerSimpleBlockItem("red_stone_brick_trim", RED_STONE_BRICK_TRIM);
//    public static final DeferredItem<BlockItem> RED_STONE_BRICK_FROG_ITEM = ITEMS.registerSimpleBlockItem("red_stone_brick_frog", RED_STONE_BRICK_FROG);
//    public static final DeferredItem<BlockItem> RED_STONE_BRICK_IGUANA_LEFT_ITEM = ITEMS.registerSimpleBlockItem("red_stone_brick_iguana_left", RED_STONE_BRICK_IGUANA_LEFT);
//    public static final DeferredItem<BlockItem> RED_STONE_BRICK_IGUANA_RIGHT_ITEM = ITEMS.registerSimpleBlockItem("red_stone_brick_iguana_right", RED_STONE_BRICK_IGUANA_RIGHT);
//    public static final DeferredItem<BlockItem> RED_STONE_BRICK_LOTUS_ITEM = ITEMS.registerSimpleBlockItem("red_stone_brick_lotus", RED_STONE_BRICK_LOTUS);
//    public static final DeferredItem<BlockItem> RED_STONE_BRICK_NAK_LEFT_ITEM = ITEMS.registerSimpleBlockItem("red_stone_brick_nak_left", RED_STONE_BRICK_NAK_LEFT);
//    public static final DeferredItem<BlockItem> RED_STONE_BRICK_NAK_RIGHT_ITEM = ITEMS.registerSimpleBlockItem("red_stone_brick_nak_right", RED_STONE_BRICK_NAK_RIGHT);
//    public static final DeferredItem<BlockItem> RED_STONE_BRICK_SALAMANDER_LEFT_ITEM = ITEMS.registerSimpleBlockItem("red_stone_brick_salamander_left", RED_STONE_BRICK_SALAMANDER_LEFT);
//    public static final DeferredItem<BlockItem> RED_STONE_BRICK_SALAMANDER_RIGHT_ITEM = ITEMS.registerSimpleBlockItem("red_stone_brick_salamander_right", RED_STONE_BRICK_SALAMANDER_RIGHT);
//    public static final DeferredItem<BlockItem> RED_STONE_BRICK_SKAIA_ITEM = ITEMS.registerSimpleBlockItem("red_stone_brick_skaia_", RED_STONE_BRICK_SKAIA);
//    public static final DeferredItem<BlockItem> RED_STONE_BRICK_TURTLE_ITEM = ITEMS.registerSimpleBlockItem("red_stone_brick_turtle", RED_STONE_BRICK_TURTLE);
//    public static final DeferredBlock<Block> BLUE_STONE = BLOCKS.register("blue_stone", () -> new Block(Block.Properties.of().mapColor(MapColor.COLOR_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.5F, 7.0F)));
//    public static final DeferredBlock<StairBlock> BLUE_STONE_STAIRS = BLOCKS.register("blue_stone_stairs", () -> new StairBlock(BLUE_STONE.get().defaultBlockState(), ofFullCopy(BLUE_STONE.get())));
//    public static final DeferredBlock<SlabBlock> BLUE_STONE_SLAB = BLOCKS.register("blue_stone_slab", () -> new SlabBlock(ofFullCopy(BLUE_STONE.get())));
//    public static final DeferredBlock<WallBlock> BLUE_STONE_WALL = BLOCKS.register("blue_stone_wall", () -> new WallBlock(ofFullCopy(BLUE_STONE.get())));
//    public static final DeferredBlock<ButtonBlock> BLUE_STONE_BUTTON = BLOCKS.register("blue_stone_button", () -> new ButtonBlock(BENTBlockSetType.BLUE_STONE, 10, ofFullCopy(BLUE_STONE.get()).noCollission()));
//    public static final DeferredBlock<PressurePlateBlock> BLUE_STONE_PRESSURE_PLATE = BLOCKS.register("blue_stone_pressure_plate", () -> new PressurePlateBlock(BENTBlockSetType.BLUE_STONE, ofFullCopy(BLUE_STONE.get())));
//    public static final DeferredBlock<Block> POLISHED_BLUE_STONE = BLOCKS.register("polished_blue_stone", () -> new Block(ofFullCopy(BLUE_STONE.get())));
//    public static final DeferredBlock<StairBlock> POLISHED_BLUE_STONE_STAIRS = BLOCKS.register("polished_blue_stone_stairs", () -> new StairBlock(POLISHED_BLUE_STONE.get().defaultBlockState(), ofFullCopy(POLISHED_BLUE_STONE.get())));
//    public static final DeferredBlock<SlabBlock> POLISHED_BLUE_STONE_SLAB = BLOCKS.register("polished_blue_stone_slab", () -> new SlabBlock(ofFullCopy(POLISHED_BLUE_STONE.get())));
//    public static final DeferredBlock<WallBlock> POLISHED_BLUE_STONE_WALL = BLOCKS.register("polished_blue_stone_wall", () -> new WallBlock(ofFullCopy(POLISHED_BLUE_STONE.get())));
//    public static final DeferredBlock<Block> BLUE_STONE_BRICKS = BLOCKS.register("blue_stone_bricks", () -> new Block(ofFullCopy(BLUE_STONE.get())));
//    public static final DeferredBlock<StairBlock> BLUE_STONE_BRICK_STAIRS = BLOCKS.register("blue_stone_brick_stairs", () -> new StairBlock(BLUE_STONE_BRICKS.get().defaultBlockState(), ofFullCopy(BLUE_STONE_BRICKS.get())));
//    public static final DeferredBlock<SlabBlock> BLUE_STONE_BRICK_SLAB = BLOCKS.register("blue_stone_brick_slab", () -> new SlabBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
//    public static final DeferredBlock<WallBlock> BLUE_STONE_BRICK_WALL = BLOCKS.register("blue_stone_brick_wall", () -> new WallBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> BLUE_STONE_COLUMN = BLOCKS.register("blue_stone_column", () -> new BENTDirectionalBlock(ofFullCopy(BLUE_STONE.get())));
//    public static final DeferredBlock<Block> CHISELED_BLUE_STONE_BRICKS = BLOCKS.register("chiseled_blue_stone_bricks", () -> new Block(ofFullCopy(BLUE_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> HORIZONTAL_BLUE_STONE_BRICKS = BLOCKS.register("horizontal_blue_stone_bricks", () -> new Block(ofFullCopy(BLUE_STONE_BRICKS.get())));
//    public static final DeferredBlock<StairBlock> HORIZONTAL_BLUE_STONE_BRICK_STAIRS = BLOCKS.register("horizontal_blue_stone_brick_stairs", () -> new StairBlock(HORIZONTAL_BLUE_STONE_BRICKS.get().defaultBlockState(), ofFullCopy(HORIZONTAL_BLUE_STONE_BRICKS.get())));
//    public static final DeferredBlock<SlabBlock> HORIZONTAL_BLUE_STONE_BRICK_SLAB = BLOCKS.register("horizontal_blue_stone_brick_slab", () -> new SlabBlock(ofFullCopy(HORIZONTAL_BLUE_STONE_BRICKS.get())));
//    public static final DeferredBlock<WallBlock> HORIZONTAL_BLUE_STONE_BRICK_WALL = BLOCKS.register("horizontal_blue_stone_brick_wall", () -> new WallBlock(ofFullCopy(HORIZONTAL_BLUE_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> VERTICAL_BLUE_STONE_BRICKS = BLOCKS.register("vertical_blue_stone_bricks", () -> new Block(ofFullCopy(BLUE_STONE_BRICKS.get())));
//    public static final DeferredBlock<StairBlock> VERTICAL_BLUE_STONE_BRICK_STAIRS = BLOCKS.register("vertical_blue_stone_brick_stairs", () -> new StairBlock(VERTICAL_BLUE_STONE_BRICKS.get().defaultBlockState(), ofFullCopy(VERTICAL_BLUE_STONE_BRICKS.get())));
//    public static final DeferredBlock<SlabBlock> VERTICAL_BLUE_STONE_BRICK_SLAB = BLOCKS.register("vertical_blue_stone_brick_slab", () -> new SlabBlock(ofFullCopy(VERTICAL_BLUE_STONE_BRICKS.get())));
//    public static final DeferredBlock<WallBlock> VERTICAL_BLUE_STONE_BRICK_WALL = BLOCKS.register("vertical_blue_stone_brick_wall", () -> new WallBlock(ofFullCopy(VERTICAL_BLUE_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> BLUE_STONE_BRICK_EMBEDDED_LADDER = BLOCKS.register("blue_stone_brick_embedded_ladder", () -> new CustomShapeBlock(ofFullCopy(BLUE_STONE_BRICKS.get()), MSBlockShapes.EMBEDDED_STAIRS)); //uses the tag CLIMBABLE
//    public static final DeferredBlock<Block> BLUE_STONE_BRICK_TRIM = BLOCKS.register("blue_stone_brick_trim", () -> new BENTDirectionalBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> BLUE_STONE_BRICK_FROG = BLOCKS.register("blue_stone_brick_frog", () -> new HieroglyphBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> BLUE_STONE_BRICK_IGUANA_LEFT = BLOCKS.register("blue_stone_brick_iguana_left", () -> new HieroglyphBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> BLUE_STONE_BRICK_IGUANA_RIGHT = BLOCKS.register("blue_stone_brick_iguana_right", () -> new HieroglyphBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> BLUE_STONE_BRICK_LOTUS = BLOCKS.register("blue_stone_brick_lotus", () -> new HieroglyphBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> BLUE_STONE_BRICK_NAK_LEFT = BLOCKS.register("blue_stone_brick_nak_left", () -> new HieroglyphBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> BLUE_STONE_BRICK_NAK_RIGHT = BLOCKS.register("blue_stone_brick_nak_right", () -> new HieroglyphBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> BLUE_STONE_BRICK_SALAMANDER_LEFT = BLOCKS.register("blue_stone_brick_salamander_left", () -> new HieroglyphBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> BLUE_STONE_BRICK_SALAMANDER_RIGHT = BLOCKS.register("blue_stone_brick_salamander_right", () -> new HieroglyphBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> BLUE_STONE_BRICK_SKAIA = BLOCKS.register("blue_stone_brick_skaia", () -> new HieroglyphBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> BLUE_STONE_BRICK_TURTLE = BLOCKS.register("blue_stone_brick_turtle", () -> new HieroglyphBlock(ofFullCopy(BLUE_STONE_BRICKS.get())));
//    public static final DeferredBlock<Block> STEEP_BLUE_STONE_BRICK_STAIRS_BASE = BLOCKS.register("steep_blue_stone_brick_stairs_base", () -> new CustomShapeBlock(ofFullCopy(BLUE_STONE.get()), MSBlockShapes.STEEP_STAIRS_BASE));
//    public static final DeferredBlock<Block> STEEP_BLUE_STONE_BRICK_STAIRS_TOP = BLOCKS.register("steep_blue_stone_brick_stairs_top", () -> new CustomShapeBlock(ofFullCopy(BLUE_STONE.get()), MSBlockShapes.STEEP_STAIRS_TOP));
//    public static final DeferredItem<BlockItem> BLUE_STONE_ITEM = ITEMS.registerSimpleBlockItem("blue_stone", BLUE_STONE);
//    public static final DeferredItem<BlockItem> BLUE_STONE_WALL_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_wall", BLUE_STONE_WALL);
//    public static final DeferredItem<BlockItem> BLUE_STONE_BUTTON_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_button", BLUE_STONE_BUTTON);
//    public static final DeferredItem<BlockItem> BLUE_STONE_PRESSURE_PLATE_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_pressure_plate", BLUE_STONE_PRESSURE_PLATE);
//    public static final DeferredItem<BlockItem> BLUE_STONE_BRICKS_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_bricks", BLUE_STONE_BRICKS);
//    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_WALL_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_brick_wall", BLUE_STONE_BRICK_WALL);
//    public static final DeferredItem<BlockItem> BLUE_STONE_COLUMN_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_column", BLUE_STONE_COLUMN);
//    public static final DeferredItem<BlockItem> POLISHED_BLUE_STONE_ITEM = ITEMS.registerSimpleBlockItem("polished_blue_stone", POLISHED_BLUE_STONE);
//    public static final DeferredItem<BlockItem> POLISHED_BLUE_STONE_STAIRS_ITEM = ITEMS.registerSimpleBlockItem("polished_blue_stone_stairs", POLISHED_BLUE_STONE_STAIRS);
//    public static final DeferredItem<BlockItem> POLISHED_BLUE_STONE_SLAB_ITEM = ITEMS.registerSimpleBlockItem("polished_blue_stone_slab", POLISHED_BLUE_STONE_SLAB);
//    public static final DeferredItem<BlockItem> POLISHED_BLUE_STONE_WALL_ITEM = ITEMS.registerSimpleBlockItem("polished_blue_stone_wall", POLISHED_BLUE_STONE_WALL);
//    public static final DeferredItem<BlockItem> CHISELED_BLUE_STONE_BRICKS_ITEM = ITEMS.registerSimpleBlockItem("chiseled_blue_stone", CHISELED_BLUE_STONE_BRICKS);
//    public static final DeferredItem<BlockItem> HORIZONTAL_BLUE_STONE_BRICKS_ITEM = ITEMS.registerSimpleBlockItem("horizontal_blue_stone", HORIZONTAL_BLUE_STONE_BRICKS);
//    public static final DeferredItem<BlockItem> HORIZONTAL_BLUE_STONE_BRICK_STAIRS_ITEM = ITEMS.registerSimpleBlockItem("horizontal_blue_stone_stairs", HORIZONTAL_BLUE_STONE_BRICK_STAIRS);
//    public static final DeferredItem<BlockItem> HORIZONTAL_BLUE_STONE_BRICK_SLAB_ITEM = ITEMS.registerSimpleBlockItem("horizontal_blue_stone_slab", HORIZONTAL_BLUE_STONE_BRICK_SLAB);
//    public static final DeferredItem<BlockItem> HORIZONTAL_BLUE_STONE_BRICK_WALL_ITEM = ITEMS.registerSimpleBlockItem("horizontal_blue_stone_wall", HORIZONTAL_BLUE_STONE_BRICK_WALL);
//    public static final DeferredItem<BlockItem> VERTICAL_BLUE_STONE_BRICKS_ITEM = ITEMS.registerSimpleBlockItem("vertical_blue_stone", VERTICAL_BLUE_STONE_BRICKS);
//    public static final DeferredItem<BlockItem> VERTICAL_BLUE_STONE_BRICK_STAIRS_ITEM = ITEMS.registerSimpleBlockItem("vertical_blue_stone_stairs", VERTICAL_BLUE_STONE_BRICK_STAIRS);
//    public static final DeferredItem<BlockItem> VERTICAL_BLUE_STONE_BRICK_SLAB_ITEM = ITEMS.registerSimpleBlockItem("vertical_blue_stone_slab", VERTICAL_BLUE_STONE_BRICK_SLAB);
//    public static final DeferredItem<BlockItem> VERTICAL_BLUE_STONE_BRICK_WALL_ITEM = ITEMS.registerSimpleBlockItem("vertical_blue_stone_wall", VERTICAL_BLUE_STONE_BRICK_WALL);
//    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_EMBEDDED_LADDER_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_brick_embedded_ladder", BLUE_STONE_BRICK_EMBEDDED_LADDER);
//    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_TRIM_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_brick_trim", BLUE_STONE_BRICK_TRIM);
//    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_FROG_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_brick_frog", BLUE_STONE_BRICK_FROG);
//    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_IGUANA_LEFT_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_brick_iguana_left", BLUE_STONE_BRICK_IGUANA_LEFT);
//    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_IGUANA_RIGHT_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_brick_iguana_right", BLUE_STONE_BRICK_IGUANA_RIGHT);
//    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_LOTUS_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_brick_lotus", BLUE_STONE_BRICK_LOTUS);
//    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_NAK_LEFT_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_brick_nak_left", BLUE_STONE_BRICK_NAK_LEFT);
//    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_NAK_RIGHT_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_brick_nak_right", BLUE_STONE_BRICK_NAK_RIGHT);
//    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_SALAMANDER_LEFT_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_brick_salamander_left", BLUE_STONE_BRICK_SALAMANDER_LEFT);
//    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_SALAMANDER_RIGHT_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_brick_salamander_right", BLUE_STONE_BRICK_SALAMANDER_RIGHT);
//    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_SKAIA_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_brick_skaia_", BLUE_STONE_BRICK_SKAIA);
//    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_TURTLE_ITEM = ITEMS.registerSimpleBlockItem("blue_stone_brick_turtle", BLUE_STONE_BRICK_TURTLE);

    //
//    @SubscribeEvent
//    public static void modifyComponents(ModifyDefaultComponentsEvent event) {
//        event.modify(MSItems.UMBRELLA, builder ->
//                builder.set(ItemRightClickEffect.switchTo(MINEBENTItems.OPEN_UMBRELLA))
//        );
//    }
}