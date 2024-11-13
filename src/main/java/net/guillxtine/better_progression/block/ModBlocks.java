package net.guillxtine.better_progression.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.guillxtine.better_progression.BetterProgression;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks
{

    public static final Block PERMAFROST = registerBlock("permafrost",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).sounds(BlockSoundGroup.STONE)));
    public static final Block PERMAFROST_BRICKS = registerBlock("permafrost_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS).sounds(BlockSoundGroup.STONE)));

    public static final Block CRYSTAL_BLOCK = registerBlock("crystal_block",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));

    public static final Block AQUALITE_BLOCK = registerBlock("aqualite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block RAW_AQUALITE_BLOCK = registerBlock("raw_aqualite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_GOLD_BLOCK)));

    public static final Block PERMAFROST_BRICK_STAIRS = registerBlock("permafrost_brick_stairs",
            new StairsBlock(ModBlocks.PERMAFROST_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(PERMAFROST_BRICKS)));
    public static final Block PERMAFROST_BRICK_SLAB = registerBlock("permafrost_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(PERMAFROST_BRICKS)));
    public static final Block PERMAFROST_BRICK_WALL = registerBlock("permafrost_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(PERMAFROST_BRICKS)));

    public static final Block CRYSTAL_ORE = registerBlock("crystal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f), UniformIntProvider.create(2, 5)));
    public static final Block DEEPSLATE_CRYSTAL_ORE = registerBlock("deepslate_crystal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f), UniformIntProvider.create(2, 5)));
    public static final Block AQUALITE_ORE = registerBlock("aqualite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f), UniformIntProvider.create(1, 4)));
    public static final Block DEEPSLATE_AQUALITE_ORE = registerBlock("deepslate_aqualite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f), UniformIntProvider.create(1, 4)));

    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BetterProgression.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block)
    {
        return Registry.register(Registries.ITEM, new Identifier(BetterProgression.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks()
    {
        BetterProgression.LOGGER.info("Registering Mod Blocks for " + BetterProgression.MOD_ID);
    }

}
