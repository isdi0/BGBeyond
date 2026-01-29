import postInit.GlobalItems.*
import static postInit.TiConMaterialBuilder.*
import static slimeknights.tconstruct.library.fluid.FluidMolten

new FluidMolten('titanium', 0x525C82)
.setDensity(2000)
.setViscosity(10000)
.setLuminosity(10)
.setTemperature(1500)

new TiConMaterialBuilder('titanium', 0xC8C8FF)
.head(600, 8f, 5f, 3) // durability, miningSpeed, attack, harvestLevel
.handle(0.95f, 175) // modifier, durability
.extra(50) // durability
.bow(1.5f, 3f, 9.5) // drawSpeed, range, bonusDamage
.addTrait('lightweight', 'head')
.addTrait('lightweight', 'handle')
.addTrait('established', 'extra')
.item(ingotTitanium)
.fluid(fluid('titanium'))
.build()

/* 
new TiConMaterialBuilder('titaniumaluminide', 0xC8C8C8)
.head(400, 8f, 6f, 4)
.handle(1.05f, 200)
.extra(100)
*/