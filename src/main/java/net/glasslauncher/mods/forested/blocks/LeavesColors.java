package net.glasslauncher.mods.forested.blocks;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.client.event.color.block.BlockColorsRegisterEvent;

public class LeavesColors {

    @EventListener
    public static void init(BlockColorsRegisterEvent event) {
        event.blockColors.registerColorProvider(
                (blockState, blockView, blockPos, meta) -> blockState.getBlock().getColor(meta),
                ForestedBlocks.Leaves.acacia,
                ForestedBlocks.Leaves.balsa,
                ForestedBlocks.Leaves.baobab,
                ForestedBlocks.Leaves.cherry,
                ForestedBlocks.Leaves.chestnut,
                ForestedBlocks.Leaves.citrus,
                ForestedBlocks.Leaves.cocobolo,
                ForestedBlocks.Leaves.ebony,
                ForestedBlocks.Leaves.giganteum,
                ForestedBlocks.Leaves.greenheart,
                ForestedBlocks.Leaves.ipe,
                ForestedBlocks.Leaves.kapok,
                ForestedBlocks.Leaves.larch,
                ForestedBlocks.Leaves.lime,
                ForestedBlocks.Leaves.mahoe,
                ForestedBlocks.Leaves.mahogany,
                ForestedBlocks.Leaves.maple,
                ForestedBlocks.Leaves.padauk,
                ForestedBlocks.Leaves.palm,
                ForestedBlocks.Leaves.papaya,
                ForestedBlocks.Leaves.pine,
                ForestedBlocks.Leaves.plum,
                ForestedBlocks.Leaves.poplar,
                ForestedBlocks.Leaves.sequoia,
                ForestedBlocks.Leaves.teak,
                ForestedBlocks.Leaves.walnut,
                ForestedBlocks.Leaves.wenge,
                ForestedBlocks.Leaves.willow,
                ForestedBlocks.Leaves.zebrawood
        );
    }
}
