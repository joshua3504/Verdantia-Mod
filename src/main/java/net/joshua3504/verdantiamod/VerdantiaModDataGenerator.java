package net.joshua3504.verdantiamod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.joshua3504.verdantiamod.datagen.ModBlockTagProvider;
import net.joshua3504.verdantiamod.datagen.ModItemTagProvider;
import net.joshua3504.verdantiamod.datagen.ModLootTableProvider;
import net.joshua3504.verdantiamod.datagen.ModModelProvider;

public class VerdantiaModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
//		pack.addProvider(ModItemTagProvider::new);
//		pack.addProvider(ModLootTableProvider::new);
//		pack.addProvider(ModModelProvider::new);
	}
}
