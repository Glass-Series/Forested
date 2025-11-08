package net.glasslauncher.mods.forested.eventlisteners.init;

import net.glasslauncher.mods.forested.ForestedConfig;
import net.glasslauncher.mods.forested.blocks.ForestedBlocks;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.modificationstation.stationapi.api.event.recipe.RecipeRegisterEvent;
import net.modificationstation.stationapi.api.recipe.CraftingRegistry;
import net.modificationstation.stationapi.api.registry.tag.ItemTags;

public class GenericRecipes {

    @EventListener
    public static void init(RecipeRegisterEvent event) {
        if (event.recipeId == RecipeRegisterEvent.Vanilla.CRAFTING_SHAPELESS.type()) {
            boolean disablePlanks = ForestedConfig.MAIN_CONFIG.disablePlanks;
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.acacia, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.acacia);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.balsa, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.balsa);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.baobab, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.baobab);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.cherry, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.cherry);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.chestnut, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.chestnut);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.citrus, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.citrus);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.cocobolo, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.cocobolo);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.ebony, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.ebony);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.giganteum, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.giganteum);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.greenheart, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.greenheart);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.ipe, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.ipe);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.ironwood, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.ironwood);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.kapok, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.kapok);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.larch, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.larch);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.lime, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.lime);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.mahoe, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.mahoe);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.mahogany, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.mahogany);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.maple, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.maple);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.padauk, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.padauk);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.palm, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.palm);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.papaya, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.papaya);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.pine, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.pine);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.plum, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.plum);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.poplar, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.poplar);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.sequoia, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.sequoia);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.teak, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.teak);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.walnut, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.walnut);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.wenge, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.wenge);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.willow, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.willow);
            CraftingRegistry.addShapelessRecipe(new ItemStack(ForestedBlocks.Planks.zebrawood, 4), disablePlanks ? Block.PLANKS : ForestedBlocks.Wood.zebrawood);

            CraftingRegistry.addShapedRecipe(new ItemStack(Item.STICK, 4), "P", "P", 'P', ItemTags.PLANKS);
        }
    }
}
