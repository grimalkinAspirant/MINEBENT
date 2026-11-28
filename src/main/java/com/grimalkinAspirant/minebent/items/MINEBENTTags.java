package com.grimalkinAspirant.minebent.items;

import com.grimalkinAspirant.minebent.MINEBENT;
import com.mraof.minestuck.Minestuck;
import com.mraof.minestuck.world.lands.LandTypes;
import com.mraof.minestuck.world.lands.terrain.TerrainLandType;
import com.mraof.minestuck.world.lands.title.TitleLandType;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.material.Fluid;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@SuppressWarnings("SameParameterValue")
public class MINEBENTTags
{
    public static class Blocks
	{
		// If other colored hieroglyph sets are added, switch to creating a tag for each analogous block instead of the whole set
		// I.e. a tag for lotus, a tag for frogs, a tag for skaia etc. instead of a tag for all hieroglyphs
		public static final TagKey<Block> TROLL_HIEROGLYPHS = tag("troll_hieroglyphs");
		public static final TagKey<Block> GLOWING_LOGS = tag("logs/glowing");
		public static final TagKey<Block> FROST_LOGS = tag("logs/frost");
		public static final TagKey<Block> RAINBOW_LOGS = tag("logs/rainbow");
		public static final TagKey<Block> END_LOGS = tag("logs/end");
		public static final TagKey<Block> VINE_LOGS = tag("logs/vine");
		public static final TagKey<Block> FLOWERY_VINE_LOGS = tag("logs/flowery_vine");
		public static final TagKey<Block> DEAD_LOGS = tag("logs/dead");
		public static final TagKey<Block> CINDERED_LOGS = tag("logs/cindered");
		public static final TagKey<Block> PETRIFIED_LOGS = tag("logs/petrified");
		public static final TagKey<Block> ASPECT_LOGS = tag("logs/aspect");
		public static final TagKey<Block> ASPECT_WOOD = tag("wood/aspect");
		public static final TagKey<Block> ASPECT_PLANKS = tag("planks/aspect");
		public static final TagKey<Block> ASPECT_SLABS = tag("slabs/aspect");
		public static final TagKey<Block> ASPECT_LEAVES = tag("leaves/aspect");
		public static final TagKey<Block> ASPECT_SAPLINGS = tag("saplings/aspect");
		public static final TagKey<Block> ASPECT_BOOKSHELVES = tag("bookshelves/aspect");
		public static final TagKey<Block> ASPECT_LADDERS = tag("ladders/aspect");
		public static final TagKey<Block> ASPECT_POTTED_SAPLINGS = tag("flower_pots/aspect");
		public static final TagKey<Block> SHADEWOOD_LOGS = tag("logs/shadewood");
		public static final TagKey<Block> SHADEWOOD_LEAVES = tag("leaves/shadewood");
		public static final TagKey<Block> WOOD_TERRAIN_BLOCKS = tag("terrain/wood_terrain_blocks");
		public static final TagKey<Block> HEAT_TERRAIN_BLOCKS = tag("terrain/heat_terrain_blocks");
		public static final TagKey<Block> ASPECT_TREE_PLACEABLE = tag("terrain/aspect_tree_placeable");
		public static final TagKey<Block> LAND_OCEAN_FLUIDS = tag("land_ocean_fluids");
		public static final TagKey<Block> CRUXITE_ORES = tag("ores/cruxite");
		public static final TagKey<Block> URANIUM_ORES = tag("ores/uranium");
		public static final TagKey<Block> COAL_ORES = tag("ores/coal");
		public static final TagKey<Block> IRON_ORES = tag("ores/iron");
		public static final TagKey<Block> GOLD_ORES = tag("ores/gold");
		public static final TagKey<Block> REDSTONE_ORES = tag("ores/redstone");
		public static final TagKey<Block> QUARTZ_ORES = tag("ores/quartz");
		public static final TagKey<Block> LAPIS_ORES = tag("ores/lapis");
		public static final TagKey<Block> DIAMOND_ORES = tag("ores/diamond");
		public static final TagKey<Block> EMERALD_ORES = tag("ores/emerald");
		public static final TagKey<Block> CRUXITE_STORAGE_BLOCKS = tag("storage_blocks/cruxite");
		public static final TagKey<Block> END_SAPLING_DIRT = tag("end_sapling_dirt");
		public static final TagKey<Block> ROTATOR_WHITELISTED = tag("rule_exempt_rotatable");
		public static final TagKey<Block> PLATFORM_ABSORBING = tag("platform_absorbing");
		public static final TagKey<Block> PUSHABLE_BLOCK_REPLACEABLE = tag("portable_block_replaceable");
		public static final TagKey<Block> PETRIFIED_FLORA_PLACEABLE = tag("petrified_flora_placeable");
		public static final TagKey<Block> EDITMODE_BREAK_BLACKLIST = tag("editmode_break_blacklist");
		public static final TagKey<Block> FARMINE_BREAK_BLACKLIST = tag("farmine_break_blacklist");

		
		private static TagKey<Block> tag(String name)
		{return BlockTags.create(MINEBENT.id(name));}
	}
	
	public static class Items
	{
        public static final TagKey<Item> TROLL_BLOOD = tag("troll_blood");
        public static final TagKey<Item> ALTERNIAN_RELIC = tag("alternian_relic");

		private static TagKey<Item> tag(String name)
		{return ItemTags.create(MINEBENT.id(name));}
	}
	
	public static class Biomes
	{
		public static final TagKey<Biome> HAS_ALTERNIA_FROG_TEMPLE = tag("has_structure/alternia_frog_temple");

		private static TagKey<Biome> tag(String name)
		{return TagKey.create(Registries.BIOME, MINEBENT.id(name));}
	}
}