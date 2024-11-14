package net.guillxtine.better_progression.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.guillxtine.better_progression.block.ModBlocks;
import net.guillxtine.better_progression.item.ModItems;
import net.guillxtine.better_progression.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider
{
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture)
    {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
    {


        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.CRYSTAL_HELMET, ModItems.CRYSTAL_CHESTPLATE, ModItems.CRYSTAL_LEGGINGS, ModItems.CRYSTAL_BOOTS)
                .add(ModItems.AQUALITE_HELMET, ModItems.AQUALITE_CHESTPLATE, ModItems.AQUALITE_LEGGINGS, ModItems.AQUALITE_BOOTS);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.CRYSTAL_SWORD)
                .add(ModItems.AQUALITE_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.CRYSTAL_PICKAXE)
                .add(ModItems.AQUALITE_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.CRYSTAL_AXE)
                .add(ModItems.AQUALITE_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.CRYSTAL_SHOVEL)
                .add(ModItems.AQUALITE_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.CRYSTAL_HOE)
                .add(ModItems.AQUALITE_HOE);

        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                .add(ModItems.CRYSTAL_SHARD);

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.MAHOGANY_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.MAHOGANY_LOG.asItem())
                .add(ModBlocks.MAHOGANY_WOOD.asItem())
                .add(ModBlocks.STRIPPED_MAHOGANY_LOG.asItem())
                .add(ModBlocks.STRIPPED_MAHOGANY_WOOD.asItem());

        getOrCreateTagBuilder(ModTags.Items.MAHOGANY_LOGS)
                .add(ModBlocks.MAHOGANY_LOG.asItem())
                .add(ModBlocks.MAHOGANY_WOOD.asItem())
                .add(ModBlocks.STRIPPED_MAHOGANY_LOG.asItem())
                .add(ModBlocks.STRIPPED_MAHOGANY_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.DOORS)
                .add(ModBlocks.MAHOGANY_DOOR.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(ModBlocks.MAHOGANY_DOOR.asItem());
        getOrCreateTagBuilder(ItemTags.TRAPDOORS)
                .add(ModBlocks.MAHOGANY_TRAPDOOR.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.MAHOGANY_TRAPDOOR.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.MAHOGANY_PRESSURE_PLATE.asItem());
        getOrCreateTagBuilder(ItemTags.BUTTONS)
                .add(ModBlocks.MAHOGANY_BUTTON.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(ModBlocks.MAHOGANY_BUTTON.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.MAHOGANY_STAIRS.asItem())
                .add(ModBlocks.PERMAFROST_BRICK_STAIRS.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(ModBlocks.MAHOGANY_STAIRS.asItem());
        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.MAHOGANY_SLAB.asItem())
                .add(ModBlocks.PERMAFROST_BRICK_SLAB.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(ModBlocks.MAHOGANY_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.FENCES)
                .add(ModBlocks.MAHOGANY_FENCE.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(ModBlocks.MAHOGANY_FENCE.asItem());
        getOrCreateTagBuilder(ItemTags.FENCE_GATES)
                .add(ModBlocks.MAHOGANY_FENCE_GATE.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.PERMAFROST_BRICK_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(ModBlocks.MAHOGANY_LEAVES.asItem());

        getOrCreateTagBuilder(ItemTags.BOATS)
                .add(ModItems.MAHOGANY_BOAT);
        getOrCreateTagBuilder(ItemTags.CHEST_BOATS)
                .add(ModItems.MAHOGANY_CHEST_BOAT);
    }
}
