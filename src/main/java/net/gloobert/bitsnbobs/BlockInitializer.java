package net.gloobert.bitsnbobs;

import net.minecraft.block.CropBlock;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;

public class BlockInitializer {

    public static final Block BLUE_NETHER_BRICKS = register("blue_nether_bricks", new Block(Block.Settings.create().strength(4.0f)), true);
    public static final Block POLISHED_TILES = register("polished_tiles", new Block(Block.Settings.create().strength(4.0f)), true);
    public static final Block PURIFIED_CORRUPTION = register("purified_corruption", new Block(Block.Settings.create().strength(4.0f)), true);
    public static final Block REFINED_CORRUPTION = register("refined_corruption", new Block(Block.Settings.create().strength(4.0f)), true);

    private static <T extends Block> T register(String path, T block, boolean registerItem) {
        Registry.register(Registries.BLOCK, Identifier.of("bitsnbobs", path), block);
        // Make it easy to distinctly separate Item and Block forms of something if preferred
        if (registerItem) {
        Registry.register(Registries.ITEM, Identifier.of("bitsnbobs", path), new BlockItem(block, new Item.Settings()));
        }
        return block;
    }
 
    public static void initialize() {
    }

}
