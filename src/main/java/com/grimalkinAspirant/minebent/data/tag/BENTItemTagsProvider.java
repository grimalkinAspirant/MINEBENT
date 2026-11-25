package com.grimalkinAspirant.minebent.data.tag;

import com.grimalkinAspirant.minebent.MINEBENT;
import com.grimalkinAspirant.minebent.items.MINEBENTItems;
import com.grimalkinAspirant.minebent.items.MINEBENTTags;
import com.mraof.minestuck.block.MSBlocks;
import com.mraof.minestuck.item.MSItems;
import com.mraof.minestuck.item.weapon.MSToolType;
import com.mraof.minestuck.item.weapon.MagicAOERightClickEffect;
import com.mraof.minestuck.item.weapon.MagicRangedRightClickEffect;
import com.mraof.minestuck.item.weapon.WeaponItem;
import com.mraof.minestuck.item.weapon.projectiles.ConsumableProjectileWeaponItem;
import com.mraof.minestuck.item.weapon.projectiles.ReturningProjectileWeaponItem;
import com.mraof.minestuck.util.ExtraModTags;
import com.mraof.minestuck.util.MSTags;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static com.mraof.minestuck.item.MSItemTypes.*;
import static com.mraof.minestuck.item.MSItems.*;
import static com.mraof.minestuck.util.MSTags.Items.*;
import static net.minecraft.tags.ItemTags.*;
import static net.neoforged.neoforge.common.Tags.Items.*;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class BENTItemTagsProvider extends ItemTagsProvider
{
	public BENTItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTagProvider, @Nullable ExistingFileHelper existingFileHelper)
	{
		super(output, lookupProvider, blockTagProvider, MINEBENT.MODID, existingFileHelper);
	}
	
	@Override
	protected void addTags(HolderLookup.Provider provider)
	{
		copy(BlockTags.PLANKS, PLANKS);
		copy(BlockTags.STONE_BRICKS, STONE_BRICKS);
		copy(BlockTags.WOODEN_BUTTONS, WOODEN_BUTTONS);
		copy(BlockTags.BUTTONS, BUTTONS);
		copy(BlockTags.WOODEN_STAIRS, WOODEN_STAIRS);
		copy(BlockTags.WOODEN_SLABS, WOODEN_SLABS);
		copy(BlockTags.SAPLINGS, SAPLINGS);
		copy(BlockTags.STAIRS, STAIRS);
		copy(BlockTags.SLABS, SLABS);
		copy(BlockTags.LOGS, LOGS);
		copy(BlockTags.LEAVES, LEAVES);
		copy(Tags.Blocks.COBBLESTONES, COBBLESTONES);
		copy(Tags.Blocks.ORES, ORES);
		copy(BlockTags.COAL_ORES, ORES_COAL);
		copy(BlockTags.DIAMOND_ORES, ORES_DIAMOND);
		copy(BlockTags.GOLD_ORES, ORES_GOLD);
		copy(BlockTags.IRON_ORES, ORES_IRON);
		copy(BlockTags.LAPIS_ORES, ORES_LAPIS);
		copy(Tags.Blocks.ORES_QUARTZ, ORES_QUARTZ);
		copy(BlockTags.REDSTONE_ORES, ORES_REDSTONE);
		copy(BlockTags.EMERALD_ORES, ORES_EMERALD);
		copy(Tags.Blocks.STONES, STONES);
		copy(Tags.Blocks.STORAGE_BLOCKS, STORAGE_BLOCKS);
		copy(ExtraModTags.Blocks.URANIUM_ORES, ExtraModTags.Items.URANIUM_ORES);
		copy(ExtraModTags.Blocks.URANIUM_STORAGE_BLOCKS, ExtraModTags.Items.URANIUM_STORAGE_BLOCKS);
		copy(MSTags.Blocks.GLOWING_LOGS, GLOWING_LOGS);
		copy(MSTags.Blocks.FROST_LOGS, FROST_LOGS);
		copy(MSTags.Blocks.RAINBOW_LOGS, RAINBOW_LOGS);
		copy(MSTags.Blocks.END_LOGS, END_LOGS);
		copy(MSTags.Blocks.VINE_LOGS, VINE_LOGS);
		copy(MSTags.Blocks.FLOWERY_VINE_LOGS, FLOWERY_VINE_LOGS);
		copy(MSTags.Blocks.DEAD_LOGS, DEAD_LOGS);
		copy(MSTags.Blocks.CINDERED_LOGS, CINDERED_LOGS);
		copy(MSTags.Blocks.PETRIFIED_LOGS, PETRIFIED_LOGS);
		copy(MSTags.Blocks.ASPECT_LOGS, ASPECT_LOGS);
		copy(MSTags.Blocks.ASPECT_WOOD, ASPECT_WOOD);
		copy(MSTags.Blocks.ASPECT_PLANKS, ASPECT_PLANKS);
		copy(MSTags.Blocks.ASPECT_SLABS, ASPECT_SLABS);
		copy(MSTags.Blocks.ASPECT_LEAVES, ASPECT_LEAVES);
		copy(MSTags.Blocks.ASPECT_SAPLINGS, ASPECT_SAPLINGS);
		copy(MSTags.Blocks.SHADEWOOD_LOGS, SHADEWOOD_LOGS);
		copy(MSTags.Blocks.SHADEWOOD_LEAVES, MSTags.Items.SHADEWOOD_LEAVES);
		copy(MSTags.Blocks.CRUXITE_ORES, CRUXITE_ORES);
		copy(MSTags.Blocks.URANIUM_ORES, URANIUM_ORES);
		copy(MSTags.Blocks.COAL_ORES, MSTags.Items.COAL_ORES);
		copy(MSTags.Blocks.IRON_ORES, MSTags.Items.IRON_ORES);
		copy(MSTags.Blocks.GOLD_ORES, MSTags.Items.GOLD_ORES);
		copy(MSTags.Blocks.REDSTONE_ORES, MSTags.Items.REDSTONE_ORES);
		copy(MSTags.Blocks.QUARTZ_ORES, QUARTZ_ORES);
		copy(MSTags.Blocks.LAPIS_ORES, MSTags.Items.LAPIS_ORES);
		copy(MSTags.Blocks.DIAMOND_ORES, MSTags.Items.DIAMOND_ORES);
		copy(MSTags.Blocks.EMERALD_ORES, MSTags.Items.EMERALD_ORES);
		copy(MSTags.Blocks.CRUXITE_STORAGE_BLOCKS, CRUXITE_STORAGE_BLOCKS);
		
		//handles items that are in tool types added by Minestuck which would otherwise not be added to relevant tags for weapons or tools
		List<MSToolType> minestuckMiningToolTypes = List.of(SICKLE_TOOL, SCYTHE_TOOL, CLAWS_TOOL, HAMMER_TOOL, FORK_TOOL);
		List<MSToolType> minestuckMeleeToolTypes = List.of(LANCE_TOOL, CLUB_TOOL, KNIFE_TOOL, KEY_TOOL, FAN_TOOL, BATON_TOOL, STAFF_TOOL, CANE_TOOL, WAND_TOOL);
		List<MSToolType> minestuckToolTypes = Stream.concat(minestuckMiningToolTypes.stream(), minestuckMeleeToolTypes.stream()).toList();
		
		tag(SWORDS).add(EMERALD_SWORD.get()).add(relevantItems(item -> hasToolType(item, List.of(SWORD_TOOL))));
		tag(AXES).add(EMERALD_AXE.get()).add(relevantItems(item -> hasToolType(item, List.of(AXE_TOOL, CHAINSAW_TOOL))));
		tag(PICKAXES).add(EMERALD_PICKAXE.get()).add(relevantItems(item -> hasToolType(item, List.of(PICKAXE_TOOL))));
		tag(SHOVELS).add(EMERALD_SHOVEL.get()).add(relevantItems(item -> hasToolType(item, List.of(SHOVEL_TOOL, SPOON_TOOL))));
		tag(HOES).add(EMERALD_HOE.get(), HELLBRINGERS_HOE_INACTIVE.get(), HELLBRINGERS_HOE_ACTIVE.get());
		tag(HEAD_ARMOR).add(relevantItems(item -> isArmorType(item, ArmorItem.Type.HELMET)));
		tag(CHEST_ARMOR).add(relevantItems(item -> isArmorType(item, ArmorItem.Type.CHESTPLATE)));
		tag(LEG_ARMOR).add(relevantItems(item -> isArmorType(item, ArmorItem.Type.LEGGINGS)));
		tag(FOOT_ARMOR).add(relevantItems(item -> isArmorType(item, ArmorItem.Type.BOOTS)));
		tag(CLUSTER_MAX_HARVESTABLES).add(relevantItems(item -> hasToolType(item, List.of(PICKAXE_TOOL, HAMMER_TOOL))));
		tag(BREAKS_DECORATED_POTS).add(relevantItems(item -> hasToolType(item, minestuckToolTypes)));
		
		tag(MINING_TOOL_TOOLS).add(relevantItems(item -> hasToolType(item, List.of(PICKAXE_TOOL, HAMMER_TOOL))));
		tag(MELEE_WEAPON_TOOLS).add(relevantItems(item -> item instanceof WeaponItem));
		tag(TOOLS_SPEAR).add(relevantItems(item -> hasToolType(item, List.of(LANCE_TOOL))));
		tag(RANGED_WEAPON_TOOLS).add(relevantItems(item -> item instanceof ConsumableProjectileWeaponItem || (item instanceof WeaponItem weapon && (weapon.getItemRightClickEffect() instanceof MagicRangedRightClickEffect || weapon.getItemRightClickEffect() instanceof MagicAOERightClickEffect))));
		
		tag(DURABILITY_ENCHANTABLE).add(relevantItems(item -> (item instanceof WeaponItem && item.isDamageable(item.getDefaultInstance())) || item instanceof ReturningProjectileWeaponItem));
		tag(MINING_ENCHANTABLE).add(relevantItems(item -> hasToolType(item, minestuckMiningToolTypes)));
		tag(MINING_LOOT_ENCHANTABLE).add(relevantItems(item -> hasToolType(item, minestuckMiningToolTypes)));
		tag(SWORD_ENCHANTABLE).add(relevantItems(item -> item instanceof WeaponItem)); //TODO weapons without sweep can get sweeping edge
		tag(SHARP_WEAPON_ENCHANTABLE).add(relevantItems(item -> item instanceof WeaponItem));
		tag(VANISHING_ENCHANTABLE).add(relevantItems(item -> item instanceof WeaponItem));
		
		tag(Tags.Items.MUSIC_DISCS).add(MUSIC_DISC_DANCE_STAB_DANCE.get(), MUSIC_DISC_EMISSARY_OF_DANCE.get(), MUSIC_DISC_RETRO_BATTLE.get());
		
		tag(MSTags.Items.FAYGO).add(MINEBENTItems.MIRTHFUL_ESSENCE.get());
		tag(CASSETTES).add(MSItems.CASSETTE_MELLOHI.get(), CASSETTE_13.get(), CASSETTE_BLOCKS.get());
        tag(MINEBENTTags.Items.TROLL_BLOOD).add(MINEBENTItems.RUST_BLOOD.get(), MINEBENTItems.BRONZE_BLOOD.get(), MINEBENTItems.GOLD_BLOOD.get(),MINEBENTItems.LIME_BLOOD.get(),
                MINEBENTItems.OLIVE_BLOOD.get(), MINEBENTItems.JADE_BLOOD.get(), MINEBENTItems.TEAL_BLOOD.get(),MINEBENTItems.BLUE_BLOOD.get(),
                MINEBENTItems.INDIGO_BLOOD.get(), MINEBENTItems.PURPLE_BLOOD.get(), MINEBENTItems.VIOLET_BLOOD.get(),MINEBENTItems.FUCHSIA_BLOOD.get());
		tag(BUGS).addTag(MINEBENTTags.Items.BUG_MEAT);
		tag(MINEBENTTags.Items.ALTERNIAN_RELIC).add(MINEBENTItems.AHABS_CROSSHAIRS.get()).add(FLUORITE_OCTET.get());
		tag(MAGIC_WEAPON).add(relevantItems(item ->
				item instanceof WeaponItem weapon && (weapon.getItemRightClickEffect() instanceof MagicRangedRightClickEffect || weapon.getItemRightClickEffect() instanceof MagicAOERightClickEffect)));
		tag(LEGENDARY).add(relevantItems(item -> item instanceof WeaponItem weapon && (weapon.getTier() == DENIZEN_TIER || weapon.getTier() == ZILLY_TIER || weapon.getTier() == WELSH_TIER)));
	}
	
	private static Item[] relevantItems(Predicate<Item> predicate)
	{
		return MSItems.REGISTER.getEntries().stream().map(Supplier::get).filter(predicate).toArray(Item[]::new);
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
	
	private static boolean isArmorType(Item item, ArmorItem.Type type)
	{
		if(item instanceof ArmorItem armorItem)
			return armorItem.getType() == type;
		
		return false;
	}
	
	@Override
	public String getName()
	{
		return "Minestuck Item Tags";
	}
}
