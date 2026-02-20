package com.frookus.endupdatereal.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class EnderDustItem extends Item {
    public EnderDustItem(Settings settings) {
        super(settings);
    }


    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {

        Vec3d blockPos = Vec3d.of(context.getBlockPos());

        blockPos = blockPos.add(0.5, 1.0, 0.5);

        if (!context.getWorld().getBlockState(BlockPos.ofFloored(blockPos)).isSolid()){
            PlayerEntity player = context.getPlayer();
            player.setPosition(blockPos);

            ItemStack itemStack = context.getStack();
            itemStack.increment(-1);
            context.getWorld().playSound(null, context.getBlockPos(), SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS);

            return ActionResult.SUCCESS;
        }
        else {
            return super.useOnBlock(context);
        }

    }
}


