import static postInit.GlobalItems.*
import mods.jei.ingredient
import mods.thermal.crucible
import mods.ticon.table
import mods.ticon.basin
import mods.ticon.melting
import slimeknights.tconstruct.library.smeltery.MeltingRecipe
import slimeknights.tconstruct.library.smeltery.CastingRecipe

// yellorium, blutonium, ludicrite are being replaced
def nuclearIngots = [
    item('bigreactors:ingotyellorium'),
    item('bigreactors:ingotcyanite'),
    item('bigreactors:ingotblutonium')
]
def nuclearDusts = [
    item('bigreactors:dustyellorium'),
    item('bigreactors:dustcyanite'),
    item('bigreactors:dustblutonium'),
    item('bigreactors:dustludicrite')
]
def nuclearBlocks = [
    item('bigreactors:blockyellorium'),
    item('bigreactors:blockcyanite'),
    item('bigreactors:blockblutonium')
]


// shield blocks are unobtainable as items, and not even craftable, so they're just cluttering up JEI
def rfShieldBlocks = [
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
    item('rftools:notick_camo_shield_block_opaque')
]

def redundantIngredients = [
    fluid('titanium_molten'),
    fluid('fuelcolumn'),
    fluid('yellorium'),
    item('mcjtylib_ng:multipart'),
    item('omlib:fake_sword'),
    item('omlib:network_cable'),
    item('omlib:debug_tool'),
    item('omlib:multi_tool'),
    item('zerocore:debugtool'),
    item('libvulpes:productingot', 3), // libvulpes metadata 3 = Silicon
    item('libvulpes:productdust', 3),
    item('libvulpes:productnugget', 3),
    item('appliedenergistics2:material', 51), // Gold dust already covered by thermal
    item('appliedenergistics2:material', 49), // Iron dust already covered by thermal
    item('thermalfoundation:material', 22), // Wooden gear covered by AE2
    item('bigreactors:oreyellorite'),
    rfShieldBlocks,
    nuclearIngots,
    nuclearDusts, 
    nuclearBlocks,
]
redundantIngredients.flatten()

crafting.removeByOutput(item('atum:scarab'))

mods.thermal.crucible.removeByOutput(fluid('titanium_molten'))

// hide from JEI
for (item in redundantIngredients) {
    mods.jei.ingredient.removeAndHide(item)
}