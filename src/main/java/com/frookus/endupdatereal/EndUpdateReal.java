package com.frookus.endupdatereal;

import com.frookus.endupdatereal.block.ModBlocks;
import com.frookus.endupdatereal.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EndUpdateReal implements ModInitializer {
    public static final String MOD_ID = "endupdatereal";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.initializeModItems();
        ModBlocks.initializeModBlocks();
    }
}
