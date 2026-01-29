import static postInit.GlobalItems.*
import static postInit.TiConMaterialBuilder.*
import slimeknights.tconstruct.library.fluid.FluidMolten

new TiConMaterialBuilder('titanium', 0xC8C8FF)
.head(600, 8f, 5f, 3) // durability, miningSpeed, attack, harvestLevel
.handle(0.95f, 175) // modifier, durability
.extra(50) // durability
.bow(1.5f, 3f, 9.5) // drawSpeed, range, bonusDamage
.addTrait('lightweight', 'head')
.addTrait('lightweight', 'handle')
.addTrait('established', 'extra')
.item('libvulpes:productingot', 7)
.fluid(fluid('titanium_molten'), 144)
.build()

/* 
new TiConMaterialBuilder('titaniumaluminide', 0xC8C8C8)
.head(400, 8f, 6f, 4)
.handle(1.05f, 200)
.extra(100)
*/