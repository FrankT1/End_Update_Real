package com.frookus.endupdatereal.item;

import com.frookus.endupdatereal.EndUpdateReal;
import com.frookus.endupdatereal.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup END_UPDATE_REAL_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(EndUpdateReal.MOD_ID, "end_update_real_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(Items.STRUCTURE_VOID))
                    .displayName(Text.translatable("itemgroup.endupdatereal.end_update_real_items"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.TEST_ITEM);
                        entries.add(ModBlocks.TEST_BLOCK);
                        entries.add(ModBlocks.TEST_BLOCK_2);
                        entries.add(ModItems.ENDER_DUST);
                        entries.add(ModItems.MORTAR);
                    }))

                    .build());




    public static void initializeItemGroups() {
    }
}
