package a1112;

import java.util.Scanner;

public class Scan7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("x 값 입력: ");
		String x = scanner.next();
				
		System.out.print("y 값 입력: ");
		String y = scanner.next();

            System.out.println(x);
            System.out.println(y); 
            
            // 출력 결과 :
            // x 값 입력: Hello world
            // y 값 입력: Hello world
            // Hello
            // Hello      
    }   
}