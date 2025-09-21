package net.gloobert.bitsnbobs;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

import net.gloobert.bitsnbobs.datagen.RecipeGenerator;
 
public class DataGen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack BitsNBobsData = generator.createPack();
 
        BitsNBobsData.addProvider(RecipeGenerator::new);
    }
}
