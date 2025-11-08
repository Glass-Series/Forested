package net.glasslauncher.mods.forested.blocks;

import net.modificationstation.stationapi.api.template.item.TemplateSaplingBlockItem;

public class ForestedSaplingBlockItem extends TemplateSaplingBlockItem {
    public ForestedSaplingBlockItem(int i) {
        super(i);
    }

    @Override
    public int getTextureId(int damage) {
        return getBlock().getTexture(0);
    }
}
