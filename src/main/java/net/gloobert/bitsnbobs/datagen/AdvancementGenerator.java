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
                            true, // Announce to chat
                            false // Hidden in the advancement tab
                    )
                    // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                    .criterion("held_warped_wart", InventoryChangedCriterion.Conditions.items(ItemInitializer.WARPED_WART))
                    .build(consumer, "bitsnbobs" + "/root");
            Advancement.Builder.create().parent(rootAdvancement)
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
            Advancement.Builder.create().parent(rootAdvancement)
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
        }
    }
