package com.grimalkinAspirant.minebent.items;

import com.grimalkinAspirant.minebent.MINEBENT;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
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
                        output.accept(MINEBENTItems.CHITIN);
                        output.accept(MINEBENTItems.CHITIN_HELMET);
                        output.accept(MINEBENTItems.CHITIN_CHESTPLATE);
                        output.accept(MINEBENTItems.CHITIN_LEGGINGS);
                        output.accept(MINEBENTItems.CHITIN_BOOTS);
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
                        output.accept(MINEBENTItems.AHABS_CROSSHAIRS);
                        output.accept(MINEBENTItems.AHABS_CROSSHAIRS);
                        output.accept(MINEBENTItems.AHABS_CROSSHAIRS);
                        output.accept(MINEBENTItems.AHABS_CROSSHAIRS);
                        output.accept(MINEBENTItems.AHABS_CROSSHAIRS);

                        output.accept(MINEBENTItems.TROLLSTONE_ITEM);
                        output.accept(MINEBENTItems.TROLLSTONE_STAIRS_ITEM);
                        output.accept(MINEBENTItems.TROLLSTONE_SLAB_ITEM);
                        output.accept(MINEBENTItems.TROLLSTONE_BUTTON_ITEM);
                        output.accept(MINEBENTItems.TROLLSTONE_PRESSURE_PLATE_ITEM);
                        output.accept(MINEBENTItems.COBBLED_TROLLSTONE_ITEM);
                        output.accept(MINEBENTItems.COBBLED_TROLLSTONE_STAIRS_ITEM);
                        output.accept(MINEBENTItems.COBBLED_TROLLSTONE_SLAB_ITEM);
                        output.accept(MINEBENTItems.COBBLED_TROLLSTONE_WALL_ITEM);
                        output.accept(MINEBENTItems.TROLLSTONE_BRICKS_ITEM);
                        output.accept(MINEBENTItems.TROLLSTONE_BRICK_STAIRS_ITEM);
                        output.accept(MINEBENTItems.TROLLSTONE_BRICK_SLAB_ITEM);
                        output.accept(MINEBENTItems.TROLLSTONE_BRICK_WALL_ITEM);
                        output.accept(MINEBENTItems.CRACKED_TROLLSTONE_BRICKS_ITEM);
                        output.accept(MINEBENTItems.CHISELED_TROLLSTONE_BRICKS_ITEM);
                        output.accept(MINEBENTItems.MOSSY_TROLLSTONE_BRICKS_ITEM);
                        output.accept(MINEBENTItems.MOSSY_COBBLED_TROLLSTONE_ITEM);
                        output.accept(MINEBENTItems.BROODSTONE_ITEM);
                        output.accept(MINEBENTItems.BROODSTONE_BRICKS_ITEM);

                        output.accept(MINEBENTItems.TROLLSTONE_COAL_ORE_ITEM);
                        output.accept(MINEBENTItems.TROLLSTONE_COPPER_ORE_ITEM);
                        output.accept(MINEBENTItems.TROLLSTONE_IRON_ORE_ITEM);
                        output.accept(MINEBENTItems.TROLLSTONE_REDSTONE_ORE_ITEM);
                        output.accept(MINEBENTItems.TROLLSTONE_GOLD_ORE_ITEM);
                        output.accept(MINEBENTItems.TROLLSTONE_DIAMOND_ORE_ITEM);
                        output.accept(MINEBENTItems.TROLLSTONE_QUARTZ_ORE_ITEM);
                        output.accept(MINEBENTItems.TROLLSTONE_CRUXITE_ORE_ITEM);
                        output.accept(MINEBENTItems.TROLLSTONE_URANIUM_ORE_ITEM);
                        output.accept(MINEBENTItems.TROLLSTONE_RUBY_ORE_ITEM);
                        output.accept(MINEBENTItems.TROLLSLATE_COAL_ORE_ITEM);
                        output.accept(MINEBENTItems.TROLLSLATE_COPPER_ORE_ITEM);
                        output.accept(MINEBENTItems.TROLLSLATE_IRON_ORE_ITEM);
                        output.accept(MINEBENTItems.TROLLSLATE_REDSTONE_ORE_ITEM);
                        output.accept(MINEBENTItems.TROLLSLATE_GOLD_ORE_ITEM);
                        output.accept(MINEBENTItems.TROLLSLATE_DIAMOND_ORE_ITEM);
                        output.accept(MINEBENTItems.TROLLSLATE_QUARTZ_ORE_ITEM);
                        output.accept(MINEBENTItems.TROLLSLATE_CRUXITE_ORE_ITEM);
                        output.accept(MINEBENTItems.TROLLSLATE_URANIUM_ORE_ITEM);
                        output.accept(MINEBENTItems.TROLLSLATE_RUBY_ORE_ITEM);

                        output.accept(MINEBENTItems.RUBY);
                        output.accept(MINEBENTItems.RUBY_BLOCK_ITEM);
                        output.accept(MINEBENTItems.ROCKET_SHOES);
                        output.accept(MINEBENTItems.ROCKET_PACK);
                        output.accept(MINEBENTItems.ROCKET_WINGPACK);

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
