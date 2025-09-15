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

public class GlowstoneCreativeGUI {
        public static final ItemGroup GLOWSTONE_EXTENDED = Registry.register(Registries.ITEM_GROUP, new Identifier("bitsnbobs", "bitsnbobs_creative"), FabricItemGroup.builder()
        .icon(() -> new ItemStack(ItemInitializer.WARPED_WART))
        .displayName(Text.translatable("itemGroup.glowstone-extended.glowstone_extended_creative"))
        .entries((context, entries) -> {
            // Warped Wart and related items
            entries.add(ItemInitializer.WARPED_WART);
            entries.add(BlockInitializer.BLUE_NETHER_BRICKS);
        })
        .build());
    public static void initialize() {
    }
}