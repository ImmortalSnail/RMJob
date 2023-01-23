package immsnail.rmjob.client;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.biome.Biome;

import static immsnail.rmjob.client.Events.onBiomeChange;
import static immsnail.rmjob.client.Events.onPlayerMove;

/**
 * This class detects events.
 * The class runs logic detecting when events occur,
 * then calls the relevant event in the Events class
 */
public class Hooks {

    /**
     * Scoped variable for position comparison.
     * The variable is scoped so that it will persist between method calls.
     */
    static Vec3d oldPosition;
    /**
     * Scoped variable for biome comparison. The variable is scoped so that it will persist between method calls.
     */
    static RegistryEntry<Biome> oldBiome;

    /**
     * This registers all the active hooks
     */
    static void register() {
        ClientTickEvents.START_CLIENT_TICK.register(Hooks::onStartTick);
    }

    /**
     * Runs every tick to detect changes to then call the relevant Event.
     * Calls the following:
     * onPlayerMove(), and onBiomeChange()
     *
     * @param client the minecraft client
     */
    static void onStartTick(MinecraftClient client) {
        if (client.player == null) {
            return;
        }
        ClientPlayerEntity player = client.player;
        {
            // Detects if player has moved
            Vec3d position = player.getPos();
            if (position != oldPosition) {
                oldPosition = position;
                onPlayerMove(client);
            }
        }
        {
            // Detects if player has moved to a new biome
            Vec3d position = player.getPos();
            RegistryEntry<Biome> biome =
                    player.getWorld().getBiome(new BlockPos(position));
            if (biome != oldBiome) {
                oldBiome = biome;
                onBiomeChange(client);
            }
        }
    }

}
