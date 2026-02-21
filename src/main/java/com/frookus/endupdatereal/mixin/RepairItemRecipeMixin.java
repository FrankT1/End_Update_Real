package com.frookus.endupdatereal.mixin;

import com.frookus.endupdatereal.item.ModItems;
import com.mojang.datafixers.util.Pair;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RepairItemRecipe;
import net.minecraft.recipe.SpecialCraftingRecipe;
import net.minecraft.recipe.book.CraftingRecipeCategory;
import net.minecraft.recipe.input.CraftingRecipeInput;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(RepairItemRecipe.class)
public abstract class RepairItemRecipeMixin extends SpecialCraftingRecipe {
    public RepairItemRecipeMixin(CraftingRecipeCategory category) {
        super(category);
    }

    @Inject(method = "findPair",at = @At(value = "HEAD"), cancellable = true)

    private static void findPair(CraftingRecipeInput craftingRecipeInput, CallbackInfoReturnable<Pair<ItemStack, ItemStack>> cir) {
        for (int i = 0; i < craftingRecipeInput.size(); ++i) {
            ItemStack itemStack2 = craftingRecipeInput.getStackInSlot(i);
            if (itemStack2.getItem() == ModItems.MORTAR) {
                cir.cancel();
            }
        }
    }
}
