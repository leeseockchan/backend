package a1115;

import java.util.Scanner;

public class Star1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print(" 입력 : ");
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j++) {
        // for (int j = i; j <= num; j++)
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
