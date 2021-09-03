package org.neocities.beep67site.endupdate.util;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.neocities.beep67site.endupdate.Endupdate;
import org.neocities.beep67site.endupdate.core.BlockInit;

@Mod.EventBusSubscriber(modid = Endupdate.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

        @SubscribeEvent
        public static void clientSetup(FMLClientSetupEvent event) {

            RenderTypeLookup.setRenderLayer(BlockInit.ENDER_FIRE.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(BlockInit.ENDER_LANTERN.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(BlockInit.ENDER_CAMPFIRE.get(), RenderType.cutout());

        }

}
