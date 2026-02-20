import static postInit.GlobalItems.*
import mods.jei.ingredient
import mods.thermal.crucible
import mods.ticon.table
import mods.ticon.basin
import mods.ticon.melting
import slimeknights.tconstruct.library.smeltery.MeltingRecipe
import slimeknights.tconstruct.library.smeltery.CastingRecipe

// copper, tin, aluminum, bronze, steel already covered by thermal
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
    commonItems, 
    commonMetals,
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

for (entry in commonItems) {
    mods.ticon.table.removeByOutput(entry)
    mods.ticon.melting.removeByInput(entry)
}

for (entry in commonMetals) {
    mods.ticon.basin.removeByOutput(entry)
    mods.ticon.melting.removeByInput(entry)
}

// Melting recipes for thermal
// copper
mods.ticon.melting.add(item('thermalfoundation:material', 128), fluid('copper') * 144, MeltingRecipe.calcTemperature(fluid('copper').getFluid().getTemperature(), 144))
mods.ticon.melting.add(item('thermalfoundation:material', 192), fluid('copper') * 16, MeltingRecipe.calcTemperature(fluid('copper').getFluid().getTemperature(), 16))
mods.ticon.melting.add(item('thermalfoundation:storage'), fluid('copper') * 1296, MeltingRecipe.calcTemperature(fluid('copper').getFluid().getTemperature(), 1296))
// tin
mods.ticon.melting.add(item('thermalfoundation:material', 129), fluid('tin') * 144, MeltingRecipe.calcTemperature(fluid('tin').getFluid().getTemperature(), 144))
mods.ticon.melting.add(item('thermalfoundation:material', 193), fluid('tin') * 16, MeltingRecipe.calcTemperature(fluid('tin').getFluid().getTemperature(), 16))
mods.ticon.melting.add(item('thermalfoundation:storage', 1), fluid('tin') * 1296, MeltingRecipe.calcTemperature(fluid('tin').getFluid().getTemperature(), 1296))
// aluminum
mods.ticon.melting.add(item('thermalfoundation:material', 132), fluid('aluminum') * 144, MeltingRecipe.calcTemperature(fluid('aluminum').getFluid().getTemperature(), 144))
mods.ticon.melting.add(item('thermalfoundation:material', 196), fluid('aluminum') * 16, MeltingRecipe.calcTemperature(fluid('aluminum').getFluid().getTemperature(), 16))
mods.ticon.melting.add(item('thermalfoundation:storage', 4), fluid('aluminum') * 1296, MeltingRecipe.calcTemperature(fluid('aluminum').getFluid().getTemperature(), 1296))
// bronze
mods.ticon.melting.add(item('thermalfoundation:material', 163), fluid('bronze') * 144, MeltingRecipe.calcTemperature(fluid('bronze').getFluid().getTemperature(), 144))
mods.ticon.melting.add(item('thermalfoundation:material', 227), fluid('bronze') * 16, MeltingRecipe.calcTemperature(fluid('bronze').getFluid().getTemperature(), 16))
mods.ticon.melting.add(item('thermalfoundation:storage_alloy', 3), fluid('bronze') * 1296, MeltingRecipe.calcTemperature(fluid('bronze').getFluid().getTemperature(), 1296))
// steel
mods.ticon.melting.add(item('thermalfoundation:material', 160), fluid('steel') * 144, MeltingRecipe.calcTemperature(fluid('steel').getFluid().getTemperature(), 144))
mods.ticon.melting.add(item('thermalfoundation:material', 224), fluid('steel') * 16, MeltingRecipe.calcTemperature(fluid('steel').getFluid().getTemperature(), 16))
mods.ticon.melting.add(item('thermalfoundation:storage_alloy'), fluid('steel') * 1296, MeltingRecipe.calcTemperature(fluid('steel').getFluid().getTemperature(), 1296))

// Casting recipes for thermal
// copper
mods.ticon.table.recipeBuilder()
    .fluidInput(fluid('copper') * 144)
    .output(item('thermalfoundation:material', 128))
    .cast(item('tconstruct:cast_custom'))
    .coolingTime(CastingRecipe.calcCooldownTime(fluid('copper').getFluid(), 144))
    .register()
mods.ticon.table.recipeBuilder()
    .fluidInput(fluid('copper') * 16)
    .output(item('thermalfoundation:material', 192))
    .cast(item('tconstruct:cast_custom', 1))
    .coolingTime(CastingRecipe.calcCooldownTime(fluid('copper').getFluid(), 16))
    .register()
