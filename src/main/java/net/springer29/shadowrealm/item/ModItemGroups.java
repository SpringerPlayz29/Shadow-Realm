package net.springer29.shadowrealm.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.springer29.shadowrealm.ShadowRealm;

public class ModItemGroups {
    public static final ItemGroup SHADOW_REALM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ShadowRealm.MOD_ID, "shadow_realm"),
            FabricItemGroup.builder().displayName(Text.translatable("item_group.shadowrealm.shadowrealm_tab"))
                    .icon(() -> new ItemStack(ModItems.SHALLITE_INGOT)).entries((displayContext, entries) -> {

                        entries.add(ModItems.SHALLITE_INGOT);
                        entries.add(ModItems.SHADOW_CRYSTAL);

                    }).build());

    public static void registerItemGroups() {
        ShadowRealm.LOGGER.info("Registering Item Groups For" + ShadowRealm.MOD_ID);
    }
}
