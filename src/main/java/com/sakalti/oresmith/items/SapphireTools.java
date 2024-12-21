package com.sakalti.oresmith;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SapphireTools {
    public static final ToolMaterial SAPPHIRE_TOOL_MATERIAL = new SapphireToolMaterial();

    public static final SwordItem SAPPHIRE_SWORD = new SwordItem(SAPPHIRE_TOOL_MATERIAL, 7, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final PickaxeItem SAPPHIRE_PICKAXE = new PickaxeItem(SAPPHIRE_TOOL_MATERIAL, 1, -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final AxeItem SAPPHIRE_AXE = new AxeItem(SAPPHIRE_TOOL_MATERIAL, 9, -1.0F, new FabricItemSettings().group(ItemGroup.TOOLS));

    public static void registerTools() {
        Registry.register(Registry.ITEM, new Identifier(Oresmith.MOD_ID, "sapphire_sword"), SAPPHIRE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Oresmith.MOD_ID, "sapphire_pickaxe"), SAPPHIRE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Oresmith.MOD_ID, "sapphire_axe"), SAPPHIRE_AXE);
    }

    private static class SapphireToolMaterial implements ToolMaterial {
        @Override
        public int getDurability() {
            return 1800;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 8.0F;
        }

        @Override
        public float getAttackDamage() {
            return 3.0F;
        }

        @Override
        public int getMiningLevel() {
            return 4;
        }

        @Override
        public int getEnchantability() {
            return 14;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(SapphireItem.SAPPHIRE_INGOT);
        }
    }
}