mods.ticon.basin.recipeBuilder()
    .fluidInput(fluid('copper') * 1296)
    .output(item('thermalfoundation:storage'))
    .cast(null)
    .coolingTime(CastingRecipe.calcCooldownTime(fluid('copper').getFluid(), 1296))
// tin
mods.ticon.table.recipeBuilder()
    .fluidInput(fluid('tin') * 144)
    .output(item('thermalfoundation:material', 129))
    .cast(item('tconstruct:cast_custom'))
    .coolingTime(CastingRecipe.calcCooldownTime(fluid('tin').getFluid(), 144))
    .register()
mods.ticon.table.recipeBuilder()
    .fluidInput(fluid('tin') * 16)
    .output(item('thermalfoundation:material', 193))
    .cast(item('tconstruct:cast_custom', 1))
    .coolingTime(CastingRecipe.calcCooldownTime(fluid('tin').getFluid(), 16))
    .register()
mods.ticon.basin.recipeBuilder()
    .fluidInput(fluid('tin') * 1296)
    .output(item('thermalfoundation:storage', 1))
    .cast(null)
    .coolingTime(CastingRecipe.calcCooldownTime(fluid('tin').getFluid(), 1296))
// aluminum
mods.ticon.table.recipeBuilder()
    .fluidInput(fluid('aluminum') * 144)
    .output(item('thermalfoundation:material', 132))
    .cast(item('tconstruct:cast_custom'))
    .coolingTime(CastingRecipe.calcCooldownTime(fluid('aluminum').getFluid(), 144))
    .register()
mods.ticon.table.recipeBuilder()
    .fluidInput(fluid('aluminum') * 16)
    .output(item('thermalfoundation:material', 196))
    .cast(item('tconstruct:cast_custom', 1))
    .coolingTime(CastingRecipe.calcCooldownTime(fluid('aluminum').getFluid(), 16))
    .register()
mods.ticon.basin.recipeBuilder()
    .fluidInput(fluid('aluminum') * 1296)
    .output(item('thermalfoundation:storage', 4))
    .cast(null)
    .coolingTime(CastingRecipe.calcCooldownTime(fluid('aluminum').getFluid(), 1296))
// bronze
mods.ticon.table.recipeBuilder()
    .fluidInput(fluid('bronze') * 144)
    .output(item('thermalfoundation:material', 163))
    .cast(item('tconstruct:cast_custom'))
    .coolingTime(CastingRecipe.calcCooldownTime(fluid('bronze').getFluid(), 144))
    .register()
mods.ticon.table.recipeBuilder()
    .fluidInput(fluid('bronze') * 16)
    .output(item('thermalfoundation:material', 227))
    .cast(item('tconstruct:cast_custom', 1))
    .coolingTime(CastingRecipe.calcCooldownTime(fluid('bronze').getFluid(), 16))
    .register()
mods.ticon.basin.recipeBuilder()
    .fluidInput(fluid('bronze') * 1296)
    .output(item('thermalfoundation:storage_alloy', 3))
    .cast(null)
    .coolingTime(CastingRecipe.calcCooldownTime(fluid('bronze').getFluid(), 1296))
// steel
mods.ticon.table.recipeBuilder()
    .fluidInput(fluid('steel') * 144)
    .output(item('thermalfoundation:material', 160))
    .cast(item('tconstruct:cast_custom'))
    .coolingTime(CastingRecipe.calcCooldownTime(fluid('steel').getFluid(), 144))
    .register()
mods.ticon.table.recipeBuilder()
    .fluidInput(fluid('steel') * 16)
    .output(item('thermalfoundation:material', 224))
    .cast(item('tconstruct:cast_custom', 1))
    .coolingTime(CastingRecipe.calcCooldownTime(fluid('steel').getFluid(), 16))
    .register()
mods.ticon.basin.recipeBuilder()
    .fluidInput(fluid('steel') * 1296)
    .output(item('thermalfoundation:storage_alloy'))
    .cast(null)
    .coolingTime(CastingRecipe.calcCooldownTime(fluid('steel').getFluid(), 1296))

for(entry in nuclearIngots) {
    crafting.removeByOutput(entry)
    Furnace.removeByOutput(entry)
    mods.thermal.Furnace.removeByOutput(entry)
    mods.thermal.Smelter.removeByOutput(entry)
}
for(entry in nuclearDusts) {
    mods.thermal.Pulverizer.removeByOutput(entry)
}
for(entry in nuclearBlocks) {
    crafting.removeByOutput(entry)
    mods.thermal.Factorizer.removeByOutput(entry)
    mods.thermal.Factorizer.removeByInput(entry)
}