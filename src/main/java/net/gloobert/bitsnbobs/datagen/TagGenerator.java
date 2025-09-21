package net.gloobert.bitsnbobs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import java.util.concurrent.*;

import net.gloobert.bitsnbobs.content.BlockInitializer;

public class TagGenerator extends FabricTagProvider<Item> {
   public static final TagKey<Item> WOVEN_WOOL = TagKey.of(RegistryKeys.ITEM, Identifier.of("bitsnbobs", "woven_wool"));

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
   }
}