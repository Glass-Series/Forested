package net.glasslauncher.mods.forested.worldgen.tree;

import net.minecraft.block.Block;
import net.minecraft.world.World;

import java.util.Random;
import java.util.Set;

public interface ForestedTreeFeature {
    Set<Block> getSoils();
    boolean generate(World world, Random random, int x, int y, int z);
}
