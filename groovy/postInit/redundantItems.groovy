import static postInit.GlobalItems.*
import mods.jei.ingredient
import mods.thermal.crucible

def redundantIngredients = [
    fluid('titanium_molten'),
    fluid('fuelcolumn'),
    item('mcjtylib_ng:multipart'),
    item('omlib:fake_sword'),
    item('omlib:network_cable'),
    item('omlib:debug_tool'),
    item('rftools:invisible_shield_block'),
    item('rftools:notick_invisible_shield_block'),
    item('rftools:invisible_shield_block_opaque'),
    item('rftools:notick_invisible_shield_block_opaque'),
    item('rftools:solid_shield_block'),
    item('rftools:notick_solid_shield_block'),
    item('rftools:camo_shield_block'),
    item('rftools:notick_camo_shield_block'),
    item('rftools:solid_shield_block_opaque'),
    item('rftools:notick_solid_shield_block_opaque'),
    item('rftools:camo_shield_block_opaque'),
    item('rftools:notick_camo_shield_block_opaque'),
    item('doubleslabs:vertical_slab').withNbt(['item': ['id': 'blockcraftery':'editable_slab', 'Count': 1 'as' 'byte', 'Damage': 0 'as' 'short']]),
    item('doubleslabs:vertical_slab').withNbt(['item': ['id': 'blockcraftery':'editable_slab_reinforced', 'Count': 1 'as' 'byte', 'Damage': 0 'as' 'short']]),
    item('doubleslabs:vertical_slab').withNbt(['item': []]),
    item('omlib:multi_tool'),
    item('zerocore:debugtool')
    item('libvulpes:productingot', 3),
    item('libvulpes:productdust', 3),
    item('libvulpes:productnugget', 3)
]

crafting.removeByOutput(item('atum:scarab'))

mods.thermal.crucible.removeByOutput(fluid('titanium_molten'))

for (ingredient in redundantIngredients) {
    mods.jei.ingredient.removeAndHide(ingredient)
}