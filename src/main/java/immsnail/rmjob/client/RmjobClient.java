package immsnail.rmjob.client;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The main client class for RMJob, this class handles mod startup for
 * client-side resources.
 */
@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class RmjobClient implements ClientModInitializer {

    /**
     * This logger is used to write text to the console and the log file.
     * It is considered best practice to use your mod id as the logger's name.
     * That way, it's clear which mod wrote info, warnings, and errors.
     */
    public static final Logger LOGGER = LoggerFactory.getLogger("RMJob");

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
