public class Logger {

    // Create a single object of Logger
    private static Logger instance;

    // Private constructor
    private Logger() {
        System.out.println("Logger object created.");
    }

    // Method to return the same object every time
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to display log messages
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}