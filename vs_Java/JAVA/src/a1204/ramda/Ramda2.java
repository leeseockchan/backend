package a1204.ramda;

import java.util.Arrays;
import java.util.List;

public class Ramda2 {
    
    public static void main(String[] args) {
        // 컬렉션과 람다식  
        List<String> names = Arrays.asList("apple","banana","fineapple","orange");
        
        // 이름을 기준으로 내림차순 정렬
        names.sort((s1,s2)->s2.compareTo(s1));
        System.out.println("내림차순 정렬 "+names);
        System.out.println();
        
        // 메서드 참조 사용하기 정렬
        names.sort(String::compareTo);
        System.out.println("오름차순 정렬"+names);
    }
}
