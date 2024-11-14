package a1112;

import java.util.Scanner;

//  연습
public class Scan10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("문자를 입력하세요 : ");
        String abc = scan.nextLine();
        System.out.println("출력 문자열 : "+ abc );
    }
}