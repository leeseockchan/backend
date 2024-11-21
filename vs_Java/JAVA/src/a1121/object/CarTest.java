package a1121.object;

public class CarTest {
    public static void main(String[] args) {
        Car genesis = new Car("g80", "white", 8000);
        // 객체 - 클래스 설계된 내용으로 생성
        // 객체 - 인스턴스는 같은 개념
        System.out.println("모델명 : "+ genesis.model);
        System.out.println("색상 : "+ genesis.color);
        System.out.println("가격 : "+ genesis.price);


        genesis.powerOn();
        genesis.accelerate();
        genesis.stop();
    }
}
