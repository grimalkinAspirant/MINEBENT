package com.grimalkinAspirant.minebent.client;

import com.grimalkinAspirant.minebent.MINEBENT;
import com.grimalkinAspirant.minebent.items.MINEBENTItems;
import com.mraof.minestuck.client.model.armor.ArmorModels;
import com.mraof.minestuck.item.armor.MSArmorItem;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.registries.DeferredItem;
import org.jetbrains.annotations.NotNull;
import com.grimalkinAspirant.minebent.client.model.armor.*;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Arrays;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
@EventBusSubscriber(value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD, modid = MINEBENT.MODID)
public class ClientProxy {

    @SubscribeEvent
    public static void init(final FMLClientSetupEvent event){

        ArmorModels.register(MINEBENTItems.ROCKET_PACK.get(), new HumanoidModel<>(RocketPack.createBodyLayer().bakeRoot()));
        ArmorModels.register(MINEBENTItems.DRAGON_PACK.get(), new HumanoidModel<>(DragonPack.createBodyLayer().bakeRoot()));
    }

    @SubscribeEvent
    private static void registerExtensions(RegisterClientExtensionsEvent event){
        for(DeferredItem<MSArmorItem> armorItem: Arrays.asList(
                MINEBENTItems.ROCKET_PACK,
                MINEBENTItems.DRAGON_PACK)
        ){
            event.registerItem(new IClientItemExtensions()
            {
                @Override
                public @NotNull HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<?> original)
                {
                    ArmorItem.Type type = armorItem.get().getType();
                    if(equipmentSlot != type.getSlot())
                        return original;
                    HumanoidModel<?> model = ArmorModels.get(armorItem.get());
                    if(model == null)
                        return original;

                    model.rightLeg.visible = type == ArmorItem.Type.LEGGINGS || type == ArmorItem.Type.BOOTS;
                    model.leftLeg.visible = type == ArmorItem.Type.LEGGINGS || type == ArmorItem.Type.BOOTS;

                    model.body.visible = type == ArmorItem.Type.CHESTPLATE;
                    model.leftArm.visible = type == ArmorItem.Type.CHESTPLATE;
                    model.rightArm.visible = type == ArmorItem.Type.CHESTPLATE;

                    model.head.visible = type == ArmorItem.Type.HELMET;
                    model.hat.visible = type == ArmorItem.Type.HELMET;


                    model.crouching = original.crouching;
                    model.riding = original.riding;
                    model.young = original.young;

                    model.rightArmPose = original.rightArmPose;
                    model.leftArmPose = original.leftArmPose;

                    return model;

                }
            }, armorItem);
        }
    }

}
