package a1113;

import java.util.Scanner;

public class ScanerSum {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("숫자를 입력 하세요 : ");
        int num = scan.nextInt();
        int result=0;
        for(int i=0; i<=num; i++){
            result += i;

        }
        System.out.println("1부터 " + num + "총 합은 "+ result + " 입니다.");
    }
    
}
