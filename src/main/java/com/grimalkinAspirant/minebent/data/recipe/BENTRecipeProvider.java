package com.grimalkinAspirant.minebent.data.recipe;

import com.grimalkinAspirant.minebent.MINEBENT;
import com.grimalkinAspirant.minebent.items.MINEBENTItems;
import com.mraof.minestuck.Minestuck;
import com.mraof.minestuck.block.MSBlocks;
import com.mraof.minestuck.data.recipe.IrradiatingRecipeBuilder;
import com.mraof.minestuck.item.MSItems;
import com.mraof.minestuck.util.ExtraModTags;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.internal.NeoForgeItemTagsProvider;

import javax.annotation.ParametersAreNonnullByDefault;
import javax.swing.text.html.HTML;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class BENTRecipeProvider extends RecipeProvider {
    public BENTRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }
    @Override
    protected void buildRecipes(RecipeOutput recipeBuilder){
        //Shaped
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, MSItems.ACTION_CLAWS_DRAWN.get())
                .pattern("m m")
                .pattern("mwm")
                .pattern("w w")
                .define('m', Items.DIAMOND)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_diamond", has(Items.DIAMOND))
                .save(recipeBuilder);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, MSItems.CAT_CLAWS_DRAWN.get())
                .pattern("m m")
                .pattern("mwm")
                .pattern("w w")
                .define('m', Items.IRON_INGOT)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(recipeBuilder);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, MINEBENTItems.WOODEN_CLAWS_DRAWN.get())
                .pattern("m m")
                .pattern("mwm")
                .pattern("w w")
                .define('m', ItemTags.STONE_TOOL_MATERIALS)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(recipeBuilder);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, MINEBENTItems.GOLD_CLAWS_DRAWN.get())
                .pattern("m m")
                .pattern("mwm")
                .pattern("w w")
                .define('m', Items.GOLD_INGOT)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                .save(recipeBuilder);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, MINEBENTItems.SAWDUST_LIPSTICK.get())
                .pattern("b")
                .pattern("m")
                .define('b', MINEBENTItems.RUST_BLOOD)
                .define('m', ItemTags.PLANKS)
                .unlockedBy("has_rust_blood", has(MINEBENTItems.RUST_BLOOD))
                .save(recipeBuilder);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, MINEBENTItems.CHALKY_LIPSTICK.get())
                .pattern("b")
                .pattern("m")
                .define('b', MINEBENTItems.GOLD_BLOOD)
                .define('m', ItemTags.STONE_TOOL_MATERIALS)
                .unlockedBy("has_gold_blood", has(MINEBENTItems.GOLD_BLOOD))
                .save(recipeBuilder);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, MSItems.LIPSTICK.get())
                .pattern("b")
                .pattern("m")
                .define('b', MINEBENTItems.JADE_BLOOD)
                .define('m', Items.IRON_INGOT)
                .unlockedBy("has_jade_blood", has(MINEBENTItems.JADE_BLOOD))
                .save(recipeBuilder);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, MINEBENTItems.SIX_KARAT_LIPSTICK.get())
                .pattern("b")
                .pattern("m")
                .define('b', MINEBENTItems.TEAL_BLOOD)
                .define('m', Items.GOLD_INGOT)
                .unlockedBy("has_teal_blood", has(MINEBENTItems.TEAL_BLOOD))
                .save(recipeBuilder);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, MINEBENTItems.ICED_LIPSTICK.get())
                .pattern("b")
                .pattern("m")
                .define('b', MINEBENTItems.PURPLE_BLOOD)
                .define('m', Items.DIAMOND)
                .unlockedBy("has_purple_blood", has(MINEBENTItems.PURPLE_BLOOD))
                .save(recipeBuilder);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, MSItems.DEMONBANE_RAGRIPPER.get())
                .pattern(" t ")
                .pattern("tct")
                .pattern(" m ")
                .define('t', MINEBENTItems.TROLL_HORN)
                .define('c', MSItems.LIPSTICK_CHAINSAW)
                .define('m', MINEBENTItems.MIRTHFUL_ESSENCE)
                .unlockedBy("has_mirthful_essence", has(MINEBENTItems.MIRTHFUL_ESSENCE))
                .save(recipeBuilder);
//        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, MSItems.DEMONBANE_RAGRIPPER.get())
//                .pattern("t")
//                .pattern("m")
//                .pattern("z")
//                .define('z', MSItems.ZILLIUM_SKITTLES)
//                .define('t', Items.DRAGON_HEAD)
//                .define('m', Items.BONE_BLOCK)
//                .unlockedBy("has_zillium_skittles", has(MSItems.ZILLIUM_SKITTLES))
//                .save(recipeBuilder);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, MINEBENTItems.STONE_CANE.get())
                .pattern("  m")
                .pattern(" c ")
                .pattern("m  ")
                .define('m', ItemTags.STONE_TOOL_MATERIALS)
                .define('c', MSItems.CANE)
                .unlockedBy("has_cobblestone", has(ItemTags.STONE_TOOL_MATERIALS))
                .save(recipeBuilder);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, MINEBENTItems.GOLD_CANE.get())
                .pattern("  m")
                .pattern(" c ")
                .pattern("m  ")
                .define('m', Items.GOLD_INGOT)
                .define('c', MSItems.CANE)
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                .save(recipeBuilder);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, MINEBENTItems.DIAMOND_CANE.get())
                .pattern("  m")
                .pattern(" c ")
                .pattern("m  ")
                .define('m', Items.DIAMOND)
                .define('c', MSItems.CANE)
                .unlockedBy("has_diamond", has(Items.DIAMOND))
                .save(recipeBuilder);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, MINEBENTItems.WOODEN_CLUB.get())
                .pattern("m  ")
                .pattern(" m ")
                .pattern("  s")
                .define('m', ItemTags.PLANKS)
                .define('s', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(recipeBuilder);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, MINEBENTItems.STONE_CLUB.get())
                .pattern("m  ")
                .pattern(" m ")
                .pattern("  s")
                .define('m', ItemTags.STONE_TOOL_MATERIALS)
                .define('s', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_cobblestone", has(ItemTags.STONE_TOOL_MATERIALS))
                .save(recipeBuilder);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, MSItems.METAL_BAT.get())
                .pattern("m  ")
                .pattern(" m ")
                .pattern("  s")
                .define('m', Items.IRON_INGOT)
                .define('s', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(recipeBuilder);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, MINEBENTItems.GOLD_CLUB.get())
                .pattern("m  ")
                .pattern(" m ")
                .pattern("  s")
                .define('m', Items.GOLD_INGOT)
                .define('s', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                .save(recipeBuilder);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, MINEBENTItems.DIAMOND_CLUB.get())
                .pattern("m  ")
                .pattern(" m ")
                .pattern("  s")
                .define('m', Items.DIAMOND)
                .define('s', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_diamond", has(Items.DIAMOND))
                .save(recipeBuilder);
        //Smithing Table
        //Furnace
        //Shapeless
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.BONE_MEAL, 3).requires(MINEBENTItems.TROLL_HORN.get()).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MINEBENT.MODID, "bone_meal_from_troll_horn"));

        //
        BENTGristCostsProvider.buildRecipes(recipeBuilder);
        BENTCombinationsProvider.buildRecipes(recipeBuilder);

    }
}
