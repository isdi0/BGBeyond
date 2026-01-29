class GlobalItems{
// Work stations
    final static def vanillaCraftingTable = item('minecraft:crafting_table')
    final static def craftingStation = item('tconstruct:tooltables')
    final static def toolStation = item('tconstruct:tooltables', 3)

    // Tinkers' Construct
    final static def pattern = ore('pattern')

    //// Generic Resources
    // Raw materials
    final static def logWood = ore('logWood')
    final static def plankWood = ore('plankWood')
    final static def stickWood = ore('stickWood')
    final static def gravel = ore('gravel')
    final static def flint = item('minecraft:flint')
    final static def blockAnorthosite = item('advancedrocketry:moonturf')

    // Processed materials
    final static def ingotTitanium = ore('ingotTitanium')
    final static def dustTitanium = ore('dustTitanium')
    final static def dustTitaniumAR = item('libvulpes:productdust', 7)
    final static def fluidAnorthite = fluid('anorthite')

    // Semi-finished materials
    final static def gearTitanium = ore('gearTitanium')
    final static def stickTiAl = ore('stickTitaniumAluminide')
    final static def stickTiIr = ore('stickTitaniumIridium')
    final static def stickIron = ore('stickIron')
    final static def stickCopper = ore('stickCopper')
    final static def stickSteel = ore('stickSteel')
    final static def stickTitanium = ore('stickTitanium')
    final static def stickIridium = ore('stickIridium')
    final static def stickMetal = [
        stickIron,
        stickCopper,
        stickSteel
    ]

    // Sub-assemblies
}