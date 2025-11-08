package net.glasslauncher.mods.forested.eventlisteners.init;

import net.glasslauncher.mods.forested.blocks.ForestedBlocks;
import net.glasslauncher.mods.forested.worldgen.tree.TreeType;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.event.init.InitFinishedEvent;

public class SaplingInit {

    @EventListener
    public static void init(InitFinishedEvent event) {
        ForestedBlocks.Sapling.acacia.setTreeType(TreeType.ACACIA);
        ForestedBlocks.Sapling.balsa.setTreeType(TreeType.BALSA);
        ForestedBlocks.Sapling.baobab.setTreeType(TreeType.BAOBAB);
        ForestedBlocks.Sapling.cherry.setTreeType(TreeType.CHERRY);
        ForestedBlocks.Sapling.chestnut.setTreeType(TreeType.CHESTNUT);
        ForestedBlocks.Sapling.citrus.setTreeType(TreeType.CITRUS);
        ForestedBlocks.Sapling.cocobolo.setTreeType(TreeType.COCOBOLO);
        ForestedBlocks.Sapling.ebony.setTreeType(TreeType.EBONY);
        ForestedBlocks.Sapling.giganteum.setTreeType(TreeType.GIGANTEUM);
        ForestedBlocks.Sapling.greenheart.setTreeType(TreeType.GREENHEART);
        ForestedBlocks.Sapling.ipe.setTreeType(TreeType.IPE);
        ForestedBlocks.Sapling.ironwood.setTreeType(TreeType.IRONWOOD);
        ForestedBlocks.Sapling.kapok.setTreeType(TreeType.KAPOK);
        ForestedBlocks.Sapling.larch.setTreeType(TreeType.LARCH);
        ForestedBlocks.Sapling.lime.setTreeType(TreeType.LIME);
        ForestedBlocks.Sapling.mahoe.setTreeType(TreeType.MAHOE);
        ForestedBlocks.Sapling.mahogany.setTreeType(TreeType.MAHOGANY);
        ForestedBlocks.Sapling.maple.setTreeType(TreeType.MAPLE);
        ForestedBlocks.Sapling.padauk.setTreeType(TreeType.PADAUK);
        ForestedBlocks.Sapling.palm.setTreeType(TreeType.PALM);
        ForestedBlocks.Sapling.papaya.setTreeType(TreeType.PAPAYA);
        ForestedBlocks.Sapling.pine.setTreeType(TreeType.PINE);
        ForestedBlocks.Sapling.plum.setTreeType(TreeType.PLUM);
        ForestedBlocks.Sapling.poplar.setTreeType(TreeType.POPLAR);
        ForestedBlocks.Sapling.sequoia.setTreeType(TreeType.SEQUOIA);
        ForestedBlocks.Sapling.teak.setTreeType(TreeType.TEAK);
        ForestedBlocks.Sapling.walnut.setTreeType(TreeType.WALNUT);
        ForestedBlocks.Sapling.wenge.setTreeType(TreeType.WENGE);
        ForestedBlocks.Sapling.willow.setTreeType(TreeType.WILLOW);
        ForestedBlocks.Sapling.zebrawood.setTreeType(TreeType.ZEBRAWOOD);
    }
}
