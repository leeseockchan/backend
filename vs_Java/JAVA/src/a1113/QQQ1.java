package a1113;

import java.util.Scanner;

public class QQQ1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int input = scan.nextInt();

        if (input % 2 == 0) {
            System.out.println(input + " 짝수 입니다.");
        } else {
            System.out.println(input + " 홀수 입니다.");
        }

    }
}
