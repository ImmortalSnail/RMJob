package immsnail.rmjob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class handles the creation of a logger and has methods for logging
 * methods of varying degree: info, debug, error, and warn.
 */
@SuppressWarnings("unused")
public class LogHandler {

    /**
     * This logger is used to write text to the console and the log file.
     * It is considered best practice to use your mod id as the logger's name.
     * That way, it's clear which mod wrote info, warnings, and errors.
     */
    public static final Logger LOGGER = LoggerFactory.getLogger("RMJob");

    /**
     * This method is used to log informative messages that provide general
     * information about the application's current state or activity.
     * @param string - the message to be logged
     */
    public static void logInfo(String string) {
        LOGGER.info(string);
    }

    /**
     * This method is used to log debug messages that provide detailed
     * information about the application's inner workings, such as variable
     * values or function calls, for the purpose of troubleshooting and
     * resolving errors.
     * @param string - the message to be logged
     */
    public static void logDebug(String string) {
        LOGGER.debug(string);
    }

    /**
     * This method is used to log error messages that indicate a failure or
     * unexpected behavior in the application, along with information that
     * can help identify and fix the issue.
     * @param string - the message to be logged
     */
    public static void logError(String string) {
        LOGGER.error(string);
    }

    /**
     * This method is used to log warning messages that indicate a potential 
     * problem or situation that requires attention, but does not necessarily 
     * prevent the application from functioning.
     * @param string - the message to be logged
     */
    public static void logWarn(String string) {
        LOGGER.warn(string);
    }

}
