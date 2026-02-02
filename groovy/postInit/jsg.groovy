import mods.jei.ingredient
import mods.thermalexpansion.Pulverizer
import mods.thermalexpansion.Compactor
import mods.thermalexpansion.Crucible
import mods.thermalexpansion.Imbuer
import mods.thermalexpansion.Refinery
import mods.thermalexpansion.Furnace

//Remove jsg machines and redundant items
mods.jei.ingredient.removeAndHide(item('jsg:titanium_ingot'))
mods.jei.ingredient.removeAndHide(item('jsg:plate_titanium'))
mods.jei.ingredient.removeAndHide(item('jsg:titanium_ore'))
mods.jei.ingredient.removeAndHide(item('jsg:titanium_impure'))
mods.jei.ingredient.removeAndHide(item('jsg:titanium_purified'))
mods.jei.ingredient.removeAndHide(item('jsg:titanium_raw'))
mods.jei.ingredient.removeAndHide(item('jsg:titanium_dust'))
mods.jei.ingredient.removeAndHide(item('jsg:titanium_nugget'))
mods.jei.ingredient.removeAndHide(item('jsg:gear_titanium'))
mods.jei.ingredient.removeAndHide(item('jsg:titanium_block'))
mods.jei.ingredient.removeAndHide(item('jsg:naquadah_purified'))
mods.jei.ingredient.removeAndHide(item('jsg:naquadah_raw'))
mods.jei.ingredient.removeAndHide(item('jsg:trinium_purified'))
mods.jei.ingredient.removeAndHide(item('jsg:trinium_raw'))
mods.jei.ingredient.removeAndHide(item('jsg:zat'))
mods.jei.ingredient.removeAndHide(item('jsg:staff'))
mods.jei.ingredient.removeAndHide(item('jsg:zpm'))
mods.jei.ingredient.removeAndHide(item('jsg:creative_zpm'))
mods.jei.ingredient.removeAndHide(item('jsg:zpm_hub_block'))
mods.jei.ingredient.removeAndHide(item('jsg:zpm_slot_block'))
mods.jei.ingredient.removeAndHide(item('jsg:assembler_machine_block'))
mods.jei.ingredient.removeAndHide(item('jsg:crystal_chamber_block'))
mods.jei.ingredient.removeAndHide(item('jsg:pcb_fabricator_block'))
mods.jei.ingredient.removeAndHide(item('jsg:ore_washing_machine_block'))
mods.jei.ingredient.removeAndHide(item('jsg:platform_rings_block'))

// Change JSG pulverizer recipes
// remove
mods.thermalexpansion.Pulverizer.removeByInput(item('jsg:naquadah_raw'))
mods.thermalexpansion.Pulverizer.removeByInput(item('jsg:titanium_raw'))
mods.thermalexpansion.Pulverizer.removeByInput(item('jsg:trinium_raw'))
mods.thermalexpansion.Pulverizer.removeByInput(item('jsg:trinium_ore'))
mods.thermalexpansion.Pulverizer.removeByInput(item('jsg:naquadah_ore'))
mods.thermalexpansion.Pulverizer.removeByInput(item('libvulpes:ore0:8'))
// add
mods.thermalexpansion.Pulverizer.add(2000, item('jsg:naquadah_alloy_raw'), item('jsg:naquadah_raw_dust'), null, 0)
mods.thermalexpansion.Pulverizer.add(2000, item('jsg:naquadah_alloy'), item('jsg:naquadah_dust'), null, 0)
mods.thermalexpansion.Pulverizer.add(2000, item('jsg:trinium_ingot'), item('jsg:trinium_dust'), null, 0)
mods.thermalexpansion.Pulverizer.add(2000, item('libvulpes:ore0:8'), item('libvulpes:productdust:7'), null, 0)
mods.thermalexpansion.Pulverizer.add(2000, item('jsg:trinium_impure'), item('jsg:trinium_dust'), null, 0)
mods.thermalexpansion.Pulverizer.add(2000, item('jsg:trinium_ore'), item('jsg:trinium_dust'), null, 0)
mods.thermalexpansion.Pulverizer.add(2000, item('jsg:naquadah_impure'), item('jsg:naquadah_raw_dust'), null, 0)
mods.thermalexpansion.Pulverizer.add(2000, item('jsg:naquadah_ore'), item('jsg:naquadah_raw_dust'), null, 0)


