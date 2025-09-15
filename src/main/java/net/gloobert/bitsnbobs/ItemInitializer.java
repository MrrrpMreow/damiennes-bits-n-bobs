package net.gloobert.bitsnbobs;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.gloobert.bitsnbobs.BlockInitializer;

public class ItemInitializer {
    private ItemInitializer() {}
 
    public static final Item WARPED_WART_ITEM = register("warped_wart", new Item(new Item.Settings()));
 
    public static <T extends Item> T register(String path, T item) {
        return Registry.register(Registries.ITEM, new Identifier("bitsnbobs", path), item);
    }
 
    public static void initialize() {
    }
}
