package a1204.ramda;

// 함수형 인터페이스
interface Calculator{
    int sum(int a, int b);
    // Calculator 인터페이스의 메서드가 1개이상이면 람다 함수 사용 못함
}

public class Function2 {
    public static void main(String[] args) {
        Calculator mc = (int a, int b) -> a+b;  // 람다를 적용한 함수
        // 괄호 사이의 int a,b는 Calculator 인터페이스 sum 함수의 입력 항목이 배당
        // 뒤에 -> a+b 가 리턴값에 해당


        int result = mc.sum(3, 4);
        System.out.println(result);
    }
}
