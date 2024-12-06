package a1206.opetional;

import java.util.*;

public class UserRepository {
    private List<User> users = new ArrayList<>();

    public UserRepository() {
        // 더미 데이터 추가
        users.add(new User(1L, "Alice"));
        users.add(new User(2L, "Bob"));
        users.add(new User(3L, "Charlie"));

    }

    public Optional<User> findById(long id) {
        // for(User user : users){ // user 리스트를 하나씩 반복
        //     if(user.getId().equals(id)){
        //         return Optional.of(user);
        //     }
        // }
        // return Optional.empty();    // 없으면 빈Optional


        // Optional<User> user1 = users.stream()
        //     .filter(user->user.getId().equals(id))
        //     .findFirst();
        
        // Optional<User> 로 반환 시켜 주면 되기에 return 문을 사용하여 반환 시켜도 가능하다.
        return users.stream()
        .filter(user->user.getId().equals(id))
        .findFirst();
        
    }
}
