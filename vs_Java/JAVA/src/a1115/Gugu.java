package a1115;

import java.util.Scanner;

public class Gugu {
    public static void main(String[] args) {
        // 구구단 (1~9단)
        // 원하는 단을 입력 받아 구구단을 완성해 보시오
        Scanner scan = new Scanner(System.in);
        System.out.print("궁금한 단을 입력 해주쎼용~");
        int num = scan.nextInt();

        for(int i=1;i<=9;i++){
            System.out.println(num+" X "+ i + " = "+ (i*num));
        }

    }
}
