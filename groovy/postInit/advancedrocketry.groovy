// Rocket fuel from O2 and H2
def rocketFuel = mods.advancedrocketry.chemicalreactor.recipeBuilder()

// Inputs
rocketFuel.fluidInput(fluid('oxygen') * 10)
rocketFuel.fluidInput(fluid('hydrogen') * 10)

// Output
rocketFuel.fluidOutput(fluid('rocketfuel') * 20)

// Power & time
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

// Power & time
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

// Power & time
boneMeal.power(20)
boneMeal.time(100)

boneMeal.register()

// Silicon Boules from Silicon
def siliconBoule = mods.advancedrocketry.crystallizer.recipeBuilder()

// Input
siliconBoule.input(item('appliedenergistics2:material', 5))

// Output
siliconBoule.output(item('libvulpes:productboule', 3))

// Power & time
siliconBoule.power(20)
siliconBoule.time(300)

siliconBoule.register()


// == AE2 CRYSTALS ==

def fluix = item('appliedenergistics2:material', 7) | item('appliedenergistics2:material', 12)

// CERTUS
def certusQuartz = mods.advancedrocketry.crystallizer.recipeBuilder()
// Item variables
certusSeed = item('appliedenergistics2:crystal_seed').withNbt(['progress': 600])
certusPure = item('appliedenergistics2:material', 10)

// Inputs
certusQuartz.input(fluix)
certusQuartz.input(certusSeed * 3)

certusQuartz.fluidInput(fluid('water') * 1000)

// Output
certusQuartz.output(certusPure * 3)

// Power & time
certusQuartz.power(75)
certusQuartz.time(1200)

certusQuartz.register()

// NETHER
def netherQuartz = mods.advancedrocketry.crystallizer.recipeBuilder()
// Item variables
netherSeed = item('appliedenergistics2:crystal_seed', 600).withNbt(['progress': 600])
netherPure = item('appliedenergistics2:material', 11)

// Inputs
netherQuartz.input(fluix)
netherQuartz.input(netherSeed * 3)

netherQuartz.fluidInput(fluid('water') * 250)

// Output
netherQuartz.output(netherPure * 3)

// Power & time
netherQuartz.power(75)
netherQuartz.time(1200)

netherQuartz.register()

// FLUIX
def fluixCrystal = mods.advancedrocketry.crystallizer.recipeBuilder()
// Item variables
fluixSeed = item('appliedenergistics2:crystal_seed', 1200).withNbt(['progress': 1200])
fluixPure = item('appliedenergistics2:material', 12)

// Inputs
fluixCrystal.input(fluixSeed * 3)

fluixCrystal.fluidInput(fluid('water') * 250)

// Output
fluixCrystal.output(fluixPure * 3)

// Power & time
fluixCrystal.power(125)
fluixCrystal.time(1800)

fluixCrystal.register()