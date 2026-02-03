import slimeknights.tconstruct.library.materials.*
import slimeknights.tconstruct.library.TinkerRegistry
import slimeknights.tconstruct.library.MaterialIntegration

// Define new material
def material = new Material('titanium', 0xCCC8FA)
material.setCraftable(false)
material.setCastable(true)

// Add to registry
TinkerRegistry.addMaterial(material)

// Set the stats
// head
material.addStats(new HeadMaterialStats(600, 8.0f, 5.0f, 3))

// handle
material.addStats(new HandleMaterialStats(0.95f, 200))

// extra
material.addStats(new ExtraMaterialStats(100))

// Integrate the new material
integration = new MaterialIntegration(material, fluid('titanium').getFluid(), 'Titanium')
integration.integrate()