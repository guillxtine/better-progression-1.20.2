package net.guillxtine.better_progression.item;

import net.guillxtine.better_progression.BetterProgression;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial
{
    CRYSTAL("crystal", 53, new int[] { 4, 6, 5, 4 }, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 1f, 0f,
            () -> Ingredient.ofItems(ModItems.CRYSTAL_SHARD)),
    AQUALITE("aqualite", 40, new int[] { 3, 5, 4, 3 }, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0f, 0f,
            () -> Ingredient.ofItems(ModItems.AQUALITE_INGOT)),
    FLOWER_CROWN("flower_crown", 200, new int[] { 1, 1, 1, 1 }, 19,
            SoundEvents.BLOCK_CHERRY_LEAVES_BREAK, 0f, 0f, null);

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 11, 16, 15, 13 };

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound,
                      float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient)
    {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability(ArmorItem.Type type)
    {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type)
    {
        return protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability()
    {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound()
    {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return this.repairIngredient.get();
    }

    @Override
    public String getName()
    {
        return BetterProgression.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness()
    {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance()
    {
        return this.knockbackResistance;
    }
}
