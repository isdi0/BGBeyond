//NO_RUN
//Add pulverizer crafting

//Sticks from logs

//Quark chest to vanilla chest

crafting.addShapeless(item('minecraft:chest'), [ore('chestWood')])

//Change some of the JSG crafting to use less crystals
//Also some weird-ass ingredients. like, glass panes?? why??

crafting.removeByOutput(item('jsg:circuit_control_base'))
crafting.addShaped(item('jsg:circuit_control_base'), [[item('jsg:crystal_red'), item('libvulpes:productingot', 7), item('jsg:crystal_white')],[null, item('jsg:crystal_blue_pegasus')]])

//Remove unused JSG crafting ingredients

crafting.removeByOutput(item('jsg:dhd_brb'))
mods.jei.JEI.hide(item('jsg:dhd_brb'))
crafting.removeByOutput(item('jsg:dhd_bbb'))
mods.jei.JEI.hide(item('jsg:dhd_bbb'))

//Change titanium gear crafting recipe to align with thermal

crafting.removeByOutput(item('libvulpes:productgear', 7))
crafting.addShaped(item('libvulpes:productgear', 7), [[null, item('libvulpes:productingot', 7)],[item('libvulpes:productingot', 7), null, item('libvulpes:productingot', 7)],[null, item('libvulpes:productingot', 7)]]);