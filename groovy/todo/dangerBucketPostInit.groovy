//no_run
import net.minecraftforge.event.entity.player.FillBucketEvent
import net.minecraft.init.SoundEvents
import net.minecraft.util.SoundCategory

eventManager.listen { FillBucketEvent event ->
    def player = event.getEntityPlayer()
    def world = player.world
    def target = event.getTarget()

    if (target == null) return

    def held = player.getHeldItem(event.getHand())
    def itemName = held.getItem().registryName?.toString()

    int threshold = -1

    if (itemName == "minecraft:bucket") {
        threshold = 769        // iron
    }
    else {
        return
    }

    if (itemName != "minecraft:bucket") return

    def block = world.getBlockState(target.getBlockPos()).getBlock()
    def fluid = net.minecraftforge.fluids.FluidRegistry.lookupFluidForBlock(block)
    def fluidTemperature = fluid.getTemperature()

    if (fluid != null && temp >= threshold || (temp > threshold * 0.9 && Math.random() < 0.5)) {
        event.setCanceled(true)

        held.shrink(1)

        world.playSound(
            null,
            player.posX,
            player.posY,
            player.posZ,
            SoundEvents.ENTITY_ITEM_BREAK,
            SoundCategory.PLAYERS,
            1.0f,
            1.0f
        )
    }
}