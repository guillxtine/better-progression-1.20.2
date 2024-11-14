package net.guillxtine.better_progression.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.guillxtine.better_progression.BetterProgression;
import net.guillxtine.better_progression.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups
{
    public static final ItemGroup BETTER_PROGRESSION_BLOCKS = Registry.register(Registries.ITEM_GROUP, new Identifier(BetterProgression.MOD_ID,
                    "better_progression_blocks"), FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.better_progression_blocks"))
                            .icon(() -> new ItemStack(ModBlocks.PERMAFROST)).entries(((displayContext, entries) -> {
                                entries.add(ModBlocks.PERMAFROST);
                                entries.add(ModBlocks.PERMAFROST_BRICKS);
                                entries.add(ModBlocks.PERMAFROST_BRICK_STAIRS);
                                entries.add(ModBlocks.PERMAFROST_BRICK_SLAB);
                                entries.add(ModBlocks.PERMAFROST_BRICK_WALL);
                                entries.add(ModBlocks.CRYSTAL_ORE);
                                entries.add(ModBlocks.DEEPSLATE_CRYSTAL_ORE);
                                entries.add(ModBlocks.CRYSTAL_BLOCK);
                                entries.add(ModBlocks.AQUALITE_ORE);
                                entries.add(ModBlocks.DEEPSLATE_AQUALITE_ORE);
                                entries.add(ModBlocks.AQUALITE_BLOCK);
                                entries.add(ModBlocks.RAW_AQUALITE_BLOCK);
                                entries.add(ModBlocks.MAHOGANY_SAPLING);
                                entries.add(ModBlocks.MAHOGANY_LOG);
                                entries.add(ModBlocks.MAHOGANY_WOOD);
                                entries.add(ModBlocks.STRIPPED_MAHOGANY_LOG);
                                entries.add(ModBlocks.STRIPPED_MAHOGANY_WOOD);
                                entries.add(ModBlocks.MAHOGANY_LEAVES);
                                entries.add(ModBlocks.MAHOGANY_PLANKS);
                                entries.add(ModBlocks.MAHOGANY_STAIRS);
                                entries.add(ModBlocks.MAHOGANY_SLAB);
                                entries.add(ModBlocks.MAHOGANY_FENCE);
                                entries.add(ModBlocks.MAHOGANY_FENCE_GATE);
                                entries.add(ModBlocks.MAHOGANY_BUTTON);
                                entries.add(ModBlocks.MAHOGANY_PRESSURE_PLATE);
                                entries.add(ModBlocks.MAHOGANY_TRAPDOOR);
                                entries.add(ModBlocks.MAHOGANY_DOOR);
                            })).build());

    public static final ItemGroup BETTER_PROGRESSION_ITEMS = Registry.register(Registries.ITEM_GROUP, new Identifier(BetterProgression.MOD_ID,
            "better_progression_items"), FabricItemGroup.builder()
            .displayName(Text.translatable("itemgroup.better_progression_items"))
                .icon(() -> new ItemStack(ModItems.CRYSTAL_SHARD)).entries(((displayContext, entries) -> {
                    entries.add(ModItems.CRYSTAL_SHARD);
                    entries.add(ModItems.RAW_AQUALITE);
                    entries.add(ModItems.AQUALITE_INGOT);
                    entries.add(ModItems.CRYSTAL_PICKAXE);
                    entries.add(ModItems.CRYSTAL_AXE);
                    entries.add(ModItems.CRYSTAL_SHOVEL);
                    entries.add(ModItems.CRYSTAL_SWORD);
                    entries.add(ModItems.CRYSTAL_HOE);
                    entries.add(ModItems.AQUALITE_PICKAXE);
                    entries.add(ModItems.AQUALITE_AXE);
                    entries.add(ModItems.AQUALITE_SHOVEL);
                    entries.add(ModItems.AQUALITE_SWORD);
                    entries.add(ModItems.AQUALITE_HOE);
                    entries.add(ModItems.CRYSTAL_HELMET);
                    entries.add(ModItems.CRYSTAL_CHESTPLATE);
                    entries.add(ModItems.CRYSTAL_LEGGINGS);
                    entries.add(ModItems.CRYSTAL_BOOTS);
                    entries.add(ModItems.AQUALITE_HELMET);
                    entries.add(ModItems.AQUALITE_CHESTPLATE);
                    entries.add(ModItems.AQUALITE_LEGGINGS);
                    entries.add(ModItems.AQUALITE_BOOTS);
                    entries.add(ModItems.FLOWER_CROWN);
                    entries.add(ModItems.MAHOGANY_SIGN);
                    entries.add(ModItems.HANGING_MAHOGANY_SIGN);
                    entries.add(ModItems.MAHOGANY_BOAT);
                    entries.add(ModItems.MAHOGANY_CHEST_BOAT);
                })).build());

    public static void registerItemGroups()
    {
        BetterProgression.LOGGER.info("Registering Item Groups for " + BetterProgression.MOD_ID);
    }
}
