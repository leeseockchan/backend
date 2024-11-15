package a1115;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        // 5개의 정수를입력 받아
        // 입력 받은 수 중 양수 만 합계를 구하여 출력하시오.

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print(i+" 번 째 숫자를 입력 하시오 : ");
            int num = scan.nextInt();
            if(num < 0){
                continue;
            // num이 음수(-)이 입력 되면 무시하고
            //  다음 실행으로 넘긴다.
            }
            sum += num;

        }
        
        System.out.println("총 합은 "+ sum + " 입니다.");
    }
}
