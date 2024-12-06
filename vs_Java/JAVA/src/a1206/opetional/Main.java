package a1206.opetional;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        // 존재하는 ID로 검색
        Optional<User> userOptional1 = userRepository.findById(2L);
        userOptional1.ifPresentOrElse(
                user -> System.out.println("찾는 사용자 : " + user),
                () -> System.out.println("찾는 사용자가 없습니다."));
        // 출력: 찾는 사용자 : User{id=2, name='Bob'}

        Optional<User> userOptional2 = userRepository.findById(99L);
        userOptional2.ifPresentOrElse(
                user -> System.out.println("찾는 사용자 : " + user),
                () -> System.out.println("찾는 사용자가 없습니다."));
            

        // 기본값 제공
        User defaultUser = userOptional2.orElse(new User(0L, "Default User"));
        System.out.println("기본 사용자: " + defaultUser);
        // 출력: 기본 사용자: User{id=0, name='Default User'}
    }
}
// findById 메소드
// 아이디로 사용자 리스트를 검색하고, 결과를 Optional<User>로 반환 합니다.
// Optional.empty() 는 사용자가 없을 때 반환 됩니다.
// Optional 처리 방식
// ifPresetOrElse : 값이 있으면 처리, 없으면 대체 동작 수행
// orElse : 값이 없으면 기본 값을 반환
// orElseThrow : 값이 없으면 예외를 던질 수도 있다.
