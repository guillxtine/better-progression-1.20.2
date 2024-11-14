package net.guillxtine.better_progression.world;

import net.guillxtine.better_progression.BetterProgression;
import net.guillxtine.better_progression.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.JungleFoliagePlacer;
import net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.CherryTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;


public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> CRYSTAL_ORE_KEY = registerKey("crystal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AQUALITE_ORE_KEY = registerKey("aqualite_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> MAHOGANY_KEY = registerKey("mahogany");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldCrystalOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.CRYSTAL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_CRYSTAL_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldAqualiteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.AQUALITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_AQUALITE_ORE.getDefaultState()));

        register(context, CRYSTAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldCrystalOres, 8));
        register(context, AQUALITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldAqualiteOres, 12));

        register(context, MAHOGANY_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.MAHOGANY_LOG),
                new CherryTrunkPlacer(4, 2, 1, UniformIntProvider.create(1, 3), UniformIntProvider.create(2, 3),
                        UniformIntProvider.create(-2, -1), UniformIntProvider.create(0, 1)),

                BlockStateProvider.of(ModBlocks.MAHOGANY_LEAVES),
                new JungleFoliagePlacer(UniformIntProvider.create(1, 3), UniformIntProvider.create(0, 1), 2),

                new TwoLayersFeatureSize(1, 0, 2)).build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BetterProgression.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
