import com.cleanroommc.groovyscript.event.LootTablesLoadedEvent
import net.minecraft.world.storage.loot.LootContext

event_manager.listen { LootTablesLoadedEvent event ->
    patchDesertPyramidLT(event)
    //event.loot.printTables()
    //event.loot.printPools()
    //event.loot.printEntries()
}

def patchDesertPyramidLT(event) {
    event.loot.getTable('minecraft:chests/desert_pyramid').getPool('main').addEntry(
        event.loot.entryBuilder()
            .name('atum:scarab')
            .item(item('atum:scarab'))
            .weight(75)
            .quality(1)
            .build()
    )
}