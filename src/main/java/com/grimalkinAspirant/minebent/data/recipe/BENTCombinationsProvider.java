package com.grimalkinAspirant.minebent.data.recipe;

import com.grimalkinAspirant.minebent.MINEBENT;
import com.grimalkinAspirant.minebent.items.MINEBENTItems;
import com.mraof.minestuck.api.alchemy.recipe.combination.CombinationRecipeBuilder;
import com.mraof.minestuck.block.AspectTreeBlocks;
import com.mraof.minestuck.block.SkaiaBlocks;
import com.mraof.minestuck.item.MSItems;
import com.mraof.minestuck.util.MSTags;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.Tags;

public class BENTCombinationsProvider {
    public static void buildRecipes(RecipeOutput consumer){
        //CombinationRecipeBuilder.of(Items.DIAMOND_BLOCK).input(Items.TORCH).and().input(ItemTags.FLOWERS).build(consumer);
        CombinationRecipeBuilder.of(MINEBENTItems.RUST_BLOOD).input(Items.IRON_INGOT).or().input(MSItems.BLOOD_BUCKET).build(consumer);
        CombinationRecipeBuilder.of(MINEBENTItems.BRONZE_BLOOD).input(Items.COPPER_INGOT).or().input(MSItems.BLOOD_BUCKET).build(consumer);
        CombinationRecipeBuilder.of(MINEBENTItems.GOLD_BLOOD).input(Items.GOLD_INGOT).or().input(MSItems.BLOOD_BUCKET).build(consumer);
        CombinationRecipeBuilder.of(MINEBENTItems.LIME_BLOOD).input(Items.LIME_DYE).or().input(MSItems.BLOOD_BUCKET).build(consumer);
        CombinationRecipeBuilder.of(MINEBENTItems.OLIVE_BLOOD).input(Items.SWEET_BERRIES).or().input(MSItems.BLOOD_BUCKET).build(consumer);
        CombinationRecipeBuilder.of(MINEBENTItems.JADE_BLOOD).input(Items.EMERALD).or().input(MSItems.BLOOD_BUCKET).build(consumer);
        CombinationRecipeBuilder.of(MINEBENTItems.TEAL_BLOOD).input(Items.CYAN_DYE).or().input(MSItems.BLOOD_BUCKET).build(consumer);
        CombinationRecipeBuilder.of(MINEBENTItems.BLUE_BLOOD).input(Items.DIAMOND).or().input(MSItems.BLOOD_BUCKET).build(consumer);
        CombinationRecipeBuilder.of(MINEBENTItems.INDIGO_BLOOD).input(Items.DIAMOND_HORSE_ARMOR).or().input(MSItems.BLOOD_BUCKET).build(consumer);
        CombinationRecipeBuilder.of(MINEBENTItems.PURPLE_BLOOD).input(MINEBENTItems.MIRTHFUL_ESSENCE).or().input(MSItems.BLOOD_BUCKET).build(consumer);
        CombinationRecipeBuilder.of(MINEBENTItems.VIOLET_BLOOD).input(Items.COD).or().input(MSItems.BLOOD_BUCKET).build(consumer);
        CombinationRecipeBuilder.of(MINEBENTItems.FUCHSIA_BLOOD).input(Items.GOLDEN_HELMET).or().input(MSItems.BLOOD_BUCKET).build(consumer);
    }

}
