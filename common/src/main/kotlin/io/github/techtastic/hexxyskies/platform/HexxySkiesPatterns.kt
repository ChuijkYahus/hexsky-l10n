package io.github.techtastic.hexxyskies.platform

import at.petrak.hexcasting.api.casting.ActionRegistryEntry
import dev.architectury.injectables.annotations.ExpectPlatform
import kotlin.reflect.KFunction0

object HexxySkiesPatterns {
    @JvmStatic
    @ExpectPlatform
    fun register(name: String, actionSupplier: KFunction0<ActionRegistryEntry>) : KFunction0<ActionRegistryEntry> {
        throw AssertionError()
    }
}