// Change JSG compactor recipes
// remove
mods.thermalexpansion.Compactor.removeByInput(item('jsg:naquadah_raw'))
mods.thermalexpansion.Compactor.removeByInput(item('jsg:titanium_raw'))
mods.thermalexpansion.Compactor.removeByInput(item('jsg:trinium_raw'))
// add
mods.thermalexpansion.Compactor.add(5000, compactorMode('plate'), item('minecraft:quartz') * 4, item('jsg:crystal_fragment'))
mods.thermalexpansion.Compactor.add(4000, compactorMode('gear'), item('jsg:naquadah_alloy_raw') * 4, item('jsg:gear_naquadah_raw'))

// Remove crafting recipes 
crafting.removeByOutput(item('jsg:page_mysterious_milkyway'))
crafting.removeByOutput(item('jsg:page_mysterious_pegasus'))
crafting.removeByOutput(item('jsg:page_mysterious_universe'))
crafting.removeByOutput(item('jsg:naquadah_raw_dust'))
crafting.removeByOutput(item('jsg:naquadah_dust'))
crafting.removeByOutput(item('jsg:trinium_dust'))
crafting.removeByOutput(item('jsg:plate_naquadah_raw'))
crafting.removeByOutput(item('jsg:plate_naquadah'))
crafting.removeByOutput(item('jsg:plate_trinium'))
crafting.removeByOutput(item('jsg:crystal_fragment'))

// Add JSG magma crucible recipes
mods.thermalexpansion.Crucible.add(2500, item('appliedenergistics2:material', 5), fluid('silicon_molten_black') * 144)
mods.thermalexpansion.Crucible.add(5000, item('jsg:naquadah_alloy_raw'), fluid('naquadah_molten_raw') * 144)
mods.thermalexpansion.Crucible.add(5000, item('jsg:naquadah_raw_dust'), fluid('naquadah_molten_raw') * 144)
mods.thermalexpansion.Crucible.add(5000, item('jsg:naquadah_alloy'), fluid('naquadah_molten_alloy') * 144)
mods.thermalexpansion.Crucible.add(5000, item('jsg:naquadah_dust'), fluid('naquadah_molten_alloy') * 144)
mods.thermalexpansion.Crucible.add(5000, item('libvulpes:productingot', 7), fluid('titanium_molten') * 144)
mods.thermalexpansion.Crucible.add(5000, item('libvulpes:productdust', 7), fluid('titanium_molten') * 144)
mods.thermalexpansion.Crucible.add(5000, item('jsg:trinium_ingot'), fluid('trinium_molten') * 144)
mods.thermalexpansion.Crucible.add(5000, item('jsg:trinium_dust'), fluid('trinium_molten') * 144)

// Add JSG fluid transposer fill recipes
mods.thermalexpansion.transposerfill.add(4000, item('minecraft:iron_ingot'), fluid('naquadah_molten_refined') * 144, item('jsg:naquadah_alloy') * 2, 100)
mods.thermalexpansion.transposerfill.add(15000, item('jsg:capacitor_block_empty'), fluid('silicon_molten_red') * 1152, item('jsg:capacitor_block'), 100)

// Add JSG alchemical imbuer recipes
mods.thermalexpansion.Imbuer.add(3000, item('minecraft:redstone'), fluid('silicon_molten_black') * 28, fluid('silicon_molten_red') * 36)
mods.thermalexpansion.Imbuer.add(3000, item('minecraft:dye', 4), fluid('silicon_molten_black') * 28, fluid('silicon_molten_blue') * 36)
mods.thermalexpansion.Imbuer.add(3000, item('minecraft:ender_pearl'), fluid('silicon_molten_black') * 112, fluid('silicon_molten_ender') * 144)
mods.thermalexpansion.Imbuer.add(3000, item('minecraft:diamond'), fluid('silicon_molten_black') * 112, fluid('silicon_molten_pegasus') * 144)
mods.thermalexpansion.Imbuer.add(3000, item('minecraft:glowstone_dust'), fluid('silicon_molten_black') * 28, fluid('silicon_molten_yellow') * 36)

