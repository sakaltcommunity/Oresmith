package com.sakalti.oresmith;

import net.fabricmc.api.ModInitializer;

public class Oresmith implements ModInitializer {
    public static final String MOD_ID = "oresmith";

    @Override
    public void onInitialize() {
        // アイテム、ブロック、ツール、防具などの登録
        NickelItem.registerItems();
        InvarItem.registerItems();
        InvarArmor.registerArmor();
        InvarTools.registerTools();

        // 鉱石生成設定の登録
        NickelOreFeature.register();
    }
}
