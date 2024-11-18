package a1118;

public class Array2 {
    public static void main(String[] args) {
        // 배열 변수 선언
        int[] scores;
        // 배열 변수에 배열 대입
        scores = new int[] { 83, 90, 87 };

        // 총합 평균 구하기
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            avg = (double) sum / scores.length;
        }
        System.out.println("총 합 점수 : " + sum);
        System.out.printf("총 평균 점수 : %.2f\n ", avg);

        // 배열을 매개값으로 주고 printItem 메소드 호출

        
        printItem(new int[] { 72, 83, 97, 86 });
        // printItem 메소드 선언
    }
    public static void printItem(int[] scores) {
        // 매개 변수가 참조하는 배열의 항목을 출력
        for (int i = 0; i < 4; i++) {
            System.out.println("scored[" + i + "] : " + scores[i]);
        }

    }

}
