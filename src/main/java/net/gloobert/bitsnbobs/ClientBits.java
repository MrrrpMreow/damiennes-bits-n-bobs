package net.gloobert.bitsnbobs;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.gloobert.bitsnbobs.content.BlockInitializer;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class ClientBits implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), BlockInitializer.WARPED_WART_CROP);
    }
}
