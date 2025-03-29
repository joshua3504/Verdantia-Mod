package net.joshua3504.verdantiamod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.joshua3504.verdantiamod.VerdantiaMod;
import net.joshua3504.verdantiamod.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PASTEL_RED_CONCRETE)
                .add(ModBlocks.PASTEL_ORANGE_CONCRETE)
                .add(ModBlocks.PASTEL_YELLOW_CONCRETE)
                .add(ModBlocks.PASTEL_LIME_CONCRETE)
                .add(ModBlocks.PASTEL_GREEN_CONCRETE)
                .add(ModBlocks.PASTEL_CYAN_CONCRETE)
                .add(ModBlocks.PASTEL_LIGHT_BLUE_CONCRETE)
                .add(ModBlocks.PASTEL_BLUE_CONCRETE)
                .add(ModBlocks.PASTEL_PURPLE_CONCRETE)
                .add(ModBlocks.PASTEL_MAGENTA_CONCRETE)
                .add(ModBlocks.PASTEL_PINK_CONCRETE);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.PALM_WOOD)
                .add(ModBlocks.REDWOOD_PLANKS)
                .add(ModBlocks.WILLOW_PLANKS)
                .add(ModBlocks.DARK_OAK_BOOKSHELF);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.DIRT_SLAB);
    }

}
