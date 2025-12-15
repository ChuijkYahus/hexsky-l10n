package io.github.techtastic.hexxyskies.platform.fabric

import at.petrak.hexcasting.api.casting.ActionRegistryEntry
import at.petrak.hexcasting.api.casting.iota.IotaType
import at.petrak.hexcasting.xplat.IXplatAbstractions
import dev.architectury.registry.registries.DeferredRegister
import io.github.techtastic.hexxyskies.HexxySkies
import net.minecraft.core.Registry
import net.minecraft.resources.ResourceKey

object RegistryUtilsImpl {
    private val IOTA_TYPES = DeferredRegister.create(HexxySkies.MOD_ID, IXplatAbstractions.INSTANCE.iotaTypeRegistry.key() as ResourceKey<Registry<IotaType<*>>>)
    private val ACTIONS = DeferredRegister.create(HexxySkies.MOD_ID, IXplatAbstractions.INSTANCE.actionRegistry.key() as ResourceKey<Registry<ActionRegistryEntry>>)

    @JvmStatic
    fun registerIota(name: String, supplier: Function0<IotaType<*>>) : Function0<IotaType<*>> {
        return IOTA_TYPES.register(name, supplier)::get
    }

    @JvmStatic
    fun registerPattern(name: String, actionSupplier: Function0<ActionRegistryEntry>) : Function0<ActionRegistryEntry> {
        return ACTIONS.register(name, actionSupplier)::get
    }

    fun register() {
        IOTA_TYPES.register()
        ACTIONS.register()
    }
}