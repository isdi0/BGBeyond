import loottweaker.LootTweaker;
import loottweaker.vanilla.loot.LootTable;
import loottweaker.vanilla.loot.LootPool;
import crafttweaker.data.IData;

//Loot tables
val desert = LootTweaker.getTable("minecraft:chests/desert_pyramid");
val desert_pool = desert.getPool("main");
val nether = LootTweaker.getTable("minecraft:chests/nether_bridge");
val nether_pool = nether.getPool("main");
val library = LootTweaker.getTable("minecraft:chests/stronghold_library");
val library_pool = library.getPool("main");
val mineshaft = LootTweaker.getTable("minecraft:chests/abandoned_mineshaft");
val mineshaft_pool = mineshaft.getPool("main");
val jungle = LootTweaker.getTable("minecraft:chests/jungle_temple");
val jungle_pool = jungle.getPool("main");
val dungeon = LootTweaker.getTable("minecraft:chests/simple_dungeon");
val dungeon_pool = dungeon.getPool("main");
val end = LootTweaker.getTable("minecraft:chests/end_city_treasure");
val end_pool = end.getPool("main");
val corridor = LootTweaker.getTable("minecraft:chests/stronghold_corridor");
val corridor_pool = corridor.getPool("main");
val crossing = LootTweaker.getTable("minecraft:chests/stronghold_crossing");
val crossing_pool = crossing.getPool("main");
val blacksmith = LootTweaker.getTable("minecraft:chests/village_blacksmith");
val blacksmith_pool = blacksmith.getPool("main");
val mansion = LootTweaker.getTable("minecraft:chests/woodland_mansion");
val mansion_pool = mansion.getPool("main");

//Remove enchanting
mods.jei.JEI.removeAndHide(<minecraft:enchanting_table>);
mods.jei.JEI.removeAndHide(<atum:disenchanting_scroll>);
mods.jei.JEI.removeAndHide(<stevescarts:cartmodule:82>);
recipes.remove(<rftoolsdim:efficiency_essence>);
recipes.addShaped("efficiencyEssence", <rftoolsdim:efficiency_essence>,
	[[null,<thermalfoundation:tool.pickaxe_platinum>,null],
	 [<minecraft:ender_eye>,<minecraft:nether_star>,<minecraft:ender_eye>],
	 [null,<minecraft:ender_eye>,null]]);
recipes.remove(<rftoolsdim:mediocre_efficiency_essence>, false);
recipes.addShaped("mediocreEfficiencyEssence", <rftoolsdim:mediocre_efficiency_essence>,
	[[null,<midnight:tenebrum_pickaxe>,null],
	 [<minecraft:ender_eye>,<minecraft:ghast_tear>,<minecraft:ender_eye>],
	 [null,<minecraft:ender_eye>,null]]);
	 
recipes.remove(<stevescarts:upgrade:2>, false);
recipes.addShaped("moduleKnowledge", <stevescarts:upgrade:2>,
	[[<minecraft:book>,<minecraft:bookshelf>,<minecraft:book>],
	 [<minecraft:bookshelf>,<minecraft:experience_bottle>,<minecraft:bookshelf>],
	 [<stevescarts:modulecomponents:22>,<stevescarts:modulecomponents:59>,<stevescarts:modulecomponents:22>]]);
	 
recipes.remove(<stevescarts:upgrade:4>, false);
recipes.addShaped("upgradeExperiencedAssembler", <stevescarts:upgrade:4>,
	[[null,<minecraft:experience_bottle>,null],
	 [null,<minecraft:redstone>,null],
	 [<minecraft:iron_ingot>,<stevescarts:modulecomponents:59>,<minecraft:iron_ingot>]]);
	 
recipes.remove(<stevescarts:upgrade:5>, false);
recipes.addShaped("upgradeNewEra", <stevescarts:upgrade:5>,
	[[<stevescarts:modulecomponents:47>,<minecraft:experience_bottle>,<stevescarts:modulecomponents:47>],
	 [<stevescarts:modulecomponents:47>,<stevescarts:modulecomponents:16>,<stevescarts:modulecomponents:47>],
	 [<stevescarts:modulecomponents:47>,<stevescarts:upgrade:4>,<stevescarts:modulecomponents:47>]]);

mods.jei.JEI.removeAndHide(<refinedstorage:upgrade:6>);
mods.jei.JEI.removeAndHide(<refinedstorage:upgrade:7>);
mods.jei.JEI.removeAndHide(<refinedstorage:upgrade:8>);
mods.jei.JEI.removeAndHide(<refinedstorage:upgrade:9>);

desert_pool.removeEntry("minecraft:book");
library_pool.removeEntry("minecraft:book#0");
jungle_pool.removeEntry("minecraft:book");
dungeon_pool.removeEntry("minecraft:book");
corridor_pool.removeEntry("minecraft:book");
crossing_pool.removeEntry("minecraft:book");
library_pool.removeEntry("minecraft:book");
mansion_pool.removeEntry("minecraft:book");
mineshaft_pool.removeEntry("minecraft:book");

mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 0 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 0 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 3 as short, id: 0 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 4 as short, id: 0 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 1 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 1 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 3 as short, id: 1 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 4 as short, id: 1 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 2 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 2 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 3 as short, id: 2 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 4 as short, id: 2 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 3 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 3 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 3 as short, id: 3 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 4 as short, id: 3 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 4 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 4 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 3 as short, id: 4 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 4 as short, id: 4 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 5 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 5 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 3 as short, id: 5 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 6 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 7 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 7 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 3 as short, id: 7 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 8 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 8 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 3 as short, id: 8 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 9 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 9 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 10 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 16 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 16 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 3 as short, id: 16 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 4 as short, id: 16 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 5 as short, id: 16 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 17 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 17 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 3 as short, id: 17 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 4 as short, id: 17 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 5 as short, id: 17 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 18 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 18 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 3 as short, id: 18 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 4 as short, id: 18 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 5 as short, id: 18 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 19 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 19 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 20 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 20 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 21 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 21 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 3 as short, id: 21 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 22 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 22 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 3 as short, id: 22 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 32 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 32 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 3 as short, id: 32 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 4 as short, id: 32 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 5 as short, id: 32 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 33 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 34 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 34 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 3 as short, id: 34 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 35 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 35 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 3 as short, id: 35 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 48 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 48 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 3 as short, id: 48 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 4 as short, id: 48 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 5 as short, id: 48 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 49 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 49 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 50 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 51 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 61 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 61 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 3 as short, id: 61 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 62 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 62 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 3 as short, id: 62 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 70 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 71 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 11 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 12 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 12 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 3 as short, id: 12 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 4 as short, id: 12 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 13 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 13 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 13 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 3 as short, id: 13 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 14 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 14 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 3 as short, id: 14 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 4 as short, id: 14 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 15 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 15 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 3 as short, id: 15 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 4 as short, id: 15 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 23 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 24 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 25 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 25 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 3 as short, id: 25 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 1 as short, id: 26 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 2 as short, id: 26 as short}]}));
mods.jei.JEI.removeAndHide(<minecraft:enchanted_book>.withTag({StoredEnchantments: [{lvl: 3 as short, id: 26 as short}]}));