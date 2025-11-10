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
            // Gilded Deepslate
            entries.add(BlockInitializer.GILDED_DEEPSLATE);
            entries.add(BlockInitializer.IRON_GILDED_DEEPSLATE);
            entries.add(BlockInitializer.COPPER_GILDED_DEEPSLATE);
            entries.add(BlockInitializer.DIAMOND_GILDED_DEEPSLATE);
            entries.add(BlockInitializer.EMERALD_GILDED_DEEPSLATE);
            entries.add(BlockInitializer.LAPIS_GILDED_DEEPSLATE);
            entries.add(BlockInitializer.NETHERITE_GILDED_DEEPSLATE);
            entries.add(BlockInitializer.REDSTONE_GILDED_DEEPSLATE);
            entries.add(BlockInitializer.AMETHYST_GILDED_DEEPSLATE);
            entries.add(BlockInitializer.QUARTZ_GILDED_DEEPSLATE);
            // Gilded Quartz
            entries.add(BlockInitializer.GILDED_QUARTZ);
            entries.add(BlockInitializer.IRON_GILDED_QUARTZ);
            entries.add(BlockInitializer.COPPER_GILDED_QUARTZ);
            entries.add(BlockInitializer.DIAMOND_GILDED_QUARTZ);
            entries.add(BlockInitializer.EMERALD_GILDED_QUARTZ);
            entries.add(BlockInitializer.LAPIS_GILDED_QUARTZ);
            entries.add(BlockInitializer.NETHERITE_GILDED_QUARTZ);
            entries.add(BlockInitializer.REDSTONE_GILDED_QUARTZ);
            entries.add(BlockInitializer.AMETHYST_GILDED_QUARTZ);
            entries.add(BlockInitializer.QUARTZ_GILDED_QUARTZ);
            //Flowers
            entries.add(BlockInitializer.SINGLE_ROSE);
            entries.add(ItemInitializer.ROSE_BOUQUET);
            entries.add(BlockInitializer.PALE_ROSE);
            entries.add(ItemInitializer.PALE_ROSE_BOUQUET);
            entries.add(BlockInitializer.CYAN_ROSE);
            entries.add(ItemInitializer.CYAN_ROSE_BOUQUET);
            entries.add(BlockInitializer.SUNSET_ROSE);
            entries.add(ItemInitializer.SUNSET_ROSE_BOUQUET);
            entries.add(BlockInitializer.DARKENED_ROSE);
            entries.add(ItemInitializer.DARKENED_ROSE_BOUQUET);
            entries.add(BlockInitializer.LAVENDER_ROSE);
            entries.add(ItemInitializer.LAVENDER_ROSE_BOUQUET);
            //Mud Blocks
            entries.add(BlockInitializer.MUD_PILLAR);
            entries.add(BlockInitializer.CHISELED_MUD_BRICKS);
            entries.add(BlockInitializer.MOSSY_MUD_BRICKS);
            entries.add(BlockInitializer.MOSSY_MUD_BRICK_SLAB);
            entries.add(BlockInitializer.MOSSY_MUD_BRICK_STAIRS);
            entries.add(BlockInitializer.MOSSY_MUD_BRICK_WALL);
            entries.add(BlockInitializer.POLISHED_MUD);
            entries.add(BlockInitializer.POLISHED_MUD_SLAB);
            entries.add(BlockInitializer.POLISHED_MUD_STAIRS);
            entries.add(BlockInitializer.POLISHED_MUD_WALL);
            // Clay
            entries.add(BlockInitializer.CLAY_WHITE);
            entries.add(BlockInitializer.CLAY_LIGHT_GRAY);
            entries.add(BlockInitializer.CLAY_GRAY);
            entries.add(BlockInitializer.CLAY_BLACK);
            entries.add(BlockInitializer.CLAY_BROWN);
            entries.add(BlockInitializer.CLAY_RED);
            entries.add(BlockInitializer.CLAY_ORANGE);
            entries.add(BlockInitializer.CLAY_YELLOW);
            entries.add(BlockInitializer.CLAY_LIME);
            entries.add(BlockInitializer.CLAY_GREEN);
            entries.add(BlockInitializer.CLAY_CYAN);
            entries.add(BlockInitializer.CLAY_LIGHT_BLUE);
            entries.add(BlockInitializer.CLAY_BLUE);
            entries.add(BlockInitializer.CLAY_PURPLE);
            entries.add(BlockInitializer.CLAY_MAGENTA);
            entries.add(BlockInitializer.CLAY_PINK);
        })
        .build());
    public static void initialize() {
    }
}