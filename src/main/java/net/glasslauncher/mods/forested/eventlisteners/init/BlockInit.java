package net.glasslauncher.mods.forested.eventlisteners.init;

import net.glasslauncher.mods.forested.blocks.*;
import net.glasslauncher.mods.forested.worldgen.tree.TreeType;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.EntrypointManager;

import java.awt.*;
import java.lang.invoke.MethodHandles;

import static net.glasslauncher.mods.forested.Forested.NAMESPACE;

public class BlockInit {
    static {
        EntrypointManager.registerLookup(MethodHandles.lookup());
    }

    @EventListener
    private static void init(BlockRegistryEvent event) {
        ForestedBlocks.Wood.acacia = new ForestedLogBlock(NAMESPACE.id("acacia_log"));
        ForestedBlocks.Wood.balsa = new ForestedLogBlock(NAMESPACE.id("balsa_log"));
        ForestedBlocks.Wood.baobab = new ForestedLogBlock(NAMESPACE.id("baobab_log"));
        ForestedBlocks.Wood.cherry = new ForestedLogBlock(NAMESPACE.id("cherry_log"));
        ForestedBlocks.Wood.chestnut = new ForestedLogBlock(NAMESPACE.id("chestnut_log"));
        ForestedBlocks.Wood.citrus = new ForestedLogBlock(NAMESPACE.id("citrus_log"));
        ForestedBlocks.Wood.cocobolo = new ForestedLogBlock(NAMESPACE.id("cocobolo_log"));
        ForestedBlocks.Wood.ebony = new ForestedLogBlock(NAMESPACE.id("ebony_log"));
        ForestedBlocks.Wood.giganteum = new ForestedLogBlock(NAMESPACE.id("giganteum_log"));
        ForestedBlocks.Wood.greenheart = new ForestedLogBlock(NAMESPACE.id("greenheart_log"));
        ForestedBlocks.Wood.ipe = new ForestedLogBlock(NAMESPACE.id("ipe_log"));
        ForestedBlocks.Wood.ironwood = new ForestedLogBlock(NAMESPACE.id("ironwood_log"));
        ForestedBlocks.Wood.kapok = new ForestedLogBlock(NAMESPACE.id("kapok_log"));
        ForestedBlocks.Wood.larch = new ForestedLogBlock(NAMESPACE.id("larch_log"));
        ForestedBlocks.Wood.lime = new ForestedLogBlock(NAMESPACE.id("lime_log"));
        ForestedBlocks.Wood.mahoe = new ForestedLogBlock(NAMESPACE.id("mahoe_log"));
        ForestedBlocks.Wood.mahogany = new ForestedLogBlock(NAMESPACE.id("mahogany_log"));
        ForestedBlocks.Wood.maple = new ForestedLogBlock(NAMESPACE.id("maple_log"));
        ForestedBlocks.Wood.padauk = new ForestedLogBlock(NAMESPACE.id("padauk_log"));
        ForestedBlocks.Wood.palm = new ForestedLogBlock(NAMESPACE.id("palm_log"));
        ForestedBlocks.Wood.papaya = new ForestedLogBlock(NAMESPACE.id("papaya_log"));
        ForestedBlocks.Wood.pine = new ForestedLogBlock(NAMESPACE.id("pine_log"));
        ForestedBlocks.Wood.plum = new ForestedLogBlock(NAMESPACE.id("plum_log"));
        ForestedBlocks.Wood.poplar = new ForestedLogBlock(NAMESPACE.id("poplar_log"));
        ForestedBlocks.Wood.sequoia = new ForestedLogBlock(NAMESPACE.id("sequoia_log"));
        ForestedBlocks.Wood.teak = new ForestedLogBlock(NAMESPACE.id("teak_log"));
        ForestedBlocks.Wood.walnut = new ForestedLogBlock(NAMESPACE.id("walnut_log"));
        ForestedBlocks.Wood.wenge = new ForestedLogBlock(NAMESPACE.id("wenge_log"));
        ForestedBlocks.Wood.willow = new ForestedLogBlock(NAMESPACE.id("willow_log"));
        ForestedBlocks.Wood.zebrawood = new ForestedLogBlock(NAMESPACE.id("zebrawood_log"));

        ForestedBlocks.Leaves.acacia = new ForestedLeavesBlock(NAMESPACE.id("acacia_leaves"), new Color(0x748C1C), () -> TreeType.ACACIA);
        ForestedBlocks.Leaves.balsa = new ForestedLeavesBlock(NAMESPACE.id("balsa_leaves"), new Color(0x59ac00), () -> TreeType.BALSA);
        ForestedBlocks.Leaves.baobab = new ForestedLeavesBlock(NAMESPACE.id("baobab_leaves"), new Color(0xfeff8f), () -> TreeType.BAOBAB);
        ForestedBlocks.Leaves.cherry = new ForestedLeavesBlock(NAMESPACE.id("cherry_leaves"), new Color(0xFF8EE8), () -> TreeType.CHERRY);
        ForestedBlocks.Leaves.chestnut = new ForestedLeavesBlock(NAMESPACE.id("chestnut_leaves"), new Color(0x5ea107), () -> TreeType.CHESTNUT);
        ForestedBlocks.Leaves.citrus = new ForestedLeavesBlock(NAMESPACE.id("citrus_leaves"), new Color(0x88af54), () -> TreeType.CITRUS);
        ForestedBlocks.Leaves.cocobolo = new ForestedLeavesBlock(NAMESPACE.id("cocobolo_leaves"), new Color(0x6aa17a), () -> TreeType.COCOBOLO);
        ForestedBlocks.Leaves.ebony = new ForestedLeavesBlock(NAMESPACE.id("ebony_leaves"), new Color(0xa2d24a), () -> TreeType.EBONY);
        ForestedBlocks.Leaves.giganteum = new ForestedLeavesBlock(NAMESPACE.id("giganteum_leaves"), new Color(0x738434), () -> TreeType.GIGANTEUM);
        ForestedBlocks.Leaves.greenheart = new ForestedLeavesBlock(NAMESPACE.id("greenheart_leaves"), new Color(0x678911), () -> TreeType.GREENHEART);
        ForestedBlocks.Leaves.ipe = new ForestedLeavesBlock(NAMESPACE.id("ipe_leaves"), new Color(0xfdd207), () -> TreeType.IPE);
        ForestedBlocks.Leaves.ironwood = new ForestedLeavesBlock(NAMESPACE.id("ironwood_leaves"), new Color(0xe691da), () -> TreeType.IRONWOOD);
        ForestedBlocks.Leaves.kapok = new ForestedLeavesBlock(NAMESPACE.id("kapok_leaves"), new Color(0x89987b), () -> TreeType.KAPOK);
        ForestedBlocks.Leaves.larch = new ForestedLeavesBlock(NAMESPACE.id("larch_leaves"), new Color(0x698f90), () -> TreeType.LARCH);
        ForestedBlocks.Leaves.lime = new ForestedLeavesBlock(NAMESPACE.id("lime_leaves"), new Color(0x5ea107), () -> TreeType.LIME);
        ForestedBlocks.Leaves.mahoe = new ForestedLeavesBlock(NAMESPACE.id("mahoe_leaves"), new Color(0xa0ba1b), () -> TreeType.MAHOE);
        ForestedBlocks.Leaves.mahogany = new ForestedLeavesBlock(NAMESPACE.id("mahogany_leaves"), new Color(0x8ab154), () -> TreeType.MAHOGANY);
        ForestedBlocks.Leaves.maple = new ForestedLeavesBlock(NAMESPACE.id("maple_leaves"), new Color(0xd4f425), () -> TreeType.MAPLE);
        ForestedBlocks.Leaves.padauk = new ForestedLeavesBlock(NAMESPACE.id("padauk_leaves"), new Color(0xd0df8c), () -> TreeType.PADAUK);
        ForestedBlocks.Leaves.palm = new ForestedLeavesBlock(NAMESPACE.id("palm_leaves"), new Color(0xcbcd79), () -> TreeType.PALM);
        ForestedBlocks.Leaves.papaya = new ForestedLeavesBlock(NAMESPACE.id("papaya_leaves"), new Color(0x6d9f58), () -> TreeType.PAPAYA);
        ForestedBlocks.Leaves.pine = new ForestedLeavesBlock(NAMESPACE.id("pine_leaves"), new Color(0xfeff8f), () -> TreeType.PINE);
        ForestedBlocks.Leaves.plum = new ForestedLeavesBlock(NAMESPACE.id("plum_leaves"), new Color(0x589246), () -> TreeType.PLUM);
        ForestedBlocks.Leaves.poplar = new ForestedLeavesBlock(NAMESPACE.id("poplar_leaves"), new Color(0xa3b8a5), () -> TreeType.POPLAR);
        ForestedBlocks.Leaves.sequoia = new ForestedLeavesBlock(NAMESPACE.id("sequoia_leaves"), new Color(0x418e71), () -> TreeType.SEQUOIA);
        ForestedBlocks.Leaves.teak = new ForestedLeavesBlock(NAMESPACE.id("teak_leaves"), new Color(0xfeff8f), () -> TreeType.TEAK);
        ForestedBlocks.Leaves.walnut = new ForestedLeavesBlock(NAMESPACE.id("walnut_leaves"), new Color(0x798c55), () -> TreeType.WALNUT);
        ForestedBlocks.Leaves.wenge = new ForestedLeavesBlock(NAMESPACE.id("wenge_leaves"), new Color(0xada157), () -> TreeType.WENGE);
        ForestedBlocks.Leaves.willow = new ForestedLeavesBlock(NAMESPACE.id("willow_leaves"), new Color(0xa3b8a5), () -> TreeType.WILLOW);
        ForestedBlocks.Leaves.zebrawood = new ForestedLeavesBlock(NAMESPACE.id("zebrawood_leaves"), new Color(0xa2d24a), () -> TreeType.ZEBRAWOOD);

        ForestedBlocks.Planks.acacia = new ForestedPlanksBlock(NAMESPACE.id("acacia_planks"));
        ForestedBlocks.Planks.balsa = new ForestedPlanksBlock(NAMESPACE.id("balsa_planks"));
        ForestedBlocks.Planks.baobab = new ForestedPlanksBlock(NAMESPACE.id("baobab_planks"));
        ForestedBlocks.Planks.cherry = new ForestedPlanksBlock(NAMESPACE.id("cherry_planks"));
        ForestedBlocks.Planks.chestnut = new ForestedPlanksBlock(NAMESPACE.id("chestnut_planks"));
        ForestedBlocks.Planks.citrus = new ForestedPlanksBlock(NAMESPACE.id("citrus_planks"));
        ForestedBlocks.Planks.cocobolo = new ForestedPlanksBlock(NAMESPACE.id("cocobolo_planks"));
        ForestedBlocks.Planks.ebony = new ForestedPlanksBlock(NAMESPACE.id("ebony_planks"));
        ForestedBlocks.Planks.giganteum = new ForestedPlanksBlock(NAMESPACE.id("giganteum_planks"));
        ForestedBlocks.Planks.greenheart = new ForestedPlanksBlock(NAMESPACE.id("greenheart_planks"));
        ForestedBlocks.Planks.ipe = new ForestedPlanksBlock(NAMESPACE.id("ipe_planks"));
        ForestedBlocks.Planks.ironwood = new ForestedPlanksBlock(NAMESPACE.id("ironwood_planks"));
        ForestedBlocks.Planks.kapok = new ForestedPlanksBlock(NAMESPACE.id("kapok_planks"));
        ForestedBlocks.Planks.larch = new ForestedPlanksBlock(NAMESPACE.id("larch_planks"));
        ForestedBlocks.Planks.lime = new ForestedPlanksBlock(NAMESPACE.id("lime_planks"));
        ForestedBlocks.Planks.mahoe = new ForestedPlanksBlock(NAMESPACE.id("mahoe_planks"));
        ForestedBlocks.Planks.mahogany = new ForestedPlanksBlock(NAMESPACE.id("mahogany_planks"));
        ForestedBlocks.Planks.maple = new ForestedPlanksBlock(NAMESPACE.id("maple_planks"));
        ForestedBlocks.Planks.padauk = new ForestedPlanksBlock(NAMESPACE.id("padauk_planks"));
        ForestedBlocks.Planks.palm = new ForestedPlanksBlock(NAMESPACE.id("palm_planks"));
        ForestedBlocks.Planks.papaya = new ForestedPlanksBlock(NAMESPACE.id("papaya_planks"));
        ForestedBlocks.Planks.pine = new ForestedPlanksBlock(NAMESPACE.id("pine_planks"));
        ForestedBlocks.Planks.plum = new ForestedPlanksBlock(NAMESPACE.id("plum_planks"));
        ForestedBlocks.Planks.poplar = new ForestedPlanksBlock(NAMESPACE.id("poplar_planks"));
        ForestedBlocks.Planks.sequoia = new ForestedPlanksBlock(NAMESPACE.id("sequoia_planks"));
        ForestedBlocks.Planks.teak = new ForestedPlanksBlock(NAMESPACE.id("teak_planks"));
        ForestedBlocks.Planks.walnut = new ForestedPlanksBlock(NAMESPACE.id("walnut_planks"));
        ForestedBlocks.Planks.wenge = new ForestedPlanksBlock(NAMESPACE.id("wenge_planks"));
        ForestedBlocks.Planks.willow = new ForestedPlanksBlock(NAMESPACE.id("willow_planks"));
        ForestedBlocks.Planks.zebrawood = new ForestedPlanksBlock(NAMESPACE.id("zebrawood_planks"));

        ForestedBlocks.Sapling.acacia = new ForestedSaplingBlock(NAMESPACE.id("acacia_sapling"));
        ForestedBlocks.Sapling.balsa = new ForestedSaplingBlock(NAMESPACE.id("balsa_sapling"));
        ForestedBlocks.Sapling.baobab = new ForestedSaplingBlock(NAMESPACE.id("baobab_sapling"));
        ForestedBlocks.Sapling.cherry = new ForestedSaplingBlock(NAMESPACE.id("cherry_sapling"));
        ForestedBlocks.Sapling.chestnut = new ForestedSaplingBlock(NAMESPACE.id("chestnut_sapling"));
        ForestedBlocks.Sapling.citrus = new ForestedSaplingBlock(NAMESPACE.id("citrus_sapling"));
        ForestedBlocks.Sapling.cocobolo = new ForestedSaplingBlock(NAMESPACE.id("cocobolo_sapling"));
        ForestedBlocks.Sapling.ebony = new ForestedSaplingBlock(NAMESPACE.id("ebony_sapling"));
        ForestedBlocks.Sapling.giganteum = new ForestedSaplingBlock(NAMESPACE.id("giganteum_sapling"));
        ForestedBlocks.Sapling.greenheart = new ForestedSaplingBlock(NAMESPACE.id("greenheart_sapling"));
        ForestedBlocks.Sapling.ipe = new ForestedSaplingBlock(NAMESPACE.id("ipe_sapling"));
        ForestedBlocks.Sapling.ironwood = new ForestedSaplingBlock(NAMESPACE.id("ironwood_sapling"));
        ForestedBlocks.Sapling.kapok = new ForestedSaplingBlock(NAMESPACE.id("kapok_sapling"));
        ForestedBlocks.Sapling.larch = new ForestedSaplingBlock(NAMESPACE.id("larch_sapling"));
        ForestedBlocks.Sapling.lime = new ForestedSaplingBlock(NAMESPACE.id("lime_sapling"));
        ForestedBlocks.Sapling.mahoe = new ForestedSaplingBlock(NAMESPACE.id("mahoe_sapling"));
        ForestedBlocks.Sapling.mahogany = new ForestedSaplingBlock(NAMESPACE.id("mahogany_sapling"));
        ForestedBlocks.Sapling.maple = new ForestedSaplingBlock(NAMESPACE.id("maple_sapling"));
        ForestedBlocks.Sapling.padauk = new ForestedSaplingBlock(NAMESPACE.id("padauk_sapling"));
        ForestedBlocks.Sapling.palm = new ForestedSaplingBlock(NAMESPACE.id("palm_sapling"));
        ForestedBlocks.Sapling.papaya = new ForestedSaplingBlock(NAMESPACE.id("papaya_sapling"));
        ForestedBlocks.Sapling.pine = new ForestedSaplingBlock(NAMESPACE.id("pine_sapling"));
        ForestedBlocks.Sapling.plum = new ForestedSaplingBlock(NAMESPACE.id("plum_sapling"));
        ForestedBlocks.Sapling.poplar = new ForestedSaplingBlock(NAMESPACE.id("poplar_sapling"));
        ForestedBlocks.Sapling.sequoia = new ForestedSaplingBlock(NAMESPACE.id("sequoia_sapling"));
        ForestedBlocks.Sapling.teak = new ForestedSaplingBlock(NAMESPACE.id("teak_sapling"));
        ForestedBlocks.Sapling.walnut = new ForestedSaplingBlock(NAMESPACE.id("walnut_sapling"));
        ForestedBlocks.Sapling.wenge = new ForestedSaplingBlock(NAMESPACE.id("wenge_sapling"));
        ForestedBlocks.Sapling.willow = new ForestedSaplingBlock(NAMESPACE.id("willow_sapling"));
        ForestedBlocks.Sapling.zebrawood = new ForestedSaplingBlock(NAMESPACE.id("zebrawood_sapling"));
    }
}
