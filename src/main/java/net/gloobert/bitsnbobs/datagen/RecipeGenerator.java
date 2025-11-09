package net.gloobert.bitsnbobs.datagen;

import java.util.List;
import java.util.function.Consumer;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SingleItemRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.recipe.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.util.Identifier;

import net.gloobert.bitsnbobs.content.BlockInitializer;
import net.gloobert.bitsnbobs.content.ItemInitializer;

public class RecipeGenerator extends FabricRecipeProvider {
	public RecipeGenerator(FabricDataOutput generator) {
        super(generator);
    }

    private void generateQuadRecipe(RecipeCategory category, ItemConvertible inItem, ItemConvertible outItem, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(category, outItem, 4)
        .pattern("ww")
        .pattern("ww")
        .input('w', inItem)
        .criterion(FabricRecipeProvider.hasItem(inItem), FabricRecipeProvider.conditionsFromItem(inItem))
        .criterion(FabricRecipeProvider.hasItem(outItem), FabricRecipeProvider.conditionsFromItem(outItem))
        .offerTo(exporter, Identifier.of("bitsnbobs", outItem.asItem().toString()));
    }

    private void generateDyeingRecipe(RecipeCategory category, ItemConvertible inItem, TagKey<Item> inItems, ItemConvertible outItem, Consumer<RecipeJsonProvider> exporter, String id) {
        ShapelessRecipeJsonBuilder.create(category, outItem)
        .input(inItem).input(inItems)
        .criterion(FabricRecipeProvider.hasItem(inItem), FabricRecipeProvider.conditionsFromItem(inItem))
        .criterion(FabricRecipeProvider.hasItem(outItem), FabricRecipeProvider.conditionsFromItem(outItem))
        .offerTo(exporter, Identifier.of("bitsnbobs", id));
    }
    
    private void generateFlatRecipe(RecipeCategory category, ItemConvertible inItem, ItemConvertible outItem, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(category, outItem, 3)
        .pattern("ww")
        .input('w', inItem)
        .criterion(FabricRecipeProvider.hasItem(inItem), FabricRecipeProvider.conditionsFromItem(inItem))
        .criterion(FabricRecipeProvider.hasItem(outItem), FabricRecipeProvider.conditionsFromItem(outItem))
        .offerTo(exporter, Identifier.of("bitsnbobs", outItem.asItem().toString()));
    }

