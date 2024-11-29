package a1127.animal;

// 추상 클래스
abstract class Animal {
    // 공통 속성
    protected String name;
    protected int age;

    // 공통 메소드
    public void info() {
        System.out.println(this.getClass().getSimpleName() + " : " + name + " 나이: " + age);
    }

    // 생성자 선언
    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 추상 메소드
    public abstract void sound();

    public abstract void move();

}
