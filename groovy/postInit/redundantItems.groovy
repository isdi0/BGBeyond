import static postInit.GlobalItems.*
import mods.jei.ingredient
import mods.thermal.crucible
import mods.ticon.table
import mods.ticon.basin
import mods.ticon.melting

def redundantIngredients = [
    fluid('titanium_molten'),
    fluid('fuelcolumn'),
    item('mcjtylib_ng:multipart'),
    item('omlib:fake_sword'),
    item('omlib:network_cable'),
    item('omlib:debug_tool'),
    item('rftools:invisible_shield_block'),
    item('rftools:notick_invisible_shield_block'),
    item('rftools:invisible_shield_block_opaque'),
    item('rftools:notick_invisible_shield_block_opaque'),
    item('rftools:solid_shield_block'),
    item('rftools:notick_solid_shield_block'),
    item('rftools:camo_shield_block'),
    item('rftools:notick_camo_shield_block'),
    item('rftools:solid_shield_block_opaque'),
    item('rftools:notick_solid_shield_block_opaque'),
    item('rftools:camo_shield_block_opaque'),
    item('rftools:notick_camo_shield_block_opaque'),
    item('omlib:multi_tool'),
    item('zerocore:debugtool'),
    item('libvulpes:productingot', 3), // libvulpes metadata 3 = Silicon
    item('libvulpes:productdust', 3),
    item('libvulpes:productnugget', 3),
    item('tconstruct:common_ingots'), // Copper, tin, aluminum, bronze, steel already covered by thermal.
    item('tconstruct:common_ingots', 1),
    item('tconstruct:common_ingots', 2),
    item('tconstruct:common_ingots', 3),
    item('tconstruct:common_ingots', 4),
    item('tconstruct:common_nuggets'),
    item('tconstruct:common_nuggets', 1),
    item('tconstruct:common_nuggets', 2),
    item('tconstruct:common_nuggets', 3),
    item('tconstruct:common_nuggets', 4),
    item('tconstruct:common_metal'),
    item('tconstruct:common_metal', 1),
    item('tconstruct:common_metal', 2),
    item('tconstruct:common_metal', 3),
    item('tconstruct:common_metal', 4),
    item('appliedenergistics2:material', 51), // Gold dust already covered by thermal
    item('appliedenergistics2:material', 49), // Iron dust already covered by thermal
    item('thermalfoundation:material', 22) // Wooden gear covered by AE2
]

def commonItems = [
    item('tconstruct:common_ingots'),
    item('tconstruct:common_ingots', 1),
    item('tconstruct:common_ingots', 2),
    item('tconstruct:common_ingots', 3),
    item('tconstruct:common_ingots', 4),
    item('tconstruct:common_nuggets'),
    item('tconstruct:common_nuggets', 1),
    item('tconstruct:common_nuggets', 2),
    item('tconstruct:common_nuggets', 3),
    item('tconstruct:common_nuggets', 4)
]
def commonMetals = [
    item('tconstruct:common_metal'),
    item('tconstruct:common_metal', 1),
    item('tconstruct:common_metal', 2),
    item('tconstruct:common_metal', 3),
    item('tconstruct:common_metal', 4)
]

for (entry in commonItems) {
    mods.ticon.table.removeByOutput(entry)
    mods.ticon.melting.removeByInput(entry)
}
for (entry in commonMetals) {
    mods.ticon.basin.removeByOutput(entry)
    mods.ticon.melting.removeByInput(entry)
}

crafting.removeByOutput(item('atum:scarab'))

mods.thermal.crucible.removeByOutput(fluid('titanium_molten'))

for (item in redundantIngredients) {
    mods.jei.ingredient.removeAndHide(item)
}