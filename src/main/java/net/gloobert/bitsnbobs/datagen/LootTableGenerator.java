package net.gloobert.bitsnbobs.datagen;

import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;

import net.gloobert.bitsnbobs.content.BlockInitializer;
import net.gloobert.bitsnbobs.content.ItemInitializer;
import net.gloobert.bitsnbobs.content.blocktypes.WarpedWartCropBlock;

public class LootTableGenerator extends FabricBlockLootTableProvider {
  public LootTableGenerator(FabricDataOutput dataOutput) {
    super(dataOutput);
  }
 
  @Override
  public void generate() {
    BlockStatePropertyLootCondition.Builder WARPED_WART_CROP_AGE_CHECK = BlockStatePropertyLootCondition.builder(BlockInitializer.WARPED_WART_CROP).properties(StatePredicate.Builder.create()
        .exactMatch(WarpedWartCropBlock.AGE, 3)
    );
    addDrop(BlockInitializer.WARPED_WART_CROP, cropDrops(BlockInitializer.WARPED_WART_CROP, ItemInitializer.WARPED_WART, ItemInitializer.WARPED_WART, WARPED_WART_CROP_AGE_CHECK));
    addDrop(BlockInitializer.AMETHYST_GILDED_DEEPSLATE);
    addDrop(BlockInitializer.CHISELED_RED_NETHER_BRICKS);
    addDrop(BlockInitializer.COPPER_GILDED_DEEPSLATE);
    addDrop(BlockInitializer.DIAMOND_GILDED_DEEPSLATE);
    addDrop(BlockInitializer.EMERALD_GILDED_DEEPSLATE);
    addDrop(BlockInitializer.GILDED_DEEPSLATE);
    addDrop(BlockInitializer.IRON_GILDED_DEEPSLATE);
    addDrop(BlockInitializer.LAPIS_GILDED_DEEPSLATE);
    addDrop(BlockInitializer.NETHERITE_GILDED_DEEPSLATE);
    addDrop(BlockInitializer.QUARTZ_GILDED_DEEPSLATE);
    addDrop(BlockInitializer.REDSTONE_GILDED_DEEPSLATE);
    addDrop(BlockInitializer.AMETHYST_PILLAR);
    addDrop(BlockInitializer.BLUE_NETHER_BRICKS);
    addDrop(BlockInitializer.BLUE_NETHER_BRICK_SLAB, slabDrops(BlockInitializer.BLUE_NETHER_BRICK_SLAB));
    addDrop(BlockInitializer.BLUE_NETHER_BRICK_STAIRS);
    addDrop(BlockInitializer.BLUE_NETHER_BRICK_WALL);
    addDrop(BlockInitializer.CHISELED_BLUE_NETHER_BRICKS);
    addDrop(BlockInitializer.CHISELED_POLISHED_TILES);
    addDrop(BlockInitializer.CUT_AMETHYST_BLOCK);
    addDrop(BlockInitializer.CUT_AMETHYST_TILES);
    addDrop(BlockInitializer.POLISHED_AMETHYST_BLOCK);
    addDrop(BlockInitializer.POLISHED_AMETHYST_BRICKS);
    addDrop(BlockInitializer.POLISHED_CUT_AMETHYST_BLOCK);
    addDrop(BlockInitializer.POLISHED_TILES);
    addDrop(BlockInitializer.POLISHED_TILE_SLAB, slabDrops(BlockInitializer.POLISHED_TILE_SLAB));
    addDrop(BlockInitializer.POLISHED_TILE_STAIRS);
    addDrop(BlockInitializer.POLISHED_TILE_WALL);
    addDrop(BlockInitializer.SANDED_COPPER_BLOCK);
    addDrop(BlockInitializer.SANDED_EXPOSED_COPPER_BLOCK);
    addDrop(BlockInitializer.SANDED_WEATHERED_COPPER_BLOCK);
    addDrop(BlockInitializer.SANDED_OXIDIZED_COPPER_BLOCK);
    addDrop(BlockInitializer.WAXED_SANDED_COPPER_BLOCK);
    addDrop(BlockInitializer.WAXED_SANDED_EXPOSED_COPPER_BLOCK);
    addDrop(BlockInitializer.WAXED_SANDED_OXIDIZED_COPPER_BLOCK);
    addDrop(BlockInitializer.WAXED_SANDED_WEATHERED_COPPER_BLOCK);
    addDrop(BlockInitializer.WOVEN_CARPET_BLACK);
    addDrop(BlockInitializer.WOVEN_CARPET_BLUE);
    addDrop(BlockInitializer.WOVEN_CARPET_BROWN);
    addDrop(BlockInitializer.WOVEN_CARPET_CYAN);
    addDrop(BlockInitializer.WOVEN_CARPET_GRAY);
    addDrop(BlockInitializer.WOVEN_CARPET_GREEN);
    addDrop(BlockInitializer.WOVEN_CARPET_LIGHT_BLUE);
    addDrop(BlockInitializer.WOVEN_CARPET_LIGHT_GRAY);
    addDrop(BlockInitializer.WOVEN_CARPET_LIME);
    addDrop(BlockInitializer.WOVEN_CARPET_MAGENTA);
    addDrop(BlockInitializer.WOVEN_CARPET_ORANGE);
    addDrop(BlockInitializer.WOVEN_CARPET_PINK);
    addDrop(BlockInitializer.WOVEN_CARPET_PURPLE);
    addDrop(BlockInitializer.WOVEN_CARPET_RED);
    addDrop(BlockInitializer.WOVEN_CARPET_WHITE);
    addDrop(BlockInitializer.WOVEN_CARPET_YELLOW);
    addDrop(BlockInitializer.WOVEN_WOOL_BLACK);
    addDrop(BlockInitializer.WOVEN_WOOL_BLUE);
    addDrop(BlockInitializer.WOVEN_WOOL_BROWN);
    addDrop(BlockInitializer.WOVEN_WOOL_CYAN);
    addDrop(BlockInitializer.WOVEN_WOOL_GRAY);
    addDrop(BlockInitializer.WOVEN_WOOL_GREEN);
    addDrop(BlockInitializer.WOVEN_WOOL_LIGHT_BLUE);
    addDrop(BlockInitializer.WOVEN_WOOL_LIGHT_GRAY);
    addDrop(BlockInitializer.WOVEN_WOOL_LIME);
    addDrop(BlockInitializer.WOVEN_WOOL_MAGENTA);
    addDrop(BlockInitializer.WOVEN_WOOL_ORANGE);
    addDrop(BlockInitializer.WOVEN_WOOL_PINK);
    addDrop(BlockInitializer.WOVEN_WOOL_PURPLE);
    addDrop(BlockInitializer.WOVEN_WOOL_RED);
    addDrop(BlockInitializer.WOVEN_WOOL_WHITE);
    addDrop(BlockInitializer.WOVEN_WOOL_YELLOW);
    addDrop(BlockInitializer.AMETHYST_GILDED_QUARTZ);
    addDrop(BlockInitializer.COPPER_GILDED_QUARTZ);
    addDrop(BlockInitializer.DIAMOND_GILDED_QUARTZ);
    addDrop(BlockInitializer.EMERALD_GILDED_QUARTZ);
    addDrop(BlockInitializer.GILDED_QUARTZ);
    addDrop(BlockInitializer.IRON_GILDED_QUARTZ);
    addDrop(BlockInitializer.LAPIS_GILDED_QUARTZ);
    addDrop(BlockInitializer.NETHERITE_GILDED_QUARTZ);
    addDrop(BlockInitializer.QUARTZ_GILDED_QUARTZ);
    addDrop(BlockInitializer.REDSTONE_GILDED_QUARTZ);
    addDrop(BlockInitializer.SINGLE_ROSE);
    addPottedPlantDrops(BlockInitializer.POTTED_ROSE);
    addDrop(BlockInitializer.PALE_ROSE);
    addPottedPlantDrops(BlockInitializer.POTTED_PALE_ROSE);
    addDrop(BlockInitializer.CYAN_ROSE);
    addPottedPlantDrops(BlockInitializer.POTTED_CYAN_ROSE);
    addDrop(BlockInitializer.SUNSET_ROSE);
    addPottedPlantDrops(BlockInitializer.POTTED_SUNSET_ROSE);
    addDrop(BlockInitializer.DARKENED_ROSE);
    addPottedPlantDrops(BlockInitializer.POTTED_DARKENED_ROSE);
    addDrop(BlockInitializer.LAVENDER_ROSE);
    addPottedPlantDrops(BlockInitializer.POTTED_LAVENDER_ROSE);
  }
}

