

public class Logger implements ILogger {
    // Private static instance
    private static volatile Logger instance = null;

    // Private constructor
    private Logger() {
        System.out.println("Logger Initialized");
    }

    // Thread-safe, lazy-loaded Singleton instance
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // Implementing ILogger
    @Override
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
