package org.neocities.beep67site.endupdate;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.neocities.beep67site.endupdate.core.BlockInit;
import org.neocities.beep67site.endupdate.core.ItemInit;

@Mod(Endupdate.MOD_ID)
public class Endupdate {
    public static final String MOD_ID = "endupdate";
    public static final ItemGroup ENDUPDATE = new ItemGroup(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.CHORUS_PLANKS.get());

        }
    };

    public Endupdate() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.register(this);
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
    }
}


