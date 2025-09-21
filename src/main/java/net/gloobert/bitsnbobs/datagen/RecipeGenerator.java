package net.gloobert.bitsnbobs.datagen;

import java.util.function.Consumer;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

import net.minecraft.data.server.recipe.RecipeJsonProvider;

import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.item.Items;
import net.minecraft.item.Item;

import net.gloobert.bitsnbobs.content.BlockInitializer;

public class RecipeGenerator extends FabricRecipeProvider {
	public RecipeGenerator(FabricDataOutput generator) {
        super(generator);
    }

    private void generateQuadRecipe(RecipeCategory category, Item inItem, Item outItem, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(category, outItem)
        .pattern("ww")
        .pattern("ww")
        .input('w', inItem)
        .criterion(FabricRecipeProvider.hasItem(inItem), FabricRecipeProvider.conditionsFromItem(inItem))
        .criterion(FabricRecipeProvider.hasItem(outItem), FabricRecipeProvider.conditionsFromItem(outItem))
        .offerTo(exporter);
    }
    
    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.WHITE_WOOL, BlockInitializer.WOVEN_WOOL_WHITE.asItem(), exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_GRAY_WOOL, BlockInitializer.WOVEN_WOOL_LIGHT_GRAY.asItem(), exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.BLACK_WOOL, BlockInitializer.WOVEN_WOOL_BLACK.asItem(), exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.GRAY_WOOL, BlockInitializer.WOVEN_WOOL_GRAY.asItem(), exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.BLUE_WOOL, BlockInitializer.WOVEN_WOOL_BLUE.asItem(), exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_BLUE_WOOL, BlockInitializer.WOVEN_WOOL_LIGHT_BLUE.asItem(), exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.BROWN_WOOL, BlockInitializer.WOVEN_WOOL_BROWN.asItem(), exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.GREEN_WOOL, BlockInitializer.WOVEN_WOOL_GREEN.asItem(), exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.CYAN_WOOL, BlockInitializer.WOVEN_WOOL_CYAN.asItem(), exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.LIME_WOOL, BlockInitializer.WOVEN_WOOL_LIME.asItem(), exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.MAGENTA_WOOL, BlockInitializer.WOVEN_WOOL_MAGENTA.asItem(), exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.ORANGE_WOOL, BlockInitializer.WOVEN_WOOL_ORANGE.asItem(), exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.PINK_WOOL, BlockInitializer.WOVEN_WOOL_PINK.asItem(), exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.PURPLE_WOOL, BlockInitializer.WOVEN_WOOL_PURPLE.asItem(), exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.RED_WOOL, BlockInitializer.WOVEN_WOOL_RED.asItem(), exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.YELLOW_WOOL, BlockInitializer.WOVEN_WOOL_YELLOW.asItem(), exporter);
    }
}