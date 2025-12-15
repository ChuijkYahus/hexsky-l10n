package io.github.techtastic.hexxyskies.platform.forge

import at.petrak.hexcasting.api.casting.ActionRegistryEntry
import at.petrak.hexcasting.api.casting.iota.IotaType
import at.petrak.hexcasting.xplat.IXplatAbstractions
import io.github.techtastic.hexxyskies.HexxySkies
import net.minecraft.core.Registry
import net.minecraft.resources.ResourceKey
import net.minecraftforge.eventbus.api.IEventBus
import net.minecraftforge.registries.DeferredRegister

object RegistryUtilsImpl {
    private val IOTA_TYPES = DeferredRegister.create(IXplatAbstractions.INSTANCE.iotaTypeRegistry.key() as ResourceKey<Registry<IotaType<*>>>, HexxySkies.MOD_ID)
    private val ACTIONS = DeferredRegister.create(IXplatAbstractions.INSTANCE.actionRegistry.key() as ResourceKey<Registry<ActionRegistryEntry>>, HexxySkies.MOD_ID)

    @JvmStatic
    fun registerIota(name: String, supplier: Function0<IotaType<*>>) : Function0<IotaType<*>> {
        return IOTA_TYPES.register(name, supplier)::get
    }

    @JvmStatic
    fun registerPattern(name: String, actionSupplier: Function0<ActionRegistryEntry>) : Function0<ActionRegistryEntry> {
        return ACTIONS.register(name, actionSupplier)::get
    }

    fun register(bus: IEventBus) {
        IOTA_TYPES.register(bus)
        ACTIONS.register(bus)
    }
}