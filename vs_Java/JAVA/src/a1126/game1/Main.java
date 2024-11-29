package a1126.game1;

public class Main {
    public static void main(String[] args) {
        // 객체 생성
        // 클래스 타입 객체명 = new 클래스명
        Pikachu pikachu = new Pikachu();
        // . -> 접근 연산자 : 객체의 변수, 메소드에 접근하는 연산자
        pikachu.energy = 100;
        pikachu.type = "번개";
        pikachu.level = 1;
        System.out.println("########피카츄########");
        System.out.println("에너지 = "+pikachu.energy);
        System.out.println("속성 = "+pikachu.type);
        System.out.println("레벨 = "+pikachu.level);
        System.out.println("공격a = "+pikachu.aAttack());
        System.out.println("공격b = "+pikachu.bAttack());
        System.out.println();


        Raichu raichu = new Raichu();
        System.out.println("########라이츄########");
        System.out.println("에너지 = "+raichu.energy);
        System.out.println("속성 = "+raichu.type);
        System.out.println("레벨 = "+raichu.level);
        System.out.println("공격a = "+raichu.aAttack());
        System.out.println("공격b = "+raichu.bAttack());
        System.out.println("공격c = "+raichu.cAttack());
        System.out.println();


        Raichu raichu2 = new Raichu(400, "메가전기", 40);
        System.out.println("########라이츄2########");
        System.out.println("에너지 = "+raichu2.energy);
        System.out.println("속성 = "+raichu2.type);
        System.out.println("레벨 = "+raichu2.level);
        System.out.println("공격a = "+raichu2.aAttack());
        System.out.println("공격b = "+raichu2.bAttack());
        System.out.println("공격c = "+raichu2.cAttack());
        System.out.println();

    }
}
