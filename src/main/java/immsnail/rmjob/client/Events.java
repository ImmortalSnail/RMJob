package immsnail.rmjob.client;

import net.minecraft.client.MinecraftClient;

/**
 * This class handles all events.
 * The events are called from hooks which check for these events occurring
 */
public class Events {

    /**
     * This event is run every tick that the player is in a new position.
     * Indicating that the player is currently moving.
     *
     * @param client the minecraft client passed from the hook.
     */
    public static void onPlayerMove(MinecraftClient client) {
    }

    /**
     * This event is run every tick that the player is in a new biome.
     *
     * @param client the minecraft client passed from the hook.
     */
    public static void onBiomeChange(MinecraftClient client) {
    }

}
