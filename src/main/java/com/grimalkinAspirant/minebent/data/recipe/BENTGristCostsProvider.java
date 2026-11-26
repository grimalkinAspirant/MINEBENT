package com.grimalkinAspirant.minebent.data.recipe;

import com.mraof.minestuck.api.alchemy.recipe.GristCostRecipeBuilder;
import com.mraof.minestuck.item.MSItems;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Items;
import static com.grimalkinAspirant.minebent.items.MINEBENTItems.*;

import static com.mraof.minestuck.api.alchemy.GristTypes.*;

public final class BENTGristCostsProvider {
    //Max Grist per Type; Around 3300000
    public static void buildRecipes(RecipeOutput recipeSaver){
        GristCostRecipeBuilder.of(AHABS_CROSSHAIRS).grist(AMBER,4).grist(BUILD, 2).grist(COBALT, 2).build(recipeSaver);
    }
}
