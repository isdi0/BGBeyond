import com.cleanroommc.groovyscript.compat.vanilla.Rarity
import li.cil.oc.util.Rarity
import static postInit.GlobalItems.*
import mods.tconstruct.melting
import mods.advancedrocketry.precisionassembler
import mods.thermalexpansion.Crucible
import net.minecraft.util.text.TextFormatting

// Add silicon carbide to oredict
oredict.add('bouleSiliconCarbide', item('bgbeyond:sic_boule'))
oredict.add('dustSiliconCarbide', item('bgbeyond:sic_dust'))
oredict.add('blockSiliconCarbide', block('bgbeyond:sic_block'))

// 1 gravel = 1 flint
crafting.remove('tconstruct:common/flint')
crafting.addShapeless('gravel_to_flint', flint, [gravel])

// Replacing the crafting station recipe to take the role of the vanilla crafting table
mods.jei.ingredient.removeAndHide(vanillaCraftingTable)
crafting.removeByOutput(craftingStation)
crafting.replaceShapeless('simple_crafting_station', craftingStation, [flint, logWood])

// Tool station 2x2 crafting recipe
crafting.removeByOutput(toolStation)
crafting.replaceShapeless('simple_tool_station', toolStation, [flint, pattern, plankWood])

// Fix rod melting recipes
for(item in stickMetalBugged){
    mods.tconstruct.melting.removeByInput(item)
}
mods.tconstruct.melting.add(stickIron, fluid('iron') * 72, 514)
mods.tconstruct.melting.add(stickCopper, fluid('copper') * 72, 410)
mods.tconstruct.melting.add(stickSteel, fluid('steel') * 72, 473)

// Add pulverizer recipe for titanium dust
mods.thermal.pulverizer.add(2000, ingotTitanium, item('libvulpes:productdust', 7), null, 0)

// Anorth(os)ite recipes
mods.thermal.crucible.add(30000, blockAnorthosite, fluidAnorthite * 1000)

// Quick sticks from logs
crafting.addShaped(item('minecraft:stick') * 16, [[logWood],[logWood]])

// Thermal-style Gear recipe for titanium gears
crafting.removeByOutput(item('libvulpes:productgear', 7))
crafting.addShaped(item('libvulpes:productgear', 7), [[null, ingotTitanium, null], [ingotTitanium, null, ingotTitanium], [null, ingotTitanium, null]])

// add recipes for resources on the moon
mods.thermalexpansion.Crucible.add(3200, item('minecraft:packed_ice'), fluid('water') * 2000)
mods.thermalexpansion.Crucible.add(3200, item('biomesoplenty:hard_ice'), fluid('water') * 2000)
mods.thermalexpansion.Crucible.add(30000, item('advancedrocketry:moonturf'), fluid('anorthite') * 1000)

// Change chickenchunks chunk loader recipe
crafting.removeByOutput(item('chickenchunks:chunk_loader'), false)
crafting.addShaped('chunkLoader', item('chickenchunks:chunk_loader'),
    [
        [null, item('minecraft:ender_eye'), null],
        [item('minecraft:gold_ingot'), item('minecraft:gold_ingot'), item('minecraft:gold_ingot')],
        [item('minecraft:gold_ingot'), item('jsg:naquadah_block'), item('minecraft:gold_ingot')]
    ]
)

// Change silicon crafting recipes to use AE2 silicon
mods.thermalexpansion.Compactor.removeByInput(item('libvulpes:productingot', 3))
mods.thermalexpansion.Compactor.add(4000, compactorMode('plate'), item('appliedenergistics2:material', 5), item('libvulpes:productplate', 3))

// Orlin alloy
item('bgbeyond:orlin_alloy_block').setRarity(TextFormatting.YELLOW)

// Change blockGlassHardened oredicts
oredict.clear('blockGlassHardened')
oredict.add('blockGlassHardened', item('thermalfoundation:glass', 3))

for(int i = 0; i < 8; i++) {
    oredict.add('blockGlassReinforced', item('thermalfoundation:glass', i))
}

