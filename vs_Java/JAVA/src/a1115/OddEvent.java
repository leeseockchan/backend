package a1115;

public class OddEvent {
    public static void main(String[] args) {
        // 1~20 까지의 정수 중
        // 홀수의 합계, 짝수의 합계를 각각 구하여 출력 하시오
        int num = 0;
        int odd = 0;
        int even = 0;

        while (num <= 20) {

            if (num % 2 == 0) {
                odd += num;
            }
             if (num % 2 != 0) {
                even += num;
            }
            num++;
        }
        System.out.println("짝수의 합계는 " + odd + " 입니다.");
        System.out.println("홀수의 합계는 " + even + " 입니다.");
    }
}
