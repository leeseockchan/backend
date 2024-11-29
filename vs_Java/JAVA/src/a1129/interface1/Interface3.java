package a1129.interface1;

interface Flyable{
    void fly();
    default void land(){
        System.out.println("천천히 착륙한다.");
    }
}
class Bird implements Flyable{

    @Override
    public void fly() {
    System.out.println("새가 하늘을 난다.");        
    }

}
public class Interface3 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird.land();
        // default 메소드는
        // 인터페이스 구현 코드에 포함 할 수 있음
        // 이를 구현한 클래스는 필요에 따라 오버라이드 할수 있음
        // 주로 기존 인터페이스에 새 기능을 추가 할때 사용
    }
}
