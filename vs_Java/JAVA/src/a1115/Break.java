package a1115;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("멈추고 싶다면 \"그만\"을 입력하세요");
        // 무한 루프
        // 반드시 종료 조건을 추가해주어야 한다. (break)
        while(true){
            System.out.print(" 입력 = ");
            String str = scan.nextLine();

            if(str.equals("그만")){
                break;
            }
            System.out.println(" 입력 받은 문자 = "+str);
        }
        
    }
}
