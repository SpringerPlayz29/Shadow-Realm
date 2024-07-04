package net.springer29.shadowrealm.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.springer29.shadowrealm.ShadowRealm;

public class ModBlocks {

    // Material Blocks
    public static final Block SHALLITE_BLOCK = registerBlock("shallite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).instrument(Instrument.IRON_XYLOPHONE).mapColor(MapColor.PURPLE)));
    public static final Block SHADOW_CRYSTAL_BLOCK = registerBlock("shadow_crystal_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).instrument(Instrument.BELL).mapColor(MapColor.MAGENTA)));

    // Soil
    public static final Block SHADOW_SOIL = registerBlock("shadow_soil",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT).strength(3f, 3f)));

    // Shadowstone Blocks
    public static final Block SHADOWSTONE = registerBlock("shadowstone",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE)));
    public static final Block SHADOWSTONE_BRICKS = registerBlock("shadowstone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block POLISHED_SHADOWSTONE = registerBlock("polished_shadowstone",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE)));
    public static final Block COBBLED_SHADOWSTONE = registerBlock("cobbled_shadowstone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLED_DEEPSLATE)));
    public static final Block CHISELED_SHADOWSTONE_BRICKS = registerBlock("chiseled_shadowstone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_DEEPSLATE)));

    // Silvium Blocks
    public static final Block SILVIUM_LOG = registerBlock("silvium_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_STEM)));
    public static final Block SILVIUM_WOOD = registerBlock("silvium_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_HYPHAE)));
    public static final Block SILVIUM_PLANKS = registerBlock("silvium_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS)));


    // Ores
    public static final Block SHALLITE_ORE = registerBlock("shallite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(ModBlocks.SHADOWSTONE).strength(4f, 5f),
                    UniformIntProvider.create(6, 12)));
    public static final Block SHADOW_CRYSTAL_ORE = registerBlock("shadow_crystal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(ModBlocks.SHADOWSTONE).strength(3f, 4f),
                    UniformIntProvider.create(7, 11)));





    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ShadowRealm.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ShadowRealm.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        ShadowRealm.LOGGER.info("Registering ModBlocks for " + ShadowRealm.MOD_ID);
    }
}
