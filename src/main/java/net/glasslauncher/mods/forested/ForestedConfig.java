package net.glasslauncher.mods.forested;

import net.glasslauncher.mods.gcapi3.api.ConfigEntry;
import net.glasslauncher.mods.gcapi3.api.ConfigRoot;

public class ForestedConfig {
    @ConfigRoot(value = "main", visibleName = "Forested Main")
    public static final Config MAIN_CONFIG = new Config();

    @ConfigRoot(value = "worldgen", visibleName = "Forested Worldgen")
    public static final WorldgenConfig WORLDGEN_CONFIG = new WorldgenConfig();

    public static class Config {
        private Config() {}

        @ConfigEntry(name = "Disable Custom Planks", comment = "Won't remove already existing custom planks from the world.", multiplayerSynced = true)
        public Boolean disablePlanks = false;
    }

    public static class WorldgenConfig {
        private WorldgenConfig() {}

        @ConfigEntry(name = "Generate Custom Trees", multiplayerSynced = true)
        public Boolean generateTrees = true;
    }
}
