package com.grimalkinAspirant.minebent.data;

import com.grimalkinAspirant.minebent.MINEBENT;
import com.grimalkinAspirant.minebent.items.MINEBENTBlocks;
import com.grimalkinAspirant.minebent.items.MINEBENTItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.Objects;
import java.util.function.Supplier;

public class BENTItemModelProvider extends ItemModelProvider{

    public BENTItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MINEBENT.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(MINEBENTItems.TROLLLOGO_FAKEITEM.get());

        //Weapons & Tools
        handheldItem(MINEBENTItems.EMPIRICISTS_WAND.get());
        handheldItem(MINEBENTItems.OPEN_UMBRELLA.get());
        handheldItem(MINEBENTItems.CHERUB_KEY.get());
        handheldItem(MINEBENTItems.MIRTHFUL_SWORD.get());
        largeLongWeapon(MINEBENTItems.STONE_LANCE);
        largeLongWeapon(MINEBENTItems.GOLD_LANCE);
        largeLongWeapon(MINEBENTItems.DIAMOND_LANCE);
        largeLongWeapon(MINEBENTItems.MIRTHFUL_LANCE);
        handheldItem(MINEBENTItems.WOODEN_SICKLE.get());
        handheldItem(MINEBENTItems.STONE_SICKLE.get());
        handheldItem(MINEBENTItems.GOLD_SICKLE.get());
        handheldItem(MINEBENTItems.DIAMOND_SICKLE.get());
        handheldItem(MINEBENTItems.MIRTHFUL_SICKLE.get());
        clawWeapon(MINEBENTItems.WOODEN_CLAWS_DRAWN);
        clawWeapon(MINEBENTItems.WOODEN_CLAWS_SHEATHED);
        clawWeapon(MINEBENTItems.GOLD_CLAWS_DRAWN);
        clawWeapon(MINEBENTItems.GOLD_CLAWS_SHEATHED);
        clawWeapon(MINEBENTItems.COPPER_CLAWS_DRAWN);
        clawWeapon(MINEBENTItems.COPPER_CLAWS_SHEATHED);
        clawWeapon(MINEBENTItems.MIRTHFUL_CLAWS_DRAWN);
        clawWeapon(MINEBENTItems.MIRTHFUL_CLAWS_SHEATHED);
        handheldItem(MINEBENTItems.SAWDUST_LIPSTICK.get());
        handheldItem(MINEBENTItems.WOODEN_CHAINSAW.get());
        handheldItem(MINEBENTItems.CHALKY_LIPSTICK.get());
        handheldItem(MINEBENTItems.STONE_CHAINSAW.get());
        handheldItem(MINEBENTItems.SIX_KARAT_LIPSTICK.get());
        handheldItem(MINEBENTItems.GOLD_CHAINSAW.get());
        handheldItem(MINEBENTItems.ICED_LIPSTICK.get());
        handheldItem(MINEBENTItems.DIAMOND_CHAINSAW.get());
        handheldItem(MINEBENTItems.STONE_CANE.get());
        handheldItem(MINEBENTItems.GOLD_CANE.get());
        handheldItem(MINEBENTItems.DIAMOND_CANE.get());
        handheldItem(MINEBENTItems.MIRTHFUL_CANE.get());
        handheldItem(MINEBENTItems.WOODEN_CLUB.get());
        handheldItem(MINEBENTItems.STONE_CLUB.get());
        handheldItem(MINEBENTItems.GOLD_CLUB.get());
        handheldItem(MINEBENTItems.DIAMOND_CLUB.get());
        handheldItem(MINEBENTItems.MIRTHFUL_CLUB.get());
        handheldItem(MINEBENTItems.MIRTHFUL_PICKAXE.get());
        handheldItem(MINEBENTItems.MIRTHFUL_SHOVEL.get());
        handheldItem(MINEBENTItems.MIRTHFUL_AXE.get());
        handheldItem(MINEBENTItems.MIRTHFUL_HOE.get());

