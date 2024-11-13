package net.guillxtine.better_progression.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.guillxtine.better_progression.BetterProgression;
import net.guillxtine.better_progression.item.custom.ModArmorItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{
    public static final Item CRYSTAL_SHARD = registerItem("crystal_shard", new Item(new FabricItemSettings()));
    public static final Item RAW_AQUALITE = registerItem("raw_aqualite", new Item(new FabricItemSettings()));
    public static final Item AQUALITE_INGOT = registerItem("aqualite_ingot", new Item(new FabricItemSettings()));

    public static final Item CRYSTAL_PICKAXE = registerItem("crystal_pickaxe",
            new PickaxeItem(ModToolMaterial.CRYSTAL, 0, -2.8f, new FabricItemSettings()));
    public static final Item CRYSTAL_AXE = registerItem("crystal_axe",
            new AxeItem(ModToolMaterial.CRYSTAL, 5, -3.1f, new FabricItemSettings()));
    public static final Item CRYSTAL_SHOVEL = registerItem("crystal_shovel",
            new ShovelItem(ModToolMaterial.CRYSTAL, 0, -3f, new FabricItemSettings()));
    public static final Item CRYSTAL_SWORD = registerItem("crystal_sword",
            new SwordItem(ModToolMaterial.CRYSTAL, 2, -2.4f, new FabricItemSettings()));
    public static final Item CRYSTAL_HOE = registerItem("crystal_hoe",
            new HoeItem(ModToolMaterial.CRYSTAL, -3,-1f, new FabricItemSettings()));

    public static final Item CRYSTAL_HELMET = registerItem("crystal_helmet",
            new ModArmorItem(ModArmorMaterials.CRYSTAL, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item CRYSTAL_CHESTPLATE = registerItem("crystal_chestplate",
            new ArmorItem(ModArmorMaterials.CRYSTAL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item CRYSTAL_LEGGINGS = registerItem("crystal_leggings",
            new ArmorItem(ModArmorMaterials.CRYSTAL, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item CRYSTAL_BOOTS = registerItem("crystal_boots",
            new ArmorItem(ModArmorMaterials.CRYSTAL, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item AQUALITE_PICKAXE = registerItem("aqualite_pickaxe",
            new PickaxeItem(ModToolMaterial.AQUALITE, 0, 0f, new FabricItemSettings()));
    public static final Item AQUALITE_AXE = registerItem("aqualite_axe",
            new AxeItem(ModToolMaterial.AQUALITE, 0, 0f, new FabricItemSettings()));
    public static final Item AQUALITE_SHOVEL = registerItem("aqualite_shovel",
            new ShovelItem(ModToolMaterial.AQUALITE, 0, 0f, new FabricItemSettings()));
    public static final Item AQUALITE_SWORD = registerItem("aqualite_sword",
            new SwordItem(ModToolMaterial.AQUALITE, 0, 0f, new FabricItemSettings()));
    public static final Item AQUALITE_HOE = registerItem("aqualite_hoe",
            new HoeItem(ModToolMaterial.AQUALITE, 0,0f, new FabricItemSettings()));

    public static final Item AQUALITE_HELMET = registerItem("aqualite_helmet",
            new ArmorItem(ModArmorMaterials.AQUALITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item AQUALITE_CHESTPLATE = registerItem("aqualite_chestplate",
            new ArmorItem(ModArmorMaterials.AQUALITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item AQUALITE_LEGGINGS = registerItem("aqualite_leggings",
            new ArmorItem(ModArmorMaterials.AQUALITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item AQUALITE_BOOTS = registerItem("aqualite_boots",
            new ArmorItem(ModArmorMaterials.AQUALITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item FLOWER_CROWN = registerItem("flower_crown",
            new ModArmorItem(ModArmorMaterials.FLOWER_CROWN, ArmorItem.Type.HELMET, new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(CRYSTAL_SHARD);
    }

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(BetterProgression.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        BetterProgression.LOGGER.info("Registering Mod Items for " + BetterProgression.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
