package net.joshua3504.verdantiamod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.joshua3504.verdantiamod.VerdantiaMod;
import net.joshua3504.verdantiamod.block.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup VERDANTIA_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(VerdantiaMod.MOD_ID, "verdantia_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.REDWOOD_PLANKS))
                    .displayName(Text.translatable("itemgroup.verdantiamod.verdantia_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.REDWOOD_PLANKS);
                        entries.add(ModBlocks.PASTEL_YELLOW_CONCRETE);
                    }).build());

    public static void registerItemGroups() {

    }
}
