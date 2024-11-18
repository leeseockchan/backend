package a1118;

public class Marray1 {
    public static void main(String[] args) {
        // 각 반의 학생 수가 3명으로 동일 할 경우
        // 점수 저장을 위한 2차원 배열 생성
        int[][] mathScores = new int[2][3];
        for (int i = 0; i < mathScores.length; i++) { // 반의 수 만큼 반복
            for (int j = 0; j < mathScores[i].length; j++) { // 해당 반의 학생 수 만큼 반복
                System.out.println("mathScores[" + i + "] [" + j + "] : " + mathScores[i][j]);
            }
        }

        // 각 배열의 항목 값 변경
        mathScores[0][0] = 80;
        mathScores[0][1] = 86;
        mathScores[0][2] = 82;
        mathScores[1][0] = 92;
        mathScores[1][1] = 96;
        mathScores[1][2] = 72;

        for (int i = 0; i < mathScores.length; i++) { // 반의 수 만큼 반복
            for (int j = 0; j < mathScores[i].length; j++) { // 해당 반의 학생 수 만큼 반복
                System.out.println("mathScores[" + i + "] [" + j + "] : " + mathScores[i][j]);
            }
        }

        // 전체 학생의 수학합계 구하기
        int totalMathSum = 0;   // 총 합의 점수
        int totalStudent = 0;   // 총 학생의 수
        double totalAverage = 0;    // 평균 점수
        for (int i = 0; i < mathScores.length; i++) {
            totalStudent = totalStudent + mathScores[i].length;
            for (int j = 0; j < mathScores[i].length; j++) {
                totalMathSum += mathScores[i][j];
            }
            totalAverage = totalMathSum / totalStudent;
        }
        System.out.println("총 합의 점수는 : " + totalMathSum + "점");
        System.out.println("총 학생의 수는 : " + totalStudent + "명");
        System.out.println("총 평균의 점수는 " + totalAverage + "점");
    }
}
