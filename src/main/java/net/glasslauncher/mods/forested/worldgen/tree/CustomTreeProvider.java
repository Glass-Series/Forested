package net.glasslauncher.mods.forested.worldgen.tree;

import net.minecraft.world.gen.feature.Feature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

@FunctionalInterface
public interface CustomTreeProvider {
    @Nullable Feature getCustomTree(Random random);
}
