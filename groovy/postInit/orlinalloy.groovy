import mods.thermal.smelter
import mods.thermal.factorizer
import mods.thermal.compactor
import mods.thermal.pulverizer

// Orlin's Alloy = Titanium + Electrum
mods.thermal.smelter.add(9600, item('libvulpes:productingot', 7) * 2, item('thermalfoundation:material', 97), item('bgbeyond:orlin_alloy_ingot') * 2, null, 0)
mods.thermal.smelter.add(9600, item('libvulpes:productingot', 7) * 2, item('thermalfoundation:material', 161), item('bgbeyond:orlin_alloy_ingot') * 2, null, 0)

crafting.addShaped('orlin_alloy_compacting', item('bgbeyond:orlin_alloy_block'), 
    [
        [item('bgbeyond:orlin_alloy_ingot'), item('bgbeyond:orlin_alloy_ingot'), item('bgbeyond:orlin_alloy_ingot')],
        [item('bgbeyond:orlin_alloy_ingot'), item('bgbeyond:orlin_alloy_ingot'), item('bgbeyond:orlin_alloy_ingot')],
        [item('bgbeyond:orlin_alloy_ingot'), item('bgbeyond:orlin_alloy_ingot'), item('bgbeyond:orlin_alloy_ingot')]
    ]
)
crafting.addShaped('orlin_alloy_decompacting', item('bgbeyond:orlin_alloy_ingot') * 9, [[item('bgbeyond:orlin_alloy_block')]])

crafting.addShaped('orlin_alloy_expanding', item('bgbeyond:orlin_alloy_nugget') * 9, [[item('bgbeyond:orlin_alloy_ingot')]])

crafting.addShaped('orlin_alloy_recompacting', item('bgbeyond:orlin_alloy_ingot'), 
    [
        [item('bgbeyond:orlin_alloy_nugget'), item('bgbeyond:orlin_alloy_nugget'), item('bgbeyond:orlin_alloy_nugget')],
        [item('bgbeyond:orlin_alloy_nugget'), item('bgbeyond:orlin_alloy_nugget'), item('bgbeyond:orlin_alloy_nugget')],
        [item('bgbeyond:orlin_alloy_nugget'), item('bgbeyond:orlin_alloy_nugget'), item('bgbeyond:orlin_alloy_nugget')]
    ]
)

mods.thermal.factorizer.add(true, true, item('bgbeyond:orlin_alloy_ingot') * 9, item('bgbeyond:orlin_alloy_block'))
mods.thermal.factorizer.add(true, true, item('bgbeyond:orlin_alloy_nugget') * 9,item('bgbeyond:orlin_alloy_ingot'))

crafting.addShaped('orlin_alloy_gear_crafting', item('bgbeyond:orlin_alloy_gear'), 
    [
        [null, item('bgbeyond:orlin_alloy_ingot'), null],
        [item('bgbeyond:orlin_alloy_ingot'), null, item('bgbeyond:orlin_alloy_ingot')],
        [null, item('bgbeyond:orlin_alloy_ingot'), null]
    ]
)
mods.thermal.compactor.add(4000, compactorMode('gear'), item('bgbeyond:orlin_alloy_ingot') * 4, item('bgbeyond:orlin_alloy_gear'))
mods.thermal.compactor.add(4000, compactorMode('plate'), item('bgbeyond:orlin_alloy_ingot'), item('bgbeyond:orlin_alloy_plate'))

mods.thermal.pulverizer.add(2000, item('bgbeyond:orlin_alloy_ingot'), item('bgbeyond:orlin_alloy_dust'), null, 0)