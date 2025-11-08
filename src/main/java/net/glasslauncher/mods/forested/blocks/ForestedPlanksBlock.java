package net.glasslauncher.mods.forested.blocks;

import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.util.Identifier;

public class ForestedPlanksBlock extends TemplateBlock {
    public ForestedPlanksBlock(Identifier identifier) {
        super(identifier, Material.WOOD);
		setHardness(2.0F);
        setResistance(5.0F);
        setSoundGroup(WOOD_SOUND_GROUP);
        setTranslationKey(identifier);
        ignoreMetaUpdates();
    }
}
