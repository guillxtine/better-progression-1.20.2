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
