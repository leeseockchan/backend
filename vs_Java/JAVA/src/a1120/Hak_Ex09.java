package a1120;

import java.util.Scanner;
/* 2024.11.20 
 * 학생 수를 입력 받아
 * 학생들의 점수를 입력 후
 * 총 합을 구하고 최고 점수와 평균 값을 출력한다.
 */
public class Hak_Ex09 {
    public static void main(String[] args) {
        boolean run = true;

        int studemtNum = 0; // 학생의 수
        int[] scores = null;// 점수

        Scanner scan = new Scanner(System.in);

        while (run) {
            System.out.println("========================================================");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료.");
            System.out.println("--------------------------------------------------------");
            System.err.print("선택 하시오. => ");
            int choose = Integer.parseInt(scan.nextLine());
            // nextLine() 줄 단위로 문자처럼 입력 받고
            // parseInt 숫자로 변환
            if (choose == 1) {
                System.out.print("학생 수 => ");
                studemtNum = Integer.parseInt(scan.nextLine());
                scores = new int[studemtNum];
            } else if (choose == 2) {
                System.out.print("점수 입력 => ");
                for (int i = 0; i < scores.length; i++) {
                    System.out.print("scores[" + i + "]>");
                    scores[i] = Integer.parseInt(scan.nextLine());
                }
            } else if (choose == 3) {
                System.out.println("점수 리스트 ");
                for (int i = 0; i < scores.length; i++) {
                    // scores[0] : 50 scores[1] : 96
                    System.out.println("scores[" + i + "] : " + scores[i]);
                }
            } else if (choose == 4) {
                System.out.print("분석");
                int max = 0;
                int sum = 0;
                double avg = 0;
                for (int i = 0; i < scores.length; i++) {
                    max = (max < scores[i]) ? scores[i] : max;
                    sum += scores[i];
                }
                avg = (double) sum / studemtNum;
                System.out.println("최고 점수 : " + max);
                System.out.println("총 합의 점수 : " + sum);
                System.out.printf("총 평균 점수 : %.2f\n" , avg);
            }else if(choose == 5){
                run = false;
            }

        }
        System.out.println("시스템을 종료 하겠습니다.");
        scan.close();
    }
}
