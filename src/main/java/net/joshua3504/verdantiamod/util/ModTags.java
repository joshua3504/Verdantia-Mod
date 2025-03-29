package net.joshua3504.verdantiamod.util;

import net.joshua3504.verdantiamod.VerdantiaMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {


        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(VerdantiaMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> CONVERTABLE_TO_SAND = createTag("convertable_to_sand");
        public static final TagKey<Item> PLANKS = createTag("planks");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(VerdantiaMod.MOD_ID, name));
        }
    }
}
