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
import net.minecraft.util.Identifier;

import net.gloobert.bitsnbobs.content.BlockInitializer;
import net.gloobert.bitsnbobs.content.ItemInitializer;

public class RecipeGenerator extends FabricRecipeProvider {
	public RecipeGenerator(FabricDataOutput generator) {
        super(generator);
    }

    private void generateQuadRecipe(RecipeCategory category, Item inItem, Item outItem, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(category, outItem, 4)
        .pattern("ww")
        .pattern("ww")
        .input('w', inItem)
        .criterion(FabricRecipeProvider.hasItem(inItem), FabricRecipeProvider.conditionsFromItem(inItem))
        .criterion(FabricRecipeProvider.hasItem(outItem), FabricRecipeProvider.conditionsFromItem(outItem))
        .offerTo(exporter, Identifier.of("bitsnbobs", outItem.toString()));
    }

    private void generateDyeingRecipe(RecipeCategory category, Item inItem, TagKey<Item> inItems, Item outItem, Consumer<RecipeJsonProvider> exporter, String id) {
        ShapelessRecipeJsonBuilder.create(category, outItem)
        .input(inItem).input(inItems)
        .criterion(FabricRecipeProvider.hasItem(inItem), FabricRecipeProvider.conditionsFromItem(inItem))
        .criterion(FabricRecipeProvider.hasItem(outItem), FabricRecipeProvider.conditionsFromItem(outItem))
        .offerTo(exporter, Identifier.of("bitsnbobs", id));
    }
    
    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        // Wool to Woven Wool conversion recipes
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
        // Woven Wool dyeing recipes
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.WHITE_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_WHITE.asItem(), exporter, "dye_white_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_GRAY_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_LIGHT_GRAY.asItem(), exporter, "dye_light_gray_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.GRAY_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_GRAY.asItem(), exporter, "dye_gray_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.BLACK_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_BLACK.asItem(), exporter, "dye_black_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.BROWN_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_BROWN.asItem(), exporter, "dye_brown_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.RED_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_RED.asItem(), exporter, "dye_red_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.ORANGE_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_ORANGE.asItem(), exporter, "dye_orange_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.YELLOW_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_YELLOW.asItem(), exporter, "dye_yellow_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.LIME_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_LIME.asItem(), exporter, "dye_lime_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.GREEN_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_GREEN.asItem(), exporter, "dye_green_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.CYAN_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_CYAN.asItem(), exporter, "dye_cyan_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_BLUE_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_LIGHT_BLUE.asItem(), exporter, "dye_light_blue_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.BLUE_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_BLUE.asItem(), exporter, "dye_blue_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.PURPLE_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_PURPLE.asItem(), exporter, "dye_purple_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.MAGENTA_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_MAGENTA.asItem(), exporter, "dye_magenta_woven_wool");
        generateDyeingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.PINK_DYE, TagGenerator.WOVEN_WOOL, BlockInitializer.WOVEN_WOOL_PINK.asItem(), exporter, "dye_pink_woven_wool");
        // Amethyst variant stonecutting
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.fromTag(TagGenerator.AMETHYST_BLOCKS), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.CUT_AMETHYST_BLOCK.asItem())
        .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_BLOCK))
        .offerTo(exporter);
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.fromTag(TagGenerator.AMETHYST_BLOCKS), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.POLISHED_CUT_AMETHYST_BLOCK.asItem())
        .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_BLOCK))
        .offerTo(exporter);
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.fromTag(TagGenerator.AMETHYST_BLOCKS), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.POLISHED_AMETHYST_BLOCK.asItem())
        .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_BLOCK))
        .offerTo(exporter);
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.fromTag(TagGenerator.AMETHYST_BLOCKS), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.CUT_AMETHYST_TILES.asItem())
        .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_BLOCK))
        .offerTo(exporter);
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.fromTag(TagGenerator.AMETHYST_BLOCKS), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.POLISHED_AMETHYST_BRICKS.asItem())
        .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_BLOCK))
        .offerTo(exporter);
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.fromTag(TagGenerator.AMETHYST_BLOCKS), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.AMETHYST_PILLAR.asItem())
        .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_BLOCK))
        .offerTo(exporter);
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.fromTag(TagGenerator.AMETHYST_BLOCKS), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.TRIMMED_AMETHYST.asItem())
        .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_BLOCK))
        .offerTo(exporter);
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.fromTag(TagGenerator.AMETHYST_BLOCKS), RecipeCategory.BUILDING_BLOCKS, Items.AMETHYST_BLOCK)
        .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_BLOCK))
        .offerTo(exporter);
        // Tiles
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.POLISHED_TILES.asItem(), 4)
        .pattern("Dd")
        .pattern("dD")
        .input('D', Items.POLISHED_DEEPSLATE)
        .input('d', Items.POLISHED_DIORITE)
        .criterion(FabricRecipeProvider.hasItem(Items.POLISHED_DEEPSLATE), FabricRecipeProvider.conditionsFromItem(Items.POLISHED_DEEPSLATE))
        .criterion(FabricRecipeProvider.hasItem(Items.POLISHED_DIORITE), FabricRecipeProvider.conditionsFromItem(Items.POLISHED_DIORITE))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.POLISHED_TILES.asItem()), FabricRecipeProvider.conditionsFromItem(BlockInitializer.POLISHED_TILES.asItem()))
        .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.POLISHED_TILE_SLAB.asItem(), 6)
        .pattern("TTT")
        .input('T', BlockInitializer.POLISHED_TILES)
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.POLISHED_TILES.asItem()), FabricRecipeProvider.conditionsFromItem(BlockInitializer.POLISHED_TILES.asItem()))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.POLISHED_TILE_SLAB.asItem()), FabricRecipeProvider.conditionsFromItem(BlockInitializer.POLISHED_TILE_SLAB.asItem()))
        .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.POLISHED_TILE_STAIRS.asItem(), 4)
        .pattern("T  ")
        .pattern("TT ")
        .pattern("TTT")
        .input('T', BlockInitializer.POLISHED_TILES)
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.POLISHED_TILES.asItem()), FabricRecipeProvider.conditionsFromItem(BlockInitializer.POLISHED_TILES.asItem()))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.POLISHED_TILE_STAIRS.asItem()), FabricRecipeProvider.conditionsFromItem(BlockInitializer.POLISHED_TILE_STAIRS.asItem()))
        .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.POLISHED_TILE_WALL.asItem(), 4)
        .pattern("TTT")
        .pattern("TTT")
        .input('T', BlockInitializer.POLISHED_TILES)
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.POLISHED_TILES.asItem()), FabricRecipeProvider.conditionsFromItem(BlockInitializer.POLISHED_TILES.asItem()))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.POLISHED_TILE_WALL.asItem()), FabricRecipeProvider.conditionsFromItem(BlockInitializer.POLISHED_TILE_WALL.asItem()))
        .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.CHISELED_POLISHED_TILES.asItem(), 4)
        .pattern("T")
        .pattern("T")
        .input('T', BlockInitializer.POLISHED_TILE_SLAB)
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.POLISHED_TILE_SLAB.asItem()), FabricRecipeProvider.conditionsFromItem(BlockInitializer.POLISHED_TILE_SLAB.asItem()))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.CHISELED_POLISHED_TILES.asItem()), FabricRecipeProvider.conditionsFromItem(BlockInitializer.CHISELED_POLISHED_TILES.asItem()))
        .offerTo(exporter);
        // Tiles (Stonecutting)
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(BlockInitializer.POLISHED_TILES.asItem()), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.POLISHED_TILE_SLAB.asItem(), 2)
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.POLISHED_TILES.asItem()), FabricRecipeProvider.conditionsFromItem(BlockInitializer.POLISHED_TILES.asItem()))
        .offerTo(exporter, Identifier.of("bitsnbobs", "polished_tile_slab_from_stonecutting"));
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(BlockInitializer.POLISHED_TILES.asItem()), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.POLISHED_TILE_STAIRS.asItem())
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.POLISHED_TILES.asItem()), FabricRecipeProvider.conditionsFromItem(BlockInitializer.POLISHED_TILES.asItem()))
        .offerTo(exporter, Identifier.of("bitsnbobs", "polished_tile_stairs_from_stonecutting"));
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(BlockInitializer.POLISHED_TILES.asItem()), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.POLISHED_TILE_WALL.asItem())
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.POLISHED_TILES.asItem()), FabricRecipeProvider.conditionsFromItem(BlockInitializer.POLISHED_TILES.asItem()))
        .offerTo(exporter, Identifier.of("bitsnbobs", "polished_tile_wall_from_stonecutting"));
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(BlockInitializer.POLISHED_TILES.asItem()), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.CHISELED_POLISHED_TILES.asItem())
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.POLISHED_TILES.asItem()), FabricRecipeProvider.conditionsFromItem(BlockInitializer.POLISHED_TILES.asItem()))
        .offerTo(exporter, Identifier.of("bitsnbobs", "chiseled_polished_tiles_from_stonecutting"));
        // Blue Nether Bricks
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.BLUE_NETHER_BRICKS.asItem(), 4)
        .pattern("WB")
        .pattern("BW")
        .input('W', ItemInitializer.WARPED_WART)
        .input('B', Items.NETHER_BRICKS)
        .criterion(FabricRecipeProvider.hasItem(ItemInitializer.WARPED_WART), FabricRecipeProvider.conditionsFromItem(ItemInitializer.WARPED_WART))
        .criterion(FabricRecipeProvider.hasItem(Items.NETHER_BRICKS), FabricRecipeProvider.conditionsFromItem(Items.NETHER_BRICKS))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.BLUE_NETHER_BRICKS.asItem()), FabricRecipeProvider.conditionsFromItem(BlockInitializer.BLUE_NETHER_BRICKS.asItem()))
        .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.BLUE_NETHER_BRICK_SLAB.asItem(), 6)
        .pattern("TTT")
        .input('T', BlockInitializer.BLUE_NETHER_BRICKS)
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.BLUE_NETHER_BRICKS.asItem()), FabricRecipeProvider.conditionsFromItem(BlockInitializer.BLUE_NETHER_BRICKS.asItem()))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.BLUE_NETHER_BRICK_SLAB.asItem()), FabricRecipeProvider.conditionsFromItem(BlockInitializer.BLUE_NETHER_BRICK_SLAB.asItem()))
        .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.BLUE_NETHER_BRICK_STAIRS.asItem(), 4)
        .pattern("T  ")
        .pattern("TT ")
        .pattern("TTT")
        .input('T', BlockInitializer.BLUE_NETHER_BRICKS)
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.BLUE_NETHER_BRICKS.asItem()), FabricRecipeProvider.conditionsFromItem(BlockInitializer.BLUE_NETHER_BRICKS.asItem()))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.BLUE_NETHER_BRICK_STAIRS.asItem()), FabricRecipeProvider.conditionsFromItem(BlockInitializer.BLUE_NETHER_BRICK_STAIRS.asItem()))
        .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.BLUE_NETHER_BRICK_WALL.asItem(), 4)
        .pattern("TTT")
        .pattern("TTT")
        .input('T', BlockInitializer.BLUE_NETHER_BRICKS)
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.BLUE_NETHER_BRICKS.asItem()), FabricRecipeProvider.conditionsFromItem(BlockInitializer.BLUE_NETHER_BRICKS.asItem()))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.BLUE_NETHER_BRICK_WALL.asItem()), FabricRecipeProvider.conditionsFromItem(BlockInitializer.BLUE_NETHER_BRICK_WALL.asItem()))
        .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.CHISELED_BLUE_NETHER_BRICKS.asItem(), 4)
        .pattern("T")
        .pattern("T")
        .input('T', BlockInitializer.BLUE_NETHER_BRICK_SLAB)
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.BLUE_NETHER_BRICK_SLAB.asItem()), FabricRecipeProvider.conditionsFromItem(BlockInitializer.BLUE_NETHER_BRICK_SLAB.asItem()))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.CHISELED_BLUE_NETHER_BRICKS.asItem()), FabricRecipeProvider.conditionsFromItem(BlockInitializer.CHISELED_BLUE_NETHER_BRICKS.asItem()))
        .offerTo(exporter);
        // Blue Nether Bricks (Stonecutting)
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(BlockInitializer.BLUE_NETHER_BRICKS.asItem()), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.BLUE_NETHER_BRICK_SLAB.asItem(), 2)
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.BLUE_NETHER_BRICKS.asItem()), FabricRecipeProvider.conditionsFromItem(BlockInitializer.BLUE_NETHER_BRICKS.asItem()))
        .offerTo(exporter, Identifier.of("bitsnbobs", "blue_nether_brick_slab_from_stonecutting"));
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(BlockInitializer.BLUE_NETHER_BRICKS.asItem()), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.BLUE_NETHER_BRICK_STAIRS.asItem())
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.BLUE_NETHER_BRICKS.asItem()), FabricRecipeProvider.conditionsFromItem(BlockInitializer.BLUE_NETHER_BRICKS.asItem()))
        .offerTo(exporter, Identifier.of("bitsnbobs", "blue_nether_brick_stairs_from_stonecutting"));
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(BlockInitializer.BLUE_NETHER_BRICKS.asItem()), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.BLUE_NETHER_BRICK_WALL.asItem())
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.BLUE_NETHER_BRICKS.asItem()), FabricRecipeProvider.conditionsFromItem(BlockInitializer.BLUE_NETHER_BRICKS.asItem()))
        .offerTo(exporter, Identifier.of("bitsnbobs", "blue_nether_brick_wall_from_stonecutting"));
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(BlockInitializer.BLUE_NETHER_BRICKS.asItem()), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.CHISELED_BLUE_NETHER_BRICKS.asItem())
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.BLUE_NETHER_BRICKS.asItem()), FabricRecipeProvider.conditionsFromItem(BlockInitializer.BLUE_NETHER_BRICKS.asItem()))
        .offerTo(exporter, Identifier.of("bitsnbobs", "chiseled_blue_nether_bricks_from_stonecutting"));
        // Red Chiseled Nether Bricks
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInitializer.CHISELED_RED_NETHER_BRICKS.asItem(), 4)
        .pattern("T")
        .pattern("T")
        .input('T', Items.RED_NETHER_BRICK_SLAB)
        .criterion(FabricRecipeProvider.hasItem(Items.RED_NETHER_BRICK_SLAB), FabricRecipeProvider.conditionsFromItem(Items.RED_NETHER_BRICK_SLAB))
        .criterion(FabricRecipeProvider.hasItem(BlockInitializer.CHISELED_RED_NETHER_BRICKS.asItem()), FabricRecipeProvider.conditionsFromItem(BlockInitializer.CHISELED_RED_NETHER_BRICKS.asItem()))
        .offerTo(exporter);
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.RED_NETHER_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.CHISELED_RED_NETHER_BRICKS.asItem())
        .criterion(FabricRecipeProvider.hasItem(Items.RED_NETHER_BRICK_SLAB), FabricRecipeProvider.conditionsFromItem(Items.RED_NETHER_BRICK_SLAB))
        .offerTo(exporter, Identifier.of("bitsnbobs", "chiseled_red_nether_bricks_from_stonecutting"));
        // Copper "Sanding" (stonecutting)
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.COPPER_BLOCK), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.SANDED_COPPER_BLOCK.asItem())
        .criterion(FabricRecipeProvider.hasItem(Items.COPPER_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.COPPER_BLOCK))
        .offerTo(exporter, Identifier.of("bitsnbobs", "sanding_copper"));
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.WEATHERED_COPPER), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.SANDED_WEATHERED_COPPER_BLOCK.asItem())
        .criterion(FabricRecipeProvider.hasItem(Items.WEATHERED_COPPER), FabricRecipeProvider.conditionsFromItem(Items.WEATHERED_COPPER))
        .offerTo(exporter, Identifier.of("bitsnbobs", "sanding_weathered_copper"));
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.EXPOSED_COPPER), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.SANDED_EXPOSED_COPPER_BLOCK.asItem())
        .criterion(FabricRecipeProvider.hasItem(Items.EXPOSED_COPPER), FabricRecipeProvider.conditionsFromItem(Items.EXPOSED_COPPER))
        .offerTo(exporter, Identifier.of("bitsnbobs", "sanding_exposed_copper"));
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.OXIDIZED_COPPER), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.SANDED_OXIDIZED_COPPER_BLOCK.asItem())
        .criterion(FabricRecipeProvider.hasItem(Items.OXIDIZED_COPPER), FabricRecipeProvider.conditionsFromItem(Items.OXIDIZED_COPPER))
        .offerTo(exporter, Identifier.of("bitsnbobs", "sanding_oxidized_copper"));
        // Waxed equivalents (i dont want people having to deal with mass stonecutting and THEN waxing, most people have a backlog of waxed copper anyway)
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.WAXED_COPPER_BLOCK), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.WAXED_SANDED_COPPER_BLOCK.asItem())
        .criterion(FabricRecipeProvider.hasItem(Items.WAXED_COPPER_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.WAXED_COPPER_BLOCK))
        .offerTo(exporter, Identifier.of("bitsnbobs", "sanding_waxed_copper"));
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.WAXED_WEATHERED_COPPER), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.WAXED_SANDED_WEATHERED_COPPER_BLOCK.asItem())
        .criterion(FabricRecipeProvider.hasItem(Items.WAXED_WEATHERED_COPPER), FabricRecipeProvider.conditionsFromItem(Items.WAXED_WEATHERED_COPPER))
        .offerTo(exporter, Identifier.of("bitsnbobs", "sanding_waxed_weathered_copper"));
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.WAXED_EXPOSED_COPPER), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.WAXED_SANDED_EXPOSED_COPPER_BLOCK.asItem())
        .criterion(FabricRecipeProvider.hasItem(Items.WAXED_EXPOSED_COPPER), FabricRecipeProvider.conditionsFromItem(Items.WAXED_EXPOSED_COPPER))
        .offerTo(exporter, Identifier.of("bitsnbobs", "sanding_waxed_exposed_copper"));
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.WAXED_OXIDIZED_COPPER), RecipeCategory.BUILDING_BLOCKS, BlockInitializer.WAXED_SANDED_OXIDIZED_COPPER_BLOCK.asItem())
        .criterion(FabricRecipeProvider.hasItem(Items.WAXED_OXIDIZED_COPPER), FabricRecipeProvider.conditionsFromItem(Items.WAXED_OXIDIZED_COPPER))
        .offerTo(exporter, Identifier.of("bitsnbobs", "sanding_waxed_oxidized_copper"));
        // Warped Wart salvaging
        RecipeProvider.offerSmelting(exporter, List.of(Items.WARPED_WART_BLOCK), RecipeCategory.BUILDING_BLOCKS, ItemInitializer.WARPED_WART, 0.1F, 300, "bitsnbobs");
    }
}