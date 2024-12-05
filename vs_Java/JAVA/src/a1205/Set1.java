package a1205;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// 자바 컬렉션
// 다수의 데이터를 쉽고 효과적으로 처리
// List 인터페이스
// Map Set
public class Set1 {
    public static void main(String[] args) {
        // 객체 선언
        Set<String> set = new HashSet<>();
        
        set.add("apple");
        set.add("banana");
        set.add("pyopyo");
        set.add("kiwi");
        System.out.println();

        for(String e : set){
            System.out.println(e);
        }
        // 데이터 삭제
        System.out.println();
        set.remove("apple");
        System.out.println(set);
        set.add("orange");
        set.add("orange"); // 중복된 요소는 저장이 안된다.
    
        Iterator<String> iterSet = set.iterator();
        while (iterSet.hasNext()) {
            System.out.println(iterSet.next() + " ");
        }
        System.out.println();
        System.out.println(set);

        System.out.println(set.contains("orange")); //reuslt : true

        // 전체 데이터 삭제
        set.clear();
        System.out.println(set);    // reuslt : []
        System.out.println(set.isEmpty());  // set 어레이가 비었느냐? -> true

    }
}
