import zmaster587.libVulpes.api.material.AllowedProducts
import zmaster587.libVulpes.api.material.MaterialRegistry

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
    content.createItem('sic_ingot')
    .setRarity(EnumRarity.COMMON)
    .setCreativeTab(creativeTab('misc'))
    .register()

    content.createItem('sic_dust')
    .setRarity(EnumRarity.COMMON)
    .setCreativeTab(creativeTab('misc'))
    .register()

    content.createItem('sic_boule')
    .setRarity(EnumRarity.COMMON)
    .setCreativeTab(creativeTab('misc'))
    .register()

    content.createItem('sic_crystal')
    .setRarity(EnumRarity.COMMON)
    .setCreativeTab(creativeTab('misc'))
    .register()

    content.createBlock('sic_block')
    .setLightOpacity(15)
    .setHardness(5f)
    .setResistance(6f)
    .setCreativeTab(creativeTab('misc'))
    .register()