#modloaded jsg
#ikwid

import crafttweaker.data.IData;
import crafttweaker.item.IIngredient;
import loottweaker.LootTweaker;
import loottweaker.vanilla.loot.LootTable;
import loottweaker.vanilla.loot.LootPool;

//Change loot tables
val end = LootTweaker.getTable("minecraft:chests/end_city_treasure").getPool("main");
val end_jsg = LootTweaker.getTable("jsg:end_city_treasure");
val nether = LootTweaker.getTable("minecraft:chests/nether_bridge").getPool("main");
val nether_jsg = LootTweaker.getTable("jsg:loot_nether");
val desert = LootTweaker.getTable("minecraft:chests/desert_pyramid").getPool("main");
val jungle = LootTweaker.getTable("minecraft:chests/jungle_temple").getPool("main");
val dungeon = LootTweaker.getTable("minecraft:chests/simple_dungeon").getPool("main");
val mineshaft = LootTweaker.getTable("minecraft:chests/abandoned_mineshaft").getPool("main");
val totem = LootTweaker.getTable("jsg:loot_obelisk");
val totem_pool = totem.getPool("other");
val tokra = LootTweaker.getTable("jsg:loot_ov").getPool("main");
val zpm = LootTweaker.getTable("jsg:loot_zpm");

end_jsg.removePool("main");
nether_jsg.removePool("main");
totem.removePool("zpm");
zpm.removePool("main");

tokra.removeEntry("jsg:staff");
tokra.removeEntry("jsg:zat");
tokra.removeEntry("jsg:schematic_milkyway");
tokra.removeEntry("jsg:schematic_pegasus");
tokra.removeEntry("jsg:schematic_universe");
tokra.removeEntry("jsg:schematic_goauld");
tokra.removeEntry("jsg:schematic_ori");
tokra.removeEntry("jsg:schematic_ancient");
tokra.removeEntry("jsg:titanium_ingot");
tokra.removeEntry("jsg:titanium_nugget");
tokra.removeEntry("jsg:titanium_dust");
tokra.removeEntry("jsg:trinium_ingot");
tokra.addItemEntry(<jsg:naquadah_alloy_raw>, 15);
tokra.addItemEntry(<jsg:naquadah_raw_dust>, 20);
tokra.addItemEntry(<jsg:naquadah_raw_nugget>, 25);
tokra.addItemEntry(<jsg:page_mysterious_universe>, 5);
tokra.addItemEntry(<jsg:schematic_universe>, 5);

totem_pool.removeEntry("jsg:titanium_ingot");
totem_pool.addItemEntry(<libvulpes:productingot:7>, 15);
totem_pool.addItemEntry(<jsg:schematic_ancient>, 5);

end.addItemEntry(<jsg:page_mysterious_pegasus>, 1);
end.addItemEntry(<jsg:schematic_pegasus>, 1);
end.addItemEntry(<jsg:schematic_ori>, 1);
end.addItemEntry(<jsg:capacitor_block>.withTag({energy: 17820000}), 5);

nether.addItemEntry(<jsg:page_notebook:1>.withTag({address: {symbol5: 10, symbol4: 15, symbol7: 5, symbol6: 7, symbol1: 23, symbol0: 19, symbolType: 0, symbol3: 30, symbol2: 2}, originId: 2, color: 10198126, display: {Name: "Terra"}, symbolType: 0, hasUpgrade: 0 as byte}), 15);
nether.addItemEntry(<jsg:page_mysterious_milkyway>, 10);
nether.addItemEntry(<jsg:schematic_milkyway>, 10);
nether.addItemEntry(<jsg:capacitor_block>.withTag({energy: 17820000}), 5);

desert.addItemEntry(<jsg:schematic_goauld>, 10);

jungle.addItemEntry(<jsg:page_mysterious_universe>, 5);
jungle.addItemEntry(<jsg:schematic_universe>, 3);

dungeon.addItemEntry(<jsg:page_mysterious_universe>, 2);
dungeon.addItemEntry(<jsg:schematic_universe>, 1);

mineshaft.addItemEntry(<jsg:page_mysterious_universe>, 2);
mineshaft.addItemEntry(<jsg:schematic_universe>, 1);