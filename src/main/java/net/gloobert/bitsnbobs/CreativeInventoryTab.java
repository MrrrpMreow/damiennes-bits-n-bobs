package net.gloobert.bitsnbobs;

import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.gloobert.bitsnbobs.BlockInitializer;
import net.gloobert.bitsnbobs.ItemInitializer;

public class CreativeInventoryTab {
        public static final ItemGroup GLOWSTONE_EXTENDED = Registry.register(Registries.ITEM_GROUP, new Identifier("bitsnbobs", "bitsnbobs_creative"), FabricItemGroup.builder()
        .icon(() -> new ItemStack(ItemInitializer.WARPED_WART))
        .displayName(Text.translatable("itemGroup.glowstone-extended.glowstone_extended_creative"))
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
            // Etc
            entries.add(BlockInitializer.GILDED_DEEPSLATE);
        })
        .build());
    public static void initialize() {
    }
}