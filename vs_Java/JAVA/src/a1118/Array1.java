package a1118;

public class Array1 {
    public static void main(String[] args) {
        // 배열 변수 선언과 배열 생성
        String[] season = { "Spring", "Summer", "Fall", "Winter" };

        System.out.println(season[0]);
        System.out.println(season[1]);
        System.out.println(season[2]);
        System.out.println(season[3]);

        // 인덱스1 항목의 값 변경
        season[1] = "여름";
        System.out.println(season[1]);

        // 배열 변수 선언과 배열 생성
        int[] scores = { 83, 90, 87 };
        // 총합 평균 구하기
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            avg = (double)sum / scores.length;
        }
        System.out.println("총 합 점수 : " + sum);
        System.out.printf("총 평균 점수 : %.2f\n " , avg);

    }
}
