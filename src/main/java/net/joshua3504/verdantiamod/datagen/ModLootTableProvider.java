package net.joshua3504.verdantiamod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.joshua3504.verdantiamod.block.ModBlocks;
import net.joshua3504.verdantiamod.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.PALM_WOOD);
        addDrop(ModBlocks.REDWOOD_PLANKS);
        addDrop(ModBlocks.WILLOW_PLANKS);

        addDrop(ModBlocks.DARK_OAK_BOOKSHELF, silkTouchDrops(ModBlocks.DARK_OAK_BOOKSHELF, Items.BOOK, 3, 3));

        addDrop(ModBlocks.PASTEL_RED_CONCRETE);
        addDrop(ModBlocks.PASTEL_ORANGE_CONCRETE);
        addDrop(ModBlocks.PASTEL_YELLOW_CONCRETE);
        addDrop(ModBlocks.PASTEL_LIME_CONCRETE);
        addDrop(ModBlocks.PASTEL_GREEN_CONCRETE);
        addDrop(ModBlocks.PASTEL_CYAN_CONCRETE);
        addDrop(ModBlocks.PASTEL_LIGHT_BLUE_CONCRETE);
        addDrop(ModBlocks.PASTEL_BLUE_CONCRETE);
        addDrop(ModBlocks.PASTEL_PURPLE_CONCRETE);
        addDrop(ModBlocks.PASTEL_MAGENTA_CONCRETE);
        addDrop(ModBlocks.PASTEL_PINK_CONCRETE);

        addDrop(ModBlocks.DIRT_SLAB, slabDrops(ModBlocks.DIRT_SLAB));
    }

    public LootTable.Builder silkTouchDrops(Block drop, Item item, float minDrops, float maxDrops) {
//        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))));
    }
}
