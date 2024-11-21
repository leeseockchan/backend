package a1121.object;
// 클래스란 객체를 정의한 설계도
// 객체를 생성하는데 사용
// 클래스 구성 힐드, 메소드, 생성자
// 이너 클래스
public class Car {
    // 필드(속성) 선언
    public String model;
    public String color;
    public int price;
    
    // 생성자(객체의 선언 및 초기화)
    public Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }
    // 메소드(행위) 선언
    void powerOn(){
        System.out.println("시동을 켭니다.");
    }
    void accelerate(){
        System.out.println("앞으로 출발 합니다.");
    }
    void stop(){
        System.out.println("차량을 멈추겠습니다.");
    }
}
