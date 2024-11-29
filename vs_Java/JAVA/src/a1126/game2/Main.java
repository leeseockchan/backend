package a1126.game2;

public class Main{
    public static void main(String[] args) {

        Pikachu pikachu = new Pikachu();
        System.out.println("pikachu "+pikachu.toString());
       
        Pikachu pikachu2 = new Pikachu(150, "전기, 강철", 15);

        Raichu raichu = new Raichu();
        System.out.println("라이츄 "+raichu);
        Raichu raichu2 = new Raichu(400, "메가전기", 40);
        System.out.println("라이츄2 "+raichu2);
    }
}
