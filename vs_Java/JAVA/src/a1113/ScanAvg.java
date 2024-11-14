package a1113;

import java.util.Scanner;

public class ScanAvg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세용~ : ");
        int scn1 = scan.nextInt();
        System.out.print("두 번째 정수를 입력하세용~ : ");
        int scn2 = scan.nextInt();
        System.out.print("세 번째 정수를 입력하세용~ : ");
        int scn3 = scan.nextInt();

        int sum = scn1 + scn2 + scn3;
        double avg = (double)sum / 3;

        System.out.println("입력한 정수들의 합은 "+sum+" 입니다.");
        System.out.printf("세 개의 평균은 %.2f 입니다.",avg);
        



    }
}
