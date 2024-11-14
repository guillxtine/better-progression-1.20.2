package net.guillxtine.better_progression.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.guillxtine.better_progression.block.ModBlocks;
import net.guillxtine.better_progression.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider
{

    public ModLootTableProvider(FabricDataOutput dataOutput) { super(dataOutput); }

    @Override
    public void generate()
    {
        addDrop(ModBlocks.PERMAFROST);
        addDrop(ModBlocks.PERMAFROST_BRICKS);
        addDrop(ModBlocks.PERMAFROST_BRICK_STAIRS);
        addDrop(ModBlocks.PERMAFROST_BRICK_SLAB, slabDrops(ModBlocks.PERMAFROST_BRICK_SLAB));
        addDrop(ModBlocks.PERMAFROST_BRICK_WALL);

        addDrop(ModBlocks.CRYSTAL_ORE, crystalOreDrops(ModBlocks.CRYSTAL_ORE, ModItems.CRYSTAL_SHARD));
        addDrop(ModBlocks.DEEPSLATE_CRYSTAL_ORE, crystalOreDrops(ModBlocks.DEEPSLATE_CRYSTAL_ORE, ModItems.CRYSTAL_SHARD));
        addDrop(ModBlocks.CRYSTAL_BLOCK);

        addDrop(ModBlocks.AQUALITE_ORE, ModItems.RAW_AQUALITE);
        addDrop(ModBlocks.DEEPSLATE_AQUALITE_ORE, ModItems.RAW_AQUALITE);
        addDrop(ModBlocks.AQUALITE_BLOCK);
        addDrop(ModBlocks.RAW_AQUALITE_BLOCK);

        addDrop(ModBlocks.MAHOGANY_LOG);
        addDrop(ModBlocks.MAHOGANY_WOOD);
        addDrop(ModBlocks.STRIPPED_MAHOGANY_LOG);
        addDrop(ModBlocks.STRIPPED_MAHOGANY_WOOD);
        addDrop(ModBlocks.MAHOGANY_SAPLING);

        addDrop(ModBlocks.MAHOGANY_PLANKS);
        addDrop(ModBlocks.MAHOGANY_STAIRS);
        addDrop(ModBlocks.MAHOGANY_SLAB, slabDrops(ModBlocks.MAHOGANY_SLAB));
        addDrop(ModBlocks.MAHOGANY_BUTTON);
        addDrop(ModBlocks.MAHOGANY_PRESSURE_PLATE);
        addDrop(ModBlocks.MAHOGANY_FENCE);
        addDrop(ModBlocks.MAHOGANY_FENCE_GATE);
        addDrop(ModBlocks.MAHOGANY_TRAPDOOR);
        addDrop(ModBlocks.MAHOGANY_DOOR, doorDrops(ModBlocks.MAHOGANY_DOOR));

        addDrop(ModBlocks.STANDING_MAHOGANY_SIGN);
        addDrop(ModBlocks.WALL_MAHOGANY_SIGN);
        addDrop(ModBlocks.HANGING_MAHOGANY_SIGN);
        addDrop(ModBlocks.WALL_HANGING_MAHOGANY_SIGN);

        addDrop(ModBlocks.MAHOGANY_LEAVES, leavesDrops(ModBlocks.MAHOGANY_LEAVES, ModBlocks.MAHOGANY_SAPLING, 0.005f));
    }

    public LootTable.Builder crystalOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(1.0f, 3.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
