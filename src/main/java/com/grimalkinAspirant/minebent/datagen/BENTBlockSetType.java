package com.grimalkinAspirant.minebent.datagen;

import com.mraof.minestuck.Minestuck;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class BENTBlockSetType {
    public static final BlockSetType RED_STONE;
    public static final BlockSetType BLUE_STONE;
    static {
        RED_STONE = new BlockSetType(Minestuck.id("red_stone").toString(), true, true, true, BlockSetType.PressurePlateSensitivity.EVERYTHING, SoundType.STONE, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN, SoundEvents.IRON_TRAPDOOR_CLOSE, SoundEvents.IRON_TRAPDOOR_OPEN, SoundEvents.STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.STONE_BUTTON_CLICK_OFF, SoundEvents.STONE_BUTTON_CLICK_ON);
        BLUE_STONE = new BlockSetType(Minestuck.id("blue_stone").toString(), true, true, true, BlockSetType.PressurePlateSensitivity.EVERYTHING, SoundType.STONE, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN, SoundEvents.IRON_TRAPDOOR_CLOSE, SoundEvents.IRON_TRAPDOOR_OPEN, SoundEvents.STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.STONE_BUTTON_CLICK_OFF, SoundEvents.STONE_BUTTON_CLICK_ON);
    }
}
