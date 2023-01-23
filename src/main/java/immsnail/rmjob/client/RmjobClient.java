package immsnail.rmjob.client;

import net.fabricmc.api.ClientModInitializer;

/**
 * The main client class for RMJob, this class handles mod startup for
 * client-side resources.
 */
@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class RmjobClient implements ClientModInitializer {

    /**
     * This code runs as soon as Minecraft is in a mod-load-ready state.
     * However, some things (like resources) may still be uninitialized.
     * Proceed with mild caution.
     */
    @Override
    public void onInitializeClient() {
        Hooks.register();
    }
}
