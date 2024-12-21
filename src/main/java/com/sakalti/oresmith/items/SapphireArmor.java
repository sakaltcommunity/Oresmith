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

public class SapphireArmor {
    public static final ArmorMaterial SAPPHIRE_ARMOR_MATERIAL = new SapphireArmorMaterial();

    public static final ArmorItem SAPPHIRE_HELMET = new ArmorItem(SAPPHIRE_ARMOR_MATERIAL, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final ArmorItem SAPPHIRE_CHESTPLATE = new ArmorItem(SAPPHIRE_ARMOR_MATERIAL, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final ArmorItem SAPPHIRE_LEGGINGS = new ArmorItem(SAPPHIRE_ARMOR_MATERIAL, EquipmentSlot.LEGS, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final ArmorItem SAPPHIRE_BOOTS = new ArmorItem(SAPPHIRE_ARMOR_MATERIAL, EquipmentSlot.FEET, new FabricItemSettings().group(ItemGroup.COMBAT));

    public static void registerArmor() {
        Registry.register(Registry.ITEM, new Identifier(Oresmith.MOD_ID, "sapphire_helmet"), SAPPHIRE_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Oresmith.MOD_ID, "sapphire_chestplate"), SAPPHIRE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Oresmith.MOD_ID, "sapphire_leggings"), SAPPHIRE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Oresmith.MOD_ID, "sapphire_boots"), SAPPHIRE_BOOTS);
    }

    private static class SapphireArmorMaterial implements ArmorMaterial {
        private static final int[] BASE_DURABILITY = {330, 550, 490, 400};
        private static final int[] PROTECTION_VALUES = {4, 7, 6, 4};

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
            return 11;
        }

        @Override
        public SoundEvent getEquipSound() {
            return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
        }

        @Override
        public String getName() {
            return "sapphire";
        }

        @Override
        public float getToughness() {
            return 2.5F;
        }

        @Override
        public float getKnockbackResistance() {
            return 0.5F;
        }
    }
}
