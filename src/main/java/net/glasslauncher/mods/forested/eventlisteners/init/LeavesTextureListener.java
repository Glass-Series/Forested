package net.glasslauncher.mods.forested.eventlisteners.init;

import net.glasslauncher.mods.forested.blocks.ForestedBlocks;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.client.event.texture.TextureRegisterEvent;
import net.modificationstation.stationapi.api.client.texture.atlas.Atlases;
import net.modificationstation.stationapi.api.client.texture.atlas.ExpandableAtlas;
import net.modificationstation.stationapi.api.mod.entrypoint.EntrypointManager;

import java.lang.invoke.MethodHandles;

import static net.glasslauncher.mods.forested.Forested.NAMESPACE;

public class LeavesTextureListener {
    static {
        EntrypointManager.registerLookup(MethodHandles.lookup());
    }

    @EventListener
    private static void init(TextureRegisterEvent event) {
        ExpandableAtlas terrain = Atlases.getTerrain();

        int conifers = terrain.addTexture(NAMESPACE.id("block/leaves/conifers.fancy")).index;
        int deciduous = terrain.addTexture(NAMESPACE.id("block/leaves/deciduous.fancy")).index;
        int jungle = terrain.addTexture(NAMESPACE.id("block/leaves/jungle.fancy")).index;
        int maple = terrain.addTexture(NAMESPACE.id("block/leaves/maple.fancy")).index;
        int palm = terrain.addTexture(NAMESPACE.id("block/leaves/palm.fancy")).index;
        int willow = terrain.addTexture(NAMESPACE.id("block/leaves/willow.fancy")).index;

        int fastConifers = terrain.addTexture(NAMESPACE.id("block/leaves/conifers.plain")).index;
        int fastDeciduous = terrain.addTexture(NAMESPACE.id("block/leaves/deciduous.plain")).index;
        int fastJungle = terrain.addTexture(NAMESPACE.id("block/leaves/jungle.plain")).index;
        int fastMaple = terrain.addTexture(NAMESPACE.id("block/leaves/maple.plain")).index;
        int fastPalm = terrain.addTexture(NAMESPACE.id("block/leaves/palm.plain")).index;
        int fastWillow = terrain.addTexture(NAMESPACE.id("block/leaves/willow.plain")).index;

        ForestedBlocks.Leaves.acacia.textureId = deciduous;
        ForestedBlocks.Leaves.balsa.textureId = deciduous;
        ForestedBlocks.Leaves.baobab.textureId = deciduous;
        ForestedBlocks.Leaves.cherry.textureId = deciduous;
        ForestedBlocks.Leaves.chestnut.textureId = deciduous;
        ForestedBlocks.Leaves.citrus.textureId = deciduous;
        ForestedBlocks.Leaves.cocobolo.textureId = deciduous;
        ForestedBlocks.Leaves.ebony.textureId = jungle;
        ForestedBlocks.Leaves.giganteum.textureId = conifers;
        ForestedBlocks.Leaves.greenheart.textureId = deciduous;
        ForestedBlocks.Leaves.ipe.textureId = jungle;
        ForestedBlocks.Leaves.ironwood.textureId = conifers;
        ForestedBlocks.Leaves.kapok.textureId = jungle;
        ForestedBlocks.Leaves.larch.textureId = conifers;
        ForestedBlocks.Leaves.lime.textureId = deciduous;
        ForestedBlocks.Leaves.mahoe.textureId = deciduous;
        ForestedBlocks.Leaves.mahogany.textureId = jungle;
        ForestedBlocks.Leaves.maple.textureId = maple;
        ForestedBlocks.Leaves.padauk.textureId = deciduous;
        ForestedBlocks.Leaves.palm.textureId = palm;
        ForestedBlocks.Leaves.papaya.textureId = palm;
        ForestedBlocks.Leaves.pine.textureId = conifers;
        ForestedBlocks.Leaves.plum.textureId = deciduous;
        ForestedBlocks.Leaves.poplar.textureId = deciduous;
        ForestedBlocks.Leaves.sequoia.textureId = conifers;
        ForestedBlocks.Leaves.teak.textureId = jungle;
        ForestedBlocks.Leaves.walnut.textureId = deciduous;
        ForestedBlocks.Leaves.wenge.textureId = deciduous;
        ForestedBlocks.Leaves.willow.textureId = willow;
        ForestedBlocks.Leaves.zebrawood.textureId = jungle;

        ForestedBlocks.Leaves.acacia.fastTextureId = fastDeciduous;
        ForestedBlocks.Leaves.balsa.fastTextureId = fastDeciduous;
        ForestedBlocks.Leaves.baobab.fastTextureId = fastDeciduous;
        ForestedBlocks.Leaves.cherry.fastTextureId = fastDeciduous;
        ForestedBlocks.Leaves.chestnut.fastTextureId = fastDeciduous;
        ForestedBlocks.Leaves.citrus.fastTextureId = fastDeciduous;
        ForestedBlocks.Leaves.cocobolo.fastTextureId = fastDeciduous;
        ForestedBlocks.Leaves.ebony.fastTextureId = fastJungle;
        ForestedBlocks.Leaves.giganteum.fastTextureId = fastConifers;
        ForestedBlocks.Leaves.greenheart.fastTextureId = fastDeciduous;
        ForestedBlocks.Leaves.ipe.fastTextureId = fastJungle;
        ForestedBlocks.Leaves.ironwood.fastTextureId = fastConifers;
        ForestedBlocks.Leaves.kapok.fastTextureId = fastJungle;
        ForestedBlocks.Leaves.larch.fastTextureId = fastConifers;
        ForestedBlocks.Leaves.lime.fastTextureId = fastDeciduous;
        ForestedBlocks.Leaves.mahoe.fastTextureId = fastDeciduous;
        ForestedBlocks.Leaves.mahogany.fastTextureId = fastJungle;
        ForestedBlocks.Leaves.maple.fastTextureId = fastMaple;
        ForestedBlocks.Leaves.padauk.fastTextureId = fastDeciduous;
        ForestedBlocks.Leaves.palm.fastTextureId = fastPalm;
        ForestedBlocks.Leaves.papaya.fastTextureId = fastPalm;
        ForestedBlocks.Leaves.pine.fastTextureId = fastConifers;
        ForestedBlocks.Leaves.plum.fastTextureId = fastDeciduous;
        ForestedBlocks.Leaves.poplar.fastTextureId = fastDeciduous;
        ForestedBlocks.Leaves.sequoia.fastTextureId = fastConifers;
        ForestedBlocks.Leaves.teak.fastTextureId = fastJungle;
        ForestedBlocks.Leaves.walnut.fastTextureId = fastDeciduous;
        ForestedBlocks.Leaves.wenge.fastTextureId = fastDeciduous;
        ForestedBlocks.Leaves.willow.fastTextureId = fastWillow;
        ForestedBlocks.Leaves.zebrawood.fastTextureId = fastJungle;

        ForestedBlocks.Sapling.acacia.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/acacia")).index;
        ForestedBlocks.Sapling.balsa.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/balsa")).index;
        ForestedBlocks.Sapling.baobab.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/baobab")).index;
        ForestedBlocks.Sapling.cherry.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/cherry")).index;
        ForestedBlocks.Sapling.chestnut.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/chestnut")).index;
        ForestedBlocks.Sapling.citrus.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/citrus")).index;
        ForestedBlocks.Sapling.cocobolo.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/cocobolo")).index;
        ForestedBlocks.Sapling.ebony.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/ebony")).index;
        ForestedBlocks.Sapling.giganteum.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/giganteum")).index;
        ForestedBlocks.Sapling.greenheart.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/greenheart")).index;
        ForestedBlocks.Sapling.ipe.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/ipe")).index;
        ForestedBlocks.Sapling.ironwood.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/ironwood")).index;
        ForestedBlocks.Sapling.kapok.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/kapok")).index;
        ForestedBlocks.Sapling.larch.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/larch")).index;
        ForestedBlocks.Sapling.lime.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/lime")).index;
        ForestedBlocks.Sapling.mahoe.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/mahoe")).index;
        ForestedBlocks.Sapling.mahogany.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/mahogany")).index;
        ForestedBlocks.Sapling.maple.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/maple")).index;
        ForestedBlocks.Sapling.padauk.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/padauk")).index;
        ForestedBlocks.Sapling.palm.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/palm")).index;
        ForestedBlocks.Sapling.papaya.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/papaya")).index;
        ForestedBlocks.Sapling.pine.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/pine")).index;
        ForestedBlocks.Sapling.plum.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/plum")).index;
        ForestedBlocks.Sapling.poplar.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/poplar")).index;
        ForestedBlocks.Sapling.sequoia.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/sequoia")).index;
        ForestedBlocks.Sapling.teak.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/teak")).index;
        ForestedBlocks.Sapling.walnut.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/walnut")).index;
        ForestedBlocks.Sapling.wenge.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/wenge")).index;
        ForestedBlocks.Sapling.willow.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/willow")).index;
        ForestedBlocks.Sapling.zebrawood.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/zebrawood")).index;
    }
}
