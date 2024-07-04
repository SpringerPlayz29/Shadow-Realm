package net.springer29.shadowrealm.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.springer29.shadowrealm.ShadowRealm;
import net.springer29.shadowrealm.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup SHADOW_REALM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ShadowRealm.MOD_ID, "shadow_realm"),
            FabricItemGroup.builder().displayName(Text.translatable("item_group.shadowrealm.shadowrealm_tab"))
                    .icon(() -> new ItemStack(ModItems.SHALLITE_INGOT)).entries((displayContext, entries) -> {

                        // ShadowSoil
                        entries.add(ModBlocks.SHADOW_SOIL);

                        // Shadowstone
                        entries.add(ModBlocks.SHADOWSTONE);
                        entries.add(ModBlocks.COBBLED_SHADOWSTONE);
                        entries.add(ModBlocks.POLISHED_SHADOWSTONE);
                        entries.add(ModBlocks.SHADOWSTONE_BRICKS);
                        entries.add(ModBlocks.CHISELED_SHADOWSTONE_BRICKS);

                        // Silvium
                        entries.add(ModBlocks.SILVIUM_LOG);
                        entries.add(ModBlocks.SILVIUM_WOOD);
                        entries.add(ModBlocks.SILVIUM_PLANKS);
                        entries.add(ModItems.SILVIUM_STICK);

                        // Shallite
                        entries.add(ModItems.SHALLITE_INGOT);
                        entries.add(ModBlocks.SHALLITE_BLOCK);
                        entries.add(ModBlocks.SHALLITE_ORE);

                        // Shadow Crystal
                        entries.add(ModItems.SHADOW_CRYSTAL);
                        entries.add(ModBlocks.SHADOW_CRYSTAL_BLOCK);
                        entries.add(ModBlocks.SHADOW_CRYSTAL_ORE);

                        // Misc


                    }).build());

    public static void registerItemGroups() {
        ShadowRealm.LOGGER.info("Registering Item Groups For " + ShadowRealm.MOD_ID);
    }
}
