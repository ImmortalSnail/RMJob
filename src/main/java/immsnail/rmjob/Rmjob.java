package immsnail.rmjob;

import net.fabricmc.api.ModInitializer;

import static immsnail.rmjob.LogHandler.logInfo;

public class Rmjob implements ModInitializer {
    @Override
    public void onInitialize() {
        logInfo("RMJob has started!");
    }
}