    private void generateStairRecipes(RecipeCategory category, ItemConvertible baseBlock, ItemConvertible stairBlock, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(category, stairBlock, 4)
        .pattern("T  ")
        .pattern("TT ")
        .pattern("TTT")
        .input('T', baseBlock)
        .criterion(FabricRecipeProvider.hasItem(baseBlock), FabricRecipeProvider.conditionsFromItem(baseBlock))
        .criterion(FabricRecipeProvider.hasItem(stairBlock), FabricRecipeProvider.conditionsFromItem(stairBlock))
        .offerTo(exporter, Identifier.of("bitsnbobs", stairBlock.asItem().toString()));
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(baseBlock), category, stairBlock)
        .criterion(FabricRecipeProvider.hasItem(baseBlock), FabricRecipeProvider.conditionsFromItem(baseBlock))
        .offerTo(exporter, Identifier.of("bitsnbobs", stairBlock.asItem().toString() + "_from_stonecutting"));
    }

    private void generateSlabRecipes(RecipeCategory category, ItemConvertible baseBlock, ItemConvertible slabBlock, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(category, slabBlock, 6)
        .pattern("TTT")
        .input('T', baseBlock)
        .criterion(FabricRecipeProvider.hasItem(baseBlock), FabricRecipeProvider.conditionsFromItem(baseBlock))
        .criterion(FabricRecipeProvider.hasItem(slabBlock), FabricRecipeProvider.conditionsFromItem(slabBlock))
        .offerTo(exporter, Identifier.of("bitsnbobs", slabBlock.asItem().toString()));
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(baseBlock), category, slabBlock, 2)
        .criterion(FabricRecipeProvider.hasItem(baseBlock), FabricRecipeProvider.conditionsFromItem(baseBlock))
        .offerTo(exporter, Identifier.of("bitsnbobs", slabBlock.asItem().toString() + "_from_stonecutting"));
    }

    private void generateWallRecipes(RecipeCategory category, ItemConvertible baseBlock, ItemConvertible wallBlock, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(category, wallBlock, 6)
        .pattern("TTT")
        .pattern("TTT")
        .input('T', baseBlock)
        .criterion(FabricRecipeProvider.hasItem(baseBlock), FabricRecipeProvider.conditionsFromItem(baseBlock))
        .criterion(FabricRecipeProvider.hasItem(wallBlock), FabricRecipeProvider.conditionsFromItem(wallBlock))
        .offerTo(exporter, Identifier.of("bitsnbobs", wallBlock.asItem().toString()));
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(baseBlock), category, wallBlock)
        .criterion(FabricRecipeProvider.hasItem(baseBlock), FabricRecipeProvider.conditionsFromItem(baseBlock))
        .offerTo(exporter, Identifier.of("bitsnbobs", wallBlock.asItem().toString() + "_from_stonecutting"));
    }
    
    private void generateChiselingRecipes(RecipeCategory category, ItemConvertible baseBlock, ItemConvertible slabBlock, ItemConvertible chiseledBlock, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(category, chiseledBlock, 1)
        .pattern("T")
        .pattern("T")
        .input('T', slabBlock)
        .criterion(FabricRecipeProvider.hasItem(slabBlock), FabricRecipeProvider.conditionsFromItem(slabBlock))
        .criterion(FabricRecipeProvider.hasItem(chiseledBlock), FabricRecipeProvider.conditionsFromItem(chiseledBlock))
        .offerTo(exporter, Identifier.of("bitsnbobs", chiseledBlock.asItem().toString()));
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(baseBlock), category, chiseledBlock)
        .criterion(FabricRecipeProvider.hasItem(baseBlock), FabricRecipeProvider.conditionsFromItem(baseBlock))
        .offerTo(exporter, Identifier.of("bitsnbobs", chiseledBlock.asItem().toString() + "_from_stonecutting"));
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        // Wool to Woven Wool conversion recipes
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.WHITE_WOOL, BlockInitializer.WOVEN_WOOL_WHITE, exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_GRAY_WOOL, BlockInitializer.WOVEN_WOOL_LIGHT_GRAY, exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.BLACK_WOOL, BlockInitializer.WOVEN_WOOL_BLACK, exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.GRAY_WOOL, BlockInitializer.WOVEN_WOOL_GRAY, exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.BLUE_WOOL, BlockInitializer.WOVEN_WOOL_BLUE, exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_BLUE_WOOL, BlockInitializer.WOVEN_WOOL_LIGHT_BLUE, exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.BROWN_WOOL, BlockInitializer.WOVEN_WOOL_BROWN, exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.GREEN_WOOL, BlockInitializer.WOVEN_WOOL_GREEN, exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.CYAN_WOOL, BlockInitializer.WOVEN_WOOL_CYAN, exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.LIME_WOOL, BlockInitializer.WOVEN_WOOL_LIME, exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.MAGENTA_WOOL, BlockInitializer.WOVEN_WOOL_MAGENTA, exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.ORANGE_WOOL, BlockInitializer.WOVEN_WOOL_ORANGE, exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.PINK_WOOL, BlockInitializer.WOVEN_WOOL_PINK, exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.PURPLE_WOOL, BlockInitializer.WOVEN_WOOL_PURPLE, exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.RED_WOOL, BlockInitializer.WOVEN_WOOL_RED, exporter);
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.YELLOW_WOOL, BlockInitializer.WOVEN_WOOL_YELLOW, exporter);
        // Woven Wool dyeing recipes
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.WHITE_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_WHITE, exporter, "dye_white_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_GRAY_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_LIGHT_GRAY, exporter, "dye_light_gray_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.GRAY_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_GRAY, exporter, "dye_gray_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.BLACK_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_BLACK, exporter, "dye_black_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.BROWN_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_BROWN, exporter, "dye_brown_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.RED_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_RED, exporter, "dye_red_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.ORANGE_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_ORANGE, exporter, "dye_orange_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.YELLOW_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_YELLOW, exporter, "dye_yellow_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.LIME_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_LIME, exporter, "dye_lime_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.GREEN_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_GREEN, exporter, "dye_green_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.CYAN_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_CYAN, exporter, "dye_cyan_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_BLUE_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_LIGHT_BLUE, exporter, "dye_light_blue_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.BLUE_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_BLUE, exporter, "dye_blue_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.PURPLE_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_PURPLE, exporter, "dye_purple_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.MAGENTA_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_MAGENTA, exporter, "dye_magenta_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.PINK_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_PINK, exporter, "dye_pink_woven_wool");
        // Woven Wool Carpets
        generateFlatRecipe(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.WOVEN_WOOL_WHITE, BlockInitializer.WOVEN_CARPET_WHITE, exporter);
        generateFlatRecipe(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.WOVEN_WOOL_LIGHT_GRAY, BlockInitializer.WOVEN_CARPET_LIGHT_GRAY, exporter);
        generateFlatRecipe(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.WOVEN_WOOL_GRAY, BlockInitializer.WOVEN_CARPET_GRAY, exporter);
        generateFlatRecipe(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.WOVEN_WOOL_BLACK, BlockInitializer.WOVEN_CARPET_BLACK, exporter);
        generateFlatRecipe(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.WOVEN_WOOL_BROWN, BlockInitializer.WOVEN_CARPET_BROWN, exporter);
        generateFlatRecipe(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.WOVEN_WOOL_RED, BlockInitializer.WOVEN_CARPET_RED, exporter);
        generateFlatRecipe(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.WOVEN_WOOL_ORANGE, BlockInitializer.WOVEN_CARPET_ORANGE, exporter);
        generateFlatRecipe(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.WOVEN_WOOL_YELLOW, BlockInitializer.WOVEN_CARPET_YELLOW, exporter);
        generateFlatRecipe(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.WOVEN_WOOL_LIME, BlockInitializer.WOVEN_CARPET_LIME, exporter);
        generateFlatRecipe(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.WOVEN_WOOL_GREEN, BlockInitializer.WOVEN_CARPET_GREEN, exporter);
        generateFlatRecipe(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.WOVEN_WOOL_CYAN, BlockInitializer.WOVEN_CARPET_CYAN, exporter);
        generateFlatRecipe(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.WOVEN_WOOL_LIGHT_BLUE, BlockInitializer.WOVEN_CARPET_LIGHT_BLUE, exporter);
        generateFlatRecipe(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.WOVEN_WOOL_BLUE, BlockInitializer.WOVEN_CARPET_BLUE, exporter);
        generateFlatRecipe(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.WOVEN_WOOL_PURPLE, BlockInitializer.WOVEN_CARPET_PURPLE, exporter);
        generateFlatRecipe(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.WOVEN_WOOL_MAGENTA, BlockInitializer.WOVEN_CARPET_MAGENTA, exporter);
        generateFlatRecipe(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.WOVEN_WOOL_PINK, BlockInitializer.WOVEN_CARPET_PINK, exporter);
        // Woven carpet dyeing recipes
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.WHITE_DYE, TagGenerator.WOVEN_CARPET, BlockInitializer.WOVEN_CARPET_WHITE, exporter, "dye_white_woven_carpet");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_GRAY_DYE, TagGenerator.WOVEN_CARPET, BlockInitializer.WOVEN_CARPET_LIGHT_GRAY, exporter, "dye_light_gray_woven_carpet");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.GRAY_DYE, TagGenerator.WOVEN_CARPET, BlockInitializer.WOVEN_CARPET_GRAY, exporter, "dye_gray_woven_carpet");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.BLACK_DYE, TagGenerator.WOVEN_CARPET, BlockInitializer.WOVEN_CARPET_BLACK, exporter, "dye_black_woven_carpet");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.BROWN_DYE, TagGenerator.WOVEN_CARPET, BlockInitializer.WOVEN_CARPET_BROWN, exporter, "dye_brown_woven_carpet");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.RED_DYE, TagGenerator.WOVEN_CARPET, BlockInitializer.WOVEN_CARPET_RED, exporter, "dye_red_woven_carpet");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.ORANGE_DYE, TagGenerator.WOVEN_CARPET, BlockInitializer.WOVEN_CARPET_ORANGE, exporter, "dye_orange_woven_carpet");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.YELLOW_DYE, TagGenerator.WOVEN_CARPET, BlockInitializer.WOVEN_CARPET_YELLOW, exporter, "dye_yellow_woven_carpet");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.LIME_DYE, TagGenerator.WOVEN_CARPET, BlockInitializer.WOVEN_CARPET_LIME, exporter, "dye_lime_woven_carpet");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.GREEN_DYE, TagGenerator.WOVEN_CARPET, BlockInitializer.WOVEN_CARPET_GREEN, exporter, "dye_green_woven_carpet");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.CYAN_DYE, TagGenerator.WOVEN_CARPET, BlockInitializer.WOVEN_CARPET_CYAN, exporter, "dye_cyan_woven_carpet");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_BLUE_DYE, TagGenerator.WOVEN_CARPET, BlockInitializer.WOVEN_CARPET_LIGHT_BLUE, exporter, "dye_light_blue_woven_carpet");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.BLUE_DYE, TagGenerator.WOVEN_CARPET, BlockInitializer.WOVEN_CARPET_BLUE, exporter, "dye_blue_woven_carpet");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.PURPLE_DYE, TagGenerator.WOVEN_CARPET, BlockInitializer.WOVEN_CARPET_PURPLE, exporter, "dye_purple_woven_carpet");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.MAGENTA_DYE, TagGenerator.WOVEN_CARPET, BlockInitializer.WOVEN_CARPET_MAGENTA, exporter, "dye_magenta_woven_carpet");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.PINK_DYE, TagGenerator.WOVEN_CARPET, BlockInitializer.WOVEN_CARPET_PINK, exporter, "dye_pink_woven_carpet");
        // Amethyst variant stonecutting
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.fromTag(TagGenerator.AMETHYST_BLOCKS), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.CUT_AMETHYST_BLOCK)
        .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_BLOCK))
        .offerTo(exporter);
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.fromTag(TagGenerator.AMETHYST_BLOCKS), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.POLISHED_CUT_AMETHYST_BLOCK)
        .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_BLOCK))
        .offerTo(exporter);
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.fromTag(TagGenerator.AMETHYST_BLOCKS), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.POLISHED_AMETHYST_BLOCK)
        .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_BLOCK))
        .offerTo(exporter);
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.fromTag(TagGenerator.AMETHYST_BLOCKS), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.CUT_AMETHYST_TILES)
        .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_BLOCK))
        .offerTo(exporter);
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.fromTag(TagGenerator.AMETHYST_BLOCKS), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.POLISHED_AMETHYST_BRICKS)
        .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_BLOCK))
        .offerTo(exporter);
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.fromTag(TagGenerator.AMETHYST_BLOCKS), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.AMETHYST_PILLAR)
        .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_BLOCK))
        .offerTo(exporter);
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.fromTag(TagGenerator.AMETHYST_BLOCKS), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.TRIMMED_AMETHYST)
        .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_BLOCK))
        .offerTo(exporter);
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.fromTag(TagGenerator.AMETHYST_BLOCKS), RecipeCategory.BUILDING_BLOCKS, Items.AMETHYST_BLOCK)
        .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_BLOCK))
        .offerTo(exporter);
        // Tiles
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.POLISHED_TILES, 4)
        .pattern("Dd")
        .pattern("dD")
        .input('D', Items.POLISHED_DEEPSLATE)
        .input('d', Items.POLISHED_DIORITE)
        .criterion(FabricRecipeProvider.hasItem(Items.POLISHED_DEEPSLATE), FabricRecipeProvider.conditionsFromItem(Items.POLISHED_DEEPSLATE))
        .criterion(FabricRecipeProvider.hasItem(Items.POLISHED_DIORITE), FabricRecipeProvider.conditionsFromItem(Items.POLISHED_DIORITE))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.POLISHED_TILES), FabricRecipeProvider.conditionsFromItem(BlockInitializer.POLISHED_TILES))
        .offerTo(exporter);
        generateStairRecipes(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.POLISHED_TILES, BlockInitializer.POLISHED_TILE_STAIRS, exporter);
        generateSlabRecipes(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.POLISHED_TILES, BlockInitializer.POLISHED_TILE_SLAB, exporter);
        generateWallRecipes(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.POLISHED_TILES, BlockInitializer.POLISHED_TILE_WALL, exporter);
        generateChiselingRecipes(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.POLISHED_TILES, BlockInitializer.POLISHED_TILE_SLAB, BlockInitializer.CHISELED_POLISHED_TILES, exporter);
        // Blue Nether Bricks
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.BLUE_NETHER_BRICKS, 4)
        .pattern("WB")
        .pattern("BW")
        .input('W', ItemInitializer.WARPED_WART)
        .input('B', Items.NETHER_BRICKS)
        .criterion(FabricRecipeProvider.hasItem(ItemInitializer.WARPED_WART), FabricRecipeProvider.conditionsFromItem(ItemInitializer.WARPED_WART))
        .criterion(FabricRecipeProvider.hasItem(Items.NETHER_BRICKS), FabricRecipeProvider.conditionsFromItem(Items.NETHER_BRICKS))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.BLUE_NETHER_BRICKS), FabricRecipeProvider.conditionsFromItem(BlockInitializer.BLUE_NETHER_BRICKS))
        .offerTo(exporter);
        generateStairRecipes(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.BLUE_NETHER_BRICKS, BlockInitializer.BLUE_NETHER_BRICK_STAIRS, exporter);
        generateSlabRecipes(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.BLUE_NETHER_BRICKS, BlockInitializer.BLUE_NETHER_BRICK_SLAB, exporter);
        generateWallRecipes(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.BLUE_NETHER_BRICKS, BlockInitializer.BLUE_NETHER_BRICK_WALL, exporter);
        generateChiselingRecipes(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.BLUE_NETHER_BRICKS, BlockInitializer.BLUE_NETHER_BRICK_SLAB, BlockInitializer.CHISELED_BLUE_NETHER_BRICKS, exporter);
        // Red Chiseled Nether Bricks
        generateChiselingRecipes(RecipeCategory.BUILDING_BLOCKS, Items.RED_NETHER_BRICKS, Items.RED_NETHER_BRICK_SLAB, BlockInitializer.CHISELED_RED_NETHER_BRICKS, exporter);
        // Copper "Sanding" (stonecutting)
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.COPPER_BLOCK), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.SANDED_COPPER_BLOCK)
        .criterion(FabricRecipeProvider.hasItem(Items.COPPER_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.COPPER_BLOCK))
        .offerTo(exporter, Identifier.of("bitsnbobs", "sanding_copper"));
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.WEATHERED_COPPER), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.SANDED_WEATHERED_COPPER_BLOCK)
        .criterion(FabricRecipeProvider.hasItem(Items.WEATHERED_COPPER), FabricRecipeProvider.conditionsFromItem(Items.WEATHERED_COPPER))
        .offerTo(exporter, Identifier.of("bitsnbobs", "sanding_weathered_copper"));
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.EXPOSED_COPPER), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.SANDED_EXPOSED_COPPER_BLOCK)
        .criterion(FabricRecipeProvider.hasItem(Items.EXPOSED_COPPER), FabricRecipeProvider.conditionsFromItem(Items.EXPOSED_COPPER))
        .offerTo(exporter, Identifier.of("bitsnbobs", "sanding_exposed_copper"));
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.OXIDIZED_COPPER), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.SANDED_OXIDIZED_COPPER_BLOCK)
        .criterion(FabricRecipeProvider.hasItem(Items.OXIDIZED_COPPER), FabricRecipeProvider.conditionsFromItem(Items.OXIDIZED_COPPER))
        .offerTo(exporter, Identifier.of("bitsnbobs", "sanding_oxidized_copper"));
        // Waxed equivalents (i dont want people having to deal with mass stonecutting and THEN waxing, most people have a backlog of waxed copper anyway)
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.WAXED_COPPER_BLOCK), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.WAXED_SANDED_COPPER_BLOCK)
        .criterion(FabricRecipeProvider.hasItem(Items.WAXED_COPPER_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.WAXED_COPPER_BLOCK))
        .offerTo(exporter, Identifier.of("bitsnbobs", "sanding_waxed_copper"));
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.WAXED_WEATHERED_COPPER), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.WAXED_SANDED_WEATHERED_COPPER_BLOCK)
        .criterion(FabricRecipeProvider.hasItem(Items.WAXED_WEATHERED_COPPER), FabricRecipeProvider.conditionsFromItem(Items.WAXED_WEATHERED_COPPER))
        .offerTo(exporter, Identifier.of("bitsnbobs", "sanding_waxed_weathered_copper"));
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.WAXED_EXPOSED_COPPER), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.WAXED_SANDED_EXPOSED_COPPER_BLOCK)
        .criterion(FabricRecipeProvider.hasItem(Items.WAXED_EXPOSED_COPPER), FabricRecipeProvider.conditionsFromItem(Items.WAXED_EXPOSED_COPPER))
        .offerTo(exporter, Identifier.of("bitsnbobs", "sanding_waxed_exposed_copper"));
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.WAXED_OXIDIZED_COPPER), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.WAXED_SANDED_OXIDIZED_COPPER_BLOCK)
        .criterion(FabricRecipeProvider.hasItem(Items.WAXED_OXIDIZED_COPPER), FabricRecipeProvider.conditionsFromItem(Items.WAXED_OXIDIZED_COPPER))
        .offerTo(exporter, Identifier.of("bitsnbobs", "sanding_waxed_oxidized_copper"));
        // Warped Wart salvaging and re-blocking
        RecipeProvider.offerSmelting(exporter, List.of(Items.WARPED_WART_BLOCK), RecipeCategory.BUILDING_BLOCKS, ItemInitializer.WARPED_WART, 0.1F, 300, "bitsnbobs");
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, ItemInitializer.WARPED_WART, Items.WARPED_WART_BLOCK, exporter);
        // Gilded Deepslate recipe (i know, it seems backwards, it was the best way I could make the cost balanced okay)
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.GILDED_DEEPSLATE, 8)
        .pattern("DDD")
        .pattern("DGD")
        .pattern("DDD")
        .input('D', Items.POLISHED_DEEPSLATE)
        .input('G', Items.GOLD_INGOT)
        .criterion(FabricRecipeProvider.hasItem(Items.GOLD_INGOT), FabricRecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
        .criterion(FabricRecipeProvider.hasItem(Items.POLISHED_DEEPSLATE), FabricRecipeProvider.conditionsFromItem(Items.POLISHED_DEEPSLATE))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.GILDED_DEEPSLATE), FabricRecipeProvider.conditionsFromItem(BlockInitializer.GILDED_DEEPSLATE))
        .offerTo(exporter, Identifier.of("bitsnbobs", "gold_gilding_deepslate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.COPPER_GILDED_DEEPSLATE, 8)
        .pattern("DDD")
        .pattern("DGD")
        .pattern("DDD")
        .input('D', Items.POLISHED_DEEPSLATE)
        .input('G', Items.COPPER_INGOT)
        .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT), FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
        .criterion(FabricRecipeProvider.hasItem(Items.POLISHED_DEEPSLATE), FabricRecipeProvider.conditionsFromItem(Items.POLISHED_DEEPSLATE))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.COPPER_GILDED_DEEPSLATE), FabricRecipeProvider.conditionsFromItem(BlockInitializer.COPPER_GILDED_DEEPSLATE))
        .offerTo(exporter, Identifier.of("bitsnbobs", "copper_gilding_deepslate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.IRON_GILDED_DEEPSLATE, 8)
        .pattern("DDD")
        .pattern("DGD")
        .pattern("DDD")
        .input('D', Items.POLISHED_DEEPSLATE)
        .input('G', Items.IRON_INGOT)
        .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT), FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
        .criterion(FabricRecipeProvider.hasItem(Items.POLISHED_DEEPSLATE), FabricRecipeProvider.conditionsFromItem(Items.POLISHED_DEEPSLATE))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.IRON_GILDED_DEEPSLATE), FabricRecipeProvider.conditionsFromItem(BlockInitializer.IRON_GILDED_DEEPSLATE))
        .offerTo(exporter, Identifier.of("bitsnbobs", "iron_gilding_deepslate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.AMETHYST_GILDED_DEEPSLATE, 8)
        .pattern("DDD")
        .pattern("DGD")
        .pattern("DDD")
        .input('D', Items.POLISHED_DEEPSLATE)
        .input('G', Items.AMETHYST_SHARD)
        .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_SHARD), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
        .criterion(FabricRecipeProvider.hasItem(Items.POLISHED_DEEPSLATE), FabricRecipeProvider.conditionsFromItem(Items.POLISHED_DEEPSLATE))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.AMETHYST_GILDED_DEEPSLATE), FabricRecipeProvider.conditionsFromItem(BlockInitializer.AMETHYST_GILDED_DEEPSLATE))
        .offerTo(exporter, Identifier.of("bitsnbobs", "amethyst_gilding_deepslate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.QUARTZ_GILDED_DEEPSLATE, 8)
        .pattern("DDD")
        .pattern("DGD")
        .pattern("DDD")
        .input('D', Items.POLISHED_DEEPSLATE)
        .input('G', Items.QUARTZ)
        .criterion(FabricRecipeProvider.hasItem(Items.QUARTZ), FabricRecipeProvider.conditionsFromItem(Items.QUARTZ))
        .criterion(FabricRecipeProvider.hasItem(Items.POLISHED_DEEPSLATE), FabricRecipeProvider.conditionsFromItem(Items.POLISHED_DEEPSLATE))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.QUARTZ_GILDED_DEEPSLATE), FabricRecipeProvider.conditionsFromItem(BlockInitializer.QUARTZ_GILDED_DEEPSLATE))
        .offerTo(exporter, Identifier.of("bitsnbobs", "quartz_gilding_deepslate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.LAPIS_GILDED_DEEPSLATE, 8)
        .pattern("DDD")
        .pattern("DGD")
        .pattern("DDD")
        .input('D', Items.POLISHED_DEEPSLATE)
        .input('G', Items.LAPIS_LAZULI)
        .criterion(FabricRecipeProvider.hasItem(Items.QUARTZ), FabricRecipeProvider.conditionsFromItem(Items.QUARTZ))
        .criterion(FabricRecipeProvider.hasItem(Items.POLISHED_DEEPSLATE), FabricRecipeProvider.conditionsFromItem(Items.POLISHED_DEEPSLATE))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.LAPIS_GILDED_DEEPSLATE), FabricRecipeProvider.conditionsFromItem(BlockInitializer.LAPIS_GILDED_DEEPSLATE))
        .offerTo(exporter, Identifier.of("bitsnbobs", "lapis_gilding_deepslate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.NETHERITE_GILDED_DEEPSLATE, 8)
        .pattern("DDD")
        .pattern("DGD")
        .pattern("DDD")
        .input('D', Items.POLISHED_DEEPSLATE)
        .input('G', Items.NETHERITE_INGOT)
        .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_INGOT), FabricRecipeProvider.conditionsFromItem(Items.NETHERITE_INGOT))
        .criterion(FabricRecipeProvider.hasItem(Items.POLISHED_DEEPSLATE), FabricRecipeProvider.conditionsFromItem(Items.POLISHED_DEEPSLATE))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.NETHERITE_GILDED_DEEPSLATE), FabricRecipeProvider.conditionsFromItem(BlockInitializer.NETHERITE_GILDED_DEEPSLATE))
        .offerTo(exporter, Identifier.of("bitsnbobs", "netherite_gilding_deepslate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.DIAMOND_GILDED_DEEPSLATE, 8)
        .pattern("DDD")
        .pattern("DGD")
        .pattern("DDD")
        .input('D', Items.POLISHED_DEEPSLATE)
        .input('G', Items.DIAMOND)
        .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND), FabricRecipeProvider.conditionsFromItem(Items.DIAMOND))
        .criterion(FabricRecipeProvider.hasItem(Items.POLISHED_DEEPSLATE), FabricRecipeProvider.conditionsFromItem(Items.POLISHED_DEEPSLATE))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.DIAMOND_GILDED_DEEPSLATE), FabricRecipeProvider.conditionsFromItem(BlockInitializer.DIAMOND_GILDED_DEEPSLATE))
        .offerTo(exporter, Identifier.of("bitsnbobs", "diamond_gilding_deepslate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.REDSTONE_GILDED_DEEPSLATE, 8)
        .pattern("DDD")
        .pattern("DGD")
        .pattern("DDD")
        .input('D', Items.POLISHED_DEEPSLATE)
        .input('G', Items.REDSTONE)
        .criterion(FabricRecipeProvider.hasItem(Items.REDSTONE), FabricRecipeProvider.conditionsFromItem(Items.REDSTONE))
        .criterion(FabricRecipeProvider.hasItem(Items.POLISHED_DEEPSLATE), FabricRecipeProvider.conditionsFromItem(Items.POLISHED_DEEPSLATE))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.REDSTONE_GILDED_DEEPSLATE), FabricRecipeProvider.conditionsFromItem(BlockInitializer.REDSTONE_GILDED_DEEPSLATE))
        .offerTo(exporter, Identifier.of("bitsnbobs", "redstone_gilding_deepslate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.EMERALD_GILDED_DEEPSLATE, 8)
        .pattern("DDD")
        .pattern("DGD")
        .pattern("DDD")
        .input('D', Items.POLISHED_DEEPSLATE)
        .input('G', Items.EMERALD)
        .criterion(FabricRecipeProvider.hasItem(Items.EMERALD), FabricRecipeProvider.conditionsFromItem(Items.EMERALD))
        .criterion(FabricRecipeProvider.hasItem(Items.POLISHED_DEEPSLATE), FabricRecipeProvider.conditionsFromItem(Items.POLISHED_DEEPSLATE))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.EMERALD_GILDED_DEEPSLATE), FabricRecipeProvider.conditionsFromItem(BlockInitializer.EMERALD_GILDED_DEEPSLATE))
        .offerTo(exporter, Identifier.of("bitsnbobs", "emerald_gilding_deepslate"));
        // Gilded Quartz recipe (meow)
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.GILDED_QUARTZ, 8)
        .pattern("DDD")
        .pattern("DGD")
        .pattern("DDD")
        .input('D', Items.QUARTZ_BLOCK)
        .input('G', Items.GOLD_INGOT)
        .criterion(FabricRecipeProvider.hasItem(Items.GOLD_INGOT), FabricRecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
        .criterion(FabricRecipeProvider.hasItem(Items.QUARTZ_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.QUARTZ_BLOCK))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.GILDED_QUARTZ), FabricRecipeProvider.conditionsFromItem(BlockInitializer.GILDED_QUARTZ))
        .offerTo(exporter, Identifier.of("bitsnbobs", "gold_gilding_quartz"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.COPPER_GILDED_QUARTZ, 8)
        .pattern("DDD")
        .pattern("DGD")
        .pattern("DDD")
        .input('D', Items.QUARTZ_BLOCK)
        .input('G', Items.COPPER_INGOT)
        .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT), FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
        .criterion(FabricRecipeProvider.hasItem(Items.QUARTZ_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.QUARTZ_BLOCK))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.COPPER_GILDED_QUARTZ), FabricRecipeProvider.conditionsFromItem(BlockInitializer.COPPER_GILDED_QUARTZ))
        .offerTo(exporter, Identifier.of("bitsnbobs", "copper_gilding_quartz"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.IRON_GILDED_QUARTZ, 8)
        .pattern("DDD")
        .pattern("DGD")
        .pattern("DDD")
        .input('D', Items.QUARTZ_BLOCK)
        .input('G', Items.IRON_INGOT)
        .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT), FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
        .criterion(FabricRecipeProvider.hasItem(Items.QUARTZ_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.QUARTZ_BLOCK))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.IRON_GILDED_QUARTZ), FabricRecipeProvider.conditionsFromItem(BlockInitializer.IRON_GILDED_QUARTZ))
        .offerTo(exporter, Identifier.of("bitsnbobs", "iron_gilding_quartz"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.AMETHYST_GILDED_QUARTZ, 8)
        .pattern("DDD")
        .pattern("DGD")
        .pattern("DDD")
        .input('D', Items.QUARTZ_BLOCK)
        .input('G', Items.AMETHYST_SHARD)
        .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_SHARD), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
        .criterion(FabricRecipeProvider.hasItem(Items.QUARTZ_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.QUARTZ_BLOCK))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.AMETHYST_GILDED_QUARTZ), FabricRecipeProvider.conditionsFromItem(BlockInitializer.AMETHYST_GILDED_QUARTZ))
        .offerTo(exporter, Identifier.of("bitsnbobs", "amethyst_gilding_quartz"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.QUARTZ_GILDED_QUARTZ, 8)
        .pattern("DDD")
        .pattern("DGD")
        .pattern("DDD")
        .input('D', Items.QUARTZ_BLOCK)
        .input('G', Items.QUARTZ)
        .criterion(FabricRecipeProvider.hasItem(Items.QUARTZ), FabricRecipeProvider.conditionsFromItem(Items.QUARTZ))
        .criterion(FabricRecipeProvider.hasItem(Items.QUARTZ_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.QUARTZ_BLOCK))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.QUARTZ_GILDED_QUARTZ), FabricRecipeProvider.conditionsFromItem(BlockInitializer.QUARTZ_GILDED_QUARTZ))
        .offerTo(exporter, Identifier.of("bitsnbobs", "quartz_gilding_quartz"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.LAPIS_GILDED_QUARTZ, 8)
        .pattern("DDD")
        .pattern("DGD")
        .pattern("DDD")
        .input('D', Items.QUARTZ_BLOCK)
        .input('G', Items.LAPIS_LAZULI)
        .criterion(FabricRecipeProvider.hasItem(Items.QUARTZ), FabricRecipeProvider.conditionsFromItem(Items.QUARTZ))
        .criterion(FabricRecipeProvider.hasItem(Items.QUARTZ_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.QUARTZ_BLOCK))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.LAPIS_GILDED_QUARTZ), FabricRecipeProvider.conditionsFromItem(BlockInitializer.LAPIS_GILDED_QUARTZ))
        .offerTo(exporter, Identifier.of("bitsnbobs", "lapis_gilding_quartz"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.NETHERITE_GILDED_QUARTZ, 8)
        .pattern("DDD")
        .pattern("DGD")
        .pattern("DDD")
        .input('D', Items.QUARTZ_BLOCK)
        .input('G', Items.NETHERITE_INGOT)
        .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_INGOT), FabricRecipeProvider.conditionsFromItem(Items.NETHERITE_INGOT))
        .criterion(FabricRecipeProvider.hasItem(Items.QUARTZ_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.QUARTZ_BLOCK))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.NETHERITE_GILDED_QUARTZ), FabricRecipeProvider.conditionsFromItem(BlockInitializer.NETHERITE_GILDED_QUARTZ))
        .offerTo(exporter, Identifier.of("bitsnbobs", "netherite_gilding_quartz"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.DIAMOND_GILDED_QUARTZ, 8)
        .pattern("DDD")
        .pattern("DGD")
        .pattern("DDD")
        .input('D', Items.QUARTZ_BLOCK)
        .input('G', Items.DIAMOND)
        .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND), FabricRecipeProvider.conditionsFromItem(Items.DIAMOND))
        .criterion(FabricRecipeProvider.hasItem(Items.QUARTZ_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.QUARTZ_BLOCK))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.DIAMOND_GILDED_QUARTZ), FabricRecipeProvider.conditionsFromItem(BlockInitializer.DIAMOND_GILDED_QUARTZ))
        .offerTo(exporter, Identifier.of("bitsnbobs", "diamond_gilding_quartz"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.REDSTONE_GILDED_QUARTZ, 8)
        .pattern("DDD")
        .pattern("DGD")
        .pattern("DDD")
        .input('D', Items.QUARTZ_BLOCK)
        .input('G', Items.REDSTONE)
        .criterion(FabricRecipeProvider.hasItem(Items.REDSTONE), FabricRecipeProvider.conditionsFromItem(Items.REDSTONE))
        .criterion(FabricRecipeProvider.hasItem(Items.QUARTZ_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.QUARTZ_BLOCK))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.REDSTONE_GILDED_QUARTZ), FabricRecipeProvider.conditionsFromItem(BlockInitializer.REDSTONE_GILDED_QUARTZ))
        .offerTo(exporter, Identifier.of("bitsnbobs", "redstone_gilding_quartz"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.EMERALD_GILDED_QUARTZ, 8)
        .pattern("DDD")
        .pattern("DGD")
        .pattern("DDD")
        .input('D', Items.QUARTZ_BLOCK)
        .input('G', Items.EMERALD)
        .criterion(FabricRecipeProvider.hasItem(Items.EMERALD), FabricRecipeProvider.conditionsFromItem(Items.EMERALD))
        .criterion(FabricRecipeProvider.hasItem(Items.QUARTZ_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.QUARTZ_BLOCK))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.EMERALD_GILDED_QUARTZ), FabricRecipeProvider.conditionsFromItem(BlockInitializer.EMERALD_GILDED_QUARTZ))
        .offerTo(exporter, Identifier.of("bitsnbobs", "emerald_gilding_quartz"));
        // Rose Bush Trimming
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.ROSE_BUSH), RecipeCategory.DECORATIONS, BlockInitializer.SINGLE_ROSE, 8)
        .criterion(FabricRecipeProvider.hasItem(Items.ROSE_BUSH), FabricRecipeProvider.conditionsFromItem(Items.ROSE_BUSH))
        .offerTo(exporter, Identifier.of("bitsnbobs", "trimming_rose_bush"));
        // Rose Recoloring
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, BlockInitializer.PALE_ROSE)
        .input(BlockInitializer.SINGLE_ROSE).input(Items.WHITE_DYE)
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.SINGLE_ROSE), FabricRecipeProvider.conditionsFromItem(BlockInitializer.SINGLE_ROSE))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.PALE_ROSE), FabricRecipeProvider.conditionsFromItem(BlockInitializer.PALE_ROSE))
        .offerTo(exporter, Identifier.of("bitsnbobs", "pale_rose_dyeing"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, BlockInitializer.CYAN_ROSE)
        .input(BlockInitializer.PALE_ROSE).input(Items.CYAN_DYE)
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.PALE_ROSE), FabricRecipeProvider.conditionsFromItem(BlockInitializer.PALE_ROSE))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.CYAN_ROSE), FabricRecipeProvider.conditionsFromItem(BlockInitializer.CYAN_ROSE))
        .offerTo(exporter, Identifier.of("bitsnbobs", "cyan_rose_dyeing"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, BlockInitializer.SUNSET_ROSE)
        .input(BlockInitializer.PALE_ROSE).input(Items.MAGENTA_DYE).input(Items.YELLOW_DYE)
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.PALE_ROSE), FabricRecipeProvider.conditionsFromItem(BlockInitializer.PALE_ROSE))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.SUNSET_ROSE), FabricRecipeProvider.conditionsFromItem(BlockInitializer.SUNSET_ROSE))
        .offerTo(exporter, Identifier.of("bitsnbobs", "sunset_rose_dyeing"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, BlockInitializer.DARKENED_ROSE)
        .input(BlockInitializer.PALE_ROSE).input(Items.BLACK_DYE)
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.PALE_ROSE), FabricRecipeProvider.conditionsFromItem(BlockInitializer.PALE_ROSE))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.DARKENED_ROSE), FabricRecipeProvider.conditionsFromItem(BlockInitializer.DARKENED_ROSE))
        .offerTo(exporter, Identifier.of("bitsnbobs", "darkened_rose_dyeing"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, BlockInitializer.LAVENDER_ROSE)
        .input(BlockInitializer.PALE_ROSE).input(Items.PURPLE_DYE).input(Items.LIGHT_GRAY_DYE)
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.PALE_ROSE), FabricRecipeProvider.conditionsFromItem(BlockInitializer.PALE_ROSE))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.LAVENDER_ROSE), FabricRecipeProvider.conditionsFromItem(BlockInitializer.LAVENDER_ROSE))
        .offerTo(exporter, Identifier.of("bitsnbobs", "lavender_rose_dyeing"));
        // Bouquets
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ItemInitializer.ROSE_BOUQUET, 1)
        .pattern("RRR") 
        .pattern("RSR")
        .pattern("RRR")
        .input('R', BlockInitializer.SINGLE_ROSE)
        .input('S', Items.STRING)
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.SINGLE_ROSE), FabricRecipeProvider.conditionsFromItem(BlockInitializer.SINGLE_ROSE))
        .criterion(FabricRecipeProvider.hasItem(ItemInitializer.ROSE_BOUQUET), FabricRecipeProvider.conditionsFromItem(ItemInitializer.ROSE_BOUQUET))
        .offerTo(exporter, Identifier.of("bitsnbobs", "red_rose_bouquet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ItemInitializer.CYAN_ROSE_BOUQUET, 1)
        .pattern("RRR")
        .pattern("RSR")
        .pattern("RRR")
        .input('R', BlockInitializer.CYAN_ROSE)
        .input('S', Items.STRING)
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.CYAN_ROSE), FabricRecipeProvider.conditionsFromItem(BlockInitializer.CYAN_ROSE))
        .criterion(FabricRecipeProvider.hasItem(ItemInitializer.CYAN_ROSE_BOUQUET), FabricRecipeProvider.conditionsFromItem(ItemInitializer.CYAN_ROSE_BOUQUET))
        .offerTo(exporter, Identifier.of("bitsnbobs", "cyan_rose_bouquet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ItemInitializer.PALE_ROSE_BOUQUET, 1)
        .pattern("RRR")
        .pattern("RSR")
        .pattern("RRR")
        .input('R', BlockInitializer.PALE_ROSE)
        .input('S', Items.STRING)
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.PALE_ROSE), FabricRecipeProvider.conditionsFromItem(BlockInitializer.PALE_ROSE))
        .criterion(FabricRecipeProvider.hasItem(ItemInitializer.PALE_ROSE_BOUQUET), FabricRecipeProvider.conditionsFromItem(ItemInitializer.PALE_ROSE_BOUQUET))
        .offerTo(exporter, Identifier.of("bitsnbobs", "pale_rose_bouquet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ItemInitializer.SUNSET_ROSE_BOUQUET, 1)
        .pattern("RRR")
        .pattern("RSR")
        .pattern("RRR")
        .input('R', BlockInitializer.SUNSET_ROSE)
        .input('S', Items.STRING)
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.SUNSET_ROSE), FabricRecipeProvider.conditionsFromItem(BlockInitializer.SUNSET_ROSE))
        .criterion(FabricRecipeProvider.hasItem(ItemInitializer.SUNSET_ROSE_BOUQUET), FabricRecipeProvider.conditionsFromItem(ItemInitializer.SUNSET_ROSE_BOUQUET))
        .offerTo(exporter, Identifier.of("bitsnbobs", "sunset_rose_bouquet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ItemInitializer.DARKENED_ROSE_BOUQUET, 1)
        .pattern("RRR")
        .pattern("RSR")
        .pattern("RRR")
        .input('R', BlockInitializer.DARKENED_ROSE)
        .input('S', Items.STRING)
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.DARKENED_ROSE), FabricRecipeProvider.conditionsFromItem(BlockInitializer.DARKENED_ROSE))
        .criterion(FabricRecipeProvider.hasItem(ItemInitializer.DARKENED_ROSE_BOUQUET), FabricRecipeProvider.conditionsFromItem(ItemInitializer.DARKENED_ROSE_BOUQUET))
        .offerTo(exporter, Identifier.of("bitsnbobs", "darkened_rose_bouquet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ItemInitializer.LAVENDER_ROSE_BOUQUET, 1)
        .pattern("RRR")
        .pattern("RSR")
        .pattern("RRR")
        .input('R', BlockInitializer.LAVENDER_ROSE)
        .input('S', Items.STRING)
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.LAVENDER_ROSE), FabricRecipeProvider.conditionsFromItem(BlockInitializer.LAVENDER_ROSE))
        .criterion(FabricRecipeProvider.hasItem(ItemInitializer.LAVENDER_ROSE_BOUQUET), FabricRecipeProvider.conditionsFromItem(ItemInitializer.LAVENDER_ROSE_BOUQUET))
        .offerTo(exporter, Identifier.of("bitsnbobs", "lavender_rose_bouquet"));
        // Polished Mud
        generateQuadRecipe(RecipeCategory.BUILDING_BLOCKS, Items.MUD, BlockInitializer.POLISHED_MUD, exporter);
        generateStairRecipes(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.POLISHED_MUD, BlockInitializer.POLISHED_MUD_STAIRS, exporter);
        generateSlabRecipes(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.POLISHED_MUD, BlockInitializer.POLISHED_MUD_SLAB, exporter);
        generateWallRecipes(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.POLISHED_MUD, BlockInitializer.POLISHED_MUD_WALL, exporter);
        // Mossy Mud Bricks
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.MOSSY_MUD_BRICKS)
        .input(Items.MUD_BRICKS).input(Items.MOSS_BLOCK)
        .criterion(FabricRecipeProvider.hasItem(Items.MUD_BRICKS), FabricRecipeProvider.conditionsFromItem(Items.MUD_BRICKS))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.MOSSY_MUD_BRICKS), FabricRecipeProvider.conditionsFromItem(BlockInitializer.MOSSY_MUD_BRICKS))
        .offerTo(exporter, Identifier.of("bitsnbobs", "mossy_mud_bricks_from_moss"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.MOSSY_MUD_BRICKS)
        .input(Items.MUD_BRICKS).input(Items.VINE)
        .criterion(FabricRecipeProvider.hasItem(Items.MUD_BRICKS), FabricRecipeProvider.conditionsFromItem(Items.MUD_BRICKS))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.MOSSY_MUD_BRICKS), FabricRecipeProvider.conditionsFromItem(BlockInitializer.MOSSY_MUD_BRICKS))
        .offerTo(exporter, Identifier.of("bitsnbobs", "mossy_mud_bricks_from_vine"));
        generateStairRecipes(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.MOSSY_MUD_BRICKS, BlockInitializer.MOSSY_MUD_BRICK_STAIRS, exporter);
        generateSlabRecipes(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.MOSSY_MUD_BRICKS, BlockInitializer.MOSSY_MUD_BRICK_SLAB, exporter);
        generateWallRecipes(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.MOSSY_MUD_BRICKS, BlockInitializer.MOSSY_MUD_BRICK_WALL, exporter);
        // Mud Etc. Blocks
        generateChiselingRecipes(RecipeCategory.BUILDING_BLOCKS, Items.MUD_BRICKS, Items.MUD_BRICK_SLAB, BlockInitializer.CHISELED_MUD_BRICKS, exporter);
        generateChiselingRecipes(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.POLISHED_MUD, BlockInitializer.POLISHED_MUD_SLAB, BlockInitializer.MUD_PILLAR, exporter);
    }
}