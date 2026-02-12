import mods.advancedrocketry.precisionassembler

// ORLIN GATE
def wrench = item('thermalfoundation:wrench', 0)
def reuseWrench = wrench.reuse()
crafting.removeByOutput(item('jsg:stargate_orlin_base_block'))
crafting.addShaped('orlinBase', item('jsg:stargate_orlin_base_block'),
	[[item('bgbeyond:orlin_alloy_gear'),item('minecraft:iron_block'),item('minecraft:iron_ingot')],
	 [item('bgbeyond:orlin_alloy_plate'),item('minecraft:redstone_block'),item('bgbeyond:orlin_alloy_plate')],
	 [item('minecraft:iron_ingot'),reuseWrench,item('bgbeyond:orlin_alloy_gear')]])
crafting.removeByOutput(item('jsg:stargate_orlin_member_block'))
crafting.addShaped('orlinRing', item('jsg:stargate_orlin_member_block'),
	[[item('minecraft:iron_ingot'),item('thermalfoundation:material', 24),item('bgbeyond:orlin_alloy_plate')],
	 [item('minecraft:iron_ingot'),item('minecraft:redstone'),item('minecraft:iron_ingot')],
	 [item('bgbeyond:orlin_alloy_plate'),reuseWrench,item('minecraft:iron_ingot')]])

// == LARGE STARGATES ==
// UNIVERSE
// Base
def uniBase = mods.advancedrocketry.precisionassembler.recipeBuilder()

// inputs
uniBase.input(item('jsg:schematic_universe'))
uniBase.input(item('jsg:fragment_stargate_universe') * 2)
uniBase.input(item('minecraft:diamond'))
uniBase.input(item('appliedenergistics2:material', 10) * 2)
uniBase.input(item('appliedenergistics2:material', 3) * 4)
uniBase.input(item('thermalfoundation:material', 320) * 2)

// outputs
uniBase.output(item('jsg:stargate_universe_base_block'))
uniBase.output(item('jsg:schematic_universe'))

// power & time
uniBase.power(250)
uniBase.time(1200)

uniBase.register()

// Ring
def uniRing = mods.advancedrocketry.precisionassembler.recipeBuilder()

// inputs
uniRing.input(item('jsg:schematic_universe'))
uniRing.input(item('jsg:fragment_stargate_universe') * 3)
uniRing.input(item('thermalfoundation:material', 770) * 6)
uniRing.input(item('thermalfoundation:material', 320)  * 2)

// outputs
uniRing.output(item('jsg:stargate_universe_member_block', 6) * 2)
uniRing.output(item('jsg:schematic_universe'))

// power & time
uniRing.power(250)
uniRing.time(600)

uniRing.register()

// Chevron
def uniChevron = mods.advancedrocketry.precisionassembler.recipeBuilder()

// inputs
uniChevron.input(item('jsg:schematic_universe'))
uniChevron.input(item('jsg:fragment_stargate_universe') * 2)
uniChevron.input(item('appliedenergistics2:material', 11))
uniChevron.input(item('minecraft:glowstone_dust') * 4)
uniChevron.input(item('minecraft:obsidian'))
uniChevron.input(item('thermalfoundation:material', 320))

// outputs
uniChevron.output(item('jsg:stargate_universe_member_block', 14))
uniChevron.output(item('jsg:schematic_universe'))

// power & time
uniChevron.power(250)
uniChevron.time(600)

uniChevron.register()

/*
// MILKY WAY
// Base
def mwBase = mods.advancedrocketry.precisionassembler.recipeBuilder()

// inputs
uniBase.input(item('jsg:schematic_universe'))
uniBase.input(item('jsg:fragment_stargate_universe') * 2)
uniBase.input(item('minecraft:diamond'))
uniBase.input(item('appliedenergistics2:material', 10) * 2)
uniBase.input(item('appliedenergistics2:material', 3) * 4)
uniBase.input(item('thermalfoundation:material', 320) * 2)

// outputs
uniBase.output(item('jsg:stargate_universe_base_block'))
uniBase.output(item('jsg:schematic_universe'))

// power & time
uniBase.power(250)
uniBase.time(1200)

uniBase.register()

// Ring
def mwRing = mods.advancedrocketry.precisionassembler.recipeBuilder()

// inputs
uniRing.input(item('jsg:schematic_universe'))
uniRing.input(item('jsg:fragment_stargate_universe') * 3)
uniRing.input(item('thermalfoundation:material', 770) * 6)
uniRing.input(item('thermalfoundation:material', 320)  * 2)

// outputs
uniRing.output(item('jsg:stargate_universe_member_block', 6) * 2)
uniRing.output(item('jsg:schematic_universe'))

// power & time
uniRing.power(250)
uniRing.time(600)

uniRing.register()

// Chevron
def mwChevron = mods.advancedrocketry.precisionassembler.recipeBuilder()

// inputs
uniChevron.input(item('jsg:schematic_universe'))
uniChevron.input(item('jsg:fragment_stargate_universe') * 2)
uniChevron.input(item('appliedenergistics2:material', 11))
uniChevron.input(item('minecraft:glowstone_dust') * 4)
uniChevron.input(item('minecraft:obsidian'))
uniChevron.input(item('thermalfoundation:material', 320))

// outputs
uniChevron.output(item('jsg:stargate_universe_member_block', 14))
uniChevron.output(item('jsg:schematic_universe'))

// power & time
uniChevron.power(250)
uniChevron.time(600)

uniChevron.register()
*/