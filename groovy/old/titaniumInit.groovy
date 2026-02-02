// no_run
import slimeknights.tconstruct.library.TinkerRegistry
import slimeknights.tconstruct.library.materials.Material

def mat = TinkerRegistry.getMaterial("titanium_bg")
if (mat == Material.UNKNOWN) {
    throw new RuntimeException("Material titanium_bg not found during init")
}

mat.init()