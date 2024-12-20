package com.sakalti.oresmith;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class InvarItem {
    public static final Item INVAR_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Oresmith.MOD_ID, "invar_ingot"), INVAR_INGOT);
    }
}
package com.sakalti.oresmith;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class InvarArmor {
    public static final ArmorMaterial INVAR_ARMOR_MATERIAL = new InvarArmorMaterial();

    public static final ArmorItem INVAR_HELMET = new ArmorItem(INVAR_ARMOR_MATERIAL, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final ArmorItem INVAR_CHESTPLATE = new ArmorItem(INVAR_ARMOR_MATERIAL, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final ArmorItem INVAR_LEGGINGS = new ArmorItem(INVAR_ARMOR_MATERIAL, EquipmentSlot.LEGS, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final ArmorItem INVAR_BOOTS = new ArmorItem(INVAR_ARMOR_MATERIAL, EquipmentSlot.FEET, new FabricItemSettings().group(ItemGroup.COMBAT));

    public static void registerArmor() {
        Registry.register(Registry.ITEM, new Identifier(Oresmith.MOD_ID, "invar_helmet"), INVAR_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Oresmith.MOD_ID, "invar_chestplate"), INVAR_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Oresmith.MOD_ID, "invar_leggings"), INVAR_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Oresmith.MOD_ID, "invar_boots"), INVAR_BOOTS);
    }

    private static class InvarArmorMaterial implements ArmorMaterial {
        private static final int[] BASE_DURABILITY = {280, 490, 405, 310};
        private static final int[] PROTECTION_VALUES = {3, 6, 5, 3};

        @Override
        public int getDurability(EquipmentSlot slot) {
            return BASE_DURABILITY[slot.getEntitySlotId()];
        }

        @Override
        public int getProtectionAmount(EquipmentSlot slot) {
            return PROTECTION_VALUES[slot.getEntitySlotId()];
        }

        @Override
        public int getEnchantability() {
            return 15;
        }

        @Override
        public SoundEvent getEquipSound() {
            return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
        }

        @Override
        public String getName() {
            return "invar";
        }

        @Override
        public float getToughness() {
            return 2.0F;
        }

        @Override
        public float getKnockbackResistance() {
            return 0.1F;
        }
    }
}
