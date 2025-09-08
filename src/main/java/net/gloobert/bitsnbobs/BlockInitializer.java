package net.gloobert.bitsnbobs;

import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.gloobert.bitsnbobs.blocks.WarpedWartCrop;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;

public class BlockInitializer {
    public static final CropBlock WARPED_WART = register("warped_wart", new CustomCropBlock(AbstractBlock.Settings.create().nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP)), false); 
    private static <T extends Block> T register(String path, T block, boolean registerItem) {
        Registry.register(Registries.BLOCK, Identifier.of("bitsnbobs", path), block);
        // Make it easy to distinctly separate Item and Block forms of something if preferred
        if (registerItem) {
        Registry.register(Registries.ITEM, Identifier.of("bitsnbobs", path), new BlockItem(block, new Item.Settings()));
        }
        return block;
    }
 
    public static void initialize() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), WARPED_WART);
    }

}
