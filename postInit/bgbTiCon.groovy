//NO_RUN
import static postInit.GlobalItems.*
import static postInit.TiConMatBuilder.*

/*
    Titanium Stats
    Color - 0xCCC8FA

    Head
    Durability - 600
    Mining Speed - 8
    Attack - 5
    Harvest Level - Obsidian (3)
    Trait - Lightweight

    Handle
    Modifier - 0.95f
    Durability - 175
    Trait - Lightweight

    Extra
    Durability - 50
    Trait - Well-Established

    Bow
    Draw Speed - 1.5
    Range - 3
    Bonus Damage - 9.5
*/
createMaterial('titanium', 0xCCC8FA) {
    // Basic info
    castable()
    setFluid(fluid('titanium_molten'))
    addItem(item('libvulpes:productingot:7'))

    // Stats
    addHeadStats(600, 8f, 5f, 3)
    addHandleStats(0.95f, 175)
    addExtraStats(50)
    addBowStats(1.5f, 3f, 9.5f)

    // Traits
    addTrait('lightweight', null)
    addTrait('established', 'extra')
}

/*
    Titanium Aluminide Stats
    Color - 0xAEC2DE

    Head
    Durability - 
    Mining Speed - 
    Attack - 
    Harvest Level - 
    Trait - 

    Handle
    Modifier - 
    Durability - 
    Trait - 

    Extra
    Durability - 
    Trait - 

    Bow
    Draw Speed - 
    Range -
    Bonus Damage - 
*/

/*
    Titanium-Iridium Alloy Stats
    Color - 0xD7DFE4

    Head
    Durability - 
    Mining Speed - 
    Attack - 
    Harvest Level - 
    Trait - 

    Handle
    Modifier - 
    Durability - 
    Trait - 

    Extra
    Durability - 
    Trait - 

    Bow
    Draw Speed - 
    Range - 
    Bonus Damage - 
*/