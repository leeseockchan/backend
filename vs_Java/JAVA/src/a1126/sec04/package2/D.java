package a1126.sec04.package2;

import a1126.sec04.package1.A;

public class D extends A {
    // 생성자 선언 
    public D(){
        // A()생성자 호출
        super();
    }

    public void method1(){
        // A 필드값 변경
        this.field = "value";
        // A의 메소드 호출
        this.method();
    }
    public void method2(){
        // A a = new A();
        // a.field = "value";
        // a.method();          // 세개 다 X

    }
}
