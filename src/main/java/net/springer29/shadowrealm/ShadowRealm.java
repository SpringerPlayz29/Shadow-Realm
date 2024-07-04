package net.springer29.shadowrealm;

import net.fabricmc.api.ModInitializer;

import net.springer29.shadowrealm.block.ModBlocks;
import net.springer29.shadowrealm.item.ModItemGroups;
import net.springer29.shadowrealm.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShadowRealm implements ModInitializer {
	public static final String MOD_ID = "shadowrealm";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Into The Shadow Realm");

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}
}