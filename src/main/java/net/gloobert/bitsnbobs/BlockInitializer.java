package net.gloobert.bitsnbobs;

import net.minecraft.block.CropBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;

public class BlockInitializer {

    // Nether Bricks
    public static final Block BLUE_NETHER_BRICKS = register("blue_nether_bricks", new Block(Block.Settings.create()
        .strength(2.0f)
        .sounds(BlockSoundGroup.NETHER_BRICKS)
    ), true);
    public static final Block CHISELED_BLUE_NETHER_BRICKS = register("chiseled_blue_nether_bricks", new Block(Block.Settings.copy(BLUE_NETHER_BRICKS)), true);
    public static final Block CHISELED_RED_NETHER_BRICKS = register("chiseled_red_nether_bricks", new Block(Block.Settings.copy(BLUE_NETHER_BRICKS)), true);
    public static final Block BLUE_NETHER_BRICK_SLAB = register("blue_nether_brick_slab", new SlabBlock(Block.Settings.copy(BLUE_NETHER_BRICKS)), true);
    public static final Block BLUE_NETHER_BRICK_STAIRS = register("blue_nether_brick_stairs", new StairsBlock(BLUE_NETHER_BRICKS.getDefaultState(), Block.Settings.copy(BLUE_NETHER_BRICKS)), true);
    public static final Block BLUE_NETHER_BRICK_WALL = register("blue_nether_brick_wall", new WallBlock(Block.Settings.copy(BLUE_NETHER_BRICKS)), true);
    // Polished Tiles
    public static final Block POLISHED_TILES = register("polished_tiles", new Block(Block.Settings.create()
        .strength(4.0f)
        .sounds(BlockSoundGroup.CALCITE)
    ), true);
    public static final Block CHISELED_POLISHED_TILES = register("chiseled_polished_tiles", new Block(Block.Settings.copy(POLISHED_TILES)), true);
    public static final Block POLISHED_TILE_STAIRS = register("polished_tile_stairs", new StairsBlock(POLISHED_TILES.getDefaultState(), Block.Settings.copy(POLISHED_TILES)), true);
    public static final Block POLISHED_TILE_SLAB = register("polished_tile_slab", new SlabBlock(Block.Settings.copy(POLISHED_TILES)), true);
    public static final Block POLISHED_TILE_WALL = register("polished_tile_wall", new WallBlock(Block.Settings.copy(POLISHED_TILES)), true);
    // Corruption
    public static final Block PURIFIED_CORRUPTION = register("purified_corruption", new Block(Block.Settings.create().strength(4.0f)), true);
    public static final Block REFINED_CORRUPTION = register("refined_corruption", new Block(Block.Settings.create().strength(4.0f)), true);
    // Woven Wool
    public static final Block WOVEN_WOOL_WHITE = register("woven_wool_white", new Block(Block.Settings.create()
        .strength(0.8f)
        .sounds(BlockSoundGroup.WOOL)
    ), true);

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
