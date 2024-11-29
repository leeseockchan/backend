package a1127.animal;

public class Fish extends Animal {
    public Fish(String name, int age) {
        super(name, age);

    }

    @Override
    public void move() {
        System.out.println(name + " 이(가) 지느러미를 이용해 헤엄친다.");
    }

    @Override
    public void sound() {
        System.out.println(name + " 이(가) 뻐끔 뻐끔");
    }
   

}
