// == ILLUMINATION ==
// Define items
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

// Change recipes
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

// Change illumar recipe
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