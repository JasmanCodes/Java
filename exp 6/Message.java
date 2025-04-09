final class Logger {
    void logmessage(String message){
        System.out.println("Log: "+ message);
    }
}

class ExtendedLogger extends Logger{
    void logmessage(String message){
        System.out.println("Extended Log: "+ message);
    }
}

public class Message{
    public static void main(String[] args) {
        Logger logger = new Logger();

        logger.logmessage("This is a log entry");
    }
}
