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

//Remove jsg machines and redundant items
mods.jei.JEI.removeAndHide(<jsg:titanium_ingot>);
mods.jei.JEI.removeAndHide(<jsg:plate_titanium>);
mods.jei.JEI.removeAndHide(<jsg:titanium_ore>);
mods.jei.JEI.removeAndHide(<jsg:titanium_impure>);
mods.jei.JEI.removeAndHide(<jsg:titanium_purified>);
mods.jei.JEI.removeAndHide(<jsg:titanium_raw>);
mods.jei.JEI.removeAndHide(<jsg:titanium_dust>);
mods.jei.JEI.removeAndHide(<jsg:titanium_nugget>);
mods.jei.JEI.removeAndHide(<jsg:gear_titanium>);
mods.jei.JEI.removeAndHide(<jsg:titanium_block>);
mods.jei.JEI.removeAndHide(<jsg:naquadah_purified>);
mods.jei.JEI.removeAndHide(<jsg:naquadah_raw>);
mods.jei.JEI.removeAndHide(<jsg:trinium_purified>);
mods.jei.JEI.removeAndHide(<jsg:trinium_raw>);
mods.jei.JEI.removeAndHide(<jsg:zat>);
mods.jei.JEI.removeAndHide(<jsg:staff>);
mods.jei.JEI.removeAndHide(<jsg:zpm>);
mods.jei.JEI.removeAndHide(<jsg:creative_zpm>);
mods.jei.JEI.removeAndHide(<jsg:zpm_hub_block>);
mods.jei.JEI.removeAndHide(<jsg:zpm_slot_block>);
mods.jei.JEI.removeAndHide(<jsg:assembler_machine_block>);
mods.jei.JEI.removeAndHide(<jsg:crystal_chamber_block>);
mods.jei.JEI.removeAndHide(<jsg:pcb_fabricator_block>);
mods.jei.JEI.removeAndHide(<jsg:ore_washing_machine_block>);
mods.jei.JEI.removeAndHide(<jsg:platform_rings_block>);

//Change recipes
recipes.remove(<jsg:page_mysterious_milkyway>, false);
recipes.remove(<jsg:page_mysterious_pegasus>, false);
recipes.remove(<jsg:page_mysterious_universe>, false);
recipes.remove(<jsg:naquadah_raw_dust>, false);
recipes.remove(<jsg:naquadah_dust>, false);
recipes.remove(<jsg:trinium_dust>, false);
recipes.remove(<jsg:plate_naquadah_raw>, false);
recipes.remove(<jsg:plate_naquadah>, false);
recipes.remove(<jsg:plate_trinium>, false);
recipes.remove(<jsg:crystal_fragment>, false);

mods.thermalexpansion.Crucible.addRecipe(<liquid:silicon_molten_black> * 144, <appliedenergistics2:material:5>, 2500);
mods.thermalexpansion.Crucible.addRecipe(<liquid:naquadah_molten_raw> * 144, <jsg:naquadah_alloy_raw>, 5000);
mods.thermalexpansion.Crucible.addRecipe(<liquid:naquadah_molten_raw> * 144, <jsg:naquadah_raw_dust>, 5000);
mods.thermalexpansion.Crucible.addRecipe(<liquid:naquadah_molten_alloy> * 144, <jsg:naquadah_alloy>, 5000);
mods.thermalexpansion.Crucible.addRecipe(<liquid:naquadah_molten_alloy> * 144, <jsg:naquadah_dust>, 5000);
mods.thermalexpansion.Crucible.addRecipe(<liquid:titanium_molten> * 144, <libvulpes:productingot:7>, 5000);
mods.thermalexpansion.Crucible.addRecipe(<liquid:titanium_molten> * 144, <libvulpes:productdust:7>, 5000);
mods.thermalexpansion.Crucible.addRecipe(<liquid:trinium_molten> * 144, <jsg:trinium_ingot>, 5000);
mods.thermalexpansion.Crucible.addRecipe(<liquid:trinium_molten> * 144, <jsg:trinium_dust>, 5000);

mods.thermalexpansion.Transposer.addFillRecipe(<jsg:naquadah_alloy> * 2, <minecraft:iron_ingot>, <liquid:naquadah_molten_refined> * 144, 4000);

mods.thermalexpansion.Imbuer.addRecipe(<liquid:silicon_molten_red> * 36, <minecraft:redstone>, <liquid:silicon_molten_black> * 28, 3000);
mods.thermalexpansion.Imbuer.addRecipe(<liquid:silicon_molten_blue> * 36, <minecraft:dye:4>, <liquid:silicon_molten_black> * 28, 3000);
mods.thermalexpansion.Imbuer.addRecipe(<liquid:silicon_molten_ender> * 144, <minecraft:ender_pearl>, <liquid:silicon_molten_black> * 112, 3000);
mods.thermalexpansion.Imbuer.addRecipe(<liquid:silicon_molten_pegasus> * 144, <minecraft:diamond>, <liquid:silicon_molten_black> * 112, 3000);
mods.thermalexpansion.Imbuer.addRecipe(<liquid:silicon_molten_yellow> * 36, <minecraft:glowstone_dust>, <liquid:silicon_molten_black> * 28, 3000);

