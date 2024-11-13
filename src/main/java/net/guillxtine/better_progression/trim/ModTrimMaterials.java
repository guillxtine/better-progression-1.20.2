package net.guillxtine.better_progression.trim;

import net.guillxtine.better_progression.BetterProgression;
import net.guillxtine.better_progression.item.ModArmorMaterials;
import net.guillxtine.better_progression.item.ModItems;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class ModTrimMaterials
{
    public static final RegistryKey<ArmorTrimMaterial> CRYSTAL = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(BetterProgression.MOD_ID, "crystal"));

    public static void bootstrap(Registerable<ArmorTrimMaterial> registerable)
    {
        register(registerable, CRYSTAL, Registries.ITEM.getEntry(ModItems.CRYSTAL_SHARD), Style.EMPTY.withColor(TextColor.parse("#ca94cd")),
                1.0f, Map.of(ModArmorMaterials.CRYSTAL, "crystal_darker"));
    }

    private static void register(Registerable<ArmorTrimMaterial> registerable, RegistryKey<ArmorTrimMaterial> armorTrimKey,
                                 RegistryEntry<Item> item, Style style, float itemModelIndex, Map<ModArmorMaterials, String> overrideArmorMaterials)
    {
        ArmorTrimMaterial trimMaterial = new ArmorTrimMaterial(armorTrimKey.getValue().getPath(), item, itemModelIndex, Map.of(),
                Text.translatable(Util.createTranslationKey("trim_material", armorTrimKey.getValue()), overrideArmorMaterials).fillStyle(style));

        registerable.register(armorTrimKey, trimMaterial);
    }
}
