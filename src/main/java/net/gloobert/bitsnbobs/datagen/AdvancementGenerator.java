package net.gloobert.bitsnbobs.datagen;

import java.util.function.Consumer;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.gloobert.bitsnbobs.content.BlockInitializer;
import net.gloobert.bitsnbobs.content.ItemInitializer;
import net.minecraft.advancement.*;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class AdvancementGenerator extends FabricAdvancementProvider {
        public AdvancementGenerator(FabricDataOutput output) {
            super(output);
        }

        @SuppressWarnings("unused")
        @Override
        public void generateAdvancement(Consumer<Advancement> consumer) {
            Advancement rootAdvancement = Advancement.Builder.create()
                    .display(
                            Items.WARPED_WART_BLOCK, // The display icon
                            Text.translatable("advancements.bitsnbobs.root.title"), // The title
                            Text.translatable("advancements.bitsnbobs.root.description"), // The description
                            new Identifier("textures/gui/advancements/backgrounds/adventure.png"), // Background image used
                            AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                            true, // Show toast top right
                            false, // Announce to chat
                            false // Hidden in the advancement tab
                    )
                    // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                    .criterion("held_warped_wart", InventoryChangedCriterion.Conditions.items(ItemInitializer.WARPED_WART))
                    .build(consumer, "bitsnbobs" + "/root");
            Advancement warpedWart = Advancement.Builder.create().parent(rootAdvancement)
                    .display(
                            ItemInitializer.WARPED_WART, // The display icon
                            Text.translatable("advancements.bitsnbobs.warped_wart.title"), // The title
                            Text.translatable("advancements.bitsnbobs.warped_wart.description"), // The description
                            new Identifier("textures/gui/advancements/backgrounds/adventure.png"), // Background image used
                            AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                            true, // Show toast top right
                            true, // Announce to chat
                            false // Hidden in the advancement tab
                    )
                    // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                    .criterion("held_warped_wart", InventoryChangedCriterion.Conditions.items(ItemInitializer.WARPED_WART))
                    .build(consumer, "bitsnbobs" + "/warped_wart");
            Advancement heldQuartzQuartz = Advancement.Builder.create().parent(rootAdvancement)
                    .display(
                            BlockInitializer.QUARTZ_GILDED_QUARTZ, // The display icon
                            Text.translatable("advancements.bitsnbobs.quartz_quartz.title"), // The title
                            Text.translatable("advancements.bitsnbobs.quartz_quartz.description"), // The description
                            new Identifier("textures/gui/advancements/backgrounds/adventure.png"), // Background image used
                            AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                            true, // Show toast top right
                            true, // Announce to chat
                            false // Hidden in the advancement tab
                    )
                    // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                    .criterion("held_quartz_quartz", InventoryChangedCriterion.Conditions.items(BlockInitializer.QUARTZ_GILDED_QUARTZ))
                    .build(consumer, "bitsnbobs" + "/held_quartz_quartz");
            Advancement netheriteDeepslate = Advancement.Builder.create().parent(heldQuartzQuartz)
                    .display(
                            BlockInitializer.NETHERITE_GILDED_DEEPSLATE, // The display icon
                            Text.translatable("advancements.bitsnbobs.netherite_deepslate.title"), // The title
                            Text.translatable("advancements.bitsnbobs.netherite_deepslate.description"), // The description
                            new Identifier("textures/gui/advancements/backgrounds/adventure.png"), // Background image used
                            AdvancementFrame.CHALLENGE, // Options: TASK, CHALLENGE, GOAL
                            true, // Show toast top right
                            true, // Announce to chat
                            true // Hidden in the advancement tab
                    )
                    // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                    .criterion("held_netherite_deepslate", InventoryChangedCriterion.Conditions.items(BlockInitializer.NETHERITE_GILDED_DEEPSLATE))
                    .build(consumer, "bitsnbobs" + "/held_netherite_deepslate");
            Advancement lovelyRoses = Advancement.Builder.create().parent(rootAdvancement)
                    .display(
                            BlockInitializer.SINGLE_ROSE, // The display icon
                            Text.translatable("advancements.bitsnbobs.lovely_roses.title"), // The title
                            Text.translatable("advancements.bitsnbobs.lovely_roses.description"), // The description
                            new Identifier("textures/gui/advancements/backgrounds/adventure.png"), // Background image used
                            AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                            true, // Show toast top right
                            true, // Announce to chat
                            false // Hidden in the advancement tab
                    )
                    // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                    .criterion("lovely_roses", InventoryChangedCriterion.Conditions.items(BlockInitializer.SINGLE_ROSE))
                    .build(consumer, "bitsnbobs" + "/lovely_roses");
            Advancement pastelPalette = Advancement.Builder.create().parent(lovelyRoses)
                    .display(
                            BlockInitializer.PALE_ROSE, // The display icon
                            Text.translatable("advancements.bitsnbobs.pastel_palette.title"), // The title
                            Text.translatable("advancements.bitsnbobs.pastel_palette.description"), // The description
                            new Identifier("textures/gui/advancements/backgrounds/adventure.png"), // Background image used
                            AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                            true, // Show toast top right
                            true, // Announce to chat
                            false // Hidden in the advancement tab
                    )
                    // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                    .criterion("pastel_palette", InventoryChangedCriterion.Conditions.items(BlockInitializer.PALE_ROSE))
                    .build(consumer, "bitsnbobs" + "/pastel_palette");
            Advancement aBeautifulBouquet = Advancement.Builder.create().parent(lovelyRoses)
                    .display(
                            ItemInitializer.ROSE_BOUQUET, // The display icon
                            Text.translatable("advancements.bitsnbobs.a_beautiful_bouquet.title"), // The title
                            Text.translatable("advancements.bitsnbobs.a_beautiful_bouquet.description"), // The description
                            new Identifier("textures/gui/advancements/backgrounds/adventure.png"), // Background image used
                            AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                            true, // Show toast top right
                            true, // Announce to chat
                            false // Hidden in the advancement tab
                    )
                    // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                    .criterion("a_beautiful_bouquet", InventoryChangedCriterion.Conditions.items(ItemInitializer.ROSE_BOUQUET))
                    .build(consumer, "bitsnbobs" + "/a_beautiful_bouquet");
            Advancement SpectrumOfColor = Advancement.Builder.create().parent(pastelPalette)
                    .display(
                            BlockInitializer.SUNSET_ROSE, // The display icon
                            Text.translatable("advancements.bitsnbobs.spectrum_of_color.title"), // The title
                            Text.translatable("advancements.bitsnbobs.spectrum_of_color.description"), // The description
                            new Identifier("textures/gui/advancements/backgrounds/adventure.png"), // Background image used
                            AdvancementFrame.GOAL, // Options: TASK, CHALLENGE, GOAL
                            true, // Show toast top right
                            true, // Announce to chat
                            false // Hidden in the advancement tab
                    )
                    // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                    .criterion("spectrum_of_color", InventoryChangedCriterion.Conditions.items(BlockInitializer.SINGLE_ROSE, BlockInitializer.CYAN_ROSE, BlockInitializer.PALE_ROSE, BlockInitializer.SUNSET_ROSE, BlockInitializer.DARKENED_ROSE, BlockInitializer.LAVENDER_ROSE))
                    .build(consumer, "bitsnbobs" + "/spectrum_of_color");
        }
    }
