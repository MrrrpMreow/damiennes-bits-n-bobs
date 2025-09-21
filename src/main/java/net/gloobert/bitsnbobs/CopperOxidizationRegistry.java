package net.gloobert.bitsnbobs;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.gloobert.bitsnbobs.BlockInitializer;

public class CopperOxidizationRegistry {

    public static void initialize() {
    OxidizableBlocksRegistry.registerOxidizableBlockPair(BlockInitializer.SANDED_COPPER_BLOCK, BlockInitializer.SANDED_EXPOSED_COPPER_BLOCK);
    OxidizableBlocksRegistry.registerOxidizableBlockPair(BlockInitializer.SANDED_EXPOSED_COPPER_BLOCK, BlockInitializer.SANDED_WEATHERED_COPPER_BLOCK);
    OxidizableBlocksRegistry.registerOxidizableBlockPair(BlockInitializer.SANDED_WEATHERED_COPPER_BLOCK, BlockInitializer.SANDED_OXIDIZED_COPPER_BLOCK);

    OxidizableBlocksRegistry.registerWaxableBlockPair(BlockInitializer.SANDED_COPPER_BLOCK, BlockInitializer.WAXED_SANDED_COPPER_BLOCK);
    OxidizableBlocksRegistry.registerWaxableBlockPair(BlockInitializer.SANDED_EXPOSED_COPPER_BLOCK, BlockInitializer.WAXED_SANDED_EXPOSED_COPPER_BLOCK);
    OxidizableBlocksRegistry.registerWaxableBlockPair(BlockInitializer.SANDED_WEATHERED_COPPER_BLOCK, BlockInitializer.WAXED_SANDED_WEATHERED_COPPER_BLOCK);
    OxidizableBlocksRegistry.registerWaxableBlockPair(BlockInitializer.SANDED_OXIDIZED_COPPER_BLOCK, BlockInitializer.WAXED_SANDED_OXIDIZED_COPPER_BLOCK);
    }
}
