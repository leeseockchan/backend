package a1112;

public class Operater {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        int result = a + b;
        System.out.println("result : " + result);

        byte c = 10;
        int d = 100;
        long e = 1000L;
        long result3 = c + d + e;
        System.out.println("result3 : " + result3);

        char f = 'A';
        char g = 1;
        int result4 = f + g;
        System.out.println("result4 :" + result4);
        System.out.println("result4 :" + (char) result4);

        int a1 = 10;
        int result5 = a1 / 4;
        System.out.println("result5 : " + result5);

        int a2 = 10;
        double result6 = a2 / 4.0;
        System.out.println("result6 : " + result6);

        int a3 = 1;
        int a4 = 2;
        double result7 = (double) a3 / a4;
        System.out.println("result7 : " + result7);
        
    }
}
