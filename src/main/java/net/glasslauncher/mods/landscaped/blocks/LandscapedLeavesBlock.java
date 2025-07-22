package net.glasslauncher.mods.landscaped.blocks;

import net.glasslauncher.mods.gcapi3.api.CharacterUtils;
import net.glasslauncher.mods.landscaped.worldgen.TreeType;
import net.minecraft.world.BlockView;
import net.modificationstation.stationapi.api.util.Identifier;

import java.awt.*;
import java.util.Random;

public class LandscapedLeavesBlock extends LeavesBlockTemplate {
    private static final Random treeRandom = new Random();
    protected int color;
    private final LazyTreeTypeProvider treeType;

    public LandscapedLeavesBlock(Identifier identifier, Color color, LazyTreeTypeProvider treeType) {
        super(identifier);
        this.color = CharacterUtils.getIntFromColour(color);
        this.treeType = treeType;
        setTranslationKey(identifier);
		setHardness(0.2F);
        setOpacity(1);
        setSoundGroup(DIRT_SOUND_GROUP);
        disableTrackingStatistics();
        ignoreMetaUpdates();
    }

    @Override
    public int getColor(int meta) {
        return color;
    }

    @Override
    public int getColorMultiplier(BlockView blockView, int x, int y, int z) {
        return getColor(blockView.getBlockMeta(x, y, z));
    }

    @Override
    public int getDroppedItemId(int blockMeta, Random random) {
        return treeType.getTreeType().sapling.id;
    }

    @FunctionalInterface
    public interface LazyTreeTypeProvider {
        TreeType getTreeType();
    }
}
