package a1129.interface1;

interface Flyable {
    void fly();
    
    // default void sleep(){
    //     System.out.println("잠을 잔다~");
    // }
    // default 메소드를 사용 할수 있다, 오버라이드도 할수 있다.
    
    // static void sleep(){
    //     System.out.println();
    // }  /* 오버라이드 상속안됨 */
    // 객체를 만들지 않고 Flyable.sleep() 직접 호출이 가능하다.

}

interface Swimmalbe{
    void swim();
}

class Bird implements Flyable{

    @Override
    public void fly() {
    System.out.println("새가 하늘을 날아간다.");        
    }

}
class Fish implements Swimmalbe{

    @Override
    public void swim() {
    System.out.println("물고기가 수영을 한다.");        
    }

}

// 인터페이스는 다중 상속이 가능하다.
class Duck implements Flyable, Swimmalbe{

    @Override
    public void fly() {
        System.out.println("오리가 하늘을 날아간다.");
    }

    @Override
    public void swim() {
        System.out.println("오리가 수영을 한다.");
    }

}

public class Interface2 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Swimmalbe fish = new Fish();
        Duck duck = new Duck();

        bird.fly();
        fish.swim();
        duck.fly();
        duck.swim();
    }
}

