package a1205;

import java.util.Arrays;
import java.util.stream.Stream;

public class Stream4 {
    public static void main(String[] args) {
        String[] arr = new String[] { "넷", "둘", "셋", "하나" };

        // 배열 스트림 생성
        Stream<String> steam1 = Arrays.stream(arr);
        steam1.forEach(e -> System.out.println(e + " "));
                       // e는 내가 정하는 변수명
        // 배열의 특정 부분만을 이용한 스트림 생성
        Stream<String> steam2 = Arrays.stream(arr, 1, 3);
        // 1,3 번째 시작인 인덱스와 끝 인덱스 1부터 3이전 까지
        steam2.forEach(e -> System.out.println(e + " "));
    }
}
