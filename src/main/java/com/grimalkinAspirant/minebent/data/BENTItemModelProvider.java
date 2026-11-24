package com.grimalkinAspirant.minebent.data;

import com.grimalkinAspirant.minebent.MINEBENT;
import com.grimalkinAspirant.minebent.items.MINEBENTItems;
import com.mraof.minestuck.Minestuck;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

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

        //Blocks

        //You Get The Point
    }

    ItemModelBuilder simpleItem(Supplier<? extends Item> item)
    {
        return simpleItem(item, id(item).getPath());
    }

    private ItemModelBuilder simpleItem(Supplier<? extends Item> item, String textureName)
    {
        return withExistingParent(id(item).getPath(),
                ResourceLocation.withDefaultNamespace("item/generated"))
                .texture("layer0", texture(textureName));
    }

    private ItemModelBuilder handheldItem(Supplier<? extends Item> item)
    {
        return handheldItem(item, id(item).getPath());
    }

    private ItemModelBuilder handheldItem(Supplier<? extends Item> item, String textureName)
    {
        return withExistingParent(id(item).getPath(),
                ResourceLocation.withDefaultNamespace("item/handheld"))
                .texture("layer0", texture(textureName));
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
     * Generates a model positioned for weapons with the handle in the top right corner of the texture.
     */
    private ItemModelBuilder knifeWeapon(Supplier<? extends Item> item)
    {
        String name = id(item).getPath();
        return withExistingParent(name,
                id("item/knife_weapon"))
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

    /**
     * Generated a model that is larger than other weapons when in hand.
     */
    private ItemModelBuilder largeWeapon(Supplier<? extends Item> item)
    {
        String name = id(item).getPath();
        return withExistingParent(name,
                id("item/large_weapon"))
                .texture("layer0", texture(name));
    }
    private static ResourceLocation texture(String path)
    {
        return id(ModelProvider.ITEM_FOLDER + "/" + path);
    }

    private static ResourceLocation id(String path)
    {
        return ResourceLocation.fromNamespaceAndPath(Minestuck.MOD_ID, path);
    }

    private static ResourceLocation id(Supplier<? extends Item> item)
    {
        return BuiltInRegistries.ITEM.getKey(item.get());
    }
}
