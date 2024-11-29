package a1127.downcasting;

public class Downcasting {
    public static void main(String[] args) {
        Parent parentRef = new Child(); // 업캐스팅 - 자식 객체를 부모타입으로 변환
        parentRef.show();   // 자식 클래스 메소드(다형성)
        
        // 다운 캐스팅
        if(parentRef instanceof Child){
            Child childRef = (Child) parentRef; // 명시적 형변환을 해줘야함
            childRef.childspecial();
        }else{
            System.out.println("다운 캐스팅 실패");
        }
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
