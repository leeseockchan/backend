package a1122.aven;

public class AvengerTest {
    public static void main(String[] args) {
        // 객체 생성
        Avenger thor = new Avenger("토르", 150);
        Avenger tanos = new Avenger("타노스", 1500);
        // 인스턴스 멤버 사용
        thor.punch(tanos);
        tanos.punch(thor);

    }
}

// 클래스 생성
class Avenger {
    // 필드 선언
    String name;
    int hp;

    // 생성자 선언
    public Avenger(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    // 메소드 생성
    public void punch(Avenger enemy) {
        // name = 매개변수
        // Avenger enemy = 매개 변수를 받는 객체
        System.out.printf("[%s]의 펀치 !!!\n", name);
        System.out.printf("[%s]의 펀치를 맞은 [%s]...\n", name, enemy.name);

        enemy.hp= enemy.hp-10;
        System.out.printf("=> %s 의 체력 : %d\n", enemy.name,enemy.hp);
        
        // 메소드에 객체도 전달 할수가 있다.
    }

}
