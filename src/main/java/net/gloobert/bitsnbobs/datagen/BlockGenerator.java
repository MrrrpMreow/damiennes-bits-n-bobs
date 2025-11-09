package net.gloobert.bitsnbobs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TextureMap;
import net.minecraft.util.Identifier;
import net.minecraft.data.client.BlockStateModelGenerator.TintType;
import net.gloobert.bitsnbobs.content.BlockInitializer;
import net.gloobert.bitsnbobs.content.ItemInitializer;

public class BlockGenerator extends FabricModelProvider {
    public BlockGenerator(FabricDataOutput output) {
        super(output);
    }

    private void generateStairsModels(BlockStateModelGenerator blockStateModelGenerator, TextureMap textures, Block stairsblock) {
        final Identifier stairsModelId = Models.STAIRS.upload(stairsblock, textures, blockStateModelGenerator.modelCollector);
        final Identifier innerStairsModelId = Models.INNER_STAIRS.upload(stairsblock, textures, blockStateModelGenerator.modelCollector);
        final Identifier outerStairsModelId = Models.OUTER_STAIRS.upload(stairsblock, textures, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(
            BlockStateModelGenerator.createStairsBlockState(stairsblock,
                innerStairsModelId,
                stairsModelId,
                outerStairsModelId));
        blockStateModelGenerator.registerParentedItemModel(stairsblock, stairsModelId);
    }

    private void generateSlabModels(BlockStateModelGenerator blockStateModelGenerator, TextureMap textures, Block slabblock, Identifier fullBlockModelID) {
        final Identifier slabBottomModelId = Models.SLAB.upload(slabblock, textures, blockStateModelGenerator.modelCollector);
        final Identifier slabTopModelId = Models.SLAB_TOP.upload(slabblock, textures, blockStateModelGenerator.modelCollector);
        // final Identifier slabWholeModelId = Models.CUBE_ALL.upload(slabblock, textures, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(
            BlockStateModelGenerator.createSlabBlockState(slabblock,
                slabBottomModelId,
                slabTopModelId,
                fullBlockModelID)
        );
        blockStateModelGenerator.registerParentedItemModel(slabblock, slabBottomModelId);
    }

    private void generateWallModels(BlockStateModelGenerator blockStateModelGenerator, TextureMap textures, Block wallblock) {
        final Identifier wallSideModelId = Models.TEMPLATE_WALL_SIDE.upload(wallblock, textures, blockStateModelGenerator.modelCollector);
        final Identifier wallSideTallModelId = Models.TEMPLATE_WALL_SIDE_TALL.upload(wallblock, textures, blockStateModelGenerator.modelCollector);
        final Identifier wallPostModelId = Models.TEMPLATE_WALL_POST.upload(wallblock, textures, blockStateModelGenerator.modelCollector);
        final Identifier wallItemModelId = Models.WALL_INVENTORY.upload(wallblock, textures, blockStateModelGenerator.modelCollector);
        // final Identifier slabWholeModelId = Models.CUBE_ALL.upload(slabblock, textures, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(
            BlockStateModelGenerator.createWallBlockState(wallblock, wallPostModelId, wallSideModelId, wallSideTallModelId)
        );
        blockStateModelGenerator.registerParentedItemModel(wallblock, wallItemModelId);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerWoolAndCarpet(BlockInitializer.WOVEN_WOOL_WHITE, BlockInitializer.WOVEN_CARPET_WHITE);
        blockStateModelGenerator.registerWoolAndCarpet(BlockInitializer.WOVEN_WOOL_LIGHT_GRAY, BlockInitializer.WOVEN_CARPET_LIGHT_GRAY);
        blockStateModelGenerator.registerWoolAndCarpet(BlockInitializer.WOVEN_WOOL_GRAY, BlockInitializer.WOVEN_CARPET_GRAY);
        blockStateModelGenerator.registerWoolAndCarpet(BlockInitializer.WOVEN_WOOL_BLACK, BlockInitializer.WOVEN_CARPET_BLACK);
        blockStateModelGenerator.registerWoolAndCarpet(BlockInitializer.WOVEN_WOOL_BROWN, BlockInitializer.WOVEN_CARPET_BROWN);
        blockStateModelGenerator.registerWoolAndCarpet(BlockInitializer.WOVEN_WOOL_RED, BlockInitializer.WOVEN_CARPET_RED);
        blockStateModelGenerator.registerWoolAndCarpet(BlockInitializer.WOVEN_WOOL_ORANGE, BlockInitializer.WOVEN_CARPET_ORANGE);
        blockStateModelGenerator.registerWoolAndCarpet(BlockInitializer.WOVEN_WOOL_YELLOW, BlockInitializer.WOVEN_CARPET_YELLOW);
        blockStateModelGenerator.registerWoolAndCarpet(BlockInitializer.WOVEN_WOOL_LIME, BlockInitializer.WOVEN_CARPET_LIME);
        blockStateModelGenerator.registerWoolAndCarpet(BlockInitializer.WOVEN_WOOL_GREEN, BlockInitializer.WOVEN_CARPET_GREEN);
        blockStateModelGenerator.registerWoolAndCarpet(BlockInitializer.WOVEN_WOOL_CYAN, BlockInitializer.WOVEN_CARPET_CYAN);
        blockStateModelGenerator.registerWoolAndCarpet(BlockInitializer.WOVEN_WOOL_LIGHT_BLUE, BlockInitializer.WOVEN_CARPET_LIGHT_BLUE);
        blockStateModelGenerator.registerWoolAndCarpet(BlockInitializer.WOVEN_WOOL_BLUE, BlockInitializer.WOVEN_CARPET_BLUE);
        blockStateModelGenerator.registerWoolAndCarpet(BlockInitializer.WOVEN_WOOL_PURPLE, BlockInitializer.WOVEN_CARPET_PURPLE);
        blockStateModelGenerator.registerWoolAndCarpet(BlockInitializer.WOVEN_WOOL_MAGENTA, BlockInitializer.WOVEN_CARPET_MAGENTA);
        blockStateModelGenerator.registerWoolAndCarpet(BlockInitializer.WOVEN_WOOL_PINK, BlockInitializer.WOVEN_CARPET_PINK);

