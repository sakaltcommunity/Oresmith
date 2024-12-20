package com.sakalti.oresmith.worldgen;

import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import com.mojang.serialization.Codec;

public class NickelOreFeature {
    public static final ConfiguredFeature<?, ?> NICKEL_ORE = Feature.ORE.configure(
            new OreFeatureConfig(
                OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                OresmithBlocks.NICKEL_ORE.getDefaultState(),
                9
            )
    );

    public static void register() {
        Registry.register(Registry.CONFIGURED_FEATURE, new Identifier(Oresmith.MOD_ID, "nickel_ore"), NICKEL_ORE);
    }

    public static PlacedFeature getOrePlacement() {
        return new PlacedFeature(NICKEL_ORE, List.of(
            CountPlacementModifier.of(50), // 1チャンクあたり50個
            HeightRangePlacementModifier.trapezoid(YOffset.fixed(-35), YOffset.fixed(20)) // Y20からY-35で生成
        ));
    }
}
