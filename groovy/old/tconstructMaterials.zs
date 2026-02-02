#norun
#loader contenttweaker
#modloaded tconstruct moartinkers

// Titanium Aluminide color - 0xaec2de
// Titanium-Iridium alloy color - 0xd7dfe4

// edit MoarTinkers titanium
val titanium = mods.contenttweaker.tconstruct.MaterialBuilder.create("titanium_bg");

// set titanium properties
titanium.color = 0xccc8fa;

// add titanium traits
titanium.addMaterialTrait("lightweight", null);
titanium.addMaterialTrait("established", "extra");

// remove titanium stats
titanium.removeHeadMaterialStats();
titanium.removeHandleMaterialStats();
titanium.removeExtraMaterialStats();
titanium.removeBowMaterialStats();
titanium.removeBowStringMaterialStats();
titanium.removeArrowShaftMaterialStats();
titanium.removeFletchingMaterialStats();
titanium.removeProjectileMaterialStats();
// add titanium stats
titanium.addHeadMaterialStats(600, 8, 5, 3);
titanium.addHandleMaterialStats(0.95, 200);
titanium.addExtraMaterialStats(100);
titanium.addBowMaterialStats(1.5, 9, 2);

titanium.register();