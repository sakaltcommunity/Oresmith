package com.sakalti.oresmith;

import net.fabricmc.api.ModInitializer;
import com.sakalti.oresmith.items.SapphireTools;
import com.sakalti.oresmith.items.InvarTools;
import com.sakalti.oresmith.items.SapphireItem;
import com.sakalti.oresmith.items.InvarItem;
import com.sakalti.oresmith.items.NickelItem;
import com.sakalti.oresmith.items.SapphireArmor;
import com.sakalti.oresmith.items.InvarArmor;
import com.sakalti.oresmith.worldgen.NickelOreFeature;


public class Oresmith implements ModInitializer {
    public static final String MOD_ID = "oresmith";

    @Override
    public void onInitialize() {
        // アイテム、ブロック、ツール、防具などの登録
        NickelItem.registerItems();
        InvarItem.registerItems();
        InvarArmor.registerArmor();
        InvarTools.registerTools();
        SapphireTools.registerTools();
        SapphireArmor.registerArmor();
        SapphireItem.registerItems();

        // 鉱石生成設定の登録
        NickelOreFeature.register();
    }
}
