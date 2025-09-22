package net.gloobert.bitsnbobs.content;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.gloobert.bitsnbobs.content.blocktypes.WarpedWartCropBlock;

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
    public static final Block WOVEN_WOOL_BLACK = register("woven_wool_black", new Block(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_WOOL_BLUE = register("woven_wool_blue", new Block(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_WOOL_BROWN = register("woven_wool_brown", new Block(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_WOOL_CYAN = register("woven_wool_cyan", new Block(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_WOOL_GRAY = register("woven_wool_gray", new Block(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_WOOL_GREEN = register("woven_wool_green", new Block(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_WOOL_LIGHT_BLUE = register("woven_wool_light_blue", new Block(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_WOOL_LIGHT_GRAY = register("woven_wool_light_gray", new Block(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_WOOL_LIME = register("woven_wool_lime", new Block(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_WOOL_MAGENTA = register("woven_wool_magenta", new Block(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_WOOL_ORANGE = register("woven_wool_orange", new Block(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_WOOL_PINK = register("woven_wool_pink", new Block(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_WOOL_PURPLE = register("woven_wool_purple", new Block(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_WOOL_RED = register("woven_wool_red", new Block(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_WOOL_YELLOW = register("woven_wool_yellow", new Block(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);

    public static final Block GILDED_DEEPSLATE = register("gilded_deepslate", new Block(Block.Settings.create()
        .strength(4.0f)
        .sounds(BlockSoundGroup.POLISHED_DEEPSLATE)
    ), true);

    public static final Block CUT_AMETHYST_BLOCK = register("cut_amethyst", new Block(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK)), true);
    public static final Block POLISHED_CUT_AMETHYST_BLOCK = register("polished_cut_amethyst", new Block(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK)), true);
    public static final Block CUT_AMETHYST_TILES = register("cut_amethyst_tiles", new Block(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK)), true);
    public static final Block POLISHED_AMETHYST_BLOCK = register("polished_amethyst", new Block(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK)), true);
    public static final Block POLISHED_AMETHYST_BRICKS = register("polished_amethyst_bricks", new Block(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK)), true);
    public static final Block AMETHYST_PILLAR = register("amethyst_pillar", new PillarBlock(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK)), true);
    public static final Block TRIMMED_AMETHYST = register("trimmed_amethyst", new Block(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK)), true);

    public static final Block WAXED_SANDED_COPPER_BLOCK = register("waxed_sanded_copper", new Block(FabricBlockSettings.copy(Blocks.WAXED_COPPER_BLOCK)), true);
    public static final Block WAXED_SANDED_EXPOSED_COPPER_BLOCK = register("waxed_sanded_exposed_copper", new Block(FabricBlockSettings.copy(Blocks.WAXED_COPPER_BLOCK)), true);
    public static final Block WAXED_SANDED_WEATHERED_COPPER_BLOCK = register("waxed_sanded_weathered_copper", new Block(FabricBlockSettings.copy(Blocks.WAXED_COPPER_BLOCK)), true);
    public static final Block WAXED_SANDED_OXIDIZED_COPPER_BLOCK = register("waxed_sanded_oxidized_copper", new Block(FabricBlockSettings.copy(Blocks.WAXED_COPPER_BLOCK)), true);
    
    public static final Block SANDED_COPPER_BLOCK = register("sanded_copper", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copy(Blocks.COPPER_BLOCK)), true);
    public static final Block SANDED_EXPOSED_COPPER_BLOCK = register("sanded_exposed_copper", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copy(Blocks.COPPER_BLOCK)), true);
    public static final Block SANDED_WEATHERED_COPPER_BLOCK = register("sanded_weathered_copper", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copy(Blocks.COPPER_BLOCK)), true);
    public static final Block SANDED_OXIDIZED_COPPER_BLOCK = register("sanded_oxidized_copper", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copy(Blocks.COPPER_BLOCK)), true);

    public static final Block WARPED_WART_CROP = register("warped_wart_crop", new WarpedWartCropBlock(FabricBlockSettings.copy(Blocks.NETHER_WART)), false);
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
