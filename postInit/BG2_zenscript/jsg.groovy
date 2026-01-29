//NO_RUN
#ikwid
import crafttweaker.data.IData
import crafttweaker.item.IIngredient
import loottweaker.LootTweaker
import loottweaker.vanilla.loot.LootTable
import loottweaker.vanilla.loot.LootPool

//Change loot tables
def end = LootTweaker.getTable('minecraft:chests/end_city_treasure').getPool('main')
def end_jsg = LootTweaker.getTable('jsg:end_city_treasure')
def nether = LootTweaker.getTable('minecraft:chests/nether_bridge').getPool('main')
def nether_jsg = LootTweaker.getTable('jsg:loot_nether')
def desert = LootTweaker.getTable('minecraft:chests/desert_pyramid').getPool('main')
def jungle = LootTweaker.getTable('minecraft:chests/jungle_temple').getPool('main')
def dungeon = LootTweaker.getTable('minecraft:chests/simple_dungeon').getPool('main')
def mineshaft = LootTweaker.getTable('minecraft:chests/abandoned_mineshaft').getPool('main')
def totem = LootTweaker.getTable('jsg:loot_obelisk')
def totem_pool = totem.getPool('other')
def tokra = LootTweaker.getTable('jsg:loot_ov').getPool('main')
def zpm = LootTweaker.getTable('jsg:loot_zpm')

end_jsg.removePool('main')
nether_jsg.removePool('main')
totem.removePool('zpm')
zpm.removePool('main')

tokra.removeEntry('jsg:staff')
tokra.removeEntry('jsg:zat')
tokra.removeEntry('jsg:schematic_milkyway')
tokra.removeEntry('jsg:schematic_pegasus')
tokra.removeEntry('jsg:schematic_universe')
tokra.removeEntry('jsg:schematic_goauld')
tokra.removeEntry('jsg:schematic_ori')
tokra.removeEntry('jsg:schematic_ancient')
tokra.removeEntry('jsg:titanium_ingot')
tokra.removeEntry('jsg:titanium_nugget')
tokra.removeEntry('jsg:titanium_dust')
tokra.removeEntry('jsg:trinium_ingot')
tokra.addItemEntry(item('jsg:naquadah_alloy_raw'), 15)
tokra.addItemEntry(item('jsg:naquadah_raw_dust'), 20)
tokra.addItemEntry(item('jsg:naquadah_raw_nugget'), 25)
tokra.addItemEntry(item('jsg:page_mysterious_universe'), 5)
tokra.addItemEntry(item('jsg:schematic_universe'), 5)

totem_pool.removeEntry('jsg:titanium_ingot')
totem_pool.addItemEntry(item('libvulpes:productingot', 7), 15)
totem_pool.addItemEntry(item('jsg:schematic_ancient'), 5)

end.addItemEntry(item('jsg:page_mysterious_pegasus'), 1)
end.addItemEntry(item('jsg:schematic_pegasus'), 1)
end.addItemEntry(item('jsg:schematic_ori'), 1)
end.addItemEntry(item('jsg:capacitor_block').withNbt(['energy': 17820000]), 5)

nether.addItemEntry(item('jsg:page_notebook', 1).withNbt(['address': [symbol5: 10, symbol4: 15, symbol7: 5, symbol6: 7, symbol1: 23, symbol0: 19, 'symbolType': 0, symbol3: 30, symbol2: 2], 'originId': 2, 'color': 10198126, 'display': ['Name': 'Terra'], 'symbolType': 0, 'hasUpgrade': 0 'as' 'byte']), 15)
nether.addItemEntry(item('jsg:page_mysterious_milkyway'), 10)
nether.addItemEntry(item('jsg:schematic_milkyway'), 10)
nether.addItemEntry(item('jsg:capacitor_block').withNbt(['energy': 17820000]), 5)

desert.addItemEntry(item('jsg:schematic_goauld'), 10)

jungle.addItemEntry(item('jsg:page_mysterious_universe'), 5)
jungle.addItemEntry(item('jsg:schematic_universe'), 3)

dungeon.addItemEntry(item('jsg:page_mysterious_universe'), 2)
dungeon.addItemEntry(item('jsg:schematic_universe'), 1)

mineshaft.addItemEntry(item('jsg:page_mysterious_universe'), 2)
mineshaft.addItemEntry(item('jsg:schematic_universe'), 1)

