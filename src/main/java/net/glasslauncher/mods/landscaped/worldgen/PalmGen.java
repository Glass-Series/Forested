package net.glasslauncher.mods.landscaped.worldgen;

import lombok.RequiredArgsConstructor;
import net.glasslauncher.mods.landscaped.util.RandomIntProvider;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.Feature;
import net.modificationstation.stationapi.api.registry.BlockRegistry;

import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.function.BiFunction;

@RequiredArgsConstructor
public class PalmGen extends Feature {
    protected final Block trunk;
    protected final Block leaves;
    private final RandomIntProvider treeHeightGetter;
    protected final Map<Block, CustomSoilPlacer> soils;

    public PalmGen(Block trunk, Block leaves, RandomIntProvider treeHeightGetter) {
        this.trunk = trunk;
        this.leaves = leaves;
        this.treeHeightGetter = treeHeightGetter;
        soils = Map.of(Block.DIRT, (w, r, x, y, z) -> {}, Block.GRASS_BLOCK, (w, r, x, y, z) -> w.setBlockWithoutNotifyingNeighbors(x, y, z, Block.DIRT.id), Block.SAND, ((w, r, x, y, z) -> {}));
    }

    @Override
    public boolean generate(World world, Random random, int x, int y, int z) {
        int treeHeight = treeHeightGetter.provide(random);
        if (treeHeight + 1 > world.getTopY()) {
            return false;
        }

        int supportingBlockId = world.getBlockId(x, y - 1, z);
        if (!(supportingBlockId == Block.GRASS_BLOCK.id || supportingBlockId == Block.DIRT.id) || y >= world.getTopY() - treeHeight - 1) {
            return false;
        }

        for(int checkingY = y; checkingY <= y + 1 + treeHeight; ++checkingY) {
            if (checkingY < world.getTopY()) {
                int foundBlockId = world.getBlockId(x, checkingY, z);
                if (foundBlockId != 0 && Objects.requireNonNull(BlockRegistry.INSTANCE.get(foundBlockId)).material == Material.LEAVES) {
                    return false;
                }
            } else {
                return false;
            }
        }

        world.setBlockWithoutNotifyingNeighbors(x, y - 1, z, Block.DIRT.id);

        for(int relativeY = 0; relativeY < treeHeight; ++relativeY) {
            if (TreeGenHelpers.isReplaceableByLogs(world.getBlockState(x, y + relativeY, z))) {
                world.setBlockWithoutNotifyingNeighbors(x, y + relativeY, z, trunk.id);
            }
        }
        
        int leavesY = y + treeHeight;

        // Thanks dany
        world.setBlockWithoutNotifyingNeighbors(x, leavesY + 1, z, leaves.id);
        world.setBlockWithoutNotifyingNeighbors(x + 1, leavesY, z, leaves.id);
        world.setBlockWithoutNotifyingNeighbors(x + 1, leavesY, z +1, leaves.id);
        world.setBlockWithoutNotifyingNeighbors(x + 1, leavesY, z - 1, leaves.id);
        world.setBlockWithoutNotifyingNeighbors(x - 1, leavesY, z, leaves.id);
        world.setBlockWithoutNotifyingNeighbors(x - 1, leavesY, z +1, leaves.id);
        world.setBlockWithoutNotifyingNeighbors(x - 1, leavesY, z - 1, leaves.id);
        world.setBlockWithoutNotifyingNeighbors(x, leavesY, z + 1, leaves.id);
        world.setBlockWithoutNotifyingNeighbors(x, leavesY, z - 1, leaves.id);

        // Leaves to side
        world.setBlockWithoutNotifyingNeighbors(x + 2, leavesY, z, leaves.id);
        world.setBlockWithoutNotifyingNeighbors(x + 3, leavesY, z, leaves.id);
        world.setBlockWithoutNotifyingNeighbors(x - 2, leavesY, z, leaves.id);
        world.setBlockWithoutNotifyingNeighbors(x - 3, leavesY, z, leaves.id);
        world.setBlockWithoutNotifyingNeighbors(x, leavesY, z + 2, leaves.id);
        world.setBlockWithoutNotifyingNeighbors(x, leavesY, z + 3, leaves.id);
        world.setBlockWithoutNotifyingNeighbors(x, leavesY, z - 2, leaves.id);
        world.setBlockWithoutNotifyingNeighbors(x, leavesY, z - 3, leaves.id);
        world.setBlockWithoutNotifyingNeighbors(x + 4, leavesY - 1, z, leaves.id);
        world.setBlockWithoutNotifyingNeighbors(x - 4, leavesY - 1, z, leaves.id);
        world.setBlockWithoutNotifyingNeighbors(x, leavesY - 1, z + 4, leaves.id);
        world.setBlockWithoutNotifyingNeighbors(x, leavesY - 1, z - 4, leaves.id);

        // Diagonal leaves to side
        world.setBlockWithoutNotifyingNeighbors(x + 2, leavesY, z + 2, leaves.id);
        world.setBlockWithoutNotifyingNeighbors(x + 2, leavesY, z - 2, leaves.id);
        world.setBlockWithoutNotifyingNeighbors(x - 2, leavesY, z + 2, leaves.id);
        world.setBlockWithoutNotifyingNeighbors(x - 2, leavesY, z - 2, leaves.id);
        world.setBlockWithoutNotifyingNeighbors(x + 3, leavesY - 1, z + 3, leaves.id);
        world.setBlockWithoutNotifyingNeighbors(x + 3, leavesY - 1, z - 3, leaves.id);
        world.setBlockWithoutNotifyingNeighbors(x - 3, leavesY - 1, z + 3, leaves.id);
        world.setBlockWithoutNotifyingNeighbors(x - 3, leavesY - 1, z - 3, leaves.id);

        return true;
    }
}
