package a1203.map;

import java.util.HashMap;
import java.util.Iterator;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        // put();
        hm.put("삼시세끼", 33);
        hm.put("1박2일", 12);
        hm.put("무한도전", 8);

        System.out.println("맵에 전장된 Key들의 집합 : "+ hm.keySet());
        for(String key : hm.keySet()){
            System.out.println(String.format("Key : %s 값 : %s",key,hm.get(key)));
        }
        // key - 값 쌍으로 데이터 저장
        // 각 데이터는 고유한 키(key)와 이에 대응하는 값(Value)로 구성
        // 순서 없음
        // 중복 허용, null 허용
        // 동기화 되지 않음
        // 시간의 복잡도 평균
        
        System.out.println();
        // remove() 메소드를 이용한 요소의 제거

        hm.remove("삼시세끼");

        Iterator<String> keys = hm.keySet().iterator();
        while(keys.hasNext()){
            String key = keys.next();
            System.out.println(String.format("Key : %s 값 : %s",key,hm.get(key)));
        }
        System.out.println();

        //replace() 메소드를 이용한 요소의 수정
        hm.replace("이십", 200);
        for(String key : hm.keySet()){
            System.out.println(String.format("Key : %s 값 : %s",key,hm.get(key)));
        }
        System.out.println();
        // size()메소드를 이용한 요소의 총 개수
        System.out.println("맵의 크기 : "+hm.size());
        
    }
}
