package a1121.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Tetragonal t1 = new Tetragonal();
        int width = scan.nextInt(); // 입력 받을 가로길이
        int height = scan.nextInt(); // 입력 받을 세로길이

        int w = t1.width;
        w = scan.nextInt();

        int h = t1.height;
        h = scan.nextInt();

        
        System.out.println("가로의 길이를 입력 하세요 : "+ w);
        
        System.out.println("사각형의 면적 = "+t1.getArea(w,h));
        System.out.println("사각형의 둘레 = "+t1.getPerimeter(w,h));
        System.out.println("정사각형의 면적 = "+t1.getArea(w));
        System.out.println("정사각형의 둘레 = "+);
    }
}
