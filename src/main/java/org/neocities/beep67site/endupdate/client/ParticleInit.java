package org.neocities.beep67site.endupdate.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleType;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.neocities.beep67site.endupdate.Endupdate;

public class ParticleInit {

    public static final DeferredRegister<ParticleType<?>> PARTICLES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, Endupdate.MOD_ID);

    public static final RegistryObject<BasicParticleType> ENDER_FLAME = PARTICLES.register("ender_flame", () -> new BasicParticleType(true));

    @Mod.EventBusSubscriber(modid = Endupdate.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegisterParticleFactories {

        @SubscribeEvent(priority = EventPriority.LOWEST)
        public static void registerParticleTypes(ParticleFactoryRegisterEvent event) {
            if (ENDER_FLAME.isPresent()) {
                Minecraft.getInstance().particleEngine.register(ENDER_FLAME.get(), FlameParticle.Factory::new);
            }
        }
    }
}
