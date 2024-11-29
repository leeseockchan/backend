package a1126.sec3_1;

class Parent{
    int x= 10;
    void show(){
        System.out.println("Parent show()");
    }
}

class Child extends Parent{
    int x = 20;
    void display(){
        System.out.println("in child : "+ x);       // 자식 클래스 x 
        System.out.println("int parent = "+super.x);// 부모 클래스 x
        super.show();
    }   
}

public class Main2 {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();

    }
}
// super() 는 자식 클래스의 생성자에게 부모 클래스의 생성자 호출
// 부모 클래스의 기본 생성자가 없으면 자식 클래스에서 supper() 
// 사용하여 부모 클래스의 배개 변수를 받는 생성자를 명시적으로 호출해야 한다.

