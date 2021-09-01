package org.neocities.beep67site.endupdate.core;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.neocities.beep67site.endupdate.Endupdate;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            Endupdate.MOD_ID);

    public static final RegistryObject<BlockItem> CHORUS_STEM = ITEMS.register("chorus_stem", () -> new BlockItem(BlockInit.CHORUS_STEM.get(),new Item.Properties().tab(Endupdate.ENDUPDATE)));
    public static final RegistryObject<BlockItem> END_TITANIUM = ITEMS.register("end_titanium", () -> new BlockItem(BlockInit.END_TITANIUM.get(),new Item.Properties().tab(Endupdate.ENDUPDATE)));
    public static final RegistryObject<Item> CHORUS_PLANKS = ITEMS.register("chorus_planks", () -> new BlockItem(BlockInit.CHORUS_PLANKS.get(),new Item.Properties().tab(Endupdate.ENDUPDATE)));
    public static final RegistryObject<Item> CHORUS_DOOR = ITEMS.register("chorus_door", () -> new BlockItem(BlockInit.CHORUS_DOOR.get(),new Item.Properties().tab(Endupdate.ENDUPDATE)));
    public static final RegistryObject<Item> STRIPPED_CHORUS_STEM = ITEMS.register("stripped_chorus_stem", () -> new BlockItem(BlockInit.STRIPPED_CHORUS_STEM.get(),new Item.Properties().tab(Endupdate.ENDUPDATE)));
    public static final RegistryObject<Item> ENDER_MAGMA = ITEMS.register("ender_magma", () -> new BlockItem(BlockInit.ENDER_MAGMA.get(), new Item.Properties().tab(Endupdate.ENDUPDATE)));
    public static final RegistryObject<Item> ENDER_LANTERN = ITEMS.register("ender_lantern", () -> new BlockItem(BlockInit.ENDER_LANTERN.get(), new Item.Properties().tab(Endupdate.ENDUPDATE)));
    public static final RegistryObject<Item> SOUL_MAGMA = ITEMS.register("soul_magma", () -> new BlockItem(BlockInit.SOUL_MAGMA.get(), new Item.Properties().tab(Endupdate.ENDUPDATE)));
}
