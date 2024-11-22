package a1122.static1;

public class final1 {
    public static void main(String[] args) {
        // 객체 생성
        Car car1 = new Car("BMW", "X5");
        car1.display();
        // car.brand = "KIA";   final 필드는 재할당을 할수 없다.
    }
}

class Car {
    final String brand; // final 필드 선언
    final String model;
    // final : 객체마다 고유하지만 한 번만 초기화 후 변경 할수 없는 데이터
    // static final 상수 클래스 차원에서 모든 객체가 공유하며,
    // 변경 할수 없는 고정 데이터

    // 생성자
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // 메소드(함수)
    void display(){
        System.out.println("Brand: "+brand+" , Model: "+model);
    }
}
