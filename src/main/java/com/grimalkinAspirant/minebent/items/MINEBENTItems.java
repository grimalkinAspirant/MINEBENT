package com.grimalkinAspirant.minebent.items;

import com.grimalkinAspirant.minebent.MINEBENT;
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
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.mraof.minestuck.item.MSItems.registerBlockItem;

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
    public static final DeferredItem<Item> CANDY_BLOOD = ITEMS.register("candy_blood",
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
    public static final DeferredItem<MSArmorItem> SUNHAT = ITEMS.register("sunhat",
            () -> new MSArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(0))));
    public static final DeferredItem<ArmorItem> CONE_HORNS = ITEMS.register("cone_horns",
            () -> new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(0))));
    // Block Items
    public static final DeferredItem<BlockItem> CHERUB_PORTAL = registerBlockItem(MINEBENTBlocks.CHERUB_PORTAL);
    public static final DeferredItem<BlockItem> RUBY_BLOCK = registerBlockItem(MINEBENTBlocks.RUBY_BLOCK);
    public static final DeferredItem<BlockItem> FELTSTONE = registerBlockItem(MINEBENTBlocks.FELTSTONE);
    public static final DeferredItem<BlockItem> CARNIVAL_GROUND = registerBlockItem(MINEBENTBlocks.CARNIVAL_GROUND);
    public static final DeferredItem<BlockItem> TROLLSTONE = registerBlockItem(MINEBENTBlocks.TROLLSTONE);
    public static final DeferredItem<BlockItem> TROLLSTONE_STAIRS = registerBlockItem(MINEBENTBlocks.TROLLSTONE_STAIRS);
    public static final DeferredItem<BlockItem> TROLLSTONE_SLAB = registerBlockItem(MINEBENTBlocks.TROLLSTONE_SLAB);
    public static final DeferredItem<BlockItem> TROLLSTONE_BUTTON = registerBlockItem(MINEBENTBlocks.TROLLSTONE_BUTTON);
    public static final DeferredItem<BlockItem> TROLLSTONE_PRESSURE_PLATE = registerBlockItem(MINEBENTBlocks.TROLLSTONE_PRESSURE_PLATE);
    public static final DeferredItem<BlockItem> COBBLED_TROLLSTONE = registerBlockItem(MINEBENTBlocks.COBBLED_TROLLSTONE);
    public static final DeferredItem<BlockItem> COBBLED_TROLLSTONE_STAIRS = registerBlockItem(MINEBENTBlocks.COBBLED_TROLLSTONE_STAIRS);
    public static final DeferredItem<BlockItem> COBBLED_TROLLSTONE_SLAB = registerBlockItem(MINEBENTBlocks.COBBLED_TROLLSTONE_SLAB);
    public static final DeferredItem<BlockItem> COBBLED_TROLLSTONE_WALL = registerBlockItem(MINEBENTBlocks.COBBLED_TROLLSTONE_WALL);
    public static final DeferredItem<BlockItem> TROLLSTONE_BRICKS = registerBlockItem(MINEBENTBlocks.TROLLSTONE_BRICKS);
    public static final DeferredItem<BlockItem> TROLLSTONE_BRICK_STAIRS = registerBlockItem(MINEBENTBlocks.TROLLSTONE_BRICK_STAIRS);
    public static final DeferredItem<BlockItem> TROLLSTONE_BRICK_SLAB = registerBlockItem(MINEBENTBlocks.TROLLSTONE_BRICK_SLAB);
    public static final DeferredItem<BlockItem> TROLLSTONE_BRICK_WALL = registerBlockItem(MINEBENTBlocks.TROLLSTONE_BRICK_WALL);
    public static final DeferredItem<BlockItem> CRACKED_TROLLSTONE_BRICKS = registerBlockItem(MINEBENTBlocks.CRACKED_TROLLSTONE_BRICKS);
    public static final DeferredItem<BlockItem> CHISELED_TROLLSTONE_BRICKS = registerBlockItem(MINEBENTBlocks.CHISELED_TROLLSTONE_BRICKS);
    public static final DeferredItem<BlockItem> MOSSY_COBBLED_TROLLSTONE = registerBlockItem(MINEBENTBlocks.MOSSY_COBBLED_TROLLSTONE);
    public static final DeferredItem<BlockItem> MOSSY_TROLLSTONE_BRICKS = registerBlockItem(MINEBENTBlocks.MOSSY_TROLLSTONE_BRICKS);
    public static final DeferredItem<BlockItem> TROLLSLATE = registerBlockItem(MINEBENTBlocks.TROLLSLATE);
    public static final DeferredItem<BlockItem> TROLLSLATE_STAIRS = registerBlockItem(MINEBENTBlocks.TROLLSLATE_STAIRS);
    public static final DeferredItem<BlockItem> TROLLSLATE_SLAB = registerBlockItem(MINEBENTBlocks.TROLLSLATE_SLAB);
    public static final DeferredItem<BlockItem> TROLLSLATE_BUTTON = registerBlockItem(MINEBENTBlocks.TROLLSLATE_BUTTON);
    public static final DeferredItem<BlockItem> TROLLSLATE_PRESSURE_PLATE = registerBlockItem(MINEBENTBlocks.TROLLSLATE_PRESSURE_PLATE);
    public static final DeferredItem<BlockItem> POLISHED_TROLLSLATE = registerBlockItem(MINEBENTBlocks.POLISHED_TROLLSLATE);
    public static final DeferredItem<BlockItem> POLISHED_TROLLSLATE_STAIRS = registerBlockItem(MINEBENTBlocks.POLISHED_TROLLSLATE_STAIRS);
    public static final DeferredItem<BlockItem> POLISHED_TROLLSLATE_SLAB = registerBlockItem(MINEBENTBlocks.POLISHED_TROLLSLATE_SLAB);
    public static final DeferredItem<BlockItem> POLISHED_TROLLSLATE_WALL = registerBlockItem(MINEBENTBlocks.POLISHED_TROLLSLATE_WALL);
    public static final DeferredItem<BlockItem> COBBLED_TROLLSLATE = registerBlockItem(MINEBENTBlocks.COBBLED_TROLLSLATE);
    public static final DeferredItem<BlockItem> COBBLED_TROLLSLATE_STAIRS = registerBlockItem(MINEBENTBlocks.COBBLED_TROLLSLATE_STAIRS);
    public static final DeferredItem<BlockItem> COBBLED_TROLLSLATE_SLAB = registerBlockItem(MINEBENTBlocks.COBBLED_TROLLSLATE_SLAB);
    public static final DeferredItem<BlockItem> COBBLED_TROLLSLATE_WALL = registerBlockItem(MINEBENTBlocks.COBBLED_TROLLSLATE_WALL);
    public static final DeferredItem<BlockItem> TROLLSLATE_BRICKS = registerBlockItem(MINEBENTBlocks.TROLLSLATE_BRICKS);
    public static final DeferredItem<BlockItem> TROLLSLATE_BRICK_STAIRS = registerBlockItem(MINEBENTBlocks.TROLLSLATE_BRICK_STAIRS);
    public static final DeferredItem<BlockItem> TROLLSLATE_BRICK_SLAB = registerBlockItem(MINEBENTBlocks.TROLLSLATE_BRICK_SLAB);
    public static final DeferredItem<BlockItem> TROLLSLATE_BRICK_WALL = registerBlockItem(MINEBENTBlocks.TROLLSLATE_BRICK_WALL);
    public static final DeferredItem<BlockItem> TROLLSLATE_TILES = registerBlockItem(MINEBENTBlocks.TROLLSLATE_TILES);
    public static final DeferredItem<BlockItem> TROLLSLATE_TILE_STAIRS = registerBlockItem(MINEBENTBlocks.TROLLSLATE_TILE_STAIRS);
    public static final DeferredItem<BlockItem> TROLLSLATE_TILE_SLAB = registerBlockItem(MINEBENTBlocks.TROLLSLATE_TILE_SLAB);
    public static final DeferredItem<BlockItem> TROLLSLATE_TILE_WALL = registerBlockItem(MINEBENTBlocks.TROLLSLATE_TILE_WALL);
    public static final DeferredItem<BlockItem> CRACKED_TROLLSLATE_BRICKS = registerBlockItem(MINEBENTBlocks.CRACKED_TROLLSLATE_BRICKS);
    public static final DeferredItem<BlockItem> CRACKED_TROLLSLATE_TILES = registerBlockItem(MINEBENTBlocks.CRACKED_TROLLSLATE_TILES);
    public static final DeferredItem<BlockItem> CHISELED_TROLLSLATE = registerBlockItem(MINEBENTBlocks.CHISELED_TROLLSLATE);
    public static final DeferredItem<BlockItem> FLUSHDESITE = registerBlockItem(MINEBENTBlocks.FLUSHDESITE);
    public static final DeferredItem<BlockItem> FLUSHDESITE_STAIRS = registerBlockItem(MINEBENTBlocks.FLUSHDESITE_STAIRS);
    public static final DeferredItem<BlockItem> FLUSHDESITE_SLAB = registerBlockItem(MINEBENTBlocks.FLUSHDESITE_SLAB);
    public static final DeferredItem<BlockItem> FLUSHDESITE_WALL = registerBlockItem(MINEBENTBlocks.FLUSHDESITE_WALL);
    public static final DeferredItem<BlockItem> POLISHED_FLUSHDESITE = registerBlockItem(MINEBENTBlocks.POLISHED_FLUSHDESITE);
    public static final DeferredItem<BlockItem> POLISHED_FLUSHDESITE_STAIRS = registerBlockItem(MINEBENTBlocks.POLISHED_FLUSHDESITE_STAIRS);
    public static final DeferredItem<BlockItem> POLISHED_FLUSHDESITE_SLAB = registerBlockItem(MINEBENTBlocks.POLISHED_FLUSHDESITE_SLAB);
    public static final DeferredItem<BlockItem> PALEORITE = registerBlockItem(MINEBENTBlocks.PALEORITE);
    public static final DeferredItem<BlockItem> PALEORITE_STAIRS = registerBlockItem(MINEBENTBlocks.PALEORITE_STAIRS);
    public static final DeferredItem<BlockItem> PALEORITE_SLAB = registerBlockItem(MINEBENTBlocks.PALEORITE_SLAB);
    public static final DeferredItem<BlockItem> PALEORITE_WALL = registerBlockItem(MINEBENTBlocks.PALEORITE_WALL);
    public static final DeferredItem<BlockItem> POLISHED_PALEORITE = registerBlockItem(MINEBENTBlocks.POLISHED_PALEORITE);
    public static final DeferredItem<BlockItem> POLISHED_PALEORITE_STAIRS = registerBlockItem(MINEBENTBlocks.POLISHED_PALEORITE_STAIRS);
    public static final DeferredItem<BlockItem> POLISHED_PALEORITE_SLAB = registerBlockItem(MINEBENTBlocks.POLISHED_PALEORITE_SLAB);
    public static final DeferredItem<BlockItem> ASHENITE = registerBlockItem(MINEBENTBlocks.ASHENITE);
    public static final DeferredItem<BlockItem> ASHENITE_STAIRS = registerBlockItem(MINEBENTBlocks.ASHENITE_STAIRS);
    public static final DeferredItem<BlockItem> ASHENITE_SLAB = registerBlockItem(MINEBENTBlocks.ASHENITE_SLAB);
    public static final DeferredItem<BlockItem> ASHENITE_WALL = registerBlockItem(MINEBENTBlocks.ASHENITE_WALL);
    public static final DeferredItem<BlockItem> POLISHED_ASHENITE = registerBlockItem(MINEBENTBlocks.POLISHED_ASHENITE);
    public static final DeferredItem<BlockItem> POLISHED_ASHENITE_STAIRS = registerBlockItem(MINEBENTBlocks.POLISHED_ASHENITE_STAIRS);
    public static final DeferredItem<BlockItem> POLISHED_ASHENITE_SLAB = registerBlockItem(MINEBENTBlocks.POLISHED_ASHENITE_SLAB);
    public static final DeferredItem<BlockItem> BROODSTONE = registerBlockItem(MINEBENTBlocks.BROODSTONE);
    public static final DeferredItem<BlockItem> BROODSTONE_STAIRS = registerBlockItem(MINEBENTBlocks.BROODSTONE_STAIRS);
    public static final DeferredItem<BlockItem> BROODSTONE_SLAB = registerBlockItem(MINEBENTBlocks.BROODSTONE_SLAB);
    public static final DeferredItem<BlockItem> BROODSTONE_WALL = registerBlockItem(MINEBENTBlocks.BROODSTONE_WALL);
    public static final DeferredItem<BlockItem> BROODSTONE_BRICKS = registerBlockItem(MINEBENTBlocks.BROODSTONE_BRICKS);
    public static final DeferredItem<BlockItem> BROODSTONE_BRICK_STAIRS = registerBlockItem(MINEBENTBlocks.BROODSTONE_BRICK_STAIRS);
    public static final DeferredItem<BlockItem> BROODSTONE_BRICK_SLAB = registerBlockItem(MINEBENTBlocks.BROODSTONE_BRICK_SLAB);
    public static final DeferredItem<BlockItem> BROODSTONE_BRICK_WALL = registerBlockItem(MINEBENTBlocks.BROODSTONE_BRICK_WALL);
    public static final DeferredItem<BlockItem> TROLLSTONE_COAL_ORE = registerBlockItem(MINEBENTBlocks.TROLLSTONE_COAL_ORE);
    public static final DeferredItem<BlockItem> TROLLSTONE_COPPER_ORE = registerBlockItem(MINEBENTBlocks.TROLLSTONE_COPPER_ORE);
    public static final DeferredItem<BlockItem> TROLLSTONE_IRON_ORE = registerBlockItem(MINEBENTBlocks.TROLLSTONE_IRON_ORE);
    public static final DeferredItem<BlockItem> TROLLSTONE_REDSTONE_ORE = registerBlockItem(MINEBENTBlocks.TROLLSTONE_REDSTONE_ORE);
    public static final DeferredItem<BlockItem> TROLLSTONE_GOLD_ORE = registerBlockItem(MINEBENTBlocks.TROLLSTONE_GOLD_ORE);
    public static final DeferredItem<BlockItem> TROLLSTONE_LAPIS_ORE = registerBlockItem(MINEBENTBlocks.TROLLSTONE_LAPIS_ORE);
    public static final DeferredItem<BlockItem> TROLLSTONE_DIAMOND_ORE = registerBlockItem(MINEBENTBlocks.TROLLSTONE_DIAMOND_ORE);
    public static final DeferredItem<BlockItem> TROLLSTONE_QUARTZ_ORE = registerBlockItem(MINEBENTBlocks.TROLLSTONE_QUARTZ_ORE);
    public static final DeferredItem<BlockItem> TROLLSTONE_CRUXITE_ORE = registerBlockItem(MINEBENTBlocks.TROLLSTONE_CRUXITE_ORE);
    public static final DeferredItem<BlockItem> TROLLSTONE_URANIUM_ORE = registerBlockItem(MINEBENTBlocks.TROLLSTONE_URANIUM_ORE);
    public static final DeferredItem<BlockItem> TROLLSTONE_RUBY_ORE = registerBlockItem(MINEBENTBlocks.TROLLSTONE_RUBY_ORE);
    public static final DeferredItem<BlockItem> TROLLSLATE_COAL_ORE = registerBlockItem(MINEBENTBlocks.TROLLSLATE_COAL_ORE);
    public static final DeferredItem<BlockItem> TROLLSLATE_COPPER_ORE = registerBlockItem(MINEBENTBlocks.TROLLSLATE_COPPER_ORE);
    public static final DeferredItem<BlockItem> TROLLSLATE_IRON_ORE = registerBlockItem(MINEBENTBlocks.TROLLSLATE_IRON_ORE);
    public static final DeferredItem<BlockItem> TROLLSLATE_REDSTONE_ORE = registerBlockItem(MINEBENTBlocks.TROLLSLATE_REDSTONE_ORE);
    public static final DeferredItem<BlockItem> TROLLSLATE_GOLD_ORE = registerBlockItem(MINEBENTBlocks.TROLLSLATE_GOLD_ORE);
    public static final DeferredItem<BlockItem> TROLLSLATE_LAPIS_ORE = registerBlockItem(MINEBENTBlocks.TROLLSLATE_LAPIS_ORE);
    public static final DeferredItem<BlockItem> TROLLSLATE_DIAMOND_ORE = registerBlockItem(MINEBENTBlocks.TROLLSLATE_DIAMOND_ORE);
    public static final DeferredItem<BlockItem> TROLLSLATE_URANIUM_ORE = registerBlockItem(MINEBENTBlocks.TROLLSLATE_URANIUM_ORE);
    public static final DeferredItem<BlockItem> TROLLSLATE_RUBY_ORE = registerBlockItem(MINEBENTBlocks.TROLLSLATE_RUBY_ORE);
    public static final DeferredItem<BlockItem> RED_STONE = registerBlockItem(MINEBENTBlocks.RED_STONE);
    public static final DeferredItem<BlockItem> RED_STONE_STAIRS = registerBlockItem(MINEBENTBlocks.RED_STONE_STAIRS);
    public static final DeferredItem<BlockItem> RED_STONE_SLAB = registerBlockItem(MINEBENTBlocks.RED_STONE_SLAB);
    public static final DeferredItem<BlockItem> RED_STONE_WALL = registerBlockItem(MINEBENTBlocks.RED_STONE_WALL);
    public static final DeferredItem<BlockItem> RED_STONE_BUTTON = registerBlockItem(MINEBENTBlocks.RED_STONE_BUTTON);
    public static final DeferredItem<BlockItem> RED_STONE_PRESSURE_PLATE = registerBlockItem(MINEBENTBlocks.RED_STONE_PRESSURE_PLATE);
    public static final DeferredItem<BlockItem> POLISHED_RED_STONE = registerBlockItem(MINEBENTBlocks.POLISHED_RED_STONE);
    public static final DeferredItem<BlockItem> POLISHED_RED_STONE_STAIRS = registerBlockItem(MINEBENTBlocks.POLISHED_RED_STONE_STAIRS);
    public static final DeferredItem<BlockItem> POLISHED_RED_STONE_SLAB = registerBlockItem(MINEBENTBlocks.POLISHED_RED_STONE_SLAB);
    public static final DeferredItem<BlockItem> POLISHED_RED_STONE_WALL = registerBlockItem(MINEBENTBlocks.POLISHED_RED_STONE_WALL);
    public static final DeferredItem<BlockItem> RED_STONE_BRICKS = registerBlockItem(MINEBENTBlocks.RED_STONE_BRICKS);
    public static final DeferredItem<BlockItem> RED_STONE_BRICK_STAIRS = registerBlockItem(MINEBENTBlocks.RED_STONE_BRICK_STAIRS);
    public static final DeferredItem<BlockItem> RED_STONE_BRICK_SLAB = registerBlockItem(MINEBENTBlocks.RED_STONE_BRICK_SLAB);
    public static final DeferredItem<BlockItem> RED_STONE_BRICK_WALL = registerBlockItem(MINEBENTBlocks.RED_STONE_BRICK_WALL);
    //    public static final DeferredItem<BlockItem> RED_STONE_COLUMN = registerBlockItem(MINEBENTBlocks.RED_STONE_COLUMN);
    public static final DeferredItem<BlockItem> CHISELED_RED_STONE_BRICKS = registerBlockItem(MINEBENTBlocks.CHISELED_RED_STONE_BRICKS);
    public static final DeferredItem<BlockItem> HORIZONTAL_RED_STONE_BRICKS = registerBlockItem(MINEBENTBlocks.HORIZONTAL_RED_STONE_BRICKS);
    public static final DeferredItem<BlockItem> HORIZONTAL_RED_STONE_BRICK_STAIRS = registerBlockItem(MINEBENTBlocks.HORIZONTAL_RED_STONE_BRICK_STAIRS);
    public static final DeferredItem<BlockItem> HORIZONTAL_RED_STONE_BRICK_SLAB = registerBlockItem(MINEBENTBlocks.HORIZONTAL_RED_STONE_BRICK_SLAB);
    public static final DeferredItem<BlockItem> HORIZONTAL_RED_STONE_BRICK_WALL = registerBlockItem(MINEBENTBlocks.HORIZONTAL_RED_STONE_BRICK_WALL);
    public static final DeferredItem<BlockItem> VERTICAL_RED_STONE_BRICKS = registerBlockItem(MINEBENTBlocks.VERTICAL_RED_STONE_BRICKS);
    public static final DeferredItem<BlockItem> VERTICAL_RED_STONE_BRICK_STAIRS = registerBlockItem(MINEBENTBlocks.VERTICAL_RED_STONE_BRICK_STAIRS);
    public static final DeferredItem<BlockItem> VERTICAL_RED_STONE_BRICK_SLAB = registerBlockItem(MINEBENTBlocks.VERTICAL_RED_STONE_BRICK_SLAB);
    public static final DeferredItem<BlockItem> VERTICAL_RED_STONE_BRICK_WALL = registerBlockItem(MINEBENTBlocks.VERTICAL_RED_STONE_BRICK_WALL);
    public static final DeferredItem<BlockItem> RED_STONE_BRICK_EMBEDDED_LADDER = registerBlockItem(MINEBENTBlocks.RED_STONE_BRICK_EMBEDDED_LADDER);
    //    public static final DeferredItem<BlockItem> RED_STONE_BRICK_TRIM = registerBlockItem(MINEBENTBlocks.RED_STONE_BRICK_TRIM);
    public static final DeferredItem<BlockItem> RED_STONE_BRICK_FROG = registerBlockItem(MINEBENTBlocks.RED_STONE_BRICK_FROG);
    public static final DeferredItem<BlockItem> RED_STONE_BRICK_IGUANA_LEFT = registerBlockItem(MINEBENTBlocks.RED_STONE_BRICK_IGUANA_LEFT);
    public static final DeferredItem<BlockItem> RED_STONE_BRICK_IGUANA_RIGHT = registerBlockItem(MINEBENTBlocks.RED_STONE_BRICK_IGUANA_RIGHT);
    public static final DeferredItem<BlockItem> RED_STONE_BRICK_LOTUS = registerBlockItem(MINEBENTBlocks.RED_STONE_BRICK_LOTUS);
    public static final DeferredItem<BlockItem> RED_STONE_BRICK_NAK_LEFT = registerBlockItem(MINEBENTBlocks.RED_STONE_BRICK_NAK_LEFT);
    public static final DeferredItem<BlockItem> RED_STONE_BRICK_NAK_RIGHT = registerBlockItem(MINEBENTBlocks.RED_STONE_BRICK_NAK_RIGHT);
    public static final DeferredItem<BlockItem> RED_STONE_BRICK_SALAMANDER_LEFT = registerBlockItem(MINEBENTBlocks.RED_STONE_BRICK_SALAMANDER_LEFT);
    public static final DeferredItem<BlockItem> RED_STONE_BRICK_SALAMANDER_RIGHT = registerBlockItem(MINEBENTBlocks.RED_STONE_BRICK_SALAMANDER_RIGHT);
    public static final DeferredItem<BlockItem> RED_STONE_BRICK_SKAIA = registerBlockItem(MINEBENTBlocks.RED_STONE_BRICK_SKAIA);
    public static final DeferredItem<BlockItem> RED_STONE_BRICK_TURTLE = registerBlockItem(MINEBENTBlocks.RED_STONE_BRICK_TURTLE);
    public static final DeferredItem<BlockItem> STEEP_RED_STONE_BRICK_STAIRS_BASE = registerBlockItem(MINEBENTBlocks.STEEP_RED_STONE_BRICK_STAIRS_BASE);
    public static final DeferredItem<BlockItem> STEEP_RED_STONE_BRICK_STAIRS_TOP = registerBlockItem(MINEBENTBlocks.STEEP_RED_STONE_BRICK_STAIRS_TOP);
    public static final DeferredItem<BlockItem> BLUE_STONE = registerBlockItem(MINEBENTBlocks.BLUE_STONE);
    public static final DeferredItem<BlockItem> BLUE_STONE_STAIRS = registerBlockItem(MINEBENTBlocks.BLUE_STONE_STAIRS);
    public static final DeferredItem<BlockItem> BLUE_STONE_SLAB = registerBlockItem(MINEBENTBlocks.BLUE_STONE_SLAB);
    public static final DeferredItem<BlockItem> BLUE_STONE_WALL = registerBlockItem(MINEBENTBlocks.BLUE_STONE_WALL);
    public static final DeferredItem<BlockItem> BLUE_STONE_BUTTON = registerBlockItem(MINEBENTBlocks.BLUE_STONE_BUTTON);
    public static final DeferredItem<BlockItem> BLUE_STONE_PRESSURE_PLATE = registerBlockItem(MINEBENTBlocks.BLUE_STONE_PRESSURE_PLATE);
    public static final DeferredItem<BlockItem> POLISHED_BLUE_STONE = registerBlockItem(MINEBENTBlocks.POLISHED_BLUE_STONE);
    public static final DeferredItem<BlockItem> POLISHED_BLUE_STONE_STAIRS = registerBlockItem(MINEBENTBlocks.POLISHED_BLUE_STONE_STAIRS);
    public static final DeferredItem<BlockItem> POLISHED_BLUE_STONE_SLAB = registerBlockItem(MINEBENTBlocks.POLISHED_BLUE_STONE_SLAB);
    public static final DeferredItem<BlockItem> POLISHED_BLUE_STONE_WALL = registerBlockItem(MINEBENTBlocks.POLISHED_BLUE_STONE_WALL);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICKS = registerBlockItem(MINEBENTBlocks.BLUE_STONE_BRICKS);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_STAIRS = registerBlockItem(MINEBENTBlocks.BLUE_STONE_BRICK_STAIRS);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_SLAB = registerBlockItem(MINEBENTBlocks.BLUE_STONE_BRICK_SLAB);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_WALL = registerBlockItem(MINEBENTBlocks.BLUE_STONE_BRICK_WALL);
    //    public static final DeferredItem<BlockItem> BLUE_STONE_COLUMN = registerBlockItem(MINEBENTBlocks.BLUE_STONE_COLUMN);
    public static final DeferredItem<BlockItem> CHISELED_BLUE_STONE_BRICKS = registerBlockItem(MINEBENTBlocks.CHISELED_BLUE_STONE_BRICKS);
    public static final DeferredItem<BlockItem> HORIZONTAL_BLUE_STONE_BRICKS = registerBlockItem(MINEBENTBlocks.HORIZONTAL_BLUE_STONE_BRICKS);
    public static final DeferredItem<BlockItem> HORIZONTAL_BLUE_STONE_BRICK_STAIRS = registerBlockItem(MINEBENTBlocks.HORIZONTAL_BLUE_STONE_BRICK_STAIRS);
    public static final DeferredItem<BlockItem> HORIZONTAL_BLUE_STONE_BRICK_SLAB = registerBlockItem(MINEBENTBlocks.HORIZONTAL_BLUE_STONE_BRICK_SLAB);
    public static final DeferredItem<BlockItem> HORIZONTAL_BLUE_STONE_BRICK_WALL = registerBlockItem(MINEBENTBlocks.HORIZONTAL_BLUE_STONE_BRICK_WALL);
    public static final DeferredItem<BlockItem> VERTICAL_BLUE_STONE_BRICKS = registerBlockItem(MINEBENTBlocks.VERTICAL_BLUE_STONE_BRICKS);
    public static final DeferredItem<BlockItem> VERTICAL_BLUE_STONE_BRICK_STAIRS = registerBlockItem(MINEBENTBlocks.VERTICAL_BLUE_STONE_BRICK_STAIRS);
    public static final DeferredItem<BlockItem> VERTICAL_BLUE_STONE_BRICK_SLAB = registerBlockItem(MINEBENTBlocks.VERTICAL_BLUE_STONE_BRICK_SLAB);
    public static final DeferredItem<BlockItem> VERTICAL_BLUE_STONE_BRICK_WALL = registerBlockItem(MINEBENTBlocks.VERTICAL_BLUE_STONE_BRICK_WALL);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_EMBEDDED_LADDER = registerBlockItem(MINEBENTBlocks.BLUE_STONE_BRICK_EMBEDDED_LADDER);
    //    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_TRIM = registerBlockItem(MINEBENTBlocks.BLUE_STONE_BRICK_TRIM);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_FROG = registerBlockItem(MINEBENTBlocks.BLUE_STONE_BRICK_FROG);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_IGUANA_LEFT = registerBlockItem(MINEBENTBlocks.BLUE_STONE_BRICK_IGUANA_LEFT);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_IGUANA_RIGHT = registerBlockItem(MINEBENTBlocks.BLUE_STONE_BRICK_IGUANA_RIGHT);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_LOTUS = registerBlockItem(MINEBENTBlocks.BLUE_STONE_BRICK_LOTUS);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_NAK_LEFT = registerBlockItem(MINEBENTBlocks.BLUE_STONE_BRICK_NAK_LEFT);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_NAK_RIGHT = registerBlockItem(MINEBENTBlocks.BLUE_STONE_BRICK_NAK_RIGHT);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_SALAMANDER_LEFT = registerBlockItem(MINEBENTBlocks.BLUE_STONE_BRICK_SALAMANDER_LEFT);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_SALAMANDER_RIGHT = registerBlockItem(MINEBENTBlocks.BLUE_STONE_BRICK_SALAMANDER_RIGHT);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_SKAIA = registerBlockItem(MINEBENTBlocks.BLUE_STONE_BRICK_SKAIA);
    public static final DeferredItem<BlockItem> BLUE_STONE_BRICK_TURTLE = registerBlockItem(MINEBENTBlocks.BLUE_STONE_BRICK_TURTLE);
    public static final DeferredItem<BlockItem> STEEP_BLUE_STONE_BRICK_STAIRS_BASE = registerBlockItem(MINEBENTBlocks.STEEP_BLUE_STONE_BRICK_STAIRS_BASE);
    public static final DeferredItem<BlockItem> STEEP_BLUE_STONE_BRICK_STAIRS_TOP = registerBlockItem(MINEBENTBlocks.STEEP_BLUE_STONE_BRICK_STAIRS_TOP);
}