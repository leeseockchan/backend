package a1203.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonLogger logger = SingletonLogger.getInstance();
        logger.logo("This is a log message");

        SingletonLogger anotherLogger = SingletonLogger.getInstance();
        anotherLogger.logo("This is another log message");

        if(logger == anotherLogger){
            System.out.println("Both logger instances are the same");;
        }
    }
}