        //Armor
        basicItem(MINEBENTItems.ROCKET_SHOES.get());
        basicItem(MINEBENTItems.ROCKET_PACK.get());
        basicItem(MINEBENTItems.DRAGON_PACK.get());
        basicItem(MINEBENTItems.CHITIN_HELMET.get());
        basicItem(MINEBENTItems.CHITIN_CHESTPLATE.get());
        basicItem(MINEBENTItems.CHITIN_LEGGINGS.get());
        basicItem(MINEBENTItems.CHITIN_BOOTS.get());
        basicItem(MINEBENTItems.MIRTHFUL_MASQUE.get());
        basicItem(MINEBENTItems.MIRTHFUL_CHESTPLATE.get());
        basicItem(MINEBENTItems.MIRTHFUL_LEGGINGS.get());
        basicItem(MINEBENTItems.MIRTHFUL_BOOTS.get());
        basicItem(MINEBENTItems.SUNHAT.get());
        basicItem(MINEBENTItems.CONE_HORNS.get());

        //Food
        basicItem(MINEBENTItems.SMALL_GRUB.get());
        basicItem(MINEBENTItems.COOKED_SMALL_GRUB.get());
        basicItem(MINEBENTItems.BIG_GRUB.get());
        basicItem(MINEBENTItems.COOKED_BIG_GRUB.get());
        basicItem(MINEBENTItems.BUG_MEAT.get());
        basicItem(MINEBENTItems.COOKED_BUG_MEAT.get());

        //Other
        basicItem(MINEBENTItems.TROLL_HORN.get());
        basicItem(MINEBENTItems.RUBY.get());
        basicItem(MINEBENTItems.CHITIN.get());
        basicItem(MINEBENTItems.MIRTHFUL_ESSENCE.get());
        basicItem(MINEBENTItems.MIRTHFUL_SCRIPTURES.get());
        basicItem(MINEBENTItems.CANDY_BLOOD.get());
        basicItem(MINEBENTItems.RUST_BLOOD.get());
        basicItem(MINEBENTItems.BRONZE_BLOOD.get());
        basicItem(MINEBENTItems.GOLD_BLOOD.get());
        basicItem(MINEBENTItems.LIME_BLOOD.get());
        basicItem(MINEBENTItems.OLIVE_BLOOD.get());
        basicItem(MINEBENTItems.JADE_BLOOD.get());
        basicItem(MINEBENTItems.TEAL_BLOOD.get());
        basicItem(MINEBENTItems.BLUE_BLOOD.get());
        basicItem(MINEBENTItems.INDIGO_BLOOD.get());
        basicItem(MINEBENTItems.PURPLE_BLOOD.get());
        basicItem(MINEBENTItems.VIOLET_BLOOD.get());
        basicItem(MINEBENTItems.FUCHSIA_BLOOD.get());

