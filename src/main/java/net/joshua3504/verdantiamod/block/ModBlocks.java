package net.joshua3504.verdantiamod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.joshua3504.verdantiamod.VerdantiaMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block PALM_WOOD = registerBlock("palm_wood",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BROWN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
            ));
    public static final Block REDWOOD_PLANKS = registerBlock("redwood_planks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
            ));
    public static final Block WILLOW_PLANKS = registerBlock("willow_planks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
            ));

    // PASTEL CONCRETES
    public static final Block PASTEL_RED_CONCRETE = registerBlock("pastel_red_concrete",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)
            ));
    public static final Block PASTEL_ORANGE_CONCRETE = registerBlock("pastel_orange_concrete",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)
            ));
    public static final Block PASTEL_YELLOW_CONCRETE = registerBlock("pastel_yellow_concrete",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)
            ));
    public static final Block PASTEL_LIME_CONCRETE = registerBlock("pastel_lime_concrete",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_LIME)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)
            ));
    public static final Block PASTEL_GREEN_CONCRETE = registerBlock("pastel_green_concrete",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)
            ));
    public static final Block PASTEL_CYAN_CONCRETE = registerBlock("pastel_cyan_concrete",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)
            ));
    public static final Block PASTEL_LIGHT_BLUE_CONCRETE = registerBlock("pastel_light_blue_concrete",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)
            ));
    public static final Block PASTEL_BLUE_CONCRETE = registerBlock("pastel_blue_concrete",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)
            ));
    public static final Block PASTEL_PURPLE_CONCRETE = registerBlock("pastel_purple_concrete",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)
            ));
    public static final Block PASTEL_MAGENTA_CONCRETE = registerBlock("pastel_magenta_concrete",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)
            ));
    public static final Block PASTEL_PINK_CONCRETE = registerBlock("pastel_pink_concrete",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_PINK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)
            ));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(VerdantiaMod.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(VerdantiaMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.PALM_WOOD);
            entries.add(ModBlocks.WILLOW_PLANKS);
            entries.add(ModBlocks.REDWOOD_PLANKS);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
            entries.add(ModBlocks.PASTEL_RED_CONCRETE);
            entries.add(ModBlocks.PASTEL_ORANGE_CONCRETE);
            entries.add(ModBlocks.PASTEL_YELLOW_CONCRETE);
            entries.add(ModBlocks.PASTEL_LIME_CONCRETE);
            entries.add(ModBlocks.PASTEL_GREEN_CONCRETE);
            entries.add(ModBlocks.PASTEL_CYAN_CONCRETE);
            entries.add(ModBlocks.PASTEL_LIGHT_BLUE_CONCRETE);
            entries.add(ModBlocks.PASTEL_BLUE_CONCRETE);
            entries.add(ModBlocks.PASTEL_PURPLE_CONCRETE);
            entries.add(ModBlocks.PASTEL_MAGENTA_CONCRETE);
            entries.add(ModBlocks.PASTEL_PINK_CONCRETE);
        });
    }
}
