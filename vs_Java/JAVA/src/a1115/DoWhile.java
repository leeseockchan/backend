package a1115;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        
        do{
            System.out.print("숫자를 입력하세요");
            number=scan.nextInt();
            System.out.println("입력 한 숫자 : "+ number);
        }while(number != 0);
        System.out.println("프로그램 종료");
        
    }
}
