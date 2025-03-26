package net.joshua3504.verdantiamod;

import net.fabricmc.api.ModInitializer;

import net.joshua3504.verdantiamod.block.ModBlocks;
import net.joshua3504.verdantiamod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VerdantiaMod implements ModInitializer {
	public static final String MOD_ID = "verdantiamod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}