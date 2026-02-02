import static postInit.GlobalItems.*
import mods.jei.ingredient
import mods.thermal.crucible

mods.jei.ingredient.removeAndHide(fluid('titanium_molten'))

mods.thermal.crucible.removeByOutput(fluid('titanium_molten'))