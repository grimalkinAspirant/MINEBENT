package com.grimalkinAspirant.minebent.items;

import com.grimalkinAspirant.minebent.MINEBENT;
import com.mraof.minestuck.item.MSItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class MINEBENTCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MINEBENT.MODID);

    public  static final Supplier<CreativeModeTab> MINEBENT_TAB = CREATIVE_MODE_TAB.register("minebent_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(MINEBENTItems.TROLLLOGO_FAKEITEM.get()))
                    .title(Component.translatable("MINEBENT"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(MINEBENTItems.CHERUB_KEY);
                        output.accept(MINEBENTItems.CHERUB_PORTAL_ITEM);

                        output.accept(MINEBENTItems.TROLL_HORN);
                        output.accept(MINEBENTItems.CHITIN);
                        output.accept(MINEBENTItems.CHITIN_HELMET);
                        output.accept(MINEBENTItems.CHITIN_CHESTPLATE);
                        output.accept(MINEBENTItems.CHITIN_LEGGINGS);
                        output.accept(MINEBENTItems.CHITIN_BOOTS);

                        output.accept(MINEBENTItems.RUBY);
                        output.accept(MINEBENTItems.RUBY_BLOCK_ITEM);
                        output.accept(MINEBENTItems.ROCKET_SHOES);
                        output.accept(MINEBENTItems.ROCKET_PACK);
                        output.accept(MINEBENTItems.DRAGON_PACK);

                        output.accept(MINEBENTItems.SMALL_GRUB);
                        output.accept(MINEBENTItems.BIG_GRUB);
                        output.accept(MINEBENTItems.BUG_MEAT);
                        output.accept(MINEBENTItems.COOKED_SMALL_GRUB);
                        output.accept(MINEBENTItems.COOKED_BIG_GRUB);
                        output.accept(MINEBENTItems.COOKED_BUG_MEAT);

                        output.accept(MINEBENTItems.MIRTHFUL_ESSENCE);
                        output.accept(MINEBENTItems.MIRTHFUL_SHOVEL);
                        output.accept(MINEBENTItems.MIRTHFUL_PICKAXE);
                        output.accept(MINEBENTItems.MIRTHFUL_AXE);
                        output.accept(MINEBENTItems.MIRTHFUL_HOE);
                        output.accept(MINEBENTItems.MIRTHFUL_SWORD);
                        output.accept(MINEBENTItems.MIRTHFUL_CLUB);
                        output.accept(MINEBENTItems.MIRTHFUL_MASQUE);
                        output.accept(MINEBENTItems.MIRTHFUL_CHESTPLATE);
                        output.accept(MINEBENTItems.MIRTHFUL_LEGGINGS);
                        output.accept(MINEBENTItems.MIRTHFUL_BOOTS);
                        output.accept(MINEBENTItems.MIRTHFUL_SCRIPTURES);

                        output.accept(MINEBENTItems.OPEN_UMBRELLA);
                        output.accept(MINEBENTItems.AHABS_CROSSHAIRS);
                        output.accept(MINEBENTItems.EMPIRICISTS_WAND);
                        output.accept(MINEBENTItems.STONE_LANCE);
                        output.accept(MINEBENTItems.GOLD_LANCE);
                        output.accept(MINEBENTItems.DIAMOND_LANCE);
                        output.accept(MINEBENTItems.MIRTHFUL_LANCE);
                        output.accept(MINEBENTItems.WOODEN_SICKLE);
                        output.accept(MINEBENTItems.STONE_SICKLE);
                        output.accept(MINEBENTItems.GOLD_SICKLE);
                        output.accept(MINEBENTItems.DIAMOND_SICKLE);
                        output.accept(MINEBENTItems.MIRTHFUL_SICKLE);
                        output.accept(MINEBENTItems.WOODEN_CLAWS_DRAWN);
                        output.accept(MINEBENTItems.GOLD_CLAWS_DRAWN);
                        output.accept(MINEBENTItems.COPPER_CLAWS_DRAWN);
                        output.accept(MINEBENTItems.MIRTHFUL_CLAWS_DRAWN);
                        output.accept(MINEBENTItems.WOODEN_CHAINSAW);
                        output.accept(MINEBENTItems.STONE_CHAINSAW);
                        output.accept(MINEBENTItems.GOLD_CHAINSAW);
                        output.accept(MINEBENTItems.DIAMOND_CHAINSAW);
                        output.accept(MINEBENTItems.SAWDUST_LIPSTICK);
                        output.accept(MINEBENTItems.CHALKY_LIPSTICK);
                        output.accept(MSItems.LIPSTICK);
                        output.accept(MINEBENTItems.SIX_KARAT_LIPSTICK);
                        output.accept(MINEBENTItems.ICED_LIPSTICK);
                        output.accept(MINEBENTItems.STONE_CANE);
                        output.accept(MINEBENTItems.GOLD_CANE);
                        output.accept(MINEBENTItems.DIAMOND_CANE);
                        output.accept(MINEBENTItems.MIRTHFUL_CANE);
                        output.accept(MINEBENTItems.WOODEN_CLUB);
                        output.accept(MINEBENTItems.STONE_CLUB);
                        output.accept(MINEBENTItems.GOLD_CLUB);
                        output.accept(MINEBENTItems.DIAMOND_CLUB);

//                        output.accept(MINEBENTItems.TROLLSTONE);
//                        output.accept(MINEBENTItems.TROLLSTONE_STAIRS);
//                        output.accept(MINEBENTItems.TROLLSTONE_SLAB);
//                        output.accept(MINEBENTItems.TROLLSTONE_BUTTON);
//                        output.accept(MINEBENTItems.TROLLSTONE_PRESSURE_PLATE);
//                        output.accept(MINEBENTItems.COBBLED_TROLLSTONE);
//                        output.accept(MINEBENTItems.COBBLED_TROLLSTONE_STAIRS);
//                        output.accept(MINEBENTItems.COBBLED_TROLLSTONE_SLAB);
//                        output.accept(MINEBENTItems.COBBLED_TROLLSTONE_WALL);
//
//                        output.accept(MINEBENTItems.TROLLSTONE_BRICKS);
//                        output.accept(MINEBENTItems.TROLLSTONE_BRICK_STAIRS);
//                        output.accept(MINEBENTItems.TROLLSTONE_BRICK_SLAB);
//                        output.accept(MINEBENTItems.TROLLSTONE_BRICK_WALL);
//
//                        output.accept(MINEBENTItems.CRACKED_TROLLSTONE_BRICKS);
//                        output.accept(MINEBENTItems.CHISELED_TROLLSTONE_BRICKS);
//                        output.accept(MINEBENTItems.MOSSY_TROLLSTONE_BRICKS);
//                        output.accept(MINEBENTItems.MOSSY_COBBLED_TROLLSTONE);
//
//                        output.accept(MINEBENTItems.BROODSTONE);
//                        output.accept(MINEBENTItems.BROODSTONE_STAIRS);
//                        output.accept(MINEBENTItems.BROODSTONE_SLAB);
//                        output.accept(MINEBENTItems.BROODSTONE_WALL);
//                        output.accept(MINEBENTItems.BROODSTONE_BRICKS);
//                        output.accept(MINEBENTItems.BROODSTONE_BRICK_STAIRS);
//                        output.accept(MINEBENTItems.BROODSTONE_BRICK_SLAB);
//                        output.accept(MINEBENTItems.BROODSTONE_BRICK_WALL);
//
//                        output.accept(MINEBENTItems.TROLLSTONE_COAL_ORE);
//                        output.accept(MINEBENTItems.TROLLSTONE_COPPER_ORE);
//                        output.accept(MINEBENTItems.TROLLSTONE_IRON_ORE);
//                        output.accept(MINEBENTItems.TROLLSTONE_REDSTONE_ORE);
//                        output.accept(MINEBENTItems.TROLLSTONE_GOLD_ORE);
//                        output.accept(MINEBENTItems.TROLLSTONE_DIAMOND_ORE);
//                        output.accept(MINEBENTItems.TROLLSTONE_QUARTZ_ORE);
//                        output.accept(MINEBENTItems.TROLLSTONE_CRUXITE_ORE);
//                        output.accept(MINEBENTItems.TROLLSTONE_URANIUM_ORE);
//                        output.accept(MINEBENTItems.TROLLSTONE_RUBY_ORE);
//                        output.accept(MINEBENTItems.TROLLSLATE_COAL_ORE);
//                        output.accept(MINEBENTItems.TROLLSLATE_COPPER_ORE);
//                        output.accept(MINEBENTItems.TROLLSLATE_IRON_ORE);
//                        output.accept(MINEBENTItems.TROLLSLATE_REDSTONE_ORE);
//                        output.accept(MINEBENTItems.TROLLSLATE_GOLD_ORE);
//                        output.accept(MINEBENTItems.TROLLSLATE_DIAMOND_ORE);
//                        output.accept(MINEBENTItems.TROLLSLATE_URANIUM_ORE);
//                        output.accept(MINEBENTItems.TROLLSLATE_RUBY_ORE);

//                        output.accept(MINEBENTItems.RED_STONE_ITEM);
//                        output.accept(MINEBENTItems.RED_STONE_WALL_ITEM);
//                        output.accept(MINEBENTItems.RED_STONE_BUTTON_ITEM);
//                        output.accept(MINEBENTItems.RED_STONE_PRESSURE_PLATE_ITEM);
//                        output.accept(MINEBENTItems.RED_STONE_BRICKS_ITEM);
//                        output.accept(MINEBENTItems.RED_STONE_BRICK_WALL_ITEM);
//                        output.accept(MINEBENTItems.RED_STONE_COLUMN_ITEM);
//                        output.accept(MINEBENTItems.POLISHED_RED_STONE_ITEM);
//                        output.accept(MINEBENTItems.POLISHED_RED_STONE_STAIRS_ITEM);
//                        output.accept(MINEBENTItems.POLISHED_RED_STONE_SLAB_ITEM);
//                        output.accept(MINEBENTItems.POLISHED_RED_STONE_WALL_ITEM);
//                        output.accept(MINEBENTItems.CHISELED_RED_STONE_BRICKS_ITEM);
//                        output.accept(MINEBENTItems.HORIZONTAL_RED_STONE_BRICKS_ITEM);
//                        output.accept(MINEBENTItems.HORIZONTAL_RED_STONE_BRICK_STAIRS_ITEM);
//                        output.accept(MINEBENTItems.HORIZONTAL_RED_STONE_BRICK_SLAB_ITEM);
//                        output.accept(MINEBENTItems.HORIZONTAL_RED_STONE_BRICK_WALL_ITEM);
//                        output.accept(MINEBENTItems.VERTICAL_RED_STONE_BRICKS_ITEM);
//                        output.accept(MINEBENTItems.VERTICAL_RED_STONE_BRICK_STAIRS_ITEM);
//                        output.accept(MINEBENTItems.VERTICAL_RED_STONE_BRICK_SLAB_ITEM);
//                        output.accept(MINEBENTItems.VERTICAL_RED_STONE_BRICK_WALL_ITEM);
//                        output.accept(MINEBENTItems.RED_STONE_BRICK_EMBEDDED_LADDER_ITEM);
//                        output.accept(MINEBENTItems.RED_STONE_BRICK_TRIM_ITEM);
//                        output.accept(MINEBENTItems.RED_STONE_BRICK_FROG_ITEM);
//                        output.accept(MINEBENTItems.RED_STONE_BRICK_IGUANA_LEFT_ITEM);
//                        output.accept(MINEBENTItems.RED_STONE_BRICK_IGUANA_RIGHT_ITEM);
//                        output.accept(MINEBENTItems.RED_STONE_BRICK_LOTUS_ITEM);
//                        output.accept(MINEBENTItems.RED_STONE_BRICK_NAK_LEFT_ITEM);
//                        output.accept(MINEBENTItems.RED_STONE_BRICK_NAK_RIGHT_ITEM);
//                        output.accept(MINEBENTItems.RED_STONE_BRICK_SALAMANDER_LEFT_ITEM);
//                        output.accept(MINEBENTItems.RED_STONE_BRICK_SALAMANDER_RIGHT_ITEM);
//                        output.accept(MINEBENTItems.RED_STONE_BRICK_SKAIA_ITEM);
//                        output.accept(MINEBENTItems.RED_STONE_BRICK_TURTLE_ITEM);
//                        output.accept(MINEBENTItems.BLUE_STONE_ITEM);
//                        output.accept(MINEBENTItems.BLUE_STONE_WALL_ITEM);
//                        output.accept(MINEBENTItems.BLUE_STONE_BUTTON_ITEM);
//                        output.accept(MINEBENTItems.BLUE_STONE_PRESSURE_PLATE_ITEM);
//                        output.accept(MINEBENTItems.BLUE_STONE_BRICKS_ITEM);
//                        output.accept(MINEBENTItems.BLUE_STONE_BRICK_WALL_ITEM);
//                        output.accept(MINEBENTItems.BLUE_STONE_COLUMN_ITEM);
//                        output.accept(MINEBENTItems.POLISHED_BLUE_STONE_ITEM);
//                        output.accept(MINEBENTItems.POLISHED_BLUE_STONE_STAIRS_ITEM);
//                        output.accept(MINEBENTItems.POLISHED_BLUE_STONE_SLAB_ITEM);
//                        output.accept(MINEBENTItems.POLISHED_BLUE_STONE_WALL_ITEM);
//                        output.accept(MINEBENTItems.CHISELED_BLUE_STONE_BRICKS_ITEM);
//                        output.accept(MINEBENTItems.HORIZONTAL_BLUE_STONE_BRICKS_ITEM);
//                        output.accept(MINEBENTItems.HORIZONTAL_BLUE_STONE_BRICK_STAIRS_ITEM);
//                        output.accept(MINEBENTItems.HORIZONTAL_BLUE_STONE_BRICK_SLAB_ITEM);
//                        output.accept(MINEBENTItems.HORIZONTAL_BLUE_STONE_BRICK_WALL_ITEM);
//                        output.accept(MINEBENTItems.VERTICAL_BLUE_STONE_BRICKS_ITEM);
//                        output.accept(MINEBENTItems.VERTICAL_BLUE_STONE_BRICK_STAIRS_ITEM);
//                        output.accept(MINEBENTItems.VERTICAL_BLUE_STONE_BRICK_SLAB_ITEM);
//                        output.accept(MINEBENTItems.VERTICAL_BLUE_STONE_BRICK_WALL_ITEM);
//                        output.accept(MINEBENTItems.BLUE_STONE_BRICK_EMBEDDED_LADDER_ITEM);
//                        output.accept(MINEBENTItems.BLUE_STONE_BRICK_TRIM_ITEM);
//                        output.accept(MINEBENTItems.BLUE_STONE_BRICK_FROG_ITEM);
//                        output.accept(MINEBENTItems.BLUE_STONE_BRICK_IGUANA_LEFT_ITEM);
//                        output.accept(MINEBENTItems.BLUE_STONE_BRICK_IGUANA_RIGHT_ITEM);
//                        output.accept(MINEBENTItems.BLUE_STONE_BRICK_LOTUS_ITEM);
//                        output.accept(MINEBENTItems.BLUE_STONE_BRICK_NAK_LEFT_ITEM);
//                        output.accept(MINEBENTItems.BLUE_STONE_BRICK_NAK_RIGHT_ITEM);
//                        output.accept(MINEBENTItems.BLUE_STONE_BRICK_SALAMANDER_LEFT_ITEM);
//                        output.accept(MINEBENTItems.BLUE_STONE_BRICK_SALAMANDER_RIGHT_ITEM);
//                        output.accept(MINEBENTItems.BLUE_STONE_BRICK_SKAIA_ITEM);
//                        output.accept(MINEBENTItems.BLUE_STONE_BRICK_TURTLE_ITEM);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
