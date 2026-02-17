//Remove existing crafting
crafting.removeByOutput(item('rftools:elevator'))
crafting.removeByOutput(item('rftools:screen_controller'))
crafting.removeByOutput(item('rftools:destination_analyzer'))
crafting.removeByOutput(item('rftools:dialing_device'))
crafting.removeByOutput(item('rftools:matter_receiver'))
crafting.removeByOutput(item('rftools:matter_transmitter'))
crafting.removeByOutput(item('rftools:machine_frame'))
//Add crafting
rs = item('minecraft:redstone')
rt = item('minecraft:redstone_torch')
pt = item('minecraft:piston')
bi = item('jsg:naquadah_alloy_raw')
fi = item('minecraft:iron_ingot')
bG = item('minecraft:glass')
pE = item('minecraft:ender_pearl')
fm = item('rftools:machine_frame')
ii = item('thermalfoundation:material', 162)
bg = item('thermalfoundation:material', 291)
hG = item('thermalfoundation:glass', 3)
crafting.addShaped(item('rftools:elevator'), [
    [rs, pt, rs],
    [rs, fm, rs], 
    [rs, rt, rs]
])
crafting.addShaped(item('rftools:screen_controller'), [
    [rs, pE, rs],
    [bG, fm, bG],
    [rs, bG, rs]
])
crafting.addShaped(item('rftools:destination_analyzer'), [
    [bi, rs, bi],
    [rs, fm, rs],
    [bi, rs, bi]
])
crafting.addShaped(item('rftools:dialing_device'), [
    [rs, rs, rs],
    [item('minecraft:redstone_torch'), fm, item('minecraft:redstone_torch')],
    [rs, rs, rs]
])
crafting.addShaped(item('rftools:matter_receiver'), [
    [fi, fi, fi],
    [rs, fm, rs],
    [bi, bi, bi]
])
crafting.addShaped(item('rftools:matter_transmitter'), [
    [bi, bi, bi],
    [rs, fm, rs], 
    [fi, fi, fi]
])
crafting.addShaped(fm, [
    [ii, hG, ii],
    [hG, bg, hG],
    [ii, hG, ii]
])