mods.thermalexpansion.Transposer.addFillRecipe(<jsg:capacitor_block>, <jsg:capacitor_block_empty>, <liquid:silicon_molten_red> * 1152, 15000);

mods.thermalexpansion.Refinery.addRecipe(<liquid:silicon_molten_white> * 36, null, <liquid:silicon_molten_black> * 36, 1000);
mods.thermalexpansion.Refinery.addRecipe(<liquid:naquadah_molten_refined> * 144, null, <liquid:naquadah_molten_raw> * 144, 2000);

val naquadah = <jsg:naquadah_alloy_raw>;
val twoNaquadah = naquadah.definition.makeStack(0).withAmount(2);
val trinium = <jsg:trinium_ingot>;
val twoTrinium = trinium.definition.makeStack(0).withAmount(2);

furnace.remove(twoNaquadah);
furnace.remove(twoTrinium);
furnace.remove(<jsg:naquadah_alloy_raw>, <jsg:naquadah_purified>);
furnace.remove(<jsg:trinium_ingot>, <jsg:trinium_purified>);
mods.thermalexpansion.RedstoneFurnace.removeRecipe(<jsg:trinium_raw>);
mods.thermalexpansion.RedstoneFurnace.removeRecipe(<jsg:trinium_purified>);
mods.thermalexpansion.RedstoneFurnace.removeRecipe(<jsg:naquadah_raw>);
mods.thermalexpansion.RedstoneFurnace.removeRecipe(<jsg:naquadah_purified>);

mods.thermalexpansion.RedstoneFurnace.removeRecipe(<libvulpes:productdust:7>);
mods.thermalexpansion.RedstoneFurnace.addRecipe(<libvulpes:productingot:7>, <libvulpes:productdust:7>, 2000);

furnace.addRecipe(<libvulpes:productnugget:7> * 4, <libvulpes:ore0:8>);
mods.thermalexpansion.RedstoneFurnace.addRecipe(<libvulpes:productnugget:7> * 4, <libvulpes:ore0:8>, 2000);
furnace.addRecipe(<jsg:naquadah_raw_nugget> * 4, <jsg:naquadah_ore>);
mods.thermalexpansion.RedstoneFurnace.addRecipe(<jsg:naquadah_raw_nugget> * 4, <jsg:naquadah_ore>, 2000);
furnace.addRecipe(<jsg:trinium_nugget> * 4, <jsg:trinium_ore>);
mods.thermalexpansion.RedstoneFurnace.addRecipe(<jsg:trinium_nugget> * 4, <jsg:trinium_ore>, 2000);
furnace.addRecipe(<jsg:trinium_ingot> * 4, <jsg:gear_trinium>);
mods.thermalexpansion.RedstoneFurnace.addRecipe(<jsg:trinium_ingot> * 4, <jsg:gear_trinium>, 2000);
furnace.addRecipe(<jsg:naquadah_alloy_raw> * 4, <jsg:gear_naquadah_raw>);
mods.thermalexpansion.RedstoneFurnace.addRecipe(<jsg:naquadah_alloy_raw> * 4, <jsg:gear_naquadah_raw>, 2000);

recipes.remove(<jsg:gdo>, false);
recipes.addShaped("gdo", <jsg:gdo>,
	[[<minecraft:stone_button>,<minecraft:glass_pane>,<minecraft:stone_button>],
	 [<minecraft:iron_ingot>,<minecraft:redstone>,<minecraft:iron_ingot>],
	 [<minecraft:iron_ingot>,<libvulpes:productgear:7>,<minecraft:iron_ingot>]]);

recipes.remove(<advancedrocketry:vacuumlaser>, false);
recipes.addShaped("laser", <advancedrocketry:vacuumlaser>,
	[[null,<advancedrocketry:blocklens>,null],
	 [<thermalfoundation:material:324>,<jsg:crystal_red>,<thermalfoundation:material:324>],
	 [<thermalfoundation:material:324>,<libvulpes:structuremachine>,<thermalfoundation:material:324>]]);
	 
val wrench = <thermalfoundation:wrench:0>;
val reuseWrench = wrench.reuse();
recipes.remove(<jsg:stargate_orlin_base_block>, false);
recipes.addShaped("orlinBase", <jsg:stargate_orlin_base_block>,
	[[<libvulpes:productgear:7>,<minecraft:iron_block>,<minecraft:iron_ingot>],
	 [<libvulpes:productplate:7>,<minecraft:redstone_block>,<libvulpes:productplate:7>],
	 [<minecraft:iron_ingot>,reuseWrench,<libvulpes:productgear:7>]]);
recipes.remove(<jsg:stargate_orlin_member_block>, false);
recipes.addShaped("orlinRing", <jsg:stargate_orlin_member_block>,
	[[<minecraft:iron_ingot>,<minecraft:iron_bars>,<libvulpes:productplate:7>],
	 [<minecraft:iron_ingot>,<minecraft:redstone_torch>,<minecraft:iron_ingot>],
	 [<libvulpes:productplate:7>,reuseWrench,<minecraft:iron_ingot>]]); 