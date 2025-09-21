package net.gloobert.bitsnbobs;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.gloobert.bitsnbobs.BlockInitializer;
import net.gloobert.bitsnbobs.ItemInitializer;
import net.gloobert.bitsnbobs.CreativeInventoryTab;
import net.gloobert.bitsnbobs.CopperOxidizationRegistry;

public class DamiennesBitsnBobs implements ModInitializer {
	public static final String MOD_ID = "damiennes-bits-n-bobs";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Adding random junk and trinkets!");
		BlockInitializer.initialize();
		ItemInitializer.initialize();
		CreativeInventoryTab.initialize();
		CopperOxidizationRegistry.initialize();
	}
}
