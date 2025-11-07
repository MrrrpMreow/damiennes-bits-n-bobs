package net.gloobert.bitsnbobs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.BlockStateModelGenerator.TintType;
import net.gloobert.bitsnbobs.content.BlockInitializer;
import net.gloobert.bitsnbobs.content.ItemInitializer;

public class BlockGenerator extends FabricModelProvider {
    public BlockGenerator(FabricDataOutput output) {
        super(output);
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
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ItemInitializer.ROSE_BOUQUET, Models.HANDHELD);
        itemModelGenerator.register(ItemInitializer.PALE_ROSE_BOUQUET, Models.HANDHELD);
        itemModelGenerator.register(ItemInitializer.CYAN_ROSE_BOUQUET, Models.HANDHELD);
    }
}
