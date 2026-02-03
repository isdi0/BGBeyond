import slimeknights.mantle.util.RecipeMatchRegistry
import slimeknights.tconstruct.library.TinkerRegistry
import slimeknights.tconstruct.library.materials.*
import slimeknights.tconstruct.library.MaterialIntegration

// Define the material
def material = TinkerRegistry.getMaterial('titanium')

// Add items
material.addCommonItems('Titanium')
material.addItem('dustTitanium')
material.addItem('plateTitanium')
material.addItem('sheetTitanium')
material.addItem('gearTitanium', 1, 576)
material.addItem('coilTitanium', 1, 1152)

// Set the fluid
material.setFluid(fluid('titanium').getFluid())

// Add traits
material.addTrait(TinkerRegistry.getTrait("lightweight"), "head")
material.addTrait(TinkerRegistry.getTrait("lightweight"), "handle")
material.addTrait(TinkerRegistry.getTrait("established"), "extra")