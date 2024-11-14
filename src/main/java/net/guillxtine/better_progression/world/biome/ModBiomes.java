package net.guillxtine.better_progression.world.biome;

import net.guillxtine.better_progression.BetterProgression;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public class ModBiomes {
    public static RegistryKey<Biome> UNDERGROUND_JUNGLE = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(BetterProgression.MOD_ID, "underground_jungle"));

    public static void bootstrap(Registerable<Biome> context) {
        context.register(UNDERGROUND_JUNGLE, undergroundJungle(context));
    }

}