// Add JSG fractionating still recipes
mods.thermalexpansion.Refinery.add(1000, fluid('silicon_molten_black') * 36, fluid('silicon_molten_white') * 36, null, 100)
mods.thermalexpansion.Refinery.add(2000, fluid('naquadah_molten_raw') * 144, fluid('naquadah_molten_refined') * 144, null, 100)

// Naquadah and trinium
// define variables
def naquadah = item('jsg:naquadah_alloy_raw')
def twoNaquadah = naquadah * 2
def trinium = item('jsg:trinium_ingot')
def twoTrinium = trinium * 2

// remove furnace recipes
furnace.removeByOutput(twoNaquadah)
furnace.removeByOutput(twoTrinium)
furnace.removeByInput(item('jsg:naquadah_purified'))
furnace.removeByInput(item('jsg:trinium_purified'))
mods.thermalexpansion.Furnace.removeByInput(item('jsg:trinium_raw'))
mods.thermalexpansion.Furnace.removeByInput(item('jsg:trinium_purified'))
mods.thermalexpansion.Furnace.removeByInput(item('jsg:naquadah_raw'))
mods.thermalexpansion.Furnace.removeByInput(item('jsg:naquadah_purified'))
mods.thermalexpansion.Furnace.removeByInput(item('libvulpes:productdust', 7))

// add furnace recipes
mods.thermalexpansion.Furnace.add(2000, item('libvulpes:productdust', 7), item('libvulpes:productingot', 7))

// Titanium
// add furnace recipes
furnace.add(item('libvulpes:ore0', 8), item('libvulpes:productnugget', 7) * 4)
mods.thermalexpansion.Furnace.add(2000, item('libvulpes:ore0', 8), item('libvulpes:productnugget', 7) * 4)
furnace.add(item('jsg:naquadah_ore'), item('jsg:naquadah_raw_nugget') * 4)
mods.thermalexpansion.Furnace.add(2000, item('jsg:naquadah_ore'), item('jsg:naquadah_raw_nugget') * 4)
furnace.add(item('jsg:trinium_ore'), item('jsg:trinium_nugget') * 4)
mods.thermalexpansion.Furnace.add(2000, item('jsg:trinium_ore'), item('jsg:trinium_nugget') * 4)
furnace.add(item('jsg:gear_trinium'), item('jsg:trinium_ingot') * 4)
mods.thermalexpansion.Furnace.add(2000, item('jsg:gear_trinium'), item('jsg:trinium_ingot') * 4)
furnace.add(item('jsg:gear_naquadah_raw'), item('jsg:naquadah_alloy_raw') * 4)
mods.thermalexpansion.Furnace.add(2000, item('jsg:gear_naquadah_raw'), item('jsg:naquadah_alloy_raw') * 4)

// Add JSG's Orlin Gate recipe
def wrench = item('thermalfoundation:wrench', 0)
def reuseWrench = wrench.reuse()
crafting.removeByOutput(item('jsg:stargate_orlin_base_block'))
crafting.addShaped('orlinBase', item('jsg:stargate_orlin_base_block'),
	[[item('libvulpes:productgear', 7),item('minecraft:iron_block'),item('minecraft:iron_ingot')],
	 [item('libvulpes:productplate', 7),item('minecraft:redstone_block'),item('libvulpes:productplate', 7)],
	 [item('minecraft:iron_ingot'),reuseWrench,item('libvulpes:productgear', 7)]])
crafting.removeByOutput(item('jsg:stargate_orlin_member_block'))
crafting.addShaped('orlinRing', item('jsg:stargate_orlin_member_block'),
	[[item('minecraft:iron_ingot'),item('thermalfoundation:material', 24),item('libvulpes:productplate', 7)],
	 [item('minecraft:iron_ingot'),item('minecraft:redstone_torch'),item('minecraft:iron_ingot')],
	 [item('libvulpes:productplate', 7),reuseWrench,item('minecraft:iron_ingot')]]); 