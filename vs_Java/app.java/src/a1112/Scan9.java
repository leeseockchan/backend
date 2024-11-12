package a1112;

import java.util.Scanner;
//  연습
public class Scan9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Hour 시간 입력 : ");
        String a = scanner.next();

        System.out.print("minute 분 입력 : ");
        String b = scanner.next();

        System.out.print(a+ ":"+b);
    
        
    }   
}