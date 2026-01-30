//NO_RUN
import slimeknights.tconstruct.library.TinkerRegistry
import slimeknights.tconstruct.library.materials.*
import slimeknights.tconstruct.library.traits.ITrait

class TiConMatBuilder {
    String identifier
    int color
    Material material
    boolean isCraftable
    boolean isCastable

    // Constructor
    TiConMatBuilder(String id, int col) {
        this.identifier = id
        this.color = col
        // Create the raw TiC material
        this.material = new Material(id, col)
    }

    // --- Configuration Methods ---

    def craftable() {
        this.isCraftable = true
        return this
    }

    def castable() {
        this.isCastable = true
        return this
    }

    // Link an item for the Part Builder
    def addItem(def item, int value = 144) {
        material.addItem(item, 1, value)
        return this
    }

    // Link a fluid for Casting
    def setFluid(def fluid) {
        material.setFluid(fluid)
        return this
    }

    // --- Stats Builders ---

    // Head: Durability, Mining Speed, Attack, Mining Level
    def addHeadStats(int durability, float speed, float attack, int harvestLevel) {
        TinkerRegistry.addMaterialStats(material, new HeadMaterialStats(durability, speed, attack, harvestLevel))
        return this
    }

    // Handle: Durability Multiplier, Flat durability boost (or loss)
    def addHandleStats(float modifier, int durability) {
        TinkerRegistry.addMaterialStats(material, new HandleMaterialStats(modifier, durability))
        return this
    }

    // Extra: Extra Durability
    def addExtraStats(int extraDurability) {
        TinkerRegistry.addMaterialStats(material, new ExtraMaterialStats(extraDurability))
        return this
    }

    // Bow: Draw Speed, Range, Bonus Damage
    def addBowStats(float drawSpeed, float range, float bonusDamage) {
        TinkerRegistry.addMaterialStats(material, new BowMaterialStats(drawSpeed, range, bonusDamage))
        return this
    }

    // --- Traits ---

    def addTrait(String traitIdentifier, String dependency = null) { // dependencies: "head", "handle", "extra", "bow" (null = all parts)
        ITrait trait = TinkerRegistry.getTrait(traitIdentifier) 
        if (trait != null) {
            material.addTrait(trait, dependency)
        }
        else {
            println('Warning: Trait \'${traitIdentifiier}\' not found for material \'${identifier}\'')
        }
        return this
    }

    // Finalize registration
    def build() {
        println('Registered TiC Material: ' + identifier)
    }
}

// Helper closure to make the syntax cleaner
def createMaterial(String id, int color, Closure body) {
    def builder = new TiConMatBuilder(id, color)
    body.delegate = builder
    body()
    builder.build()
}