package net.glasslauncher.mods.landscaped.worldgen;

import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.block.BlockState;

import java.util.Objects;

public class TreeGenHelpers {
    public static boolean isReplaceableByLogs(BlockState state) {
        return state.isAir() || !state.isOpaque() || state.getMaterial() == Material.LEAVES;
    }
}
