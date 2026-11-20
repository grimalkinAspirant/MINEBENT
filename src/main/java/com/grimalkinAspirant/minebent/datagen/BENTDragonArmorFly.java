package com.grimalkinAspirant.minebent.datagen;

import com.google.common.base.Suppliers;
import com.mraof.minestuck.item.armor.MSArmorItem;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.level.gameevent.GameEvent;
import net.neoforged.neoforge.common.NeoForgeMod;

import java.util.function.Supplier;

public class BENTDragonArmorFly extends MSArmorItem {
    private final Supplier<ItemAttributeModifiers> defaultModifiers;
    public BENTDragonArmorFly(Holder<ArmorMaterial> material, Type type, Properties properties) {
        super(material, type, properties);
        this.defaultModifiers = Suppliers.memoize(
                () -> {
                    int i = material.value().getDefense(type);
                    float f = material.value().toughness();
                    ItemAttributeModifiers.Builder itemattributemodifiers$builder = ItemAttributeModifiers.builder();
                    EquipmentSlotGroup equipmentSlotGroup = EquipmentSlotGroup.bySlot(type.getSlot());
                    ResourceLocation resourceLocation = ResourceLocation.withDefaultNamespace("armor." + type.getName());
                    itemattributemodifiers$builder.add(Attributes.ARMOR, new AttributeModifier(resourceLocation, i, AttributeModifier.Operation.ADD_VALUE), equipmentSlotGroup);
                    itemattributemodifiers$builder.add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(resourceLocation, f, AttributeModifier.Operation.ADD_VALUE), equipmentSlotGroup);
                    float f1 = material.value().knockbackResistance();
                    if (f1 > 0.0F)
                        itemattributemodifiers$builder.add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(resourceLocation, f1, AttributeModifier.Operation.ADD_VALUE), equipmentSlotGroup);
                    itemattributemodifiers$builder.add(NeoForgeMod.CREATIVE_FLIGHT, new AttributeModifier(resourceLocation, 1, AttributeModifier.Operation.ADD_VALUE), equipmentSlotGroup);
                    return itemattributemodifiers$builder.build();
                }
        );
    }
    @Override
    public ItemAttributeModifiers getDefaultAttributeModifiers() {
        return this.defaultModifiers.get();
    }
    public boolean canElytraFly(ItemStack stack, LivingEntity entity) {
        return true;
    }
    public boolean elytraFlightTick(ItemStack stack, LivingEntity entity, int flightTicks) {
        if (!entity.level().isClientSide) {
            int nextFlightTick = flightTicks + 1;
            if (nextFlightTick % 10 == 0) {
                entity.gameEvent(GameEvent.ELYTRA_GLIDE);
            }
        }
        return true;
    }
}