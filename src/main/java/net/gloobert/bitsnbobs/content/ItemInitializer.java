package net.gloobert.bitsnbobs.content;

import net.minecraft.item.Item;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;

public class ItemInitializer {
    private ItemInitializer() {}
 
    public static final Item WARPED_WART = register("warped_wart", new AliasedBlockItem(BlockInitializer.WARPED_WART_CROP, new Item.Settings()));
    public static final Item ROSE_BOUQUET = register("rose_bouquet", new Item(new Item.Settings()));
    public static final Item PALE_ROSE_BOUQUET = register("pale_rose_bouquet", new Item(new Item.Settings()));
    public static final Item CYAN_ROSE_BOUQUET = register("cyan_rose_bouquet", new Item(new Item.Settings()));
    public static final Item SUNSET_ROSE_BOUQUET = register("sunset_rose_bouquet", new Item(new Item.Settings()));
    public static final Item DARKENED_ROSE_BOUQUET = register("darkened_rose_bouquet", new Item(new Item.Settings()));
    public static final Item LAVENDER_ROSE_BOUQUET = register("lavender_rose_bouquet", new Item(new Item.Settings()));


    public static <T extends Item> T register(String path, T item) {
        return Registry.register(Registries.ITEM, new Identifier("bitsnbobs", path), item);
    }
 
    public static void initialize() {
    }
}
