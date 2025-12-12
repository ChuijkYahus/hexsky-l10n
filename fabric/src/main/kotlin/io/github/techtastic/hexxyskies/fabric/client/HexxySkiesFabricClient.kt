package io.github.techtastic.hexxyskies.fabric.client

import net.fabricmc.api.ClientModInitializer
import io.github.techtastic.hexxyskies.client.HexxySkiesClient

/**
 * The fabric-side client initializer for the mod. Used for fabric-platform-specific code that runs on the client exclusively.
 */
class HexxySkiesFabricClient : ClientModInitializer {
    override fun onInitializeClient() {
        // Put anything initialized on fabric-side client here.
        HexxySkiesClient.initClient()
    }
}
