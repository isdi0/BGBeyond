import slimeknights.tconstruct.library.TinkerRegistry
import slimeknights.tconstruct.library.materials.*
import slimeknights.tconstruct.library.traits.ITrait
import slimeknights.tconstruct.library.utils.HarvestLevels

public class TiConMaterialBuilder {
    private final Material material
    private boolean built = false

    TiConMaterialBuilder(String identifier, int color) {
        this.material = new Material(identifier, color)
    }

    /*
    @param durability     How long the tool lasts
    @param miningSpeed    How fast it mines
    @param attack         Base attack damage
    @param harvestLevel   0=Stone, 1=Iron, 2=Diamond, 3=Obsidian, 4=Cobalt
    */
    public TiConMaterialBuilder head(int durability, float miningSpeed, float attack, int harvestLevel) {
        TinkerRegistry.addMaterialStats(material, new HeadMaterialStats(durability, miningSpeed, attack, harvestLevel))
        return this
    }

    /*
    @param modifier      Durability multiplier
    @param durability    Flat durability addition
    */
    public TiConMaterialBuilder handle(float modifier, int durability) {
        TinkerRegistry.addMaterialStats(material, new HandleMaterialStats(modifier, durability))
        return this
    }

    /*
    @param durability  Flat durability addition
    */
    public TiConMaterialBuilder extra(int durability) {
        TinkerRegistry.addMaterialStats(material, new ExtraMaterialStats(durability))
        return this
    }

    /*
    @param drawSpeed   How much time the bow takes to draw
    @param range       Range multiplier
    @param bonusDamage Extra damage
    */
    public TiConMaterialBuilder bow(float drawSpeed, float range, float bonusDamage) {
        TinkerRegistry.addMaterialStats(material, new BowMaterialStats(drawSpeed, range, bonusDamage)) 
        return this
    }

    // --- Traits & Items ---
    /*
    Adds a trait to the material.
    @param traitName    The identifier string of the trait
    @param dependency   Part dependency ("head", "handle", "extra", "bow", or null for all)
    */
    public TiConMaterialBuilder addTrait(String traitName, String dependency) {
        ITrait trait = TinkerRegistry.getTrait(traitName)
        if (trait != null) {
            material.addTrait(trait, dependency)
        }
        else {
            println('[TiConBuilder] Warning: Trait ' + traitName + 'not found for material ' + material.getIdentifier())
        }
        return this
    }

    public TiConMaterialBuilder addTrait(String traitName) {
        return addTrait(traitName, null)
    }

    /*
    Sets the item used to repair/build this material.
    @param stack    The item stack
    */
    public TiConMaterialBuilder item(def stack) {
        material.addItem(stack)
        material.setRepresentativeItem(stack)
        return this
    }

    /*
    Links a fluid to the material
    @param fluid    The fluid object
    */
    public TiConMaterialBuilder fluid(def fluid) {
        material.setFluid(fluid)
        return this
    }

    // Explicit build method. Optional, since stats are added immediately, but useful for performing validation.
    public Material build() {
        this.built = true
        return this.material
    }
}