for(int i = 0; i < 7; i++) {
    oredict.add('blockGlassReinforced', item('thermalfoundation:glass_alloy', i))
    oredict.add('blockGlassAlloyReinforced', item('thermalfoundation:glass_alloy', i))
}

// Change ProjectRed Illumination recipes
xx = null
rs = item('minecraft:redstone')
rt = item('minecraft:redstone_torch')
rl = item('minecraft:redstone_lamp')
ri = item('quark:lit_lamp')
gb = ore('blockGlass')
gp = ore('paneGlass')
cb = item('projectred-core:resource_item')
cc = item('projectred-core:resource_item', 1)
ci = item('projectred-core:resource_item', 11)
gd = item('minecraft:glowstone_dust')
pc = ore('dustCoal')
ip = item('minecraft:iron_bars')
for(int i = 0; i < 15; i++) {
    // Illumar
    il = item('projectred-core:resource_item', i + 500)

    // Full-block lamps
    lamp = item('projectred-illumination:lamp', i)
    lampInverted = item('projectred-illumination:lamp', i + 16)
    crafting.removeByOutput(lamp)
    crafting.removeByOutput(lampInverted)
    crafting.addShapeless(lamp, [rl, il])
    crafting.addShapeless(lampInverted, [ri, il])

    // Lanterns
    lantern = item('projectred-illumination:lantern', i)
    lanternInverted = item('projectred-illumination:inverted_lantern', i)
    crafting.removeByOutput(lantern)
    crafting.removeByOutput(lanternInverted)
    crafting.addShaped(lantern, [
        [xx, cb, xx],
        [gp, il, gp],
        [xx, cc, xx]
    ])
    crafting.addShaped(lanternInverted, [
        [xx, cb, xx],
        [gp, il, gp],
        [xx, ci, xx]
    ])

    // Light fixtures
    fixture = item('projectred-illumination:fixture_light', i)
    fixtureInverted = item('projectred-illumination:inverted_fixture_light', i)
    crafting.removeByOutput(fixture)
    crafting.removeByOutput(fixtureInverted)
    crafting.addShaped(fixture, [
        [xx, gp, xx],
        [gp, il, gp],
        [xx, cc, xx]
    ])
    crafting.addShaped(fixtureInverted, [
        [xx, gp, xx],
        [gp, il, gp],
        [xx, ci, xx]
    ])

    // Fallout lamps
    fallout = item('projectred-illumination:fallout_lamp', i)
    falloutNewVegas = item('projectred-illumination:inverted_fallout_lamp', i)
    crafting.removeByOutput(fallout)
    crafting.removeByOutput(falloutNewVegas)
    crafting.addShaped(fallout, [
        [ip, ip, ip],
        [ip, il, ip],
        [xx, cc, xx]
    ])
    crafting.addShaped(falloutNewVegas, [
        [ip, ip, ip],
        [ip, il, ip],
        [xx, ci, xx]
    ])

    // Cage lamps
    cage = item('projectred-illumination:cage_lamp', i)
    cageInverted = item('projectred-illumination:inverted_cage_lamp', i)
    crafting.removeByOutput(cage)
    crafting.removeByOutput(cageInverted)
    crafting.addShaped(cage, [
        [xx, ip, xx],
        [ip, il, ip],
        [xx, cc, xx]
    ])
    crafting.addShaped(cageInverted, [
        [xx, ip, xx],
        [ip, il, ip],
        [xx, ci, xx]
    ])
}

iw = ore('projredIllumar')
crafting.removeByOutput(iw)
def illumar(int x, String color) {
    il = item('projectred-core:resource_item', x + 500)
    crafting.addShapeless(il, [iw, ore('dye' + color)])
}

crafting.addShapeless(item('projectred-core:resource_item', 500), [gd, pc])
illumar(1, 'Orange')
illumar(2, 'Magenta')
illumar(3, 'LightBlue')
illumar(4, 'Yellow')
illumar(5, 'Lime')
illumar(6, 'Pink')
illumar(7, 'Gray')
illumar(8, 'LightGray')
illumar(9, 'Cyan')
illumar(10, 'Purple')
illumar(11, 'Blue')
illumar(12, 'Brown')
illumar(13, 'Green')
illumar(14, 'Red')
illumar(15, 'Black')