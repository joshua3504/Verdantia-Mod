package net.joshua3504.verdantiamod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.joshua3504.verdantiamod.block.ModBlocks;
import net.joshua3504.verdantiamod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.RenderPhase;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // Block texture pools
        BlockStateModelGenerator.BlockTexturePool dirtPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DIRT);

        // Wood
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALM_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.REDWOOD_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WILLOW_PLANKS);

        // Bookshelves
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DARK_OAK_BOOKSHELF);

        // Pastel concretes
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PASTEL_RED_CONCRETE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PASTEL_ORANGE_CONCRETE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PASTEL_YELLOW_CONCRETE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PASTEL_LIME_CONCRETE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PASTEL_GREEN_CONCRETE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PASTEL_CYAN_CONCRETE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PASTEL_LIGHT_BLUE_CONCRETE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PASTEL_BLUE_CONCRETE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PASTEL_PURPLE_CONCRETE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PASTEL_MAGENTA_CONCRETE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PASTEL_PINK_CONCRETE);

        // Dirt variants
        dirtPool.slab(ModBlocks.DIRT_SLAB);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }

//    public static TextureMap generateBlockWithMultipleTextures(Block block) {
//        return new TextureMap()
//                .put();
//    }
}
