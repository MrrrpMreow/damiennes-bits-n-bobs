package net.gloobert.bitsnbobs.content;

import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class CreativeInventoryTab {
        public static final ItemGroup BITSNBOBS = Registry.register(Registries.ITEM_GROUP, new Identifier("bitsnbobs", "bitsnbobs_creative"), FabricItemGroup.builder()
        .icon(() -> new ItemStack(ItemInitializer.WARPED_WART))
        .displayName(Text.translatable("itemGroup.bitsnbobs.bitsnbobs_creative"))
        .entries((context, entries) -> {
            // Warped Wart and related items
            entries.add(ItemInitializer.WARPED_WART);
            entries.add(BlockInitializer.BLUE_NETHER_BRICKS);
            entries.add(BlockInitializer.BLUE_NETHER_BRICK_STAIRS);
            entries.add(BlockInitializer.BLUE_NETHER_BRICK_SLAB);
            entries.add(BlockInitializer.BLUE_NETHER_BRICK_WALL);
            entries.add(BlockInitializer.CHISELED_BLUE_NETHER_BRICKS);
            entries.add(BlockInitializer.CHISELED_RED_NETHER_BRICKS);
            // Building Blocks
            entries.add(BlockInitializer.POLISHED_TILES);
            entries.add(BlockInitializer.POLISHED_TILE_STAIRS);
            entries.add(BlockInitializer.POLISHED_TILE_SLAB);
            entries.add(BlockInitializer.POLISHED_TILE_WALL);
            entries.add(BlockInitializer.CHISELED_POLISHED_TILES);
            // Corruption
            entries.add(BlockInitializer.PURIFIED_CORRUPTION);
            entries.add(BlockInitializer.REFINED_CORRUPTION);
            // Woven Wool
            entries.add(BlockInitializer.WOVEN_WOOL_WHITE);
            entries.add(BlockInitializer.WOVEN_WOOL_LIGHT_GRAY);
            entries.add(BlockInitializer.WOVEN_WOOL_GRAY);
            entries.add(BlockInitializer.WOVEN_WOOL_BLACK);
            entries.add(BlockInitializer.WOVEN_WOOL_BROWN);
            entries.add(BlockInitializer.WOVEN_WOOL_RED);
            entries.add(BlockInitializer.WOVEN_WOOL_ORANGE);
            entries.add(BlockInitializer.WOVEN_WOOL_YELLOW);
            entries.add(BlockInitializer.WOVEN_WOOL_LIME);
            entries.add(BlockInitializer.WOVEN_WOOL_GREEN);
            entries.add(BlockInitializer.WOVEN_WOOL_CYAN);
            entries.add(BlockInitializer.WOVEN_WOOL_LIGHT_BLUE);
            entries.add(BlockInitializer.WOVEN_WOOL_BLUE);
            entries.add(BlockInitializer.WOVEN_WOOL_PURPLE);
            entries.add(BlockInitializer.WOVEN_WOOL_MAGENTA);
            entries.add(BlockInitializer.WOVEN_WOOL_PINK);
            // Woven Carpet
            entries.add(BlockInitializer.WOVEN_CARPET_WHITE);
            entries.add(BlockInitializer.WOVEN_CARPET_LIGHT_GRAY);
            entries.add(BlockInitializer.WOVEN_CARPET_GRAY);
            entries.add(BlockInitializer.WOVEN_CARPET_BLACK);
            entries.add(BlockInitializer.WOVEN_CARPET_BROWN);
            entries.add(BlockInitializer.WOVEN_CARPET_RED);
            entries.add(BlockInitializer.WOVEN_CARPET_ORANGE);
            entries.add(BlockInitializer.WOVEN_CARPET_YELLOW);
            entries.add(BlockInitializer.WOVEN_CARPET_LIME);
            entries.add(BlockInitializer.WOVEN_CARPET_GREEN);
            entries.add(BlockInitializer.WOVEN_CARPET_CYAN);
            entries.add(BlockInitializer.WOVEN_CARPET_LIGHT_BLUE);
            entries.add(BlockInitializer.WOVEN_CARPET_BLUE);
            entries.add(BlockInitializer.WOVEN_CARPET_PURPLE);
            entries.add(BlockInitializer.WOVEN_CARPET_MAGENTA);
            entries.add(BlockInitializer.WOVEN_CARPET_PINK);
            // Amethyst Block Palette
            entries.add(BlockInitializer.CUT_AMETHYST_BLOCK);
            entries.add(BlockInitializer.POLISHED_CUT_AMETHYST_BLOCK);
            entries.add(BlockInitializer.CUT_AMETHYST_TILES);
            entries.add(BlockInitializer.POLISHED_AMETHYST_BLOCK);
            entries.add(BlockInitializer.POLISHED_AMETHYST_BRICKS);
            entries.add(BlockInitializer.TRIMMED_AMETHYST);
            entries.add(BlockInitializer.AMETHYST_PILLAR);
            // Sanded Copper
            entries.add(BlockInitializer.SANDED_COPPER_BLOCK);
            entries.add(BlockInitializer.SANDED_EXPOSED_COPPER_BLOCK);
            entries.add(BlockInitializer.SANDED_WEATHERED_COPPER_BLOCK);
            entries.add(BlockInitializer.SANDED_OXIDIZED_COPPER_BLOCK);
            entries.add(BlockInitializer.WAXED_SANDED_COPPER_BLOCK);
            entries.add(BlockInitializer.WAXED_SANDED_EXPOSED_COPPER_BLOCK);
            entries.add(BlockInitializer.WAXED_SANDED_WEATHERED_COPPER_BLOCK);
            entries.add(BlockInitializer.WAXED_SANDED_OXIDIZED_COPPER_BLOCK);

            // Etc
            entries.add(BlockInitializer.GILDED_DEEPSLATE);

        })
        .build());
    public static void initialize() {
    }
}