//Remove jsg machines and redundant items
mods.jei.JEI.removeAndHide(item('jsg:titanium_ingot'))
mods.jei.JEI.removeAndHide(item('jsg:plate_titanium'))
mods.jei.JEI.removeAndHide(item('jsg:titanium_ore'))
mods.jei.JEI.removeAndHide(item('jsg:titanium_impure'))
mods.jei.JEI.removeAndHide(item('jsg:titanium_purified'))
mods.jei.JEI.removeAndHide(item('jsg:titanium_raw'))
mods.jei.JEI.removeAndHide(item('jsg:titanium_dust'))
mods.jei.JEI.removeAndHide(item('jsg:titanium_nugget'))
mods.jei.JEI.removeAndHide(item('jsg:gear_titanium'))
mods.jei.JEI.removeAndHide(item('jsg:titanium_block'))
mods.jei.JEI.removeAndHide(item('jsg:naquadah_purified'))
mods.jei.JEI.removeAndHide(item('jsg:naquadah_raw'))
mods.jei.JEI.removeAndHide(item('jsg:trinium_purified'))
mods.jei.JEI.removeAndHide(item('jsg:trinium_raw'))
mods.jei.JEI.removeAndHide(item('jsg:zat'))
mods.jei.JEI.removeAndHide(item('jsg:staff'))
mods.jei.JEI.removeAndHide(item('jsg:zpm'))
mods.jei.JEI.removeAndHide(item('jsg:creative_zpm'))
mods.jei.JEI.removeAndHide(item('jsg:zpm_hub_block'))
mods.jei.JEI.removeAndHide(item('jsg:zpm_slot_block'))
mods.jei.JEI.removeAndHide(item('jsg:assembler_machine_block'))
mods.jei.JEI.removeAndHide(item('jsg:crystal_chamber_block'))
mods.jei.JEI.removeAndHide(item('jsg:pcb_fabricator_block'))
mods.jei.JEI.removeAndHide(item('jsg:ore_washing_machine_block'))
mods.jei.JEI.removeAndHide(item('jsg:platform_rings_block'))

//Change crafting
crafting.removeByOutput(item('jsg:page_mysterious_milkyway'), false)
crafting.removeByOutput(item('jsg:page_mysterious_pegasus'), false)
crafting.removeByOutput(item('jsg:page_mysterious_universe'), false)
crafting.removeByOutput(item('jsg:naquadah_raw_dust'), false)
crafting.removeByOutput(item('jsg:naquadah_dust'), false)
crafting.removeByOutput(item('jsg:trinium_dust'), false)
crafting.removeByOutput(item('jsg:plate_naquadah_raw'), false)
crafting.removeByOutput(item('jsg:plate_naquadah'), false)
crafting.removeByOutput(item('jsg:plate_trinium'), false)

mods.thermalexpansion.Pulverizer.removeRecipe(item('jsg:naquadah_raw'))
mods.thermalexpansion.Pulverizer.removeRecipe(item('jsg:titanium_raw'))
mods.thermalexpansion.Pulverizer.removeRecipe(item('jsg:trinium_raw'))
mods.thermalexpansion.Pulverizer.removeRecipe(item('jsg:trinium_ore'))
mods.thermalexpansion.Pulverizer.removeRecipe(item('jsg:naquadah_ore'))
mods.thermalexpansion.Pulverizer.removeRecipe(item('libvulpes:ore0', 8))
mods.thermalexpansion.Pulverizer.addRecipe(item('jsg:naquadah_raw_dust'), item('jsg:naquadah_alloy_raw'), 2000)
mods.thermalexpansion.Pulverizer.addRecipe(item('jsg:naquadah_dust'), item('jsg:naquadah_alloy'), 2000)
mods.thermalexpansion.Pulverizer.addRecipe(item('jsg:trinium_dust'), item('jsg:trinium_ingot'), 2000)
mods.thermalexpansion.Pulverizer.addRecipe(item('libvulpes:productdust', 7), item('libvulpes:ore0', 8), 2000)
mods.thermalexpansion.Pulverizer.addRecipe(item('jsg:trinium_dust'), item('jsg:trinium_impure'), 2000)
mods.thermalexpansion.Pulverizer.addRecipe(item('jsg:trinium_dust'), item('jsg:trinium_ore'), 2000)
mods.thermalexpansion.Pulverizer.addRecipe(item('jsg:naquadah_raw_dust'), item('jsg:naquadah_impure'), 2000)
mods.thermalexpansion.Pulverizer.addRecipe(item('jsg:naquadah_raw_dust'), item('jsg:naquadah_ore'), 2000)

