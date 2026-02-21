import erogenousbeef.bigreactors.api.registry.ReactorConversions
import erogenousbeef.bigreactors.api.registry.Reactants

// Register pyrotheum reactants
Reactants.registerReactant('pyrotheum_fuel', 0, 0xf6e4bd)
Reactants.registerReactant('pyrotheum_waste', 1, 0x262626)

// Add oredict items to reactants
Reactants.registerSolid(item('thermalfoundation:material', 1024), 'pyrotheum_fuel', 500)
Reactants.registerSolid(item('bgbeyond:pyrotheum_slag'), 'pyrotheum_waste', 500)

ReactorConversions.register('pyrotheum_fuel', 'pyrotheum_waste', 1.4f, 1f)