import slimeknights.tconstruct.library.materials.*
import slimeknights.tconstruct.library.TinkerRegistry

// Define new material
def material = new Material('titanium', 0xCCC8FA)
material.setCraftable(false)
material.setCastable(true)

// Add to registry
TinkerRegistry.addMaterial(material)