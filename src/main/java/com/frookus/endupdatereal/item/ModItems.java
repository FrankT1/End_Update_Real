package com.frookus.endupdatereal.item;

import com.frookus.endupdatereal.EndUpdateReal;
import com.frookus.endupdatereal.item.custom.EnderDustItem;
import com.frookus.endupdatereal.item.custom.MortarItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;


public class ModItems {


//    private static Item registerItem(String name, Item item) {
//        return Registry.register(Registries.ITEM, Identifier.of(Hackcraft_jan_2026.MOD_ID), item);
//
//    }

    public static <GenericItem extends Item> GenericItem registerItem(String name, Function<Item.Settings, GenericItem> itemFactory, Item.Settings settings) {

        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EndUpdateReal.MOD_ID, name));

        GenericItem item = itemFactory.apply(settings.registryKey(itemKey));

        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }

    public static final Item TEST_ITEM = registerItem("test_item", Item::new, new Item.Settings());
    public static final Item ENDER_DUST = registerItem("ender_dust", EnderDustItem::new, new Item.Settings());
    public static final Item MORTAR = registerItem("mortar", MortarItem::new, new Item.Settings()
            .maxCount(1)
            .maxDamage(256));

    public static void initializeModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
        });

    }



}
