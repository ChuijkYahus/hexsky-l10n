package io.github.techtastic.hexxyskies.forge.client

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent
import io.github.techtastic.hexxyskies.client.HexxySkiesClient

object HexxySkiesForgeClient {
    @JvmStatic
    fun clientInit(event: FMLClientSetupEvent) {
        // Put anything initialized on forge-side client here.
        HexxySkiesClient.initClient()
    }
}
