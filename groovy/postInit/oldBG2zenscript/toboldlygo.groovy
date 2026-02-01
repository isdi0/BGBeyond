//NO_RUN
import loottweaker.LootTweaker
import loottweaker.vanilla.loot.LootTable
import loottweaker.vanilla.loot.LootPool
import crafttweaker.data.IData

//Change display names
item('libvulpes:ore0').displayName = 'Dilithium'
item('libvulpes:battery', 0).displayName = 'Battery'
item('libvulpes:battery', 1).displayName = 'Battery Pack'
item('advancedrocketry:moonturf').displayName = 'Anorthosite'
item('advancedrocketry:moonturf_dark').displayName = 'Regolith'
item('advancedrocketry:hotturf').displayName = 'Ferric Regolith'
item('atum:desert_helmet_diamond').displayName = 'Desert Helmet (Platinum)'
item('atum:desert_chest_diamond').displayName = 'Desert Chestplate (Platinum)'
item('atum:desert_legs_diamond').displayName = 'Desert Leggings (Platinum)'
item('atum:desert_boots_diamond').displayName = 'Desert Boots (Platinum)'
item('atum:desert_wolf_diamond_armor').displayName = 'Platinum Desert Wolf Armor'
item('atum:camel_diamond_armor').displayName = 'Platinum Camel Armor'
item('minecraft:experience_bottle').displayName = 'Knowledge Potion'

//Add magma crucible crafting
mods.thermalexpansion.Crucible.addRecipe(fluid('water') * 2000, item('minecraft:packed_ice'), 3200)
mods.thermalexpansion.Crucible.addRecipe(fluid('water') * 2000, item('biomesoplenty:hard_ice'), 3200)
mods.thermalexpansion.Crucible.addRecipe(fluid('anorthite') * 1000, item('advancedrocketry:moonturf'), 30000)

//Fix rods being melted down into more metal than it takes to make them
mods.tconstruct.Melting.removeRecipe(fluid('iron'), item('libvulpes:productrod', 1))
mods.tconstruct.Melting.addRecipe(fluid('iron') * 72, item('libvulpes:productrod', 1), 514)
mods.tconstruct.Melting.removeRecipe(fluid('copper'), item('libvulpes:productrod', 4))
mods.tconstruct.Melting.addRecipe(fluid('copper') * 72, item('libvulpes:productrod', 4), 410)
mods.tconstruct.Melting.removeRecipe(fluid('steel'), item('libvulpes:productrod', 6))
mods.tconstruct.Melting.addRecipe(fluid('steel') * 72, item('libvulpes:productrod', 6), 473)
mods.tconstruct.Melting.removeRecipe(fluid('titanium_molten'), item('libvulpes:productrod', 7))
mods.tconstruct.Melting.addRecipe(fluid('titanium_molten') * 72, item('libvulpes:productrod', 7), 619)
mods.tconstruct.Melting.removeRecipe(fluid('iridium'), item('libvulpes:productrod', 10))
mods.tconstruct.Melting.addRecipe(fluid('iridium') * 72, item('libvulpes:productrod', 10), 802)

//Change chunk loader recipe to use a platinum block instead of an enchanting table
crafting.removeByOutput(item('chickenchunks:chunk_loader'), false)
crafting.addShaped('chunkLoader', item('chickenchunks:chunk_loader'),
	[[null,item('minecraft:ender_eye'),null],
	 [item('minecraft:gold_ingot'),item('minecraft:gold_ingot'),item('minecraft:gold_ingot')],
	 [item('minecraft:gold_ingot'),item('thermalfoundation:storage', 6),item('minecraft:gold_ingot')]])
	 

//Remove crafting recipe for the atum scarab and make it a desert temple loot chest drop
def desert = LootTweaker.getTable('minecraft:chests/desert_pyramid').getPool('main')
crafting.removeByOutput(item('atum:scarab'))
desert.addItemEntry(item('atum:scarab'), 75)

//Change silicon crafting to use refined storage silicon
mods.thermalexpansion.Compactor.removeStorageRecipe(item('libvulpes:productingot', 3))
mods.thermalexpansion.Compactor.addStorageRecipe(item('libvulpes:productplate', 3), item('refinedstorage:silicon'), 4000)
mods.jei.JEI.removeAndHide(item('libvulpes:productingot', 3))
mods.jei.JEI.removeAndHide(item('libvulpes:productdust', 3))
mods.jei.JEI.removeAndHide(item('libvulpes:productnugget', 3))

//Add uses for regolith
furnace.addRecipe(item('minecraft:iron_nugget'), item('advancedrocketry:hotturf'))
mods.thermalexpansion.RedstoneFurnace.addRecipe(item('minecraft:iron_nugget'), item('advancedrocketry:hotturf'), 2000)
furnace.addRecipe(item('minecraft:glass'), item('advancedrocketry:moonturf_dark'))
mods.thermalexpansion.RedstoneFurnace.addRecipe(item('minecraft:glass'), item('advancedrocketry:moonturf_dark'), 2000)

//Tidy up JEI
mods.jei.JEI.hide(fluid('fuelcolumn'))
mods.jei.JEI.hide(item('mcjtylib_ng:multipart'))
mods.jei.JEI.hide(item('omlib:fake_sword'))
mods.jei.JEI.hide(item('omlib:network_cable'))
mods.jei.JEI.hide(item('omlib:debug_tool'))
mods.jei.JEI.hide(item('rftools:invisible_shield_block'))
mods.jei.JEI.hide(item('rftools:notick_invisible_shield_block'))
mods.jei.JEI.hide(item('rftools:invisible_shield_block_opaque'))
mods.jei.JEI.hide(item('rftools:notick_invisible_shield_block_opaque'))
mods.jei.JEI.hide(item('rftools:solid_shield_block'))
mods.jei.JEI.hide(item('rftools:notick_solid_shield_block'))
mods.jei.JEI.hide(item('rftools:camo_shield_block'))
mods.jei.JEI.hide(item('rftools:notick_camo_shield_block'))
mods.jei.JEI.hide(item('rftools:solid_shield_block_opaque'))
mods.jei.JEI.hide(item('rftools:notick_solid_shield_block_opaque'))
mods.jei.JEI.hide(item('rftools:camo_shield_block_opaque'))
mods.jei.JEI.hide(item('rftools:notick_camo_shield_block_opaque'))
mods.jei.JEI.hide(item('doubleslabs:vertical_slab').withNbt(['item': ['id': 'blockcraftery':'editable_slab', 'Count': 1 'as' 'byte', 'Damage': 0 'as' 'short']]))
mods.jei.JEI.hide(item('doubleslabs:vertical_slab').withNbt(['item': ['id': 'blockcraftery':'editable_slab_reinforced', 'Count': 1 'as' 'byte', 'Damage': 0 'as' 'short']]))
mods.jei.JEI.hide(item('doubleslabs:vertical_slab').withNbt(['item': []]))
mods.jei.JEI.removeAndHide(item('omlib:multi_tool'))
mods.jei.JEI.removeAndHide(item('zerocore:debugtool'));