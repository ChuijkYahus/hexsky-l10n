package io.github.techtastic.hexxyskies.platform.forge

import at.petrak.hexcasting.api.casting.iota.IotaType
import at.petrak.hexcasting.common.lib.HexRegistries
import io.github.techtastic.hexxyskies.HexxySkies
import net.minecraftforge.eventbus.api.IEventBus
import net.minecraftforge.registries.DeferredRegister
import kotlin.reflect.KFunction0

object HexxySkiesIotaTypesImpl {
    private val IOTA_TYPES = DeferredRegister.create(HexRegistries.IOTA_TYPE, HexxySkies.MOD_ID)

    @JvmStatic
    fun register(name: String, supplier: KFunction0<IotaType<*>>) : KFunction0<IotaType<*>> {
        return IOTA_TYPES.register(name, supplier)::get
    }

    fun register(bus: IEventBus) {
        IOTA_TYPES.register(bus)
    }
}