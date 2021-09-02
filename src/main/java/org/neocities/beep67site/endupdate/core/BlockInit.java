package org.neocities.beep67site.endupdate.core;


import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.neocities.beep67site.endupdate.Endupdate;
import org.neocities.beep67site.endupdate.common.properties.blocks.ChorusDoorBlock;
import org.neocities.beep67site.endupdate.common.properties.blocks.EnderFireBlock;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Endupdate.MOD_ID);

    public static final RegistryObject<Block> CHORUS_STEM = BLOCKS.register("chorus_stem", () -> new Block(AbstractBlock.Properties.copy(Blocks.CRIMSON_STEM)));
    public static final RegistryObject<Block> STRIPPED_CHORUS_STEM = BLOCKS.register("stripped_chorus_stem", () -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.STRIPPED_CRIMSON_STEM)));
    public static final RegistryObject<Block> CHORUS_PLANKS = BLOCKS.register("chorus_planks", () -> new Block(AbstractBlock.Properties.copy(Blocks.CRIMSON_PLANKS)));
    public static final RegistryObject<Block> CHORUS_DOOR = BLOCKS.register("chorus_door", () -> new ChorusDoorBlock(AbstractBlock.Properties.copy(Blocks.CRIMSON_DOOR)));
    public static final RegistryObject<Block> END_TITANIUM = BLOCKS.register("end_titanium", () -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> ENDER_FIRE = BLOCKS.register("ender_fire", () -> new EnderFireBlock(AbstractBlock.Properties.copy(Blocks.SOUL_FIRE)));
    public static final RegistryObject<Block> ENDER_LANTERN = BLOCKS.register("ender_lantern", () -> new LanternBlock(AbstractBlock.Properties.copy(Blocks.LANTERN)));
}
