package net.guillxtine.better_progression.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.guillxtine.better_progression.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider
{
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
    {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PERMAFROST)
                .add(ModBlocks.PERMAFROST_BRICKS)
                .add(ModBlocks.PERMAFROST_BRICK_STAIRS)
                .add(ModBlocks.PERMAFROST_BRICK_SLAB)
                .add(ModBlocks.PERMAFROST_BRICK_WALL)
                .add(ModBlocks.CRYSTAL_ORE)
                .add(ModBlocks.DEEPSLATE_CRYSTAL_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.CRYSTAL_ORE)
                .add(ModBlocks.DEEPSLATE_CRYSTAL_ORE)
                .add(ModBlocks.CRYSTAL_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.PERMAFROST)
                .add(ModBlocks.PERMAFROST_BRICKS)
                .add(ModBlocks.PERMAFROST_BRICK_STAIRS)
                .add(ModBlocks.PERMAFROST_BRICK_SLAB)
                .add(ModBlocks.PERMAFROST_BRICK_WALL)
                .add(ModBlocks.AQUALITE_ORE)
                .add(ModBlocks.DEEPSLATE_AQUALITE_ORE)
                .add(ModBlocks.AQUALITE_BLOCK)
                .add(ModBlocks.RAW_AQUALITE_BLOCK);
    }
}
