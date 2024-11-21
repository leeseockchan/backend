package a1121.Overloading;

public class Car {
    
    //필드 선언
    String company = "현대 자동차";
    String model;
    String color;
    int maxSpeed;

    Car(){}

    Car(String model){
        this.model = model;
    }
    
    Car(String model, String color){
        this.model = model;
        this.color = color;
    }

    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

}
