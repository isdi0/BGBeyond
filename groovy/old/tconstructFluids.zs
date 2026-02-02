#norun
#loader contenttweaker

val titanium = mods.contenttweaker.VanillaFactory.createFluid("titanium", 0xccc8fa);

// set general properties
titanium.density = 4500;
titanium.luminosity = 10;
titanium.temperature = 776;
titanium.viscosity = 10000;
// set textures
titanium.stillLocation = "tconstruct:blocks/fluids/molten_metal";
titanium.flowingLocation = "tconstruct:blocks/fluids/molten_metal_flow";
// set sounds
titanium.fillSound = <soundevent:item.bucket.fill_lava>;
titanium.emptySound = <soundevent:item.bucket.empty_lava>;
// set material
titanium.material = <blockmaterial:lava>;

titanium.register();