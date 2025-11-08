package net.glasslauncher.mods.forested.util;

import java.util.Random;

@FunctionalInterface
public interface RandomIntProvider {
    int provide(Random random);
}
