// Create molten anorthite
content.createFluid('anorthite')
.setColor(0x656565)
.setMetalTexture()
.setDensity(2000)
.setLavaMaterial()
.setSound(sound('minecraft:item.bucket.fill_lava'), sound('minecraft:item.bucket.empty_lava'))
.setViscosity(10000)
.setLuminosity(10)
.setTemperature(1500)
.register()

// Create molten titanium
content.createFluid('titanium')
.setColor(0xccc8fa)
.setMetalTexture()
.setDensity(4500)
.setLavaMaterial()
.setSound(sound('minecraft:item.bucket.fill_lava'), sound('minecraft:item.bucket.empty_lava'))
.setViscosity(10000)
.setLuminosity(10)
.setTemperature(776)
.register()

// Create silicon carbide
content.createItem('sic_dust')
.setRarity(EnumRarity.COMMON)
.setCreativeTab(creativeTab('misc'))
.register()

content.createItem('sic_boule')
.setRarity(EnumRarity.COMMON)
.setCreativeTab(creativeTab('misc'))
.register()

content.createBlock('sic_block')
.setLightOpacity(15)
.setHardness(5f)
.setResistance(30f)
.setCreativeTab(creativeTab('buildingBlocks'))
.register()

// Create Orlin Alloy
content.createItem('orlin_alloy_ingot')
.setRarity(EnumRarity.UNCOMMON)
.setCreativeTab(creativeTab('misc'))
.register()

content.createItem('orlin_alloy_nugget')
.setRarity(EnumRarity.UNCOMMON)
.setCreativeTab(creativeTab('misc'))
.register()

content.createItem('orlin_alloy_dust')
.setRarity(EnumRarity.UNCOMMON)
.setCreativeTab(creativeTab('misc'))
.register()

content.createItem('orlin_alloy_plate')
.setRarity(EnumRarity.UNCOMMON)
.setCreativeTab(creativeTab('misc'))
.register()

content.createItem('orlin_alloy_gear')
.setRarity(EnumRarity.UNCOMMON)
.setCreativeTab(creativeTab('misc'))
.register()

content.createBlock('orlin_alloy_block', blockMaterial('iron'))
.setLightOpacity(15)
.setHardness(5f)
.setResistance(40f)
.setCreativeTab(creativeTab('buildingBlocks'))
.register()

// Niobium
content.createBlock('niobium_ore', blockMaterial('rock'))
.setLightOpacity(15)
.setHardness(3f)
.setCreativeTab(creativeTab('buildingBlocks'))
.register()

content.createBlock('niobium_block', blockMaterial('rock'))
.setLightOpacity(15)
.setHardness(5f)
.setResistance(40f)
.setCreativeTab(creativeTab('buildingBlocks'))
.register()

content.createItem('niobium_ingot')
.setCreativeTab(creativeTab('misc'))
.register()

content.createItem('niobium_nugget')
.setCreativeTab(creativeTab('misc'))
.register()