crafting.removeByOutput(item('jsg:crystal_fragment'), false)
mods.thermalexpansion.Compactor.removeStorageRecipe(item('jsg:naquadah_raw'))
mods.thermalexpansion.Compactor.removeStorageRecipe(item('jsg:titanium_raw'))
mods.thermalexpansion.Compactor.removeStorageRecipe(item('jsg:trinium_raw'))

mods.thermalexpansion.Compactor.addPressRecipe(item('jsg:crystal_fragment'), item('minecraft:quartz') * 4, 5000)

mods.thermalexpansion.Compactor.removeGearRecipe(item('jsg:titanium_raw'))
mods.thermalexpansion.Compactor.removeGearRecipe(item('jsg:trinium_raw'))
mods.thermalexpansion.Compactor.addGearRecipe(item('jsg:gear_naquadah_raw'), item('jsg:naquadah_alloy_raw') * 4, 4000)

mods.thermalexpansion.Crucible.addRecipe(fluid('silicon_molten_black') * 144, item('refinedstorage:silicon'), 2500)
mods.thermalexpansion.Crucible.addRecipe(fluid('naquadah_molten_raw') * 144, item('jsg:naquadah_alloy_raw'), 5000)
mods.thermalexpansion.Crucible.addRecipe(fluid('naquadah_molten_raw') * 144, item('jsg:naquadah_raw_dust'), 5000)
mods.thermalexpansion.Crucible.addRecipe(fluid('naquadah_molten_alloy') * 144, item('jsg:naquadah_alloy'), 5000)
mods.thermalexpansion.Crucible.addRecipe(fluid('naquadah_molten_alloy') * 144, item('jsg:naquadah_dust'), 5000)
mods.thermalexpansion.Crucible.addRecipe(fluid('titanium_molten') * 144, item('libvulpes:productingot', 7), 5000)
mods.thermalexpansion.Crucible.addRecipe(fluid('titanium_molten') * 144, item('libvulpes:productdust', 7), 5000)
mods.thermalexpansion.Crucible.addRecipe(fluid('trinium_molten') * 144, item('jsg:trinium_ingot'), 5000)
mods.thermalexpansion.Crucible.addRecipe(fluid('trinium_molten') * 144, item('jsg:trinium_dust'), 5000)

mods.thermalexpansion.Transposer.addFillRecipe(item('jsg:naquadah_alloy') * 2, item('minecraft:iron_ingot'), fluid('naquadah_molten_refined') * 144, 4000)

mods.thermalexpansion.Imbuer.addRecipe(fluid('silicon_molten_red') * 36, item('minecraft:redstone'), fluid('silicon_molten_black') * 28, 3000)
mods.thermalexpansion.Imbuer.addRecipe(fluid('silicon_molten_blue') * 36, item('minecraft:dye', 4), fluid('silicon_molten_black') * 28, 3000)
mods.thermalexpansion.Imbuer.addRecipe(fluid('silicon_molten_ender') * 144, item('minecraft:ender_pearl'), fluid('silicon_molten_black') * 112, 3000)
mods.thermalexpansion.Imbuer.addRecipe(fluid('silicon_molten_pegasus') * 144, item('minecraft:diamond'), fluid('silicon_molten_black') * 112, 3000)
mods.thermalexpansion.Imbuer.addRecipe(fluid('silicon_molten_yellow') * 36, item('minecraft:glowstone_dust'), fluid('silicon_molten_black') * 28, 3000)

mods.thermalexpansion.Transposer.addFillRecipe(item('jsg:capacitor_block'), item('jsg:capacitor_block_empty'), fluid('silicon_molten_red') * 1152, 15000)

mods.thermalexpansion.Refinery.addRecipe(fluid('silicon_molten_white') * 36, null, fluid('silicon_molten_black') * 36, 1000)
mods.thermalexpansion.Refinery.addRecipe(fluid('naquadah_molten_refined') * 144, null, fluid('naquadah_molten_raw') * 144, 2000)

def naquadah = item('jsg:naquadah_alloy_raw')
def twoNaquadah = naquadah.definition.makeStack(0).withAmount(2)
def trinium = item('jsg:trinium_ingot')
def twoTrinium = trinium.definition.makeStack(0).withAmount(2)

