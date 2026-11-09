package com.grimalkinAspirant.minebent.items;

import com.grimalkinAspirant.minebent.MINEBENT;
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
                    .icon(() -> new ItemStack(MINEBENTItems.CHITIN.get()))
                    .title(Component.translatable("MINEBENT"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(MINEBENTItems.CHITIN);
                        output.accept(MINEBENTItems.TROLLSTONE_ITEM);
                        output.accept(MINEBENTItems.COBBLED_TROLLSTONE_ITEM);
                        output.accept(MINEBENTItems.TROLLSTONE_BRICKS_ITEM);
                        output.accept(MINEBENTItems.CRACKED_TROLLSTONE_BRICKS_ITEM);
                        output.accept(MINEBENTItems.CHISELED_TROLLSTONE_BRICKS_ITEM);
                        output.accept(MINEBENTItems.MOSSY_TROLLSTONE_BRICKS_ITEM);
                        output.accept(MINEBENTItems.MOSSY_COBBLED_TROLLSTONE_ITEM);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
