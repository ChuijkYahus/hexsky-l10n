package io.github.techtastic.hexxyskies.platform.fabric

import at.petrak.hexcasting.api.casting.ActionRegistryEntry
import at.petrak.hexcasting.common.lib.HexRegistries
import dev.architectury.registry.registries.DeferredRegister
import io.github.techtastic.hexxyskies.HexxySkies
import kotlin.reflect.KFunction0

object HexxySkiesPatternsImpl {
    private val ACTIONS = DeferredRegister.create(HexxySkies.MOD_ID, HexRegistries.ACTION)

    @JvmStatic
    fun register(name: String, actionSupplier: KFunction0<ActionRegistryEntry>) : KFunction0<ActionRegistryEntry> {
        return ACTIONS.register(name, actionSupplier)::get
    }

    fun register() {
        ACTIONS.register()
    }
}