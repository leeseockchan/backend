package a1112;

import java.util.Scanner;

public class Scan6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("x 값 입력: ");
		String x = scanner.nextLine();
				
		System.out.print("y 값 입력: ");
		String y = scanner.next();

            System.out.println(x);  // .nextLine(); 문장 전체 
            System.out.println(y);  // .next();     단어
            
            // 출력 결과 :
            // x 값 입력: Hello world
            // y 값 입력: Hello world
            // Hello world
            // Hello      
    }   
}