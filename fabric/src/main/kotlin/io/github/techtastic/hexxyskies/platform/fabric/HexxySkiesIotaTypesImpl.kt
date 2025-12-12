package io.github.techtastic.hexxyskies.platform.fabric

import at.petrak.hexcasting.api.casting.iota.IotaType
import at.petrak.hexcasting.common.lib.HexRegistries
import dev.architectury.registry.registries.DeferredRegister
import io.github.techtastic.hexxyskies.HexxySkies
import kotlin.reflect.KFunction0

object HexxySkiesIotaTypesImpl {
    private val IOTA_TYPES = DeferredRegister.create(HexxySkies.MOD_ID, HexRegistries.IOTA_TYPE)

    @JvmStatic
    fun register(name: String, supplier: KFunction0<IotaType<*>>) : KFunction0<IotaType<*>> {
        return IOTA_TYPES.register(name, supplier)::get
    }

    fun register() {
        IOTA_TYPES.register()
    }
}