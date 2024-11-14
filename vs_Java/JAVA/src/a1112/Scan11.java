package a1112;

import java.util.Scanner;

//  연습
public class Scan11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("실수문자를 입력하세요 : ");
        Float abc = scanner.nextFloat();
        System.out.printf("출력 문자열 :%-10.2f\n", abc );

    }
}