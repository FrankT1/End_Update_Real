package com.example.hackcraft_jan_2026;

import com.example.hackcraft_jan_2026.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hackcraft_jan_2026 implements ModInitializer {
    public static final String MOD_ID = "endupdatereal";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.initializeModItems();
    }
}
