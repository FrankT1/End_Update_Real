package com.frookus.endupdatereal.client.datagen;

import com.frookus.endupdatereal.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {

            @Override
            public void generate() {

                createShapeless(RecipeCategory.MISC, ModItems.ENDER_DUST)
                        .input(Items.ENDER_PEARL)
                        .input(ModItems.MORTAR)
                        .criterion(hasItem(Items.ENDER_PEARL), conditionsFromItem(Items.ENDER_PEARL))
                        .offerTo(exporter);

                // Can add recipes that give bonus items when using mortar, not tryna get carried away with random features
//                createShapeless(RecipeCategory.MISC, Items.SUGAR, 2)
//                        .input(Items.SUGAR_CANE)
//                        .input(ModItems.MORTAR)
//                        .criterion(hasItem(ModItems.MORTAR), conditionsFromItem(ModItems.MORTAR))
//                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.MORTAR)
                        .pattern(" F ")
                        .pattern("SFS")
                        .pattern(" S ")
                        .input('F', Items.FLINT)
                        .input('S', Items.STONE)
                        .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                        .offerTo(exporter);

            }
        };
    }

    @Override
    public String getName() {
        return "EndUpdateRealRecipeProvider";
    }
}
