package com.frookus.endupdatereal.client.datagen;

import com.frookus.endupdatereal.item.ModItems;
import com.frookus.endupdatereal.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        valueLookupBuilder(ModTags.Items.MORTAR_ITEMS)
                .add(ModItems.MORTAR)
                .add(ModItems.OBSIDIAN_MORTAR);
    }
}
