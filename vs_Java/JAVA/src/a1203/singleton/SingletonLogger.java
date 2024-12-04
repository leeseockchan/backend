package a1203.singleton;

public class SingletonLogger {
    // 생성자를 private로 선언하여 외부에서 새로운 인스턴스 생성 금지
    // 클래스 내부의 유일한 인스턴스 'private static'
    private static SingletonLogger instance;

    // 기본 생성자
    private SingletonLogger() {

    }

    public static SingletonLogger getInstance() {
        if (instance == null) { // 아직 객체가 생성되지 않았다면
            synchronized (SingletonLogger.class) {
                if (instance == null) {
                    instance = new SingletonLogger();
                    // 객체가 없으면 하나 생성
                }
            
            }
        }
        return instance;
    }

    public void logo(String message){
        System.out.println("Logo : "+message);
    }

    public void log(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'log'");
    }
    

}
