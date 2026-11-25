package com.grimalkinAspirant.minebent.data;

import com.google.gson.JsonObject;
import com.grimalkinAspirant.minebent.MINEBENT;
import com.grimalkinAspirant.minebent.items.MINEBENTItems;
import com.mraof.minestuck.Minestuck;
import com.mraof.minestuck.item.weapon.MSToolType;
import com.mraof.minestuck.item.weapon.WeaponItem;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;

import javax.annotation.ParametersAreNonnullByDefault;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static com.mraof.minestuck.item.MSItemTypes.*;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class BENTBetterCombatCompat implements DataProvider
{
    private static final String SICKLE = "bettercombat:sickle";
    private static final String SCYTHE = "bettercombat:scythe";
    private static final String CLAW = "bettercombat:claw";
    private static final String PICKAXE = "bettercombat:pickaxe";
    private static final String HAMMER = "bettercombat:hammer";
    private static final String AXE = "bettercombat:axe";
    private static final String HEAVY_AXE = "bettercombat:heavy_axe";
    private static final String CHAINSAW = "minestuck:chainsaw_base";
    private static final String MACE = "bettercombat:mace";
    private static final String SWORD = "bettercombat:sword";
    private static final String KATANA = "bettercombat:katana";
    private static final String CUTLASS = "bettercombat:cutlass";
    private static final String CLAYMORE = "bettercombat:claymore";
    private static final String RAPIER = "bettercombat:rapier";
    private static final String DAGGER = "bettercombat:dagger";
    private static final String LANCE = "bettercombat:lance";
    private static final String STAFF = "bettercombat:battlestaff";
    private static final String CANE = "minestuck:cane_base";
    private static final String FORK = "minestuck:fork_base";
    private static final String WAND = "bettercombat:wand";
    private static final String HALBERD = "bettercombat:halberd";
    private static final String SPEAR = "bettercombat:spear";
    private static final String TRIDENT = "bettercombat:trident";

    private final PackOutput output;

    private final Map<ResourceKey<Item>, String> weaponWithParent = new HashMap<>();

    public BENTBetterCombatCompat(PackOutput output)
    {
        this.output = output;
    }

    @Override
    public final CompletableFuture<?> run(CachedOutput cache)
    {
        List<CompletableFuture<?>> futures = new ArrayList<>();
        Path basePath = this.output.getOutputFolder(PackOutput.Target.DATA_PACK).resolve(MINEBENT.MODID).resolve("weapon_attributes");

        addAllWeapons();

        for(Map.Entry<ResourceKey<Item>, String> entry : weaponWithParent.entrySet())
        {
            JsonObject object = new JsonObject();

            object.addProperty("parent", entry.getValue());

            futures.add(DataProvider.saveStable(cache, object, basePath.resolve(entry.getKey().location().getPath() + ".json")));
        }

        return CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));
    }

    public void addAllWeapons()
    {
        addWeaponDefaults();

        addWeapon(MINEBENTItems.EMPIRICISTS_WAND, WAND);
        addWeapon(MINEBENTItems.CHERUB_KEY, SWORD);
        addWeapon(MINEBENTItems.OPEN_UMBRELLA, CANE);
        addWeapon(MINEBENTItems.MIRTHFUL_SWORD, SWORD);

        addWeapon(MINEBENTItems.STONE_LANCE, LANCE);
        addWeapon(MINEBENTItems.GOLD_LANCE, LANCE);
        addWeapon(MINEBENTItems.DIAMOND_LANCE, LANCE);
        addWeapon(MINEBENTItems.MIRTHFUL_LANCE, LANCE);

        addWeapon(MINEBENTItems.WOODEN_SICKLE, SICKLE);
        addWeapon(MINEBENTItems.STONE_SICKLE, SICKLE);
        addWeapon(MINEBENTItems.GOLD_SICKLE, SICKLE);
        addWeapon(MINEBENTItems.DIAMOND_SICKLE, SICKLE);
        addWeapon(MINEBENTItems.MIRTHFUL_SICKLE, SICKLE);

        addWeapon(MINEBENTItems.WOODEN_CLAWS_DRAWN, CLAW);
        addWeapon(MINEBENTItems.WOODEN_CLAWS_SHEATHED, CLAW);
        addWeapon(MINEBENTItems.GOLD_CLAWS_DRAWN, CLAW);
        addWeapon(MINEBENTItems.GOLD_CLAWS_SHEATHED, CLAW);
        addWeapon(MINEBENTItems.COPPER_CLAWS_DRAWN, CLAW);
        addWeapon(MINEBENTItems.COPPER_CLAWS_SHEATHED, CLAW);
        addWeapon(MINEBENTItems.MIRTHFUL_CLAWS_DRAWN, CLAW);
        addWeapon(MINEBENTItems.MIRTHFUL_CLAWS_SHEATHED, CLAW);

    }

    private void addWeaponDefaults()
    {
        MINEBENTItems.ITEMS.getEntries().forEach(weaponHolder ->
        {
            if(weaponHolder.get() instanceof WeaponItem weaponItem && weaponItem.getToolTypes() != null)
            {
                for(MSToolType toolType : weaponItem.getToolTypes())
                {
                    String parent = getWeaponParent(toolType);

                    if(!parent.isEmpty())
                        weaponWithParent.put(weaponHolder.getKey(), parent);
                }
            }
        });
    }

    public String getWeaponParent(MSToolType toolType)
    {
        if(toolType == SICKLE_TOOL)
            return SICKLE;
        else if(toolType == SCYTHE_TOOL)
            return SCYTHE;
        else if(toolType == CLAWS_TOOL)
            return CLAW;
        else if(toolType == PICKAXE_TOOL)
            return PICKAXE;
        else if(toolType == HAMMER_TOOL)
            return HAMMER;
        else if(toolType == AXE_TOOL)
            return AXE;
        else if(toolType == CHAINSAW_TOOL)
            return CHAINSAW;
        else if(toolType == CLUB_TOOL || toolType == SHOVEL_TOOL)
            return MACE;
        else if(toolType == SWORD_TOOL || toolType == KEY_TOOL || toolType == BATON_TOOL)
            return SWORD;
        else if(toolType == KNIFE_TOOL || toolType == FAN_TOOL)
            return DAGGER;
        else if(toolType == LANCE_TOOL)
            return LANCE;
        else if(toolType == STAFF_TOOL)
            return STAFF;
        else if(toolType == CANE_TOOL)
            return CANE;
        else if(toolType == FORK_TOOL)
            return FORK;
        else if(toolType == WAND_TOOL)
            return WAND;
        return "";
    }

    public void addWeapon(DeferredItem<Item> weapon, String parent)
    {
        weaponWithParent.put(weapon.getKey(), parent);
    }

    @Override
        public String getName()
        {
            return "MINEBENT Better Combat Weapon Files";
        }
    }

