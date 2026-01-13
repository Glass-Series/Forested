package net.glasslauncher.mods.forested.blocks;

import net.glasslauncher.mods.gcapi3.api.CharacterUtils;
import net.glasslauncher.mods.forested.worldgen.tree.TreeType;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stat.Stats;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.item.tool.StationShearsItem;
import net.modificationstation.stationapi.api.util.Identifier;

import java.awt.*;
import java.util.Random;

public class ForestedLeavesBlock extends LeavesBlockTemplate {
    private static final Random treeRandom = new Random();
    protected int color;
    private final LazyTreeTypeProvider treeType;

    public ForestedLeavesBlock(Identifier identifier, Color color, LazyTreeTypeProvider treeType) {
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
        return treeType.getTreeType().sapling.asItem().id;
    }

    @Override
    public void afterBreak(World world, PlayerEntity playerEntity, int x, int y, int z, int meta) {
        if (!world.isRemote && playerEntity.getHand() != null && playerEntity.getHand().getItem() instanceof StationShearsItem) {
//            playerEntity.increaseStat(Stats.MINE_BLOCK[this.id], 1); // Dammit mine
            this.dropStack(world, x, y, z, new ItemStack(this));
        } else {
            super.afterBreak(world, playerEntity, x, y, z, meta);
        }
    }

    @FunctionalInterface
    public interface LazyTreeTypeProvider {
        TreeType getTreeType();
    }
}
