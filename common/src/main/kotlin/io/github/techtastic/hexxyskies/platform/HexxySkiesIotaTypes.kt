package io.github.techtastic.hexxyskies.platform

import at.petrak.hexcasting.api.casting.iota.IotaType
import dev.architectury.injectables.annotations.ExpectPlatform
import kotlin.reflect.KFunction0

object HexxySkiesIotaTypes {
    @JvmStatic
    @ExpectPlatform
    fun register(name: String, supplier: KFunction0<IotaType<*>>) : KFunction0<IotaType<*>> {
        throw AssertionError()
    }
}