package a1127.animal;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {
        System.out.println(name + " 이(가) 네 발로 걷는다");
    }

    @Override
    public void sound() {
        System.out.println(name + " 이(가) 멍멍 짖는다.");
    }

   
    
}
