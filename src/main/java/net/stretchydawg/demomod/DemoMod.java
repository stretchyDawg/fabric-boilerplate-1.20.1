package net.stretchydawg.demomod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.stretchydawg.demomod.block.ModBlocks;
import net.stretchydawg.demomod.item.ModItems;
import net.stretchydawg.demomod.item.ModItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoMod implements ModInitializer {
    public static final String MOD_ID = "demomod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.COAL_BRIQUETTE, 200);


	}
}