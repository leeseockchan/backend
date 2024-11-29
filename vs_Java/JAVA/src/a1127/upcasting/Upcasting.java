package a1127.upcasting;

public class Upcasting {
    public static void main(String[] args) {
        Child childObj = new Child();
        Parent parentObj = new Parent();
        childObj.show();    // => 자식 객체 메소드
        parentObj.show();   // => 부모 객체 메소드
        Parent parentRef = childObj;    // 업캐스팅 (묵시적 형변환)
        parentRef.show();   // => 자식 객체 메소드
        // parentRef.childspecial(); 
        //오류 : parent 클래스에서 정의 되지 않은 메소드(사용불가)

    }
}
class Parent{
    void show(){
        System.out.println("부모 클래스 메소드");
    }
}

class Child extends Parent{
    @Override
    void show() {
        System.out.println("자식 클래스 메소드");
    }
    void childspecial(){
        System.out.println("자식 특별한 클래스 메소드");
    }
}
