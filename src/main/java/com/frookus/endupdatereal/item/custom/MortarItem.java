package com.frookus.endupdatereal.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.jspecify.annotations.NonNull;

public class MortarItem extends Item {

    public MortarItem(Settings settings) {
        super(settings);
    }


    @Override
    public @NonNull ItemStack getRecipeRemainder(ItemStack stack) {

        if (stack.getDamage() < stack.getMaxDamage() - 1) {
            ItemStack moreDamaged = stack.copy();
            moreDamaged.setDamage(stack.getDamage() + 1);
            return moreDamaged;
        }

        return ItemStack.EMPTY;
    }

}
