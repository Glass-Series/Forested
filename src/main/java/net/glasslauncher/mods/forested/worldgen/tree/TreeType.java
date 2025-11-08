package net.glasslauncher.mods.forested.worldgen.tree;

import net.glasslauncher.mods.forested.blocks.ForestedBlocks;
import net.glasslauncher.mods.forested.blocks.ForestedLeavesBlock;
import net.glasslauncher.mods.forested.blocks.ForestedLogBlock;
import net.glasslauncher.mods.forested.blocks.ForestedSaplingBlock;
import net.minecraft.block.Block;
import net.minecraft.world.biome.Biome;

import java.util.List;
import java.util.Map;

public enum TreeType {
    ACACIA(ForestedBlocks.Wood.acacia, ForestedBlocks.Leaves.acacia, ForestedBlocks.Sapling.acacia, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 5, (random, layer) -> layer == 0 ? 1 : -layer * 2, r -> 2), () -> List.of(Biome.SAVANNA)),
    BALSA(ForestedBlocks.Wood.balsa, ForestedBlocks.Leaves.balsa, ForestedBlocks.Sapling.balsa, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(2) + 7, (random, layer) -> layer == 0 ? 1 : -(int) Math.floor(layer * 1.5D), r -> 2), () -> List.of(Biome.RAINFOREST)),
    BAOBAB(ForestedBlocks.Wood.baobab, ForestedBlocks.Leaves.baobab, ForestedBlocks.Sapling.baobab, (t, l) -> new ThickOakGen(t, l, r -> r.nextInt(2) + 8, (random, layer) -> layer == 0 ? 1 : -layer + 1, r -> 2, r -> 8 + r.nextInt(1), Map.of(Block.SAND, (w, r, x, y , z) -> {})), () -> List.of(Biome.SAVANNA)),
    CHERRY(ForestedBlocks.Wood.cherry, ForestedBlocks.Leaves.cherry, ForestedBlocks.Sapling.cherry, (t, l) -> new CherryGen(t, l, r -> r.nextInt(3) + 5, (random, layer) -> layer == 0 ? 1 : -(int) Math.floor(layer * 1.5D), r -> 2, r -> r.nextInt(3) + 1, r -> r.nextInt(3), (r, treeHeight) -> treeHeight - 2 - r.nextInt(2)), () -> List.of(Biome.FOREST)),
    CHESTNUT(ForestedBlocks.Wood.chestnut, ForestedBlocks.Leaves.chestnut, ForestedBlocks.Sapling.chestnut, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 4, (random, layer) -> 1 - layer / 2, r -> 3), () -> List.of(Biome.FOREST)),
    CITRUS(ForestedBlocks.Wood.citrus, ForestedBlocks.Leaves.citrus, ForestedBlocks.Sapling.citrus, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 5, (random, layer) -> layer == 0 ? 1 : -(int) Math.floor(layer / 2D), r -> 4), () -> List.of(Biome.SEASONAL_FOREST)),
    COCOBOLO(ForestedBlocks.Wood.cocobolo, ForestedBlocks.Leaves.cocobolo, ForestedBlocks.Sapling.cocobolo, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 7, (random, layer) -> 1, r -> 4 + r.nextInt(3)), () -> List.of(Biome.RAINFOREST)),
    EBONY(ForestedBlocks.Wood.ebony, ForestedBlocks.Leaves.ebony, ForestedBlocks.Sapling.ebony, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 4, (random, layer) -> 1 - layer / 2, r -> 3), () -> List.of(Biome.RAINFOREST)),
    GIGANTEUM(ForestedBlocks.Wood.giganteum, ForestedBlocks.Leaves.giganteum, ForestedBlocks.Sapling.giganteum, (t, l) -> new ThickOakGen(t, l, r -> r.nextInt(8) + 20, (random, layer) -> layer == 0 ? 2 : 2 + random.nextInt(2), r -> r.nextInt(2) + 6, r -> 19 + r.nextInt(2)), List::of),
    GREENHEART(ForestedBlocks.Wood.greenheart, ForestedBlocks.Leaves.greenheart, ForestedBlocks.Sapling.greenheart, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 4, (random, layer) -> 1 - layer / 2, r -> 3), () -> List.of(Biome.RAINFOREST, Biome.SEASONAL_FOREST)),
    IPE(ForestedBlocks.Wood.ipe, ForestedBlocks.Leaves.ipe, ForestedBlocks.Sapling.ipe, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 6, (random, layer) -> 2 -layer / 2, r -> 3), () -> List.of(Biome.RAINFOREST)),
    IRONWOOD(ForestedBlocks.Wood.ironwood, ForestedBlocks.Leaves.ironwood, ForestedBlocks.Sapling.ironwood, (t, l) -> new CherryGen(t, l, r -> r.nextInt(3) + 3, (random, layer) -> 2 -layer / 2, r -> 3, r -> r.nextInt(4) + 2, r -> r.nextInt(2) + 1, (r, treeHeight) -> treeHeight > 0 ? treeHeight - 1 - r.nextInt(treeHeight / 2) : treeHeight - 1, Map.of(Block.SAND, (w, r, x, y , z) -> {})), () -> List.of(Biome.DESERT)),
    KAPOK(ForestedBlocks.Wood.kapok, ForestedBlocks.Leaves.kapok, ForestedBlocks.Sapling.kapok, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(2) + 8, (random, layer) -> layer == 0 ? 1 : -layer + 1, r -> 2), () -> List.of(Biome.RAINFOREST)),
    LARCH(ForestedBlocks.Wood.larch, ForestedBlocks.Leaves.larch, ForestedBlocks.Sapling.larch, (t, l) -> new ConifersGen(t, l, r -> 6 + r.nextInt(2), r -> 2, r -> r.nextInt(2) + 1, r -> r.nextInt(3), r -> 0, r -> 0, r -> 1, r -> 1), () -> List.of(Biome.TAIGA)),
    LIME(ForestedBlocks.Wood.lime, ForestedBlocks.Leaves.lime, ForestedBlocks.Sapling.lime, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 5, (random, layer) -> layer == 0 ? 1 : -(int) Math.floor(layer / 2D), r -> 4), () -> List.of(Biome.RAINFOREST)),
    MAHOE(ForestedBlocks.Wood.mahoe, ForestedBlocks.Leaves.mahoe, ForestedBlocks.Sapling.mahoe, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 5, (random, layer) -> layer == 0 ? 1 : -(int) Math.floor(layer / 2D), r -> 4), () -> List.of(Biome.RAINFOREST, Biome.SEASONAL_FOREST)),
    MAHOGANY(ForestedBlocks.Wood.mahogany, ForestedBlocks.Leaves.mahogany, ForestedBlocks.Sapling.mahogany, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 6, (random, layer) -> 2 -layer / 2, r -> 3), () -> List.of(Biome.RAINFOREST, Biome.SEASONAL_FOREST)),
    MAPLE(ForestedBlocks.Wood.maple, ForestedBlocks.Leaves.maple, ForestedBlocks.Sapling.maple, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 5, (random, layer) -> 2 -layer / 2, r -> 3), () -> List.of(Biome.FOREST, Biome.PLAINS)),
    PADAUK(ForestedBlocks.Wood.padauk, ForestedBlocks.Leaves.padauk, ForestedBlocks.Sapling.padauk, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 5, (random, layer) -> 2 -layer / 2, r -> 3), () -> List.of(Biome.RAINFOREST)),
    PALM(ForestedBlocks.Wood.palm, ForestedBlocks.Leaves.palm, ForestedBlocks.Sapling.palm, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 5, (random, layer) -> 3 + layer, r -> 2, Map.of(Block.SAND, (w, r, x, y , z) -> {})), () -> List.of(Biome.DESERT)),
    PAPAYA(ForestedBlocks.Wood.papaya, ForestedBlocks.Leaves.papaya, ForestedBlocks.Sapling.papaya, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 5, (random, layer) -> layer == 0 ? 1 : layer == -1 ? 2 : 1, r -> 2), () -> List.of(Biome.RAINFOREST)),
    PINE(ForestedBlocks.Wood.pine, ForestedBlocks.Leaves.pine, ForestedBlocks.Sapling.pine, (t, l) -> new ConifersGen(t, l, r -> 6 + r.nextInt(2), r -> 2, r -> r.nextInt(2) + 1, r -> r.nextInt(3), r -> 0, r -> 0, r -> 1, r -> 1), () -> List.of(Biome.TAIGA)),
    PLUM(ForestedBlocks.Wood.plum, ForestedBlocks.Leaves.plum, ForestedBlocks.Sapling.plum, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 4, (random, layer) -> 1 - layer / 2, r -> 3), () -> List.of(Biome.SWAMPLAND)),
    POPLAR(ForestedBlocks.Wood.poplar, ForestedBlocks.Leaves.poplar, ForestedBlocks.Sapling.poplar, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(4) + 9, (random, layer) -> 1, r -> 4 + r.nextInt(3)), () -> List.of(Biome.FOREST)),
    SEQUOIA(ForestedBlocks.Wood.sequoia, ForestedBlocks.Leaves.sequoia, ForestedBlocks.Sapling.sequoia, (t, l) -> new ThickOakGen(t, l, r -> r.nextInt(5) + 12, (random, layer) -> layer == 0 ? 2 : 2 + random.nextInt(2), r -> r.nextInt(2) + 6, r -> 11 + r.nextInt(2)), List::of),
    TEAK(ForestedBlocks.Wood.teak, ForestedBlocks.Leaves.teak, ForestedBlocks.Sapling.teak, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 7, (random, layer) -> layer == 0 ? 1 : -(int) Math.floor(layer / 2D), r -> 4), () -> List.of(Biome.RAINFOREST)),
    WALNUT(ForestedBlocks.Wood.walnut, ForestedBlocks.Leaves.walnut, ForestedBlocks.Sapling.walnut, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 4, (random, layer) -> 2 -layer / 2, r -> 3), () -> List.of(Biome.FOREST)),
    WENGE(ForestedBlocks.Wood.wenge, ForestedBlocks.Leaves.wenge, ForestedBlocks.Sapling.wenge, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 4, (random, layer) -> 1 - layer / 2, r -> 3), () -> List.of(Biome.RAINFOREST, Biome.SAVANNA)),
    WILLOW(ForestedBlocks.Wood.willow, ForestedBlocks.Leaves.willow, ForestedBlocks.Sapling.willow, (t, l) -> new WillowGen(t, l, r -> r.nextInt(3) + 5, (random, layer) -> 2 -layer / 2, r -> 3, r -> r.nextInt(3)), () -> List.of(Biome.SWAMPLAND)),
    ZEBRAWOOD(ForestedBlocks.Wood.zebrawood, ForestedBlocks.Leaves.zebrawood, ForestedBlocks.Sapling.zebrawood, (t, l) -> new CherryGen(t, l, r -> r.nextInt(6) + 8, (random, layer) -> 2 -layer / 2, r -> 3, r -> r.nextInt(4) + 2, r -> r.nextInt(2) + 2, (r, treeHeight) -> treeHeight - 2 - r.nextInt(4)), () -> List.of(Biome.SAVANNA)),
    ;

    public final ForestedLogBlock trunk;
    public final ForestedLeavesBlock leaves;
    public final ForestedSaplingBlock sapling;
    public final LazyBiomeProvider biomeProvider;
    public final ForestedTreeFeature feature;

    TreeType(ForestedLogBlock trunk, ForestedLeavesBlock leaves, ForestedSaplingBlock sapling, LazyTreeFeatureProvider treeFeatureProvider, LazyBiomeProvider biomes) {
        this.trunk = trunk;
        this.leaves = leaves;
        this.sapling = sapling;
        this.biomeProvider = biomes;
        feature = treeFeatureProvider.provide(trunk, leaves);
    }

    @FunctionalInterface
    public interface LazyBiomeProvider {
        List<Biome> getBiomes();
    }

    @FunctionalInterface
    public interface LazyTreeFeatureProvider {
        ForestedTreeFeature provide(ForestedLogBlock t, ForestedLeavesBlock l);
    }
}
