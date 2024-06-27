package net.springer29.shadowrealm;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShadowRealm implements ModInitializer {
	public static final String MOD_ID = "shadowrealm";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Into The Shadow Realm");
	}
}