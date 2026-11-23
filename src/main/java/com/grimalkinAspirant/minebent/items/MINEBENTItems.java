package com.grimalkinAspirant.minebent.items;

import com.grimalkinAspirant.minebent.MINEBENT;
import com.grimalkinAspirant.minebent.datagen.BENTDragonArmorFly;
import com.grimalkinAspirant.minebent.datagen.BENTMagicRangedRightClickEffect;
import com.grimalkinAspirant.minebent.datagen.BENTRocketArmorFly;
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
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.grimalkinAspirant.minebent.MINEBENT.BLOCKS;
import static net.minecraft.world.level.block.state.BlockBehaviour.Properties.ofFullCopy;


public class MINEBENTItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MINEBENT.MODID);

    // Misc
    public static final DeferredItem<Item> TROLLLOGO_FAKEITEM = ITEMS.register("trolllogo_fakeitem",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> CHITIN = ITEMS.register("chitin",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MIRTHFUL_ESSENCE = ITEMS.register("mirthful_essence",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> MIRTHFUL_SCRIPTURES = ITEMS.register("mirthful_scriptures",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TROLL_HORN = ITEMS.register("troll_horn",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RUST_BLOOD = ITEMS.register("rust_blood",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_BLOOD = ITEMS.register("bronze_blood",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLD_BLOOD = ITEMS.register("gold_blood",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LIME_BLOOD = ITEMS.register("lime_blood",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OLIVE_BLOOD = ITEMS.register("olive_blood",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> JADE_BLOOD = ITEMS.register("jade_blood",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TEAL_BLOOD = ITEMS.register("teal_blood",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLUE_BLOOD = ITEMS.register("blue_blood",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INDIGO_BLOOD = ITEMS.register("indigo_blood",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PURPLE_BLOOD = ITEMS.register("purple_blood",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VIOLET_BLOOD = ITEMS.register("violet_blood",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FUCHSIA_BLOOD = ITEMS.register("fuchsia_blood",
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
    public static final DeferredItem<Item> WOODEN_CHAINSAW = ITEMS.register("wooden_chainsaw",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.WOOD, 2, -1.5F).efficiency(10.0F).set(MSItemTypes.CHAINSAW_TOOL).set(ItemRightClickEffect.switchTo(MINEBENTItems.SAWDUST_LIPSTICK)), new MSItemProperties().durability(250)));
    public static final DeferredItem<Item> SAWDUST_LIPSTICK = ITEMS.register("sawdust_lipstick",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.WOOD, -1, -0.5F).efficiency(10.0F).set(ItemRightClickEffect.switchTo(MINEBENTItems.WOODEN_CHAINSAW)), new MSItemProperties().durability(250)));
    public static final DeferredItem<Item> STONE_CHAINSAW = ITEMS.register("stone_chainsaw",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.STONE, 2, -1.5F).efficiency(10.0F).set(MSItemTypes.CHAINSAW_TOOL).set(ItemRightClickEffect.switchTo(MINEBENTItems.CHALKY_LIPSTICK)), new MSItemProperties().durability(250)));
    public static final DeferredItem<Item> CHALKY_LIPSTICK = ITEMS.register("chalky_lipstick",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.WOOD, -1, -0.5F).efficiency(10.0F).set(ItemRightClickEffect.switchTo(MINEBENTItems.STONE_CHAINSAW)), new MSItemProperties().durability(250)));
    public static final DeferredItem<Item> GOLD_CHAINSAW = ITEMS.register("gold_chainsaw",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.GOLD, 2, -1.5F).efficiency(10.0F).set(MSItemTypes.CHAINSAW_TOOL).set(ItemRightClickEffect.switchTo(MINEBENTItems.SIX_KARAT_LIPSTICK)), new MSItemProperties().durability(250)));
    public static final DeferredItem<Item> SIX_KARAT_LIPSTICK = ITEMS.register("six_karat_lipstick",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.WOOD, -1, -0.5F).efficiency(10.0F).set(ItemRightClickEffect.switchTo(MINEBENTItems.GOLD_CHAINSAW)), new MSItemProperties().durability(250)));
    public static final DeferredItem<Item> DIAMOND_CHAINSAW = ITEMS.register("diamond_chainsaw",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 2, -1.5F).efficiency(10.0F).set(MSItemTypes.CHAINSAW_TOOL).set(ItemRightClickEffect.switchTo(MINEBENTItems.ICED_LIPSTICK)), new MSItemProperties().durability(250)));
    public static final DeferredItem<Item> ICED_LIPSTICK = ITEMS.register("iced_lipstick",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.WOOD, -1, -0.5F).efficiency(10.0F).set(ItemRightClickEffect.switchTo(MINEBENTItems.DIAMOND_CHAINSAW)), new MSItemProperties().durability(250)));
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
    public static final DeferredItem<MSArmorItem> ROCKET_SHOES = ITEMS.register("rocket_shoes",
            () -> new BENTRocketArmorFly(MINEBENTMaterials.ROCKET_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(32))));
    public static final DeferredItem<MSArmorItem> ROCKET_PACK = ITEMS.register("rocket_pack",
            () -> new BENTRocketArmorFly(MINEBENTMaterials.ROCKET_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(32))));
    public static final DeferredItem<MSArmorItem> DRAGON_PACK = ITEMS.register("dragon_pack",
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
    public static final DeferredItem<ArmorItem> CONE_HORNS = ITEMS.register("cone_horns",
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
    public static final DeferredBlock<StairBlock> TROLLSTONE_STAIRS = BLOCKS.register("trollstone_stairs", () -> new StairBlock(MINEBENTItems.TROLLSTONE.get().defaultBlockState(), ofFullCopy(TROLLSTONE.get())));
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
    public static final DeferredBlock<StairBlock> TROLLSLATE_STAIRS = BLOCKS.register("trollslate_stairs", () -> new StairBlock(MINEBENTItems.TROLLSLATE.get().defaultBlockState(), ofFullCopy(TROLLSLATE.get())));
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

    //
//    @SubscribeEvent
//    public static void modifyComponents(ModifyDefaultComponentsEvent event) {
//        event.modify(MSItems.UMBRELLA, builder ->
//                builder.set(ItemRightClickEffect.switchTo(MINEBENTItems.OPEN_UMBRELLA))
//        );
//    }
}