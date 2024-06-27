package net.springer29.shadowrealm.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.springer29.shadowrealm.ShadowRealm;

public class ModItems {
    public static final Item SHALLITE_INGOT = registerItem("shallite_ingot", new Item(new FabricItemSettings()));
    public static final Item SHADOW_CRYSTAL = registerItem("shadow_crystal", new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ShadowRealm.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ShadowRealm.LOGGER.info("Registering Mod Items for" + ShadowRealm.MOD_ID);
    }
}