        //Blocks
        simpleBlockItem(MINEBENTBlocks.RUBY_BLOCK.get());
        simpleBlockItem(MINEBENTBlocks.FELTSTONE.get());
        simpleBlockItem(MINEBENTBlocks.CARNIVAL_GROUND.get());
        simpleBlockItem(MINEBENTBlocks.COBBLED_TROLLSTONE.get());
        simpleBlockItem(MINEBENTBlocks.TROLLSTONE.get());
        simpleBlockItem(MINEBENTBlocks.TROLLSTONE_BRICKS.get());
        simpleBlockItem(MINEBENTBlocks.CRACKED_TROLLSTONE_BRICKS.get());
        simpleBlockItem(MINEBENTBlocks.CHISELED_TROLLSTONE_BRICKS.get());
        simpleBlockItem(MINEBENTBlocks.MOSSY_COBBLED_TROLLSTONE.get());
        simpleBlockItem(MINEBENTBlocks.MOSSY_TROLLSTONE_BRICKS.get());
        simpleBlockItem(MINEBENTBlocks.TROLLSLATE.get());
        simpleBlockItem(MINEBENTBlocks.POLISHED_TROLLSLATE.get());
        simpleBlockItem(MINEBENTBlocks.COBBLED_TROLLSLATE.get());
        simpleBlockItem(MINEBENTBlocks.TROLLSLATE_BRICKS.get());
        simpleBlockItem(MINEBENTBlocks.TROLLSLATE_TILES.get());
        simpleBlockItem(MINEBENTBlocks.CRACKED_TROLLSLATE_BRICKS.get());
        simpleBlockItem(MINEBENTBlocks.CRACKED_TROLLSLATE_TILES.get());
        simpleBlockItem(MINEBENTBlocks.CHISELED_TROLLSLATE.get());
        simpleBlockItem(MINEBENTBlocks.FLUSHDESITE.get());
        simpleBlockItem(MINEBENTBlocks.POLISHED_FLUSHDESITE.get());
        simpleBlockItem(MINEBENTBlocks.PALEORITE.get());
        simpleBlockItem(MINEBENTBlocks.POLISHED_PALEORITE.get());
        simpleBlockItem(MINEBENTBlocks.ASHENITE.get());
        simpleBlockItem(MINEBENTBlocks.POLISHED_ASHENITE.get());
        simpleBlockItem(MINEBENTBlocks.BROODSTONE.get());
        simpleBlockItem(MINEBENTBlocks.BROODSTONE_BRICKS.get());
        simpleBlockItem(MINEBENTBlocks.TROLLSTONE_COAL_ORE.get());
        simpleBlockItem(MINEBENTBlocks.TROLLSTONE_COPPER_ORE.get());
        simpleBlockItem(MINEBENTBlocks.TROLLSTONE_IRON_ORE.get());
        simpleBlockItem(MINEBENTBlocks.TROLLSTONE_REDSTONE_ORE.get());
        simpleBlockItem(MINEBENTBlocks.TROLLSTONE_GOLD_ORE.get());
        simpleBlockItem(MINEBENTBlocks.TROLLSTONE_LAPIS_ORE.get());
        simpleBlockItem(MINEBENTBlocks.TROLLSTONE_DIAMOND_ORE.get());
        simpleBlockItem(MINEBENTBlocks.TROLLSTONE_QUARTZ_ORE.get());
        simpleBlockItem(MINEBENTBlocks.TROLLSTONE_CRUXITE_ORE.get());
        simpleBlockItem(MINEBENTBlocks.TROLLSTONE_URANIUM_ORE.get());
        simpleBlockItem(MINEBENTBlocks.TROLLSTONE_RUBY_ORE.get());
        simpleBlockItem(MINEBENTBlocks.TROLLSLATE_COAL_ORE.get());
        simpleBlockItem(MINEBENTBlocks.TROLLSLATE_COPPER_ORE.get());
        simpleBlockItem(MINEBENTBlocks.TROLLSLATE_IRON_ORE.get());
        simpleBlockItem(MINEBENTBlocks.TROLLSLATE_REDSTONE_ORE.get());
        simpleBlockItem(MINEBENTBlocks.TROLLSLATE_GOLD_ORE.get());
        simpleBlockItem(MINEBENTBlocks.TROLLSLATE_LAPIS_ORE.get());
        simpleBlockItem(MINEBENTBlocks.TROLLSLATE_DIAMOND_ORE.get());
        simpleBlockItem(MINEBENTBlocks.TROLLSLATE_URANIUM_ORE.get());
        simpleBlockItem(MINEBENTBlocks.TROLLSLATE_RUBY_ORE.get());
        simpleBlockItem(MINEBENTBlocks.RED_STONE.get());
        simpleBlockItem(MINEBENTBlocks.RED_STONE_COLUMN.get());
        simpleBlockItem(MINEBENTBlocks.RED_STONE_BRICK_TRIM.get());
        simpleBlockItem(MINEBENTBlocks.POLISHED_RED_STONE.get());
        simpleBlockItem(MINEBENTBlocks.RED_STONE_BRICKS.get());
        simpleBlockItem(MINEBENTBlocks.CHISELED_RED_STONE_BRICKS.get());
        simpleBlockItem(MINEBENTBlocks.HORIZONTAL_RED_STONE_BRICKS.get());
        simpleBlockItem(MINEBENTBlocks.VERTICAL_RED_STONE_BRICKS.get());
        simpleBlockItem(MINEBENTBlocks.RED_STONE_BRICK_FROG.get());
        simpleBlockItem(MINEBENTBlocks.RED_STONE_BRICK_LOTUS.get());
        simpleBlockItem(MINEBENTBlocks.RED_STONE_BRICK_NAK_LEFT.get());
        simpleBlockItem(MINEBENTBlocks.RED_STONE_BRICK_NAK_RIGHT.get());
        simpleBlockItem(MINEBENTBlocks.RED_STONE_BRICK_SKAIA.get());
        simpleBlockItem(MINEBENTBlocks.RED_STONE_COLUMN.get());
        simpleBlockItem(MINEBENTBlocks.BLUE_STONE.get());
        simpleBlockItem(MINEBENTBlocks.POLISHED_BLUE_STONE.get());
        simpleBlockItem(MINEBENTBlocks.BLUE_STONE_BRICKS.get());
        simpleBlockItem(MINEBENTBlocks.CHISELED_BLUE_STONE_BRICKS.get());
        simpleBlockItem(MINEBENTBlocks.HORIZONTAL_BLUE_STONE_BRICKS.get());
        simpleBlockItem(MINEBENTBlocks.VERTICAL_BLUE_STONE_BRICKS.get());
        simpleBlockItem(MINEBENTBlocks.BLUE_STONE_BRICK_IGUANA_LEFT.get());
        simpleBlockItem(MINEBENTBlocks.BLUE_STONE_BRICK_IGUANA_RIGHT.get());
        simpleBlockItem(MINEBENTBlocks.BLUE_STONE_BRICK_TURTLE.get());
        simpleBlockItem(MINEBENTBlocks.BLUE_STONE_BRICK_SALAMANDER_LEFT.get());
        simpleBlockItem(MINEBENTBlocks.BLUE_STONE_BRICK_SALAMANDER_RIGHT.get());
        simpleBlockItem(MINEBENTBlocks.BLUE_STONE_COLUMN.get());
        simpleBlockItem(MINEBENTBlocks.BLUE_STONE_BRICK_TRIM.get());
    }

    /**
     * Generates a model that in third person places the weapon flat on top of the hand.
     */
    private ItemModelBuilder clawWeapon(Supplier<? extends Item> item)
    {
        String name = id(item).getPath();
        return withExistingParent(name,
                id("item/claw_weapon"))
                .texture("layer0", texture(name));
    }

    /**
     * Generated a model that is larger than other weapons when in hand.
     * This variant moves the weapon forward a little bit, suitable for weapons with a short handle or otherwise should be held closer to the bottom left corner.
     */
    private ItemModelBuilder largeLongWeapon(Supplier<? extends Item> item)
    {
        String name = id(item).getPath();
        return withExistingParent(name,
                id("item/large_long_weapon"))
                .texture("layer0", texture(name));
    }

    private static ResourceLocation texture(String path)
    {
        return id(ModelProvider.ITEM_FOLDER + "/" + path);
    }

    private static ResourceLocation id(String path)
    {
        return ResourceLocation.fromNamespaceAndPath(MINEBENT.MODID, path);
    }

    private static ResourceLocation id(Supplier<? extends Item> item)
    {
        return BuiltInRegistries.ITEM.getKey(item.get());
    }
}
