package net.gloobert.bitsnbobs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.concurrent.*;

import net.gloobert.bitsnbobs.content.BlockInitializer;

public class TagGenerator extends FabricTagProvider<Item> {
   public static final TagKey<Item> WOVEN_WOOL = TagKey.of(RegistryKeys.ITEM, Identifier.of("bitsnbobs", "woven_wool"));
   public static final TagKey<Item> WOVEN_CARPET = TagKey.of(RegistryKeys.ITEM, Identifier.of("bitsnbobs", "woven_carpet"));
   public static final TagKey<Item> AMETHYST_BLOCKS = TagKey.of(RegistryKeys.ITEM, Identifier.of("bitsnbobs", "amethyst_blocks"));

   public TagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.ITEM, registriesFuture);
   }
 
   @Override
   protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(WOVEN_WOOL)
            .add(BlockInitializer.WOVEN_WOOL_BLACK.asItem())
            .add(BlockInitializer.WOVEN_WOOL_BLUE.asItem())
            .add(BlockInitializer.WOVEN_WOOL_BROWN.asItem())
            .add(BlockInitializer.WOVEN_WOOL_CYAN.asItem())
            .add(BlockInitializer.WOVEN_WOOL_GRAY.asItem())
            .add(BlockInitializer.WOVEN_WOOL_GREEN.asItem())
            .add(BlockInitializer.WOVEN_WOOL_LIGHT_BLUE.asItem())
            .add(BlockInitializer.WOVEN_WOOL_LIGHT_GRAY.asItem())
            .add(BlockInitializer.WOVEN_WOOL_LIME.asItem())
            .add(BlockInitializer.WOVEN_WOOL_MAGENTA.asItem())
            .add(BlockInitializer.WOVEN_WOOL_ORANGE.asItem())
            .add(BlockInitializer.WOVEN_WOOL_PINK.asItem())
            .add(BlockInitializer.WOVEN_WOOL_PURPLE.asItem())
            .add(BlockInitializer.WOVEN_WOOL_RED.asItem())
            .add(BlockInitializer.WOVEN_WOOL_WHITE.asItem())
            .add(BlockInitializer.WOVEN_WOOL_YELLOW.asItem());
        getOrCreateTagBuilder(AMETHYST_BLOCKS)
            .add(BlockInitializer.CUT_AMETHYST_BLOCK.asItem())
            .add(BlockInitializer.POLISHED_CUT_AMETHYST_BLOCK.asItem())
            .add(BlockInitializer.POLISHED_AMETHYST_BLOCK.asItem())
            .add(BlockInitializer.CUT_AMETHYST_TILES.asItem())
            .add(BlockInitializer.POLISHED_AMETHYST_BRICKS.asItem())
            .add(BlockInitializer.AMETHYST_PILLAR.asItem())
            .add(BlockInitializer.TRIMMED_AMETHYST.asItem())
            .add(Items.AMETHYST_BLOCK);
        getOrCreateTagBuilder(WOVEN_CARPET)
            .add(BlockInitializer.WOVEN_CARPET_BLACK.asItem())
            .add(BlockInitializer.WOVEN_CARPET_BLUE.asItem())
            .add(BlockInitializer.WOVEN_CARPET_BROWN.asItem())
            .add(BlockInitializer.WOVEN_CARPET_CYAN.asItem())
            .add(BlockInitializer.WOVEN_CARPET_GRAY.asItem())
            .add(BlockInitializer.WOVEN_CARPET_GREEN.asItem())
            .add(BlockInitializer.WOVEN_CARPET_LIGHT_BLUE.asItem())
            .add(BlockInitializer.WOVEN_CARPET_LIGHT_GRAY.asItem())
            .add(BlockInitializer.WOVEN_CARPET_LIME.asItem())
            .add(BlockInitializer.WOVEN_CARPET_MAGENTA.asItem())
            .add(BlockInitializer.WOVEN_CARPET_ORANGE.asItem())
            .add(BlockInitializer.WOVEN_CARPET_PINK.asItem())
            .add(BlockInitializer.WOVEN_CARPET_PURPLE.asItem())
            .add(BlockInitializer.WOVEN_CARPET_RED.asItem())
            .add(BlockInitializer.WOVEN_CARPET_WHITE.asItem())
            .add(BlockInitializer.WOVEN_CARPET_YELLOW.asItem());
   }
}