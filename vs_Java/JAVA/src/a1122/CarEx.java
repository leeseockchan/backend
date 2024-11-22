package a1122;

class Car {
    String brand;
    String model;

    Car() {
        this("unknown", "Unknown"); // 다른 생성자 호출
    }

    // 매개변수 한개
    Car(String brand){
        this(brand, "Unknown");
    }
    
    // 매개변수 두개
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }

}

public class CarEx {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Toyota");
        Car car3 = new Car("Honda", "Cuvic");
        Car car4 = new Car(null, "G90");
        car1.display();
        car2.display();
        car3.display();
        car4.display();
    }
}
// this - 현재 객채 자신 임을 강조
// this() - 현재 클래스의 다른 생성자 호출1
