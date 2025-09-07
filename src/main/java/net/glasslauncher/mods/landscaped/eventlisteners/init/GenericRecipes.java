package net.glasslauncher.mods.landscaped.eventlisteners.init;

import net.glasslauncher.mods.landscaped.LandscapedConfig;
import net.glasslauncher.mods.landscaped.blocks.LandscapedBlocks;
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
            boolean disablePlanks = LandscapedConfig.MAIN_CONFIG.disablePlanks;
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.acacia, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.acacia);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.balsa, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.balsa);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.baobab, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.baobab);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.cherry, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.cherry);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.chestnut, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.chestnut);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.citrus, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.citrus);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.cocobolo, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.cocobolo);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.ebony, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.ebony);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.giganteum, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.giganteum);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.greenheart, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.greenheart);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.ipe, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.ipe);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.ironwood, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.ironwood);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.kapok, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.kapok);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.larch, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.larch);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.lime, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.lime);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.mahoe, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.mahoe);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.mahogany, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.mahogany);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.maple, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.maple);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.padauk, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.padauk);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.palm, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.palm);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.papaya, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.papaya);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.pine, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.pine);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.plum, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.plum);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.poplar, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.poplar);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.sequoia, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.sequoia);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.teak, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.teak);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.walnut, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.walnut);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.wenge, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.wenge);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.willow, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.willow);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.zebrawood, 4), disablePlanks ? Block.PLANKS : LandscapedBlocks.Wood.zebrawood);

            CraftingRegistry.addShapedRecipe(new ItemStack(Item.STICK, 4), "P", "P", 'P', ItemTags.PLANKS);
        }
    }
}
