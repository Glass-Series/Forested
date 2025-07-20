package net.glasslauncher.mods.landscaped.blocks;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.glasslauncher.mods.gcapi3.api.CharacterUtils;
import net.glasslauncher.mods.landscaped.worldgen.CustomTreeProvider;
import net.glasslauncher.mods.landscaped.worldgen.TreeType;
import net.minecraft.block.Block;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.block.BlockState;
import net.modificationstation.stationapi.api.block.States;
import net.modificationstation.stationapi.api.registry.tag.BlockTags;
import net.modificationstation.stationapi.api.template.block.TemplateLeavesBlock;
import net.modificationstation.stationapi.api.util.Identifier;
import net.modificationstation.stationapi.api.util.math.Direction;

import java.awt.*;
import java.util.Random;

public class LandscapedLeavesBlock extends TemplateLeavesBlock {
    private static final Random treeRandom = new Random();
    protected int color;
    private final LazyTreeTypeProvider treeType;

    public LandscapedLeavesBlock(Identifier identifier, Color color, LazyTreeTypeProvider treeType) {
        super(identifier, 1);
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
    public boolean isOpaque() {
        return Block.LEAVES.isOpaque();
    }

    @Environment(EnvType.CLIENT)
    @Override
    public boolean isSideVisible(BlockView blockView, int x, int y, int z, int side) {
        int var6 = blockView.getBlockId(x, y, z);
        if (Block.LEAVES.isOpaque() && var6 == this.id) {
            return false;
        }

        if (side == 0 && this.minY > 0.0) {
            return true;
        } else if (side == 1 && this.maxY < 1.0) {
            return true;
        } else if (side == 2 && this.minZ > 0.0) {
            return true;
        } else if (side == 3 && this.maxZ < 1.0) {
            return true;
        } else if (side == 4 && this.minX > 0.0) {
            return true;
        } else {
            return side == 5 && this.maxX < 1.0 || !blockView.method_1783(x, y, z);
        }
    }

    @Override
    public int getDroppedItemId(int blockMeta, Random random) {
        return treeType.getTreeType().sapling.id;
    }

    @Override
    public int getTextureId(BlockView blockView, int x, int y, int z, int side) {
        return textureId;
    }

    @FunctionalInterface
    public interface LazyTreeTypeProvider {
        TreeType getTreeType();
    }
}
