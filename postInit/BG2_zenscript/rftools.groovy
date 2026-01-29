//Remove existing crafting
crafting.removeByOutput(item('rftools:elevator'))
crafting.removeByOutput(item('rftools:screen_controller'))
crafting.removeByOutput(item('rftools:destination_analyzer'))
crafting.removeByOutput(item('rftools:dialing_device'))
crafting.removeByOutput(item('rftools:matter_receiver'))
crafting.removeByOutput(item('rftools:matter_transmitter'))
crafting.removeByOutput(item('rftools:machine_frame'))
//Add crafting
crafting.addShaped(item('rftools:elevator'), [[item('minecraft:redstone'), item('minecraft:piston'), item('minecraft:redstone')],[item('minecraft:redstone'), item('thermalexpansion:frame'), item('minecraft:redstone')], [item('minecraft:redstone'), item('minecraft:redstone_torch'), item('minecraft:redstone')]])
crafting.addShaped(item('rftools:screen_controller'), [[item('minecraft:redstone'), item('minecraft:ender_pearl'), item('minecraft:redstone')],[item('minecraft:glass'), item('thermalexpansion:frame'), item('minecraft:glass')], [item('minecraft:redstone'), item('minecraft:glass'), item('minecraft:redstone')]])
crafting.addShaped(item('rftools:destination_analyzer'), [[item('jsg:naquadah_alloy_raw'), item('minecraft:redstone'), item('jsg:naquadah_alloy_raw')],[item('minecraft:redstone'), item('thermalexpansion:frame'), item('minecraft:redstone')], [item('jsg:naquadah_alloy_raw'), item('minecraft:redstone'), item('jsg:naquadah_alloy_raw')]])
crafting.addShaped(item('rftools:dialing_device'), [[item('minecraft:redstone'), item('minecraft:redstone'), item('minecraft:redstone')],[item('minecraft:redstone_torch'), item('thermalexpansion:frame'), item('minecraft:redstone_torch')], [item('minecraft:redstone'), item('minecraft:redstone'), item('minecraft:redstone')]])
crafting.addShaped(item('rftools:matter_receiver'), [[item('minecraft:iron_ingot'), item('minecraft:iron_ingot'), item('minecraft:iron_ingot')],[item('minecraft:redstone'), item('thermalexpansion:frame'), item('minecraft:redstone')], [item('jsg:naquadah_alloy_raw'), item('jsg:naquadah_alloy_raw'), item('jsg:naquadah_alloy_raw')]])
crafting.addShaped(item('rftools:matter_transmitter'), [[item('jsg:naquadah_alloy_raw'), item('jsg:naquadah_alloy_raw'), item('jsg:naquadah_alloy_raw')],[item('minecraft:redstone'), item('thermalexpansion:frame'), item('minecraft:redstone')], [item('minecraft:iron_ingot'), item('minecraft:iron_ingot'), item('minecraft:iron_ingot')]]);