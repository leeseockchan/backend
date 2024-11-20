package a1120.Class_Chapter06;

public class CarEx {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.company = "현대";
        car1.model = "제네시스";
        car1.color = "무광화이트";
        car1.maxSpeed = 320;
        car1.speed = 120;
        System.out.println(car1.company+" 회사의 "+car1.model+"을(를) 소개 하겠습니다. ");
        System.out.println("회사는 "+car1.company);
        System.out.println("모델명은 "+car1.model);
        System.out.println("차량의 색상은 "+car1.color);
        System.out.println("차량의 최고 속도는 "+car1.maxSpeed+"km");
        System.out.println("현재 속도는 "+car1.speed+"km");

        Car car2 = new Car("검정", "카니발", "검정", 300, 120);
        System.out.println(car2.company+" 회사의 "+car2.model+"을(를) 소개 하겠습니다. ");
        System.out.println("회사는 "+car2.company);
        System.out.println("모델명은 "+car2.model);
        System.out.println("차량의 색상은 "+car2.color);
        System.out.println("차량의 최고 속도는 "+car2.maxSpeed+"km");
        System.out.println("현재 속도는 "+car2.speed+"km");
    }
}
