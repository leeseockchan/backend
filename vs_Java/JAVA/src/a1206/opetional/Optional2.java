package a1206.opetional;

import java.util.Optional;

public class Optional2 {
    public static void main(String[] args) {
        Optional<String> optionalName = findName("John");
        System.out.println(optionalName.orElse("Name not found"));
        // orElse = 그렇지 않으면 과 같은 의미
        // optionalName에 findName 메소드가 실행되면서 일치 하지 않다면 8번 줄 실행
    }

    private static Optional<String> findName(String name) {
        if("John".equals(name)){
            return Optional.of(name);
        // name 변수 안에 "John" 이라는 문자가 있다면 그대로 출력
        }
        return Optional.empty();
    }
}
