package net.guillxtine.better_progression.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.guillxtine.better_progression.item.ModItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider
{
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture)
    {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
    {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.CRYSTAL_HELMET, ModItems.CRYSTAL_CHESTPLATE, ModItems.CRYSTAL_LEGGINGS, ModItems.CRYSTAL_BOOTS)
                .add(ModItems.AQUALITE_HELMET, ModItems.AQUALITE_CHESTPLATE, ModItems.AQUALITE_LEGGINGS, ModItems.AQUALITE_BOOTS);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.CRYSTAL_SWORD)
                .add(ModItems.AQUALITE_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.CRYSTAL_PICKAXE)
                .add(ModItems.AQUALITE_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.CRYSTAL_AXE)
                .add(ModItems.AQUALITE_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.CRYSTAL_SHOVEL)
                .add(ModItems.AQUALITE_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.CRYSTAL_HOE)
                .add(ModItems.AQUALITE_HOE);

        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                .add(ModItems.CRYSTAL_SHARD);
    }
}
