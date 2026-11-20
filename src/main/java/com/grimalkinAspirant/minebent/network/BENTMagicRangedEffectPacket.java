package com.grimalkinAspirant.minebent.network;

import com.grimalkinAspirant.minebent.MINEBENT;
import com.mraof.minestuck.network.MSPayloads;
import com.grimalkinAspirant.minebent.datagen.BENTMagicEffect;
import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.network.codec.NeoForgeStreamCodecs;
import net.neoforged.neoforge.network.handling.IPayloadContext;

public record BENTMagicRangedEffectPacket(BENTMagicEffect.BENTRangedType rangedType, Vec3 pos, Vec3 lookVec, int length, boolean collides) implements BENTPacket.PlayToClient {

    public static final Type<BENTMagicRangedEffectPacket> ID = new Type<>(MINEBENT.id("magic_ranged_effect"));

    public static final StreamCodec<FriendlyByteBuf, BENTMagicRangedEffectPacket> STREAM_CODEC = StreamCodec.composite(
            NeoForgeStreamCodecs.enumCodec(BENTMagicEffect.BENTRangedType.class),
            BENTMagicRangedEffectPacket::rangedType,
            MSPayloads.VEC3_STREAM_CODEC,
            BENTMagicRangedEffectPacket::pos,
            MSPayloads.VEC3_STREAM_CODEC,
            BENTMagicRangedEffectPacket::lookVec,
            ByteBufCodecs.INT,
            BENTMagicRangedEffectPacket::length,
            ByteBufCodecs.BOOL,
            BENTMagicRangedEffectPacket::collides,
            BENTMagicRangedEffectPacket::new
    );
    @Override
    public Type<? extends CustomPacketPayload> type()
    {
        return ID;
    }

    @Override
    public void execute(IPayloadContext context)
    {
        BENTMagicEffect.rangedParticleEffect(rangedType, Minecraft.getInstance().level, pos, lookVec, length, collides);
    }
}
