import static GlobalVars.*

// Removing unwanted items / recipes
mods.jei.ingredient.removeAndHide(vanillaCraftingTable)
crafting.removeByOutput(craftingStation)
crafting.removeByOutput(toolStation)
crafting.remove('tconstruct:common/flint')

// 1 gravel = 1 flint
crafting.addShapeless('gravel_to_flint', flint, [gravel])

// Replacing the crafting station recipe to take the role of the vanilla crafting table
crafting.replaceShapeless('simple_crafting_station', craftingStation, [flint, logWood])

// Tool station 2x2 crafting recipe
crafting.replaceShapeless('simple_tool_station', toolStation, [flint, pattern, plankWood])

// Fix rod melting recipes
for(item in stickMetal){
    mods.tconstruct.melting.removeByInput(item)
}
mods.tconstruct.melting.add(stickIron, fluid('iron') * 72, 514)
mods.tconstruct.melting.add(stickCopper, fluid('copper') * 72, 410)
mods.tconstruct.melting.add(stickSteel, fluid('steel') * 72, 473)
mods.tconstruct.melting.add(stickTitanium, fluid('titanium') * 72, 619)

// Add pulverizer recipe for titanium dust
mods.thermal.pulverizer.add(2000, ingotTitanium, item('libvulpes:productdust', 7), null, 0)

// Anorth(os)ite recipes
mods.thermal.crucible.add(30000, blockAnorthosite, fluidAnorthite)

// Quick sticks from logs
crafting.addShaped(item('minecraft:stick') * 16, [[logWood],[logWood]])

// Thermal-style Gear recipe for titanium gears
crafting.removeByOutput(item('libvulpes:productgear', 7))
crafting.addShaped(item('libvulpes:productgear', 7), [[null, ingotTitanium, null], [ingotTitanium, null, ingotTitanium], [null, ingotTitanium, null]])