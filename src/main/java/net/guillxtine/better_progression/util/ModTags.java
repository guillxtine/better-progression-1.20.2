package net.guillxtine.better_progression.util;

import net.guillxtine.better_progression.BetterProgression;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags
{
    public static class Blocks
    {
        public static final TagKey<Block> MAHOGANY_LOGS = createTag("mahogany_logs");

        private static TagKey<Block> createTag(String name)
        {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(BetterProgression.MOD_ID, name));
        }

    }

    public static class Items
    {
        public static final TagKey<Item> MAHOGANY_LOGS = createTag("mahogany_logs");

        private static TagKey<Item> createTag(String name)
        {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(BetterProgression.MOD_ID, name));
        }
    }
}
