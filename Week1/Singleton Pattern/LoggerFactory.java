

public class LoggerFactory {
    // This provides the dependency from abstraction, not direct class
    public static ILogger createLogger() {
        return Logger.getInstance();
    }
}
