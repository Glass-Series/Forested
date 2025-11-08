package net.glasslauncher.mods.forested.worldgen.tree;

import net.glasslauncher.mods.forested.blocks.LeavesBlockTemplate;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.block.BlockState;

import java.util.Map;

public class TreeGenHelpers {
    public static final Map<Block, CustomSoilPlacer> DEFAULT_SOILS = Map.of(Block.DIRT, (w, r, x, y, z) -> {}, Block.GRASS_BLOCK, (w, r, x, y, z) -> w.setBlockWithoutNotifyingNeighbors(x, y, z, Block.DIRT.id));

    public static boolean isReplaceableByLogs(BlockState state) {
        return state.isAir() || !state.isOpaque() || state.getMaterial() == Material.LEAVES;
    }

    public static void updateGeneratedLeaves(World world, int x, int y, int z) {
        Block block = world.getBlockState(x, y, z).getBlock();
        if (block instanceof LeavesBlockTemplate template) {
            template.updateDecay(world, x, y, z, false);
        }
    }
}
