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

// Control Circuit Base recipe
crafting.removeByOutput(item('jsg:circuit_control_base'))
mods.advancedrocketry.precisionassembler.recipeBuilder()
    .input(controlBoard, item('minecraft:redstone') * 8)
    .fluidInput(blendWhite * 144)
    .output(item('jsg:circuit_control_base'))
    .fluidOutput(blendBlack * 72)
    .power(100)
    .time(400)
    .register()

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