package a1122;

public class CardEx {
    public static void main(String[] args) {
        System.out.println("카드의 길이 : " + Card.width);
        System.out.println("카드의 높이 : " + Card.height);
        // 클래스 변수(static) 
        // 객체 생성 없이 - 클래스이름.클래스변수 
        // 직접 사용이 가능하다.


        Card c1 = new Card();
        c1.kind = "heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + "모양이다.");
        System.out.println("c1은 " + c1.number + "숫자이다.");
        System.out.println("c1의 카드 길이는 " + c1.width + " cm이다.");
        System.out.println("c1의 카드 높이는 " + c1.height + " cm이다.");

        System.out.println("c2은 " + c2.kind + "모양이다.");
        System.out.println("c2은 " + c2.number + "숫자이다.");
        System.out.println("c2의 카드 길이는 " + c2.width + " cm이다.");
        System.out.println("c2의 카드 높이는 " + c2.height + " cm이다.");
        c1.width = 50;
        c1.height = 80;
        System.out.println("c1은 " + c1.kind + "모양이다.");
        System.out.println("c1은 " + c1.number + "숫자이다.");
        System.out.println("c1의 카드 길이는 " + c1.width + " cm이다.");
        System.out.println("c1의 카드 높이는 " + c1.height + " cm이다.");

        System.out.println("c2은 " + c2.kind + "모양이다.");
        System.out.println("c2은 " + c2.number + "숫자이다.");
        System.out.println("c2의 카드 길이는 " + c2.width + " cm이다.");
        System.out.println("c2의 카드 높이는 " + c2.height + " cm이다.");
    }
}

class Card {
    String kind;
    int number;
    static int width = 100; // 클래스 변수(static 변수 - 정적변수)
    static int height = 250;
}
// Card의 인스턴스인 c1과 c2는 클래스(static) 
// 변수인 width,height를 공유하기 때문에 
// c1의 width, height를 변경하면 c2의 width, height 값도 변경이 된다.
