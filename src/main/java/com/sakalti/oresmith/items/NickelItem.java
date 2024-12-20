package com.sakalti.oresmith;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NickelItem {
    public static final Item NICKEL_ORE = new Item(new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item RAW_NICKEL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item NICKEL_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Oresmith.MOD_ID, "nickel_ore"), NICKEL_ORE);
        Registry.register(Registry.ITEM, new Identifier(Oresmith.MOD_ID, "raw_nickel"), RAW_NICKEL);
        Registry.register(Registry.ITEM, new Identifier(Oresmith.MOD_ID, "nickel_ingot"), NICKEL_INGOT);
    }
}
