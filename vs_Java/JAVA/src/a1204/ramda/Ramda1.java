package a1204.ramda;

import java.util.Arrays;
import java.util.List;

public class Ramda1 {
    
    public static void main(String[] args) {
        // 컬렉션과 람다식  
        List<String> names = Arrays.asList("apple","banana","fineapple","orange");
        
        // 모든 요소 출력
        for(String name : names){
            System.out.println(name);
        }

        // 람다 foreach
        names.forEach(name -> System.out.println(name));

        // 길이가 6이상(단어의 갯수) 요소만 필터링
        names.stream()
            .filter(name -> name.length() >=6)
            .forEach(System.out::println);
    }
}
