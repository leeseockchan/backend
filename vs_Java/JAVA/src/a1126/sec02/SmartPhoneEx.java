package a1126.sec02;

public class SmartPhoneEx {
    public static void main(String[] args) {
        
        // 객체 생성
        SmartPhone myPhone = new SmartPhone("iPhone", "black");

        //Phone 으로 부터 상속 받은 필드 읽기
        System.out.println("모델 : "+ myPhone.model);
        System.out.println("색상 : "+ myPhone.color);

        // SmartPhone의 필드 읽기
        System.out.println("와이파이 상태 : "+ myPhone.wifi);
        // boolean의 초기 값 => false

        // Phone으로 부터 상속 받은 메소드
        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("Hi ! i am Honggildong");
        myPhone.sendVoice("아~ 네 반갑습니다.");
        myPhone.hangUp();

        // SmartPhone의 메소드 호출
        myPhone.setWifi(true);
        myPhone.internet();
        System.out.println("와이파이 상태 : "+myPhone.wifi);
    }
}
