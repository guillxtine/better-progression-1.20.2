package net.guillxtine.better_progression;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.guillxtine.better_progression.block.ModBlocks;
import net.guillxtine.better_progression.entity.ModBoats;
import net.guillxtine.better_progression.item.ModItemGroups;
import net.guillxtine.better_progression.item.ModItems;
import net.guillxtine.better_progression.recipe.ModRecipes;
import net.guillxtine.better_progression.util.ModCustomTrades;
import net.guillxtine.better_progression.util.ModLootTableModifiers;
import net.guillxtine.better_progression.villager.ModVillagers;
import net.guillxtine.better_progression.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterProgression implements ModInitializer {
	public static final String MOD_ID = "better-progression";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItemGroups.registerItemGroups();

		ModBlocks.registerModBlocks();
		ModItems.registerModItems();

		ModCustomTrades.registerCustomTrades();
		ModLootTableModifiers.modifyLootTables();

		ModVillagers.registerVillagers();

		ModRecipes.registerRecipes();

		ModBoats.registerBoats();

		StrippableBlockRegistry.register(ModBlocks.MAHOGANY_LOG, ModBlocks.STRIPPED_MAHOGANY_LOG);
		StrippableBlockRegistry.register(ModBlocks.MAHOGANY_WOOD, ModBlocks.STRIPPED_MAHOGANY_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAHOGANY_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAHOGANY_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_MAHOGANY_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_MAHOGANY_WOOD, 5, 5);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAHOGANY_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAHOGANY_LEAVES, 30, 60);

		ModWorldGeneration.generateModWorldGen();
	}
}