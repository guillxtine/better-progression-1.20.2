package net.guillxtine.better_progression.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.guillxtine.better_progression.block.ModBlocks;
import net.guillxtine.better_progression.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricDataOutput output) { super(output); }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        BlockStateModelGenerator.BlockTexturePool permaBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PERMAFROST_BRICKS);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PERMAFROST);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRYSTAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_CRYSTAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRYSTAL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AQUALITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_AQUALITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AQUALITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_AQUALITE_BLOCK);

        permaBricksPool.stairs(ModBlocks.PERMAFROST_BRICK_STAIRS);
        permaBricksPool.slab(ModBlocks.PERMAFROST_BRICK_SLAB);
        permaBricksPool.wall(ModBlocks.PERMAFROST_BRICK_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
        itemModelGenerator.register(ModItems.CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_AQUALITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.AQUALITE_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.CRYSTAL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CRYSTAL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CRYSTAL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CRYSTAL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CRYSTAL_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.CRYSTAL_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.CRYSTAL_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.CRYSTAL_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.CRYSTAL_BOOTS);

        itemModelGenerator.register(ModItems.AQUALITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AQUALITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AQUALITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AQUALITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AQUALITE_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.AQUALITE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.AQUALITE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.AQUALITE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.AQUALITE_BOOTS);

        itemModelGenerator.register(ModItems.FLOWER_CROWN, Models.GENERATED);
    }
}
