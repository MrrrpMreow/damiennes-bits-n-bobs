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
  }
}

