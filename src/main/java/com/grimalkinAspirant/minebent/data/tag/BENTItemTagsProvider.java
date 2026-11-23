package com.grimalkinAspirant.minebent.data.tag;

import com.grimalkinAspirant.minebent.items.MINEBENTItems;
import com.mraof.minestuck.item.MSItems;
import com.mraof.minestuck.item.weapon.MSToolType;
import com.mraof.minestuck.item.weapon.MagicRangedRightClickEffect;
import com.mraof.minestuck.item.weapon.WeaponItem;
import com.mraof.minestuck.item.weapon.projectiles.ConsumableProjectileWeaponItem;
import com.grimalkinAspirant.minebent.MINEBENT;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static com.mraof.minestuck.item.MSItemTypes.*;
import static net.minecraft.tags.ItemTags.*;
import static net.neoforged.neoforge.common.Tags.Items.*;

public class BENTItemTagsProvider extends ItemTagsProvider {

    public BENTItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTagProvider, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(output, lookupProvider, blockTagProvider, MINEBENT.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider){

        List<MSToolType> MINEBENTMiningToolTypes = List.of(SICKLE_TOOL, SCYTHE_TOOL, CLAWS_TOOL, HAMMER_TOOL, FORK_TOOL);
        List<MSToolType> minestuckMeleeExtendedToolTypes = List.of(LANCE_TOOL, CLUB_TOOL, KNIFE_TOOL, KEY_TOOL, FAN_TOOL, BATON_TOOL, STAFF_TOOL, CANE_TOOL, WAND_TOOL);
        List<MSToolType> MINEBENTToolTypes = Stream.concat(MINEBENTMiningToolTypes.stream(), minestuckMeleeExtendedToolTypes.stream()).toList();

        tag(SWORDS).add(relevantWeapons(item -> hasToolType(item, List.of(SWORD_TOOL))));
        tag(AXES).add(relevantWeapons(item -> hasToolType(item, List.of(AXE_TOOL))));
        tag(SHOVELS).add(relevantWeapons(item -> hasToolType(item, List.of(SHOVEL_TOOL))));

        tag(BREAKS_DECORATED_POTS).add(relevantWeapons(item -> hasToolType(item, MINEBENTToolTypes)));

        tag(MELEE_WEAPON_TOOLS).add(relevantWeapons(item -> item instanceof WeaponItem));
        tag(TOOLS_SPEAR).add(relevantWeapons(item -> hasToolType(item, List.of(LANCE_TOOL))));
        tag(RANGED_WEAPON_TOOLS).add(relevantWeapons(item -> item instanceof ConsumableProjectileWeaponItem || (item instanceof WeaponItem weapon && (weapon.getItemRightClickEffect() instanceof MagicRangedRightClickEffect))));

        tag(DURABILITY_ENCHANTABLE).add(relevantWeapons(item -> item instanceof WeaponItem && item.isDamageable(item.getDefaultInstance())));
        tag(MINING_ENCHANTABLE).add(relevantWeapons(item -> hasToolType(item, MINEBENTMiningToolTypes)));
        tag(MINING_LOOT_ENCHANTABLE).add(relevantWeapons(item -> hasToolType(item, MINEBENTMiningToolTypes)));
        tag(SWORD_ENCHANTABLE).add(relevantWeapons(item -> item instanceof WeaponItem));
        tag(VANISHING_ENCHANTABLE).add(relevantWeapons(item -> item instanceof WeaponItem));
        
        this.tag(TRIM_MATERIALS)
                .add(MINEBENTItems.RUBY.get());

    }

    private static Item[] relevantWeapons(Predicate<Item> predicate)
    {
        return MINEBENTItems.ITEMS.getEntries().stream().map(Supplier::get).filter(predicate).toArray(Item[]::new);
    }

    private static boolean hasToolType(Item item, List<MSToolType> toolTypes)
    {
        if(!(item instanceof WeaponItem weaponItem) || weaponItem.getToolTypes() == null)
            return false;

        List<MSToolType> weaponTypes = weaponItem.getToolTypes();

        for(MSToolType toolType : toolTypes)
            if(weaponTypes.contains(toolType))
                return true;

        return false;
    }

}
