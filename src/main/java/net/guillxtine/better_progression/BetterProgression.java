package net.guillxtine.better_progression;

import net.fabricmc.api.ModInitializer;

import net.guillxtine.better_progression.block.ModBlocks;
import net.guillxtine.better_progression.item.ModItemGroups;
import net.guillxtine.better_progression.item.ModItems;
import net.guillxtine.better_progression.recipe.ModRecipes;
import net.guillxtine.better_progression.util.ModCustomTrades;
import net.guillxtine.better_progression.util.ModLootTableModifiers;
import net.guillxtine.better_progression.villager.ModVillagers;
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
	}
}