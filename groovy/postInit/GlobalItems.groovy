class GlobalItems{
    // Work stations
    final static def vanillaCraftingTable = item('minecraft:crafting_table')
    final static def craftingStation = item('tconstruct:tooltables')
    final static def toolStation = item('tconstruct:tooltables', 3)

    // Tinkers' Construct
    final static def pattern = ore('pattern')

    //// --- GENERIC ITEMS ---
    // Raw materials
    final static def logWood = ore('logWood')
    final static def plankWood = ore('plankWood')
    final static def stickWood = ore('stickWood')
    final static def gravel = ore('gravel')
    final static def flint = item('minecraft:flint')
    final static def blockAnorthosite = item('advancedrocketry:moonturf')
    final static def ingotNaquadahRaw = ore('ingotNaquadahRaw')
    final static def ingotNaquadahRefined = ore('ingotNaquadahRefined')

    // Processed materials
    final static def ingotTitanium = ore('ingotTitanium')
    final static def dustTitanium = ore('dustTitanium')
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
    final static def stickMetalBugged = [
        stickIron,
        stickCopper,
        stickSteel
    ]
    final static def plateNaquadahRaw = ore('plateNaquadahRaw')
    final static def plateNaquadah = ore('plateNaquadahRefined')
    // Sub-assemblies
    final static def controlBoard = item('advancedrocketry:ic:3')
    final static def itemBoard = item('advancedrocketry:ic:4')
    final static def fluidBoard = item('advancedrocketry:ic:5')

    //// --- CRYSTALS ---
    final static def blendBlack = fluid('silicon_molten_black')
    final static def blendWhite = fluid('silicon_molten_white')
    final static def moltenSilicon = blendBlack
    final static def refinedSilicon = blendWhite
    final static def blendBlue = fluid('silicon_molten_blue')
    final static def blendEnder = fluid('silicon_molten_ender')
    final static def blendPegasus = fluid('silicon_molten_pegasus')
    final static def blendRed = fluid('silicon_molten_red')
    final static def blendYellow = fluid('silicon_molten_yellow')

    final static def crystalBlue = item('jsg:crystal_blue')
    final static def crystalEnder = item('jsg:crystal_ender')
    final static def crystalPegasus = item('jsg:crystal_blue_pegasus')
    final static def crystalRed = item('jsg:crystal_red')
    final static def crystalWhite = item('jsg:crystal_white')
    final static def crystalYellow = item('jsg:crystal_yellow')
}