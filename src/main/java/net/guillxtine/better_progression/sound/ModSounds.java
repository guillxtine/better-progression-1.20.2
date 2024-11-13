package net.guillxtine.better_progression.sound;

import net.guillxtine.better_progression.BetterProgression;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds
{
    private static SoundEvent registerSoundEvent(String name)
    {
        Identifier id = new Identifier(BetterProgression.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds()
    {
        BetterProgression.LOGGER.info("Registering Sounds for " + BetterProgression.MOD_ID);
    }
}
