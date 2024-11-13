package net.guillxtine.better_progression.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.guillxtine.better_progression.block.ModBlocks;
import net.guillxtine.better_progression.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider
{
    private static final List<ItemConvertible> AQUALITE_SMELTABLES = List.of(ModItems.RAW_AQUALITE,
            ModBlocks.AQUALITE_ORE, ModBlocks.DEEPSLATE_AQUALITE_ORE);
    private static final List<ItemConvertible> CRYSTAL_SMELTABLES = List.of(ModBlocks.CRYSTAL_ORE, ModBlocks.DEEPSLATE_CRYSTAL_ORE);

    public ModRecipeProvider(FabricDataOutput output) { super(output); }

    @Override
    public void generate(RecipeExporter recipeExporter)
    {
        offer2x2CompactingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.PERMAFROST_BRICKS, ModBlocks.PERMAFROST);

        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.PERMAFROST_BRICK_SLAB, ModBlocks.PERMAFROST_BRICKS);
        offerWallRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.PERMAFROST_BRICK_WALL, ModBlocks.PERMAFROST_BRICKS);

        offerSmelting(recipeExporter, CRYSTAL_SMELTABLES, RecipeCategory.MISC, ModItems.CRYSTAL_SHARD,
                0.7f, 200, "crystal");
        offerBlasting(recipeExporter, CRYSTAL_SMELTABLES, RecipeCategory.MISC, ModItems.CRYSTAL_SHARD,
                0.7f, 100, "crystal");

        offerSmelting(recipeExporter, AQUALITE_SMELTABLES, RecipeCategory.MISC, ModItems.AQUALITE_INGOT,
                0.5f, 200, "aqualite");
        offerBlasting(recipeExporter, AQUALITE_SMELTABLES, RecipeCategory.MISC, ModItems.AQUALITE_INGOT,
                0.5f, 100, "aqualite");

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, ModItems.CRYSTAL_SHARD,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRYSTAL_BLOCK);

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, ModItems.AQUALITE_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.AQUALITE_BLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, ModItems.RAW_AQUALITE,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_AQUALITE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.CRYSTAL_HELMET)
                        .pattern("CCC")
                        .pattern("C C")
                        .input('C', ModItems.CRYSTAL_SHARD)
                        .criterion(hasItem(ModItems.CRYSTAL_SHARD), conditionsFromItem(ModItems.CRYSTAL_SHARD))
                        .offerTo(recipeExporter, new Identifier(getRecipeName(ModItems.CRYSTAL_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.CRYSTAL_CHESTPLATE)
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', ModItems.CRYSTAL_SHARD)
                .criterion(hasItem(ModItems.CRYSTAL_SHARD), conditionsFromItem(ModItems.CRYSTAL_SHARD))
                .offerTo(recipeExporter, new Identifier(getRecipeName(ModItems.CRYSTAL_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.CRYSTAL_LEGGINGS)
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .input('C', ModItems.CRYSTAL_SHARD)
                .criterion(hasItem(ModItems.CRYSTAL_SHARD), conditionsFromItem(ModItems.CRYSTAL_SHARD))
                .offerTo(recipeExporter, new Identifier(getRecipeName(ModItems.CRYSTAL_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.CRYSTAL_BOOTS)
                .pattern("C C")
                .pattern("C C")
                .input('C', ModItems.CRYSTAL_SHARD)
                .criterion(hasItem(ModItems.CRYSTAL_SHARD), conditionsFromItem(ModItems.CRYSTAL_SHARD))
                .offerTo(recipeExporter, new Identifier(getRecipeName(ModItems.CRYSTAL_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CRYSTAL_PICKAXE)
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .input('C', ModItems.CRYSTAL_SHARD)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.CRYSTAL_SHARD), conditionsFromItem(ModItems.CRYSTAL_SHARD))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, new Identifier(getRecipeName(ModItems.CRYSTAL_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CRYSTAL_AXE)
                .pattern("CC")
                .pattern("CS")
                .pattern(" S")
                .input('C', ModItems.CRYSTAL_SHARD)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.CRYSTAL_SHARD), conditionsFromItem(ModItems.CRYSTAL_SHARD))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, new Identifier(getRecipeName(ModItems.CRYSTAL_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CRYSTAL_SHOVEL)
                .pattern("C")
                .pattern("S")
                .pattern("S")
                .input('C', ModItems.CRYSTAL_SHARD)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.CRYSTAL_SHARD), conditionsFromItem(ModItems.CRYSTAL_SHARD))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, new Identifier(getRecipeName(ModItems.CRYSTAL_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CRYSTAL_SWORD)
                .pattern("C")
                .pattern("C")
                .pattern("S")
                .input('C', ModItems.CRYSTAL_SHARD)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.CRYSTAL_SHARD), conditionsFromItem(ModItems.CRYSTAL_SHARD))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, new Identifier(getRecipeName(ModItems.CRYSTAL_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CRYSTAL_HOE)
                .pattern("CC")
                .pattern(" S")
                .pattern(" S")
                .input('C', ModItems.CRYSTAL_SHARD)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.CRYSTAL_SHARD), conditionsFromItem(ModItems.CRYSTAL_SHARD))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, new Identifier(getRecipeName(ModItems.CRYSTAL_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AQUALITE_HELMET)
                .pattern("CCC")
                .pattern("C C")
                .input('C', ModItems.AQUALITE_INGOT)
                .criterion(hasItem(ModItems.AQUALITE_INGOT), conditionsFromItem(ModItems.AQUALITE_INGOT))
                .offerTo(recipeExporter, new Identifier(getRecipeName(ModItems.AQUALITE_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AQUALITE_CHESTPLATE)
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', ModItems.AQUALITE_INGOT)
                .criterion(hasItem(ModItems.AQUALITE_INGOT), conditionsFromItem(ModItems.AQUALITE_INGOT))
                .offerTo(recipeExporter, new Identifier(getRecipeName(ModItems.AQUALITE_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AQUALITE_LEGGINGS)
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .input('C', ModItems.AQUALITE_INGOT)
                .criterion(hasItem(ModItems.AQUALITE_INGOT), conditionsFromItem(ModItems.AQUALITE_INGOT))
                .offerTo(recipeExporter, new Identifier(getRecipeName(ModItems.AQUALITE_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AQUALITE_BOOTS)
                .pattern("C C")
                .pattern("C C")
                .input('C', ModItems.AQUALITE_INGOT)
                .criterion(hasItem(ModItems.AQUALITE_INGOT), conditionsFromItem(ModItems.AQUALITE_INGOT))
                .offerTo(recipeExporter, new Identifier(getRecipeName(ModItems.AQUALITE_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.AQUALITE_PICKAXE)
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .input('C', ModItems.AQUALITE_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.AQUALITE_INGOT), conditionsFromItem(ModItems.AQUALITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, new Identifier(getRecipeName(ModItems.AQUALITE_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.AQUALITE_AXE)
                .pattern("CC")
                .pattern("CS")
                .pattern(" S")
                .input('C', ModItems.AQUALITE_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.AQUALITE_INGOT), conditionsFromItem(ModItems.AQUALITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, new Identifier(getRecipeName(ModItems.AQUALITE_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.AQUALITE_SHOVEL)
                .pattern("C")
                .pattern("S")
                .pattern("S")
                .input('C', ModItems.AQUALITE_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.AQUALITE_INGOT), conditionsFromItem(ModItems.AQUALITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, new Identifier(getRecipeName(ModItems.AQUALITE_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.AQUALITE_SWORD)
                .pattern("C")
                .pattern("C")
                .pattern("S")
                .input('C', ModItems.AQUALITE_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.AQUALITE_INGOT), conditionsFromItem(ModItems.AQUALITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, new Identifier(getRecipeName(ModItems.AQUALITE_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.AQUALITE_HOE)
                .pattern("CC")
                .pattern(" S")
                .pattern(" S")
                .input('C', ModItems.AQUALITE_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.AQUALITE_INGOT), conditionsFromItem(ModItems.AQUALITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, new Identifier(getRecipeName(ModItems.AQUALITE_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PERMAFROST_BRICK_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ModBlocks.PERMAFROST_BRICKS)
                .criterion(hasItem(ModBlocks.PERMAFROST_BRICKS), conditionsFromItem(ModBlocks.PERMAFROST_BRICKS))
                .offerTo(recipeExporter, new Identifier(getRecipeName(ModBlocks.PERMAFROST_BRICK_STAIRS)));
    }
}
