package a1112;

public class Boolean {
    public static void main(String[] args) {
        boolean stop = true;
        if (stop) {
            System.out.println("중지 하겠습니다.");
        } else {
            System.out.println("실행 하겠습니다.");
        }

        int x = 10;
        boolean result1 = (x == 20);
        boolean result2 = (x != 20);
        System.out.println("result1 : " + result1);
        System.out.println("resutl2 : " + result2);
    }
}
