package com.frookus.endupdatereal.client.datagen;

import com.frookus.endupdatereal.EndUpdateReal;
import com.frookus.endupdatereal.block.ModBlocks;
import com.frookus.endupdatereal.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

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

//                createShaped(RecipeCategory.TOOLS, ModItems.MORTAR)
//                        .pattern("   ")
//                        .pattern("SFS")
//                        .pattern(" S ")
//                        .input('F', Items.FLINT)
//                        .input('S', Items.STONE)
//                        .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
//                        .offerTo(exporter);

            }
        };
    }

    @Override
    public String getName() {
        return "EndUpdateRealRecipeProvider";
    }
}
