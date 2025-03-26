package net.joshua3504.verdantiamod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.joshua3504.verdantiamod.VerdantiaMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
//    public static final Item MAPLE_PLANKS = registerItem( "maple_planks", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(VerdantiaMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
//            entries.add(MAPLE_PLANKS);
        });
    }
}