        blockStateModelGenerator.registerFlowerPotPlant(BlockInitializer.SINGLE_ROSE, BlockInitializer.POTTED_ROSE, TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(BlockInitializer.PALE_ROSE, BlockInitializer.POTTED_PALE_ROSE, TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(BlockInitializer.CYAN_ROSE, BlockInitializer.POTTED_CYAN_ROSE, TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(BlockInitializer.SUNSET_ROSE, BlockInitializer.POTTED_SUNSET_ROSE, TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(BlockInitializer.DARKENED_ROSE, BlockInitializer.POTTED_DARKENED_ROSE, TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(BlockInitializer.LAVENDER_ROSE, BlockInitializer.POTTED_LAVENDER_ROSE, TintType.NOT_TINTED);

        blockStateModelGenerator.registerSimpleCubeAll(BlockInitializer.CHISELED_MUD_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInitializer.MOSSY_MUD_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInitializer.POLISHED_MUD);

        final TextureMap mossyMudTextureMap = TextureMap.all(Identifier.of("bitsnbobs", "block/mossy_mud_bricks"));
        final TextureMap polishedMudTextureMap = TextureMap.all(Identifier.of("bitsnbobs", "block/polished_mud"));
 
        generateStairsModels(blockStateModelGenerator, mossyMudTextureMap, BlockInitializer.MOSSY_MUD_BRICK_STAIRS);
        generateSlabModels(blockStateModelGenerator, mossyMudTextureMap, BlockInitializer.MOSSY_MUD_BRICK_SLAB, Identifier.of("bitsnbobs", "block/mossy_mud_bricks"));
        generateWallModels(blockStateModelGenerator, mossyMudTextureMap, BlockInitializer.MOSSY_MUD_BRICK_WALL);

        generateStairsModels(blockStateModelGenerator, polishedMudTextureMap, BlockInitializer.POLISHED_MUD_STAIRS);
        generateSlabModels(blockStateModelGenerator, polishedMudTextureMap, BlockInitializer.POLISHED_MUD_SLAB, Identifier.of("bitsnbobs", "block/polished_mud"));
        generateWallModels(blockStateModelGenerator, polishedMudTextureMap, BlockInitializer.POLISHED_MUD_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ItemInitializer.ROSE_BOUQUET, Models.HANDHELD);
        itemModelGenerator.register(ItemInitializer.PALE_ROSE_BOUQUET, Models.HANDHELD);
        itemModelGenerator.register(ItemInitializer.CYAN_ROSE_BOUQUET, Models.HANDHELD);
        itemModelGenerator.register(ItemInitializer.SUNSET_ROSE_BOUQUET, Models.HANDHELD);
        itemModelGenerator.register(ItemInitializer.DARKENED_ROSE_BOUQUET, Models.HANDHELD);
        itemModelGenerator.register(ItemInitializer.LAVENDER_ROSE_BOUQUET, Models.HANDHELD);
    }
}
