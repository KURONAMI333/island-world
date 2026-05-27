package com.kuronami.islandworld;

import com.kuronami.isekaiapi.api.Isekai;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(IslandWorld.MODID)
public final class IslandWorld {
    public static final String MODID = "island_world";
    public static final String VERSION = "0.1.0";
    public static final Logger LOGGER = LogUtils.getLogger();

    public IslandWorld(IEventBus modBus) {
        LOGGER.info("Island World v{} loading", VERSION);
        LOGGER.info("Island World: Isekai API facade ready (query={}, remap={})",
                Isekai.query().getClass().getSimpleName(),
                Isekai.remap().getClass().getSimpleName());
    }
}
