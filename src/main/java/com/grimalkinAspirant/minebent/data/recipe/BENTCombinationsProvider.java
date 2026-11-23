package com.grimalkinAspirant.minebent.data.recipe;

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
        CombinationRecipeBuilder.of(Items.TORCHFLOWER).input(Items.TORCH).and().input(ItemTags.FLOWERS).build(consumer);
        CombinationRecipeBuilder.of(Items.TORCHFLOWER).input(Items.DIAMOND).or().input(Items.GLOW_LICHEN).build(consumer);
    }

}
