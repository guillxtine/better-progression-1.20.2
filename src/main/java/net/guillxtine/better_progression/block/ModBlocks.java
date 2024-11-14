package net.guillxtine.better_progression.block;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.guillxtine.better_progression.BetterProgression;
import net.guillxtine.better_progression.world.tree.MahoganySaplingGenerator;
import net.minecraft.block.*;
import net.minecraft.client.tutorial.TutorialManager;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
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

    public static final Block MAHOGANY_SAPLING = registerBlock("mahogany_sapling",
            new SaplingBlock(new MahoganySaplingGenerator(), FabricBlockSettings.copyOf(Blocks.JUNGLE_SAPLING)));

    public static final Block MAHOGANY_LOG = registerBlock("mahogany_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_LOG).strength(4f)));
    public static final Block MAHOGANY_WOOD = registerBlock("mahogany_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_WOOD).strength(4f)));
    public static final Block STRIPPED_MAHOGANY_LOG = registerBlock("stripped_mahogany_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_JUNGLE_LOG).strength(4f)));
    public static final Block STRIPPED_MAHOGANY_WOOD = registerBlock("stripped_mahogany_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_JUNGLE_WOOD).strength(4f)));

    public static final Block MAHOGANY_PLANKS = registerBlock("mahogany_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS).strength(4f)));
    public static final Block MAHOGANY_STAIRS = registerBlock("mahogany_stairs",
            new StairsBlock(ModBlocks.MAHOGANY_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.JUNGLE_STAIRS).strength(4f)));
    public static final Block MAHOGANY_SLAB = registerBlock("mahogany_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_SLAB).strength(4f)));

    public static final Block MAHOGANY_FENCE = registerBlock("mahogany_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS).strength(4f)));
    public static final Block MAHOGANY_FENCE_GATE = registerBlock("mahogany_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS).strength(4f), WoodType.JUNGLE));

    public static final Block MAHOGANY_PRESSURE_PLATE = registerBlock("mahogany_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.JUNGLE_PRESSURE_PLATE).strength(4f), BlockSetType.JUNGLE));
    public static final Block MAHOGANY_BUTTON = registerBlock("mahogany_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_BUTTON).strength(4f), BlockSetType.JUNGLE, 15, true));

    public static final Block MAHOGANY_DOOR = registerBlock("mahogany_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_DOOR).strength(4f).nonOpaque(), BlockSetType.JUNGLE));
    public static final Block MAHOGANY_TRAPDOOR = registerBlock("mahogany_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS).strength(4f).nonOpaque(), BlockSetType.JUNGLE));


    public static final Block MAHOGANY_LEAVES = registerBlock("mahogany_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_LEAVES).nonOpaque()));

    public static final Identifier MAHOGANY_SIGN_TEXTURE = new Identifier(BetterProgression.MOD_ID, "entity/signs/mahogany");
    public static final Identifier MAHOGANY_HANGING_SIGN_TEXTURE = new Identifier(BetterProgression.MOD_ID, "entity/signs/hanging/mahogany");
    public static final Identifier MAHOGANY_HANGING_GUI_SIGN_TEXTURE = new Identifier(BetterProgression.MOD_ID, "textures/gui/hanging_signs/mahogany");

    public static final Block STANDING_MAHOGANY_SIGN = Registry.register(Registries.BLOCK, new Identifier(BetterProgression.MOD_ID, "mahogany_standing_sign"),
            new TerraformSignBlock(MAHOGANY_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN)));
    public static final Block WALL_MAHOGANY_SIGN = Registry.register(Registries.BLOCK, new Identifier(BetterProgression.MOD_ID, "mahogany_wall_sign"),
            new TerraformWallSignBlock(MAHOGANY_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN).dropsLike(ModBlocks.STANDING_MAHOGANY_SIGN)));
    public static final Block HANGING_MAHOGANY_SIGN = Registry.register(Registries.BLOCK, new Identifier(BetterProgression.MOD_ID, "mahogany_hanging_sign"),
            new TerraformHangingSignBlock(MAHOGANY_HANGING_SIGN_TEXTURE, MAHOGANY_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN)));
    public static final Block WALL_HANGING_MAHOGANY_SIGN = Registry.register(Registries.BLOCK, new Identifier(BetterProgression.MOD_ID, "mahogany_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(MAHOGANY_HANGING_SIGN_TEXTURE, MAHOGANY_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN)
                    .dropsLike(ModBlocks.HANGING_MAHOGANY_SIGN)));

    public static final BlockFamily MAHOGANY_FAMILY = BlockFamilies.register(ModBlocks.MAHOGANY_PLANKS)
            .sign(ModBlocks.STANDING_MAHOGANY_SIGN, ModBlocks.WALL_MAHOGANY_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

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
