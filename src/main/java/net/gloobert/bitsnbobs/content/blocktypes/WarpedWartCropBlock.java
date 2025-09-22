package net.gloobert.bitsnbobs.content.blocktypes;

import net.minecraft.block.CropBlock;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.state.StateManager;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemConvertible;

import net.gloobert.bitsnbobs.content.ItemInitializer;

public class WarpedWartCropBlock extends CropBlock {
    public static final int MAX_AGE = 3;
    public static final IntProperty AGE = IntProperty.of("age", 0, 3);

    public WarpedWartCropBlock(Settings settings) {
        super(settings);
    }

    @Override
	protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
		return floor.isOf(Blocks.SOUL_SAND);
	}

    @Override
    protected ItemConvertible getSeedsItem() {
        return ItemInitializer.WARPED_WART;
    }

    @Override
    public IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
         return MAX_AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}
