package net.glasslauncher.mods.forested.eventlisteners.init;

import net.glasslauncher.mods.forested.blocks.ForestedBlocks;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.client.event.texture.TextureRegisterEvent;
import net.modificationstation.stationapi.api.client.texture.atlas.Atlases;
import net.modificationstation.stationapi.api.client.texture.atlas.ExpandableAtlas;
import net.modificationstation.stationapi.api.mod.entrypoint.EntrypointManager;

import java.lang.invoke.MethodHandles;

import static net.glasslauncher.mods.forested.Forested.NAMESPACE;

public class WoodTextureListener {
    static {
        EntrypointManager.registerLookup(MethodHandles.lookup());
    }

    @EventListener
    private static void init(TextureRegisterEvent event) {
        ExpandableAtlas terrain = Atlases.getTerrain();

        ForestedBlocks.Wood.acacia.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/acacia")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/acacia")).index);
        ForestedBlocks.Wood.balsa.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/balsa")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/balsa")).index);
        ForestedBlocks.Wood.baobab.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/baobab")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/baobab")).index);
        ForestedBlocks.Wood.cherry.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/cherry")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/cherry")).index);
        ForestedBlocks.Wood.chestnut.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/chestnut")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/chestnut")).index);
        ForestedBlocks.Wood.citrus.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/citrus")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/citrus")).index);
        ForestedBlocks.Wood.cocobolo.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/cocobolo")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/cocobolo")).index);
        ForestedBlocks.Wood.ebony.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/ebony")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/ebony")).index);
        ForestedBlocks.Wood.giganteum.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/giganteum")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/giganteum")).index);
        ForestedBlocks.Wood.greenheart.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/greenheart")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/greenheart")).index);
        ForestedBlocks.Wood.ipe.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/ipe")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/ipe")).index);
        ForestedBlocks.Wood.ironwood.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/ironwood")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/ironwood")).index);
        ForestedBlocks.Wood.kapok.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/kapok")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/kapok")).index);
        ForestedBlocks.Wood.larch.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/larch")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/larch")).index);
        ForestedBlocks.Wood.lime.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/lime")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/lime")).index);
        ForestedBlocks.Wood.mahoe.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/mahoe")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/mahoe")).index);
        ForestedBlocks.Wood.mahogany.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/mahogany")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/mahogany")).index);
        ForestedBlocks.Wood.maple.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/maple")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/maple")).index);
        ForestedBlocks.Wood.padauk.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/padauk")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/padauk")).index);
        ForestedBlocks.Wood.palm.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/palm")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/palm")).index);
        ForestedBlocks.Wood.papaya.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/papaya")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/papaya")).index);
        ForestedBlocks.Wood.pine.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/pine")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/pine")).index);
        ForestedBlocks.Wood.plum.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/plum")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/plum")).index);
        ForestedBlocks.Wood.poplar.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/poplar")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/poplar")).index);
        ForestedBlocks.Wood.sequoia.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/sequoia")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/sequoia")).index);
        ForestedBlocks.Wood.teak.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/teak")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/teak")).index);
        ForestedBlocks.Wood.walnut.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/walnut")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/walnut")).index);
        ForestedBlocks.Wood.wenge.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/wenge")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/wenge")).index);
        ForestedBlocks.Wood.willow.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/willow")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/willow")).index);
        ForestedBlocks.Wood.zebrawood.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/zebrawood")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/zebrawood")).index);

        ForestedBlocks.Planks.acacia.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/acacia")).index;
        ForestedBlocks.Planks.balsa.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/balsa")).index;
        ForestedBlocks.Planks.baobab.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/baobab")).index;
        ForestedBlocks.Planks.cherry.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/cherry")).index;
        ForestedBlocks.Planks.chestnut.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/chestnut")).index;
        ForestedBlocks.Planks.citrus.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/citrus")).index;
        ForestedBlocks.Planks.cocobolo.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/cocobolo")).index;
        ForestedBlocks.Planks.ebony.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/ebony")).index;
        ForestedBlocks.Planks.giganteum.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/giganteum")).index;
        ForestedBlocks.Planks.greenheart.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/greenheart")).index;
        ForestedBlocks.Planks.ipe.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/ipe")).index;
        ForestedBlocks.Planks.ironwood.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/ironwood")).index;
        ForestedBlocks.Planks.kapok.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/kapok")).index;
        ForestedBlocks.Planks.larch.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/larch")).index;
        ForestedBlocks.Planks.lime.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/lime")).index;
        ForestedBlocks.Planks.mahoe.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/mahoe")).index;
        ForestedBlocks.Planks.mahogany.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/mahogany")).index;
        ForestedBlocks.Planks.maple.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/maple")).index;
        ForestedBlocks.Planks.padauk.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/padauk")).index;
        ForestedBlocks.Planks.palm.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/palm")).index;
        ForestedBlocks.Planks.papaya.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/papaya")).index;
        ForestedBlocks.Planks.pine.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/pine")).index;
        ForestedBlocks.Planks.plum.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/plum")).index;
        ForestedBlocks.Planks.poplar.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/poplar")).index;
        ForestedBlocks.Planks.sequoia.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/sequoia")).index;
        ForestedBlocks.Planks.teak.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/teak")).index;
        ForestedBlocks.Planks.walnut.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/walnut")).index;
        ForestedBlocks.Planks.wenge.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/wenge")).index;
        ForestedBlocks.Planks.willow.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/willow")).index;
        ForestedBlocks.Planks.zebrawood.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/zebrawood")).index;
    }
}
