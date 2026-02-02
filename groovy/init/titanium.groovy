import slimeknights.mantle.util.RecipeMatchRegistry
import slimeknights.tconstruct.library.TinkerRegistry
import slimeknights.tconstruct.library.materials.*
import slimeknights.tconstruct.library.MaterialIntegration

// Define new material
def material = new Material('titanium', 0xccc8fa)
material.setCraftable(false)
material.setCastable(true)

// Add to registry
TinkerRegistry.addMaterial(material)

// Add items
material.addCommonItems('Titanium')
material.addItem('dustTitanium')
material.addItem('plateTitanium')
material.addItem('sheetTitanium')
material.addItem('gearTitanium', 1, 576)
material.addItem('coilTitanium', 1, 1152)

// Set the fluid
material.setFluid(fluid('titanium').getFluid())

// Set the stats
// head
material.addStats(new HeadMaterialStats(600, 8.0f, 5.0f, 3))

// handle
material.addStats(new HandleMaterialStats(0.95f, 200))

// extra
material.addStats(new ExtraMaterialStats(100))

// Add traits
material.addTrait(TinkerRegistry.getTrait("lightweight"), "head")
material.addTrait(TinkerRegistry.getTrait("lightweight"), "handle")
material.addTrait(TinkerRegistry.getTrait("established"), "extra")

// Integrate the new material
integration = new MaterialIntegration(material)
integration.integrate()
integration.registerRenderInfo()