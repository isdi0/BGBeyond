import mods.advancedrocketry.chemicalreactor

// Rocket fuel from O2 and H2
def rocketFuel = mods.advancedrocketry.chemicalreactor.recipeBuilder()

// Inputs
rocketFuel.fluidInput(fluid('oxygen') * 10)
rocketFuel.fluidInput(fluid('hydrogen') * 10)

// Output
rocketFuel.fluidOutput(fluid('rocketfuel') * 20)

// Power & Time
rocketFuel.power(10)
rocketFuel.time(100)

rocketFuel.register()

// CO2 cartridge recycling
def scrubberRecycle = mods.advancedrocketry.chemicalreactor.recipeBuilder()

// Input
scrubberRecycle.input(item('advancedrocketry:carbonscrubbercartridge', 32766))

// Outputs
scrubberRecycle.output(item('advancedrocketry:carbonscrubbercartridge'))
scrubberRecycle.output(item('minecraft:coal'))

// Power & Time
scrubberRecycle.power(20)
scrubberRecycle.time(40)

scrubberRecycle.register()

// Bone meal from bones
def boneMeal = mods.advancedrocketry.chemicalreactor.recipeBuilder()

// Inputs
boneMeal.input(item('minecraft:bone'))
boneMeal.fluidInput(fluid('nitrogen') * 10)

// Output
boneMeal.output(item('minecraft:dye', 15) * 8)

boneMeal.power(20)
boneMeal.time(100)

boneMeal.register()