package com.frookus.endupdatereal.item.custom;

import com.frookus.endupdatereal.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MortarItem extends Item {

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        return new ItemStack(ModItems.MORTAR);
    }

    public MortarItem(Settings settings) {
        super(settings);
    }
}
