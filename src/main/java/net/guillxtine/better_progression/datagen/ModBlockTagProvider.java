package net.guillxtine.better_progression.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.guillxtine.better_progression.block.ModBlocks;
import net.guillxtine.better_progression.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

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

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.MAHOGANY_PLANKS)
                .add(ModBlocks.MAHOGANY_LOG)
                .add(ModBlocks.MAHOGANY_WOOD)
                .add(ModBlocks.STRIPPED_MAHOGANY_LOG)
                .add(ModBlocks.STRIPPED_MAHOGANY_WOOD)
                .add(ModBlocks.STANDING_MAHOGANY_SIGN)
                .add(ModBlocks.WALL_MAHOGANY_SIGN)
                .add(ModBlocks.HANGING_MAHOGANY_SIGN)
                .add(ModBlocks.WALL_HANGING_MAHOGANY_SIGN);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.MAHOGANY_LEAVES);

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

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.MAHOGANY_LOG)
                .add(ModBlocks.MAHOGANY_WOOD)
                .add(ModBlocks.STRIPPED_MAHOGANY_LOG)
                .add(ModBlocks.STRIPPED_MAHOGANY_WOOD);

        getOrCreateTagBuilder(ModTags.Blocks.MAHOGANY_LOGS)
                .add(ModBlocks.MAHOGANY_LOG)
                .add(ModBlocks.MAHOGANY_WOOD)
                .add(ModBlocks.STRIPPED_MAHOGANY_LOG)
                .add(ModBlocks.STRIPPED_MAHOGANY_WOOD);

        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(ModBlocks.MAHOGANY_LOG)
                .add(ModBlocks.MAHOGANY_WOOD)
                .add(ModBlocks.STRIPPED_MAHOGANY_LOG)
                .add(ModBlocks.STRIPPED_MAHOGANY_WOOD);

        getOrCreateTagBuilder(BlockTags.DOORS)
                .add(ModBlocks.MAHOGANY_DOOR);
        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.MAHOGANY_DOOR);
        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
                .add(ModBlocks.MAHOGANY_TRAPDOOR);
        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.MAHOGANY_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.MAHOGANY_PRESSURE_PLATE);
        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(ModBlocks.MAHOGANY_BUTTON);
        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.MAHOGANY_BUTTON);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.MAHOGANY_STAIRS)
                .add(ModBlocks.PERMAFROST_BRICK_STAIRS);
        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.MAHOGANY_STAIRS);
        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.MAHOGANY_SLAB)
                .add(ModBlocks.PERMAFROST_BRICK_SLAB);
        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.MAHOGANY_SLAB);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.MAHOGANY_FENCE);
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.MAHOGANY_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.MAHOGANY_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.PERMAFROST_BRICK_WALL);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ModBlocks.MAHOGANY_PLANKS);

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(ModBlocks.MAHOGANY_LEAVES);
    }
}
