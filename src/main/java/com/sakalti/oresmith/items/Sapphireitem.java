package com.sakalti.oresmith.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SapphireItem {
    public static final Item SAPPHIRE_ORE = new Item(new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item RAW_SAPPHIRE = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item SAPPHIRE_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Oresmith.MOD_ID, "sapphire_ore"), SAPPHIRE_ORE);
        Registry.register(Registry.ITEM, new Identifier(Oresmith.MOD_ID, "raw_sapphire"), RAW_SAPPHIRE);
        Registry.register(Registry.ITEM, new Identifier(Oresmith.MOD_ID, "sapphire_ingot"), SAPPHIRE_INGOT);
    }
}
