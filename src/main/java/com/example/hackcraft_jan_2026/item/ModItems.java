package com.example.hackcraft_jan_2026.item;

import com.example.hackcraft_jan_2026.Hackcraft_jan_2026;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;



public class ModItems {

    public static final Item TEST_ITEM = registerItem("test_item", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Hackcraft_jan_2026.MOD_ID,"test_item")))));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Hackcraft_jan_2026.MOD_ID), item);

    }



    public static void initializeModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(TEST_ITEM);
        });

    }



}
