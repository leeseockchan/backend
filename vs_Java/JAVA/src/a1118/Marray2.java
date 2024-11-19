package a1118;

import java.util.Scanner;

public class Marray2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] scores = new int[3][3];

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("학생 %d의 국어,영어,수학 점수를 입력하세요 : " , i + 1);
            for (int j = 0; j < scores[i].length; j++) {
                scores[i][j] = scan.nextInt();
            }

        }

        // 각 학생의 총점과 평균 계산
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            double avg = (double) sum / scores[i].length;
            System.out.printf("학생%d의 총점 : %d 점, 평균: %.2f\n 점",i+1, sum, avg);
        }
        System.out.println();


        int totalSum = 0;
        int totalSub = 0;
        // 숙제 전체 총점 전체 평균을 구하시오
        for (int i = 0; i < scores.length; i++) {
            // totalSub = totalSub + scores[i].length;
            for (int j = 0; j < scores[i].length; j++) {
                totalSum = totalSum + scores[i][j];
            }

        }
        totalSub = scores[0].length * scores.length;    // 과목의 열의 개수와 행의 개수 
        System.out.println("총 인원 = "+ totalSub); 
        double totalAvg = (double)totalSum / totalSub;
        System.out.printf("전체 총점 :  %d 점, 전체 평균 : %.2f 점",totalSum, totalAvg);
    }
}
