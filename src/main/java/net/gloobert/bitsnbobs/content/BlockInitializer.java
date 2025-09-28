package net.gloobert.bitsnbobs.content;

import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.gloobert.bitsnbobs.content.blocktypes.WarpedWartCropBlock;

public class BlockInitializer {

    // Nether Bricks
    public static final Block BLUE_NETHER_BRICKS = register("blue_nether_bricks", new Block(FabricBlockSettings.copy(Blocks.NETHER_BRICKS)), true);
    public static final Block CHISELED_BLUE_NETHER_BRICKS = register("chiseled_blue_nether_bricks", new Block(Block.Settings.copy(BLUE_NETHER_BRICKS)), true);
    public static final Block CHISELED_RED_NETHER_BRICKS = register("chiseled_red_nether_bricks", new Block(Block.Settings.copy(BLUE_NETHER_BRICKS)), true);
    public static final Block BLUE_NETHER_BRICK_SLAB = register("blue_nether_brick_slab", new SlabBlock(Block.Settings.copy(BLUE_NETHER_BRICKS)), true);
    public static final Block BLUE_NETHER_BRICK_STAIRS = register("blue_nether_brick_stairs", new StairsBlock(BLUE_NETHER_BRICKS.getDefaultState(), Block.Settings.copy(BLUE_NETHER_BRICKS)), true);
    public static final Block BLUE_NETHER_BRICK_WALL = register("blue_nether_brick_wall", new WallBlock(Block.Settings.copy(BLUE_NETHER_BRICKS)), true);
    // Polished Tiles
    public static final Block POLISHED_TILES = register("polished_tiles", new Block(FabricBlockSettings.copy(Blocks.CALCITE)), true);
    public static final Block CHISELED_POLISHED_TILES = register("chiseled_polished_tiles", new Block(Block.Settings.copy(POLISHED_TILES)), true);
    public static final Block POLISHED_TILE_STAIRS = register("polished_tile_stairs", new StairsBlock(POLISHED_TILES.getDefaultState(), Block.Settings.copy(POLISHED_TILES)), true);
    public static final Block POLISHED_TILE_SLAB = register("polished_tile_slab", new SlabBlock(Block.Settings.copy(POLISHED_TILES)), true);
    public static final Block POLISHED_TILE_WALL = register("polished_tile_wall", new WallBlock(Block.Settings.copy(POLISHED_TILES)), true);
    // Corruption
    public static final Block PURIFIED_CORRUPTION = register("purified_corruption", new Block(Block.Settings.create().strength(4.0f)), true);
    public static final Block REFINED_CORRUPTION = register("refined_corruption", new Block(Block.Settings.create().strength(4.0f)), true);
    // Woven Wool
    public static final Block WOVEN_WOOL_WHITE = register("woven_wool_white", new Block(FabricBlockSettings.copy(Blocks.WHITE_WOOL)), true);
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
    // Woven Carpets
    public static final Block WOVEN_CARPET_WHITE = register("woven_carpet_white", new CarpetBlock(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_CARPET_BLACK = register("woven_carpet_black", new CarpetBlock(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_CARPET_BLUE = register("woven_carpet_blue", new CarpetBlock(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_CARPET_BROWN = register("woven_carpet_brown", new CarpetBlock(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_CARPET_CYAN = register("woven_carpet_cyan", new CarpetBlock(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_CARPET_GRAY = register("woven_carpet_gray", new CarpetBlock(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_CARPET_GREEN = register("woven_carpet_green", new CarpetBlock(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_CARPET_LIGHT_BLUE = register("woven_carpet_light_blue", new CarpetBlock(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_CARPET_LIGHT_GRAY = register("woven_carpet_light_gray", new CarpetBlock(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_CARPET_LIME = register("woven_carpet_lime", new CarpetBlock(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_CARPET_MAGENTA = register("woven_carpet_magenta", new CarpetBlock(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_CARPET_ORANGE = register("woven_carpet_orange", new CarpetBlock(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_CARPET_PINK = register("woven_carpet_pink", new CarpetBlock(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_CARPET_PURPLE = register("woven_carpet_purple", new CarpetBlock(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_CARPET_RED = register("woven_carpet_red", new CarpetBlock(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    public static final Block WOVEN_CARPET_YELLOW = register("woven_carpet_yellow", new CarpetBlock(Block.Settings.copy(WOVEN_WOOL_WHITE)), true);
    
    public static final Block GILDED_DEEPSLATE = register("gilded_deepslate", new Block(FabricBlockSettings.copy(Blocks.POLISHED_DEEPSLATE)), true);
    public static final Block COPPER_GILDED_DEEPSLATE = register("copper_gilded_deepslate", new Block(FabricBlockSettings.copy(Blocks.POLISHED_DEEPSLATE)), true);
    public static final Block AMETHYST_GILDED_DEEPSLATE = register("amethyst_gilded_deepslate", new Block(FabricBlockSettings.copy(Blocks.POLISHED_DEEPSLATE)), true);
    public static final Block NETHERITE_GILDED_DEEPSLATE = register("netherite_gilded_deepslate", new Block(FabricBlockSettings.copy(Blocks.POLISHED_DEEPSLATE)), true);
    public static final Block EMERALD_GILDED_DEEPSLATE = register("emerald_gilded_deepslate", new Block(FabricBlockSettings.copy(Blocks.POLISHED_DEEPSLATE)), true);
    public static final Block REDSTONE_GILDED_DEEPSLATE = register("redstone_gilded_deepslate", new Block(FabricBlockSettings.copy(Blocks.POLISHED_DEEPSLATE)), true);
    public static final Block QUARTZ_GILDED_DEEPSLATE = register("quartz_gilded_deepslate", new Block(FabricBlockSettings.copy(Blocks.POLISHED_DEEPSLATE)), true);
    public static final Block LAPIS_GILDED_DEEPSLATE = register("lapis_gilded_deepslate", new Block(FabricBlockSettings.copy(Blocks.POLISHED_DEEPSLATE)), true);
    public static final Block DIAMOND_GILDED_DEEPSLATE = register("diamond_gilded_deepslate", new Block(FabricBlockSettings.copy(Blocks.POLISHED_DEEPSLATE)), true);
    public static final Block IRON_GILDED_DEEPSLATE = register("iron_gilded_deepslate", new Block(FabricBlockSettings.copy(Blocks.POLISHED_DEEPSLATE)), true);

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
    
    public static void registerFuel() {
        // Wool
        FuelRegistry.INSTANCE.add(WOVEN_WOOL_BLACK, 100);
        FuelRegistry.INSTANCE.add(WOVEN_WOOL_BLUE, 100);
        FuelRegistry.INSTANCE.add(WOVEN_WOOL_BROWN, 100);
        FuelRegistry.INSTANCE.add(WOVEN_WOOL_CYAN, 100);
        FuelRegistry.INSTANCE.add(WOVEN_WOOL_GRAY, 100);
        FuelRegistry.INSTANCE.add(WOVEN_WOOL_GREEN, 100);
        FuelRegistry.INSTANCE.add(WOVEN_WOOL_LIGHT_BLUE, 100);
        FuelRegistry.INSTANCE.add(WOVEN_WOOL_LIGHT_GRAY, 100);
        FuelRegistry.INSTANCE.add(WOVEN_WOOL_LIME, 100);
        FuelRegistry.INSTANCE.add(WOVEN_WOOL_MAGENTA, 100);
        FuelRegistry.INSTANCE.add(WOVEN_WOOL_ORANGE, 100);
        FuelRegistry.INSTANCE.add(WOVEN_WOOL_PINK, 100);
        FuelRegistry.INSTANCE.add(WOVEN_WOOL_PURPLE, 100);
        FuelRegistry.INSTANCE.add(WOVEN_WOOL_RED, 100);
        FuelRegistry.INSTANCE.add(WOVEN_WOOL_WHITE, 100);
        FuelRegistry.INSTANCE.add(WOVEN_WOOL_YELLOW, 100);
        // Carpets
        FuelRegistry.INSTANCE.add(WOVEN_CARPET_BLACK, 67);
        FuelRegistry.INSTANCE.add(WOVEN_CARPET_BLUE, 67);
        FuelRegistry.INSTANCE.add(WOVEN_CARPET_BROWN, 67);
        FuelRegistry.INSTANCE.add(WOVEN_CARPET_CYAN, 67);
        FuelRegistry.INSTANCE.add(WOVEN_CARPET_GRAY, 67);
        FuelRegistry.INSTANCE.add(WOVEN_CARPET_GREEN, 67);
        FuelRegistry.INSTANCE.add(WOVEN_CARPET_LIGHT_BLUE, 67);
        FuelRegistry.INSTANCE.add(WOVEN_CARPET_LIGHT_GRAY, 67);
        FuelRegistry.INSTANCE.add(WOVEN_CARPET_LIME, 67);
        FuelRegistry.INSTANCE.add(WOVEN_CARPET_MAGENTA, 67);
        FuelRegistry.INSTANCE.add(WOVEN_CARPET_ORANGE, 67);
        FuelRegistry.INSTANCE.add(WOVEN_CARPET_PINK, 67);
        FuelRegistry.INSTANCE.add(WOVEN_CARPET_PURPLE, 67);
        FuelRegistry.INSTANCE.add(WOVEN_CARPET_RED, 67);
        FuelRegistry.INSTANCE.add(WOVEN_CARPET_WHITE, 67);
        FuelRegistry.INSTANCE.add(WOVEN_CARPET_YELLOW, 67);
    }

    public static void initialize() {
        registerFuel();
    }

}
