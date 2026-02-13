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
uniChevron.input(item('thermalfoundation:material', 1))
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

// Dialer - Grid
crafting.removeByOutput(item('jsg:universe_dialer'))
crafting.addShaped('uni_dialer', item('jsg:universe_dialer'), 
	[
		[item('minecraft:redstone'), item('advancedrocketry:misc'), item('minecraft:redstone')],
		[item('jsg:naquadah_alloy'), item('advancedrocketry:ic', 3), item('jsg:naquadah_alloy')],
		[item('jsg:naquadah_alloy'), item('minecraft:redstone'), item('jsg:naquadah_alloy')]
	]
)

// Dialer - Assembler
def uniDialer = mods.advancedrocketry.precisionassembler.recipeBuilder()

// inputs
uniDialer.input(item('minecraft:redstone') * 2)
uniDialer.input(item('jsg:naquadah_alloy') * 2)
uniDialer.input(item('advancedrocketry:ic', 3))
uniDialer.input(item('advancedrocketry:misc'))

// output
uniDialer.output(item('jsg:universe_dialer'))

// power & time
uniDialer.power(250)
uniDialer.time(300)

uniDialer.register()



// MILKY WAY
// Base
def mwBase = mods.advancedrocketry.precisionassembler.recipeBuilder()

// inputs
mwBase.input(item('jsg:schematic_milkyway'))
mwBase.input(item('jsg:fragment_stargate_milkyway') * 2)
mwBase.input(item('appliedenergistics2:material', 24))
mwBase.input(item('appliedenergistics2:material', 16) * 2)
mwBase.input(item('appliedenergistics2:material', 3) * 4)
mwBase.input(item('thermalfoundation:material', 352) * 2)

// outputs
mwBase.output(item('jsg:stargate_milkyway_base_block'))
mwBase.output(item('jsg:schematic_milkyway'))

// power & time
mwBase.power(250)
mwBase.time(1500)

mwBase.register()

// Ring
def mwRing = mods.advancedrocketry.precisionassembler.recipeBuilder()

// inputs
mwRing.input(item('jsg:schematic_milkyway'))
mwRing.input(item('jsg:fragment_stargate_milkyway') * 3)
mwRing.input(item('thermalfoundation:material', 513) * 2)
mwRing.input(item('thermalfoundation:material', 352)  * 2)

// outputs
mwRing.output(item('jsg:stargate_milkyway_member_block', 6) * 2)
mwRing.output(item('jsg:schematic_milkyway'))

// power & time
mwRing.power(250)
mwRing.time(750)

mwRing.register()

// Chevron
def mwChevron = mods.advancedrocketry.precisionassembler.recipeBuilder()

// inputs
mwChevron.input(item('jsg:schematic_milkyway'))
mwChevron.input(item('jsg:fragment_stargate_milkyway') * 2)
mwChevron.input(item('appliedenergistics2:material', 18))
mwChevron.input(ore('projredIllumar') * 2)
mwChevron.input(ore('blockGlassHardened'))
mwChevron.input(item('thermalfoundation:material', 352))

// outputs
mwChevron.output(item('jsg:stargate_milkyway_member_block', 14))
mwChevron.output(item('jsg:schematic_milkyway'))

// power & time
mwChevron.power(250)
mwChevron.time(750)

mwChevron.register()

// Dialer
def mwDialer = mods.advancedrocketry.precisionassembler.recipeBuilder()

// inputs
mwDialer.input(item('jsg:schematic_milkyway'))
mwDialer.input(item('appliedenergistics2:material', 22))
mwDialer.input(item('minecraft:redstone') * 8)
mwDialer.input(item('jsg:naquadah_alloy') * 2)
mwDialer.input(item('thermalfoundation:material', 352) * 4)

// outputs
mwDialer.output(item('jsg:dhd_block'))
mwDialer.output(item('jsg:schematic_milkyway'))

// power & time
mwDialer.power(250)
mwDialer.time(600)

mwDialer.register()


/*
// PEGASUS
// Base
def pegBase = mods.advancedrocketry.precisionassembler.recipeBuilder()

// inputs
pegBase.input(item('jsg:schematic_pegasus'))
pegBase.input(item('jsg:fragment_stargate_pegasus') * 2)
pegBase.input(item('appliedenergistics2:material', 24))
pegBase.input(item('appliedenergistics2:material', 16) * 2)
pegBase.input(item('appliedenergistics2:material', 3) * 4)
pegBase.input(item('thermalfoundation:material', 352) * 2)

// outputs
pegBase.output(item('jsg:stargate_pegasus_base_block'))
pegBase.output(item('jsg:schematic_pegasus'))

// power & time
pegBase.power(250)
pegBase.time(1200)

pegBase.register()

// Ring
def pegRing = mods.advancedrocketry.precisionassembler.recipeBuilder()

// inputs
pegRing.input(item('jsg:schematic_pegasus'))
pegRing.input(item('jsg:fragment_stargate_pegasus') * 3)
pegRing.input(item('thermalfoundation:material', 513) * 2)
pegRing.input(item('thermalfoundation:material', 352)  * 2)

// outputs
pegRing.output(item('jsg:stargate_pegasus_member_block', 6) * 2)
pegRing.output(item('jsg:schematic_pegasus'))

// power & time
pegRing.power(250)
pegRing.time(600)

pegRing.register()

// Chevron
def pegChevron = mods.advancedrocketry.precisionassembler.recipeBuilder()

// inputs
pegChevron.input(item('jsg:schematic_pegasus'))
pegChevron.input(item('jsg:fragment_stargate_pegasus') * 2)
pegChevron.input(item('appliedenergistics2:material', 18))
pegChevron.input(ore('projredIllumar') * 2)
pegChevron.input(ore('blockGlassHardened'))
pegChevron.input(item('thermalfoundation:material', 352))

// outputs
pegChevron.output(item('jsg:stargate_pegasus_member_block', 14))
pegChevron.output(item('jsg:schematic_pegasus'))

// power & time
pegChevron.power(250)
pegChevron.time(600)

pegChevron.register() */