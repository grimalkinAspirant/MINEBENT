package com.grimalkinAspirant.minebent.datagen;

import com.mraof.minestuck.util.MSSoundEvents;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.phys.Vec3;

import java.util.function.Supplier;

public interface BENTMagicEffect {

    enum BENTRangedType
    {
        AHAB_CROSS(() -> ParticleTypes.SONIC_BOOM, false, false);

        private final Supplier<ParticleOptions> particle;
        private final boolean explosiveFinish;
        private final boolean extraParticles;

        BENTRangedType(Supplier<ParticleOptions> particle, boolean explosiveFinish, boolean extraParticles)
        {
            this.particle = particle;
            this.explosiveFinish = explosiveFinish;
            this.extraParticles = extraParticles;
        }

        public int toInt()
        {
            return ordinal();
        }

        public static BENTRangedType fromInt(int i)
        {
            if(i >= 0 && i < values().length)
                return values()[i];
            else return AHAB_CROSS;
        }

    }


    static void rangedParticleEffect(BENTRangedType type, ClientLevel level, Vec3 pos, Vec3 lookVector, int length, boolean collides)
    {
        rangedParticleEffect(type.particle.get(), type.explosiveFinish, type.extraParticles, level, pos, lookVector, length, collides);
    }

    static void rangedParticleEffect(ParticleOptions particle, boolean explosiveFinish, boolean extraParticles, ClientLevel level, Vec3 pos, Vec3 lookVector, int length, boolean collides)
    {
        for(int step = 0; step <= length; step++)
        {
            rangedPathParticles(particle, extraParticles, level, pos.add(lookVector.scale(step / 2D)), step);

            if(collides && step == length)
            {
                rangedCollisionEffect(particle, explosiveFinish, level, pos.add(lookVector.scale((step - 1) / 2D)));
            }
        }
    }

    private static void rangedPathParticles(ParticleOptions particle, boolean extraParticles, ClientLevel level, Vec3 vecPos, int i)
    {
        if(i >= 5)
        {
            float offsetX = (level.random.nextFloat() - .5F) / 4;
            float offsetY = (level.random.nextFloat() - .5F) / 4;
            float offsetZ = (level.random.nextFloat() - .5F) / 4;
            level.addParticle(particle, true, vecPos.x + offsetX, vecPos.y + offsetY, vecPos.z + offsetZ, 0.0D, 0.0D, 0.0D);

            if(extraParticles)
            {
                for(float a = 0; a < 4; a++)
                {
                    float extraOffsetX = (level.random.nextFloat() - .5F) / 5;
                    float extraOffsetY = (level.random.nextFloat() - .5F) / 5;
                    float extraOffsetZ = (level.random.nextFloat() - .5F) / 5;
                    level.addParticle(particle, true, vecPos.x + extraOffsetX, vecPos.y + extraOffsetY, vecPos.z + extraOffsetZ, 0.0D, 0.0D, 0.0D);
                }
            }
        }
    }

    private static void rangedCollisionEffect(ParticleOptions particle, boolean explosiveFinish, ClientLevel level, Vec3 vecPos)
    {
        int particles = 25 + level.random.nextInt(10);

        if(explosiveFinish)
        {
            level.playLocalSound(vecPos.x, vecPos.y, vecPos.z, MSSoundEvents.ITEM_MAGIC_HIT.get(), SoundSource.BLOCKS, 1.2F, 0.6F, false);

            level.addParticle(ParticleTypes.FLASH, vecPos.x, vecPos.y, vecPos.z, 0.0D, 0.0D, 0.0D);
            for(int a = 0; a < particles; a++)
                level.addParticle(particle, true, vecPos.x, vecPos.y, vecPos.z, level.random.nextGaussian() * 0.12D, level.random.nextGaussian() * 0.12D, level.random.nextGaussian() * 0.12D);
        } else
        {
            for(int a = 0; a < particles; a++)
                level.addParticle(ParticleTypes.CRIT, true, vecPos.x, vecPos.y, vecPos.z, level.random.nextGaussian(), level.random.nextGaussian(), level.random.nextGaussian());
        }
    }

    private static void extraParticles(ParticleOptions particle, ClientLevel level, Vec3 vecPos)
    {
        for(float a = 0; a < 4; a++)
            level.addParticle(particle, true, vecPos.x, vecPos.y + randomVariation(level), vecPos.z, 0.0D, 0.0D, 0.0D);

    }

    private static float randomVariation(ClientLevel level)
    {
        return level.random.nextFloat() - .5F * 8;
    }

}
