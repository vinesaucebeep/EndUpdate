package org.neocities.beep67site.endupdate.common.properties.blocks;

import net.minecraft.block.*;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;

@SuppressWarnings("deprecation")
public class EnderFireBlock extends AbstractFireBlock {

    public EnderFireBlock(AbstractBlock.Properties properties) {
        super(properties, 3.5F);
    }

    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        return this.canSurvive(stateIn, worldIn, currentPos) ? this.defaultBlockState() : Blocks.AIR.defaultBlockState();
    }

    public boolean canSurvive(BlockState state, IWorldReader worldIn, BlockPos pos) {
        return shouldLightEnderFire(worldIn.getBlockState(pos.below()).getBlock());
    }

    public static boolean shouldLightEnderFire(Block block) {
        return block == Blocks.END_STONE;
    }

    protected boolean canBurn(BlockState state) {
        return true;
    }
}