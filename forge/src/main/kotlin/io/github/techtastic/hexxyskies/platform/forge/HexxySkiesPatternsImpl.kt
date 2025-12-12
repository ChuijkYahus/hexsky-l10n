package io.github.techtastic.hexxyskies.platform.forge

import at.petrak.hexcasting.api.casting.ActionRegistryEntry
import at.petrak.hexcasting.common.lib.HexRegistries
import io.github.techtastic.hexxyskies.HexxySkies
import net.minecraftforge.eventbus.api.IEventBus
import net.minecraftforge.registries.DeferredRegister
import kotlin.reflect.KFunction0

object HexxySkiesPatternsImpl {
    private val ACTIONS = DeferredRegister.create(HexRegistries.ACTION, HexxySkies.MOD_ID)

    @JvmStatic
    fun register(name: String, actionSupplier: KFunction0<ActionRegistryEntry>) : KFunction0<ActionRegistryEntry> {
        return ACTIONS.register(name, actionSupplier)::get
    }

    fun register(bus: IEventBus) {
        ACTIONS.register(bus)
    }
}