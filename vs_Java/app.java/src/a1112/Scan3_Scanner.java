package a1112;

import java.util.Scanner;

public class Scan3_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        String name = scan.nextLine();
        System.out.print("나이 입력 : ");
        int age = scan.nextInt();

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);

    }
}
