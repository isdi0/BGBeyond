#loader contenttweaker
#modloaded tconstruct
#modloaded bgbeyond

// Titanium Aluminide color - 0xaec2de
// Titanium-Iridium alloy color - 0xd7dfe4

// create titanium as a TiCon material
val titanium = mods.contenttweaker.tconstruct.MaterialBuilder.create("titanium");
val nuggetTitanium = <libvulpes:productnugget:7>;
val stickTitanium = <libvulpes:productrod:7>;
val ingotTitanium = <libvulpes:productingot:7>;
val ingotTitaniumOre = <ore:ingotTitanium>;
val oreRutile = <libvulpes:ore0:8>;
val dustTitanium = <libvulpes:productdust:7>;
val plateTitanium = <libvulpes:productplate:7>;
val sheetTitanium = <libvulpes:productsheet:7>;
val gearTitanium = <libvulpes:productgear:7>;
val coilTitanium = <libvulpes:coil0:7>;
val blockTitanium = <libvulpes:metal0:7>;

// set titanium properties
titanium.color = 0xccc8fa;
titanium.liquid = <liquid:titanium>;
titanium.castable = true;
titanium.craftable = false;
titanium.representativeItem = ingotTitanium;
titanium.representativeOre = ingotTitaniumOre;

// add titanium items
titanium.addItem(ingotTitanium);
titanium.addItem(nuggetTitanium, 9);
titanium.addItem(stickTitanium, 2);
titanium.addItem(dustTitanium);
titanium.addItem(plateTitanium);
titanium.addItem(sheetTitanium);
titanium.addItem(gearTitanium, 1, 576);
titanium.addItem(coilTitanium, 1, 1152);
titanium.addItem(blockTitanium, 1, 1296);

// add titanium traits
titanium.addMaterialTrait("lightweight", null);
titanium.addMaterialTrait("established", "extra");

// add titanium stats
titanium.addHeadMaterialStats(600, 8, 5, 3);
titanium.addHandleMaterialStats(0.95, 200);
titanium.addExtraMaterialStats(100);
titanium.addBowMaterialStats(1.5, 9, 2);

// add titanium localization
titanium.itemLocalizer = function(thisMaterial, itemName){return "Titanium " + itemName;};
titanium.localizedName = "Titanium";

// register titanium
titanium.register();