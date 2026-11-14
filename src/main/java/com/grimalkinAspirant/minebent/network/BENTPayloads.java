package com.grimalkinAspirant.minebent.network;

import com.grimalkinAspirant.minebent.MINEBENT;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.world.phys.Vec3;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;

@EventBusSubscriber(modid = MINEBENT.MODID, bus = EventBusSubscriber.Bus.MOD)
public final class BENTPayloads {

    public static final StreamCodec<FriendlyByteBuf, Vec3> VEC3_STREAM_CODEC = StreamCodec.composite(
            ByteBufCodecs.DOUBLE,
            Vec3::x,
            ByteBufCodecs.DOUBLE,
            Vec3::y,
            ByteBufCodecs.DOUBLE,
            Vec3::z,
            Vec3::new
    );

    @SubscribeEvent
    private static void register(RegisterPayloadHandlersEvent event){
        PayloadRegistrar registrar = event.registrar(MINEBENT.MODID).versioned("2");

        registerPlayToClient(registrar, BENTMagicRangedEffectPacket.ID, BENTMagicRangedEffectPacket.STREAM_CODEC);
    }

    private static <T extends BENTPacket.PlayToClient> void registerPlayToClient(PayloadRegistrar registrar, CustomPacketPayload.Type<T> type, StreamCodec<? super RegistryFriendlyByteBuf, T> codec)
    {
        registrar.playToClient(type, codec, BENTPacket.PlayToClient::execute);
    }

}
