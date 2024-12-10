package a1206.opetional;

import java.util.Optional;

// Opctional 은 null 처리를 위한 도구
// null 에 접근했을때 nullPointException
public class Optional1 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");
        // 값이 반드시 있어야 한다.

        Optional<String> opctional1 = Optional.ofNullable("hello");
        // 값이 있으면 출력된다.

        opctional1.ifPresent(System.out::println);

        // 값이 없으면 기본값 반환
        String value = optional.orElse("기본값 출력");
        System.out.println(value);

        // 값이 없으면 기본값을 생성
        String generatedValue = optional.orElseGet(() -> "Generated Value");
        System.out.println(generatedValue); // 출력: Hello

        // 값이 없으면 예외 던지기
        String result = optional.orElseThrow(() -> new IllegalArgumentException("No Value present"));
        System.out.println(result); // 출력 : Hello

    }
}