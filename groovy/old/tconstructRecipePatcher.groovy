//NO_RUN
import static postInit.GlobalItems.*
import mods.ticon.melting
import slimeknights.tconstruct.library.smeltery.MeltingRecipe
import slimeknights.tconstruct.library.smeltery.CastingRecipe

// Map OreDict names to their fluid values (mB)
def titaniumAmountsMelt = [
    'nuggetTitanium': 16,
    'stickTitanium': 72,
    'ingotTitanium': 144,
    'dustTitanium': 144,
    'plateTitanium': 144,
    'sheetTitanium': 144,
    'oreTitanium': 144,
    'gearTitanium': 576,
    'coilTitanium': 1152,
    'blockTitanium': 1296
]

for (entry in titaniumAmountsMelt) {
    def oreName = entry.key
    def mbAmount = entry.value

    // Define molten titanium
    def titaniumMolten = fluid('titanium')
    
    // Get all items matching this OreDict entry
    def items = oredict.getItems(oreName).get(0)
    
    for (itemStack in items) {
        // Calculate temperature based on the fluid temperature and the 'standard' unit (144mB)
        def titaniumTime = MeltingRecipe.calcTemperature(titaniumMolten.getFluid().getTemperature(), mbAmount)
        
        // Add the recipe: itemStack -> fluid * mB amount
        mods.ticon.melting.add(itemStack, titaniumMolten * mbAmount, titaniumTime)
    }
}

def titaniumAmountsTable = [
    'nuggetTitanium': 16,
    'ingotTitanium': 144,
    'plateTitanium': 144,
    'gearTitanium': 576,
]

def titaniumCasts = [
    'nuggetTitanium': item('tconstruct:cast_custom', 1),
    'ingotTitanium': item('tconstruct:cast_custom'),
    'plateTitanium': item('tconstruct:cast_custom', 3),
    'gearTitanium': item('tconstruct:cast_custom', 4)
]

for (entry in titaniumAmountsTable) {
    def oreName = entry.key
    def mbAmount = entry.value

    // Define molten titanium
    def titaniumMolten = fluid('titanium')
    
    // Get all items matching this OreDict entry, pick the first one
    def itemStack = oredict.getItems(oreName).get(0)

    // Get corresponding cast
    def cast = titaniumCasts[oreName]

    CastingRecipe(itemStack, cast, titaniumMolten, mbAmount)
}

def titaniumMolten = fluid('titanium')

CastingRecipe(blockTitanium, null, titaniumMolten, 1296)