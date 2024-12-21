package com.sakalti.oresmith.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class InvarTools {
    public static final ToolMaterial INVAR_TOOL_MATERIAL = new InvarToolMaterial();

    public static final SwordItem INVAR_SWORD = new SwordItem(INVAR_TOOL_MATERIAL, 6.3, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final PickaxeItem INVAR_PICKAXE = new PickaxeItem(INVAR_TOOL_MATERIAL, 4.3, -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final AxeItem INVAR_AXE = new AxeItem(INVAR_TOOL_MATERIAL, 9, -1.05F, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final ShovelItem INVAR_SHOVEL = new ShovelItem(INVAR_TOOL_MATERIAL, 4.8F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final HoeItem INVAR_HOE = new HoeItem(INVAR_TOOL_MATERIAL, 2, -1.0F, new FabricItemSettings().group(ItemGroup.TOOLS));

    public static void registerTools() {
        Registry.register(Registry.ITEM, new Identifier(Oresmith.MOD_ID, "invar_sword"), INVAR_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Oresmith.MOD_ID, "invar_pickaxe"), INVAR_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Oresmith.MOD_ID, "invar_axe"), INVAR_AXE);
        Registry.register(Registry.ITEM, new Identifier(Oresmith.MOD_ID, "invar_shovel"), INVAR_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Oresmith.MOD_ID, "invar_hoe"), INVAR_HOE);
    }

    private static class InvarToolMaterial implements ToolMaterial {
        @Override
        public int getDurability() {
            return 1640;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 7.0F;
        }

        @Override
        public float getAttackDamage() {
            return 2.0F;
        }

        @Override
        public int getMiningLevel() {
            return 2;
        }

        @Override
        public int getEnchantability() {
            return 14;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(NickelItem.NICKEL_INGOT);
        }
    }
}
