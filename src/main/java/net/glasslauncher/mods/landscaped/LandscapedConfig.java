package net.glasslauncher.mods.landscaped;

import net.glasslauncher.mods.gcapi3.api.ConfigEntry;
import net.glasslauncher.mods.gcapi3.api.ConfigRoot;

public class LandscapedConfig {
    @ConfigRoot(value = "main", visibleName = "Landscaped Main")
    public static final Config MAIN_CONFIG = new Config();

    @ConfigRoot(value = "worldgen", visibleName = "Landscaped Worldgen")
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
