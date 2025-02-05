package a1129;

abstract class Animal {
    int a = 10;

    abstract void cry();
    // 추상 클래스는 추상 메소드를 포함하고 있다는 점을 제외하면,
    // 일반 클래스와 동일 즉. 생성자와 필드, 일반 메소드 포함 가능
}

class Cat extends Animal {

    @Override
    void cry() {
        System.out.println("야옹");
    }
}

class Dog extends Animal {

    @Override
    void cry() {
        System.out.println("멍멍");
    }
}

public class Ab1 {
    public static void main(String[] args) {
        // Animal a = new Animal(); - 추상 클래스는 인스턴스(객체)생성 금지
        Cat c = new Cat();
        Dog d = new Dog();
        c.cry();
        d.cry();

        Animal e = new Cat(); // 자식을 부모타입으로 업캐스팅 후
                              // cry 메소드 호출 (다운 캐스팅 안해도 된다.)
        Animal f = new Dog(); // 다형성

    }
}