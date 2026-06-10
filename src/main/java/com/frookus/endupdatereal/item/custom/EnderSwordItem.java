package com.frookus.endupdatereal.item.custom;


import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Objects;

public class EnderSwordItem extends Item {

    public EnderSwordItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {

        Vec3d pos = user.raycast(8.0d, 0.05f, false).getPos();

        System.out.println(pos.toString());

//        user.teleport(pos.getX(), pos.getY(), pos.getZ(), true);

        user.setPosition(pos);
        world.playSound(user, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS);

        return ActionResult.SUCCESS;
    }
}