package org.neocities.beep67site.endupdate.mixin.common.block;

import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import org.neocities.beep67site.endupdate.common.properties.blocks.EnderFireBlock;
import org.neocities.beep67site.endupdate.core.BlockInit;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractFireBlock.class)
public abstract class MixinAbstractFireBlock {

    @Inject(at = @At("HEAD"), method = "getState", cancellable = true)
    private static void addEnderFire(IBlockReader reader, BlockPos pos, CallbackInfoReturnable<BlockState> cir) {
        BlockPos blockpos = pos.below();
        BlockState blockstate = reader.getBlockState(blockpos);
        if (EnderFireBlock.shouldLightEnderFire(blockstate.getBlock())) {
            cir.cancel();
            cir.setReturnValue(BlockInit.ENDER_FIRE.get().defaultBlockState());
        }
    }
}
