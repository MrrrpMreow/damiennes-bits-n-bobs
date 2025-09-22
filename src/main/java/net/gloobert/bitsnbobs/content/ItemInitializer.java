package net.gloobert.bitsnbobs.content;

import net.minecraft.item.Item;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;

public class ItemInitializer {
    private ItemInitializer() {}
 
    public static final Item WARPED_WART = register("warped_wart", new AliasedBlockItem(BlockInitializer.WARPED_WART_CROP, new Item.Settings()));
 
    public static <T extends Item> T register(String path, T item) {
        return Registry.register(Registries.ITEM, new Identifier("bitsnbobs", path), item);
    }
 
    public static void initialize() {
    }
}