furnace.remove(twoNaquadah)
furnace.remove(twoTrinium)
furnace.remove(item('jsg:naquadah_alloy_raw'), item('jsg:naquadah_purified'))
furnace.remove(item('jsg:trinium_ingot'), item('jsg:trinium_purified'))
mods.thermalexpansion.RedstoneFurnace.removeRecipe(item('jsg:trinium_raw'))
mods.thermalexpansion.RedstoneFurnace.removeRecipe(item('jsg:trinium_purified'))
mods.thermalexpansion.RedstoneFurnace.removeRecipe(item('jsg:naquadah_raw'))
mods.thermalexpansion.RedstoneFurnace.removeRecipe(item('jsg:naquadah_purified'))

mods.thermalexpansion.RedstoneFurnace.removeRecipe(item('libvulpes:productdust', 7))
mods.thermalexpansion.RedstoneFurnace.addRecipe(item('libvulpes:productingot', 7), item('libvulpes:productdust', 7), 2000)

furnace.addRecipe(item('libvulpes:productnugget', 7) * 4, item('libvulpes:ore0', 8))
mods.thermalexpansion.RedstoneFurnace.addRecipe(item('libvulpes:productnugget', 7) * 4, item('libvulpes:ore0', 8), 2000)
furnace.addRecipe(item('jsg:naquadah_raw_nugget') * 4, item('jsg:naquadah_ore'))
mods.thermalexpansion.RedstoneFurnace.addRecipe(item('jsg:naquadah_raw_nugget') * 4, item('jsg:naquadah_ore'), 2000)
furnace.addRecipe(item('jsg:trinium_nugget') * 4, item('jsg:trinium_ore'))
mods.thermalexpansion.RedstoneFurnace.addRecipe(item('jsg:trinium_nugget') * 4, item('jsg:trinium_ore'), 2000)
furnace.addRecipe(item('jsg:trinium_ingot') * 4, item('jsg:gear_trinium'))
mods.thermalexpansion.RedstoneFurnace.addRecipe(item('jsg:trinium_ingot') * 4, item('jsg:gear_trinium'), 2000)
furnace.addRecipe(item('jsg:naquadah_alloy_raw') * 4, item('jsg:gear_naquadah_raw'))
mods.thermalexpansion.RedstoneFurnace.addRecipe(item('jsg:naquadah_alloy_raw') * 4, item('jsg:gear_naquadah_raw'), 2000)

crafting.removeByOutput(item('jsg:gdo'), false)
crafting.addShaped('gdo', item('jsg:gdo'),
	[[item('minecraft:stone_button'),item('minecraft:glass_pane'),item('minecraft:stone_button')],
	 [item('minecraft:iron_ingot'),item('minecraft:redstone'),item('minecraft:iron_ingot')],
	 [item('minecraft:iron_ingot'),item('libvulpes:productgear', 7),item('minecraft:iron_ingot')]])

crafting.removeByOutput(item('advancedrocketry:vacuumlaser'), false)
crafting.addShaped('laser', item('advancedrocketry:vacuumlaser'),
	[[null,item('advancedrocketry:blocklens'),null],
	 [item('thermalfoundation:material', 324),item('jsg:crystal_red'),item('thermalfoundation:material', 324)],
	 [item('thermalfoundation:material', 324),item('libvulpes:structuremachine'),item('thermalfoundation:material', 324)]])
	 
def wrench = item('thermalfoundation:wrench', 0)
def reuseWrench = wrench.reuse()
crafting.removeByOutput(item('jsg:stargate_orlin_base_block'), false)
crafting.addShaped('orlinBase', item('jsg:stargate_orlin_base_block'),
	[[item('libvulpes:productgear', 7),item('minecraft:iron_block'),item('minecraft:iron_ingot')],
	 [item('libvulpes:productplate', 7),item('minecraft:redstone_block'),item('libvulpes:productplate', 7)],
	 [item('minecraft:iron_ingot'),reuseWrench,item('libvulpes:productgear', 7)]])
crafting.removeByOutput(item('jsg:stargate_orlin_member_block'), false)
crafting.addShaped('orlinRing', item('jsg:stargate_orlin_member_block'),
	[[item('minecraft:iron_ingot'),item('minecraft:iron_bars'),item('libvulpes:productplate', 7)],
	 [item('minecraft:iron_ingot'),item('minecraft:redstone_torch'),item('minecraft:iron_ingot')],
	 [item('libvulpes:productplate', 7),reuseWrench,item('minecraft:iron_ingot')]]); 