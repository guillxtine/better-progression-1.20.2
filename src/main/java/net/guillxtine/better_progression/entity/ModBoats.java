package net.guillxtine.better_progression.entity;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.guillxtine.better_progression.BetterProgression;
import net.guillxtine.better_progression.block.ModBlocks;
import net.guillxtine.better_progression.item.ModItems;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModBoats
{
    public static final Identifier MAHOGANY_BOAT_ID = new Identifier(BetterProgression.MOD_ID, "mahogany_boat");
    public static final Identifier MAHOGANY_CHEST_BOAT_ID = new Identifier(BetterProgression.MOD_ID, "mahogany_chest_boat");

    public static final RegistryKey<TerraformBoatType> MAHOGANY_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MAHOGANY_BOAT_ID);

    public static void registerBoats()
    {
        TerraformBoatType mahoganyBoat = new TerraformBoatType.Builder()
                .item(ModItems.MAHOGANY_BOAT)
                .chestItem(ModItems.MAHOGANY_CHEST_BOAT)
                .planks(ModBlocks.MAHOGANY_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, MAHOGANY_BOAT_KEY, mahoganyBoat);
    }
}
