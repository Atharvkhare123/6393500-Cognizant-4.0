
public class Main {
    public static void main(String[] args) {
        
        ILogger logger1 = LoggerFactory.createLogger();
        logger1.log("This is the first log.");

        ILogger logger2 = LoggerFactory.createLogger();
        logger2.log("This is the second log.");

        System.out.println("Same instance: " + (logger1 == logger2)); 
    }
}
