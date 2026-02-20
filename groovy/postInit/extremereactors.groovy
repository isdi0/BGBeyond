import erogenousbeef.bigreactors.api.data.ReactorReaction
import erogenousbeef.bigreactors.api.registry.Reactants

// Register pyrotheum reactants
Reactants.registerReactant('pyrotheum_fuel', 0, 0xeaeab6)
Reactants.registerReactant('pyrotheum_waste', 1, 0x262626)

// Add oredict items to reactants
Reactants.registerSolid(item('thermalfoundation:material', 1024), 'pyrotheum_fuel')
Reactants.registerSolid(item('bgbeyond:pyrotheum_slag'), 'pyrotheum_waste')