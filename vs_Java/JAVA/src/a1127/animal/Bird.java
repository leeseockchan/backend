package a1127.animal;

public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {
        System.out.println(name + " 이(가) 날개로 날아간다");
    }

    @Override
    public void sound() {
        System.out.println(name + " 이(가) 짹짹 지저긴다.");
    }
   
}
