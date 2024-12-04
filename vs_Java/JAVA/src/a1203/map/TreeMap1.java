package a1203.map;

import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<Integer,String>();

        // put() 메소드를 이용한 요소의 저장
        tm.put(10, "십");
        tm.put(20, "이십");
        tm.put(40, "사십");
        tm.put(30, "삼십");

        //TreeMape은 키를 자연순서(알파벳, 숫자)로 정렬하여 출력
        System.out.println("맵에 저장된 키들의 집합 : "+tm.keySet());
        
        for(Integer key: tm.keySet()){
            System.out.println(String.format("키 : %s, 값 : %s", key, tm.get(key)));
        }
        
        TreeMap<String, Integer> tm1 = new TreeMap<String, Integer>();
        tm1.put("ㄷㄷㄷ", 30);
        tm1.put("ㄱㄱㄱ", 10);
        tm1.put("ㅅㅅㅅ", 40);
        tm1.put("ㄴㄴㄴ", 20);
        tm1.put("ㅎㅎㅎ", 50);
        System.out.println("맵에 저장된 키들의 집합 : "+tm1.keySet());
        for(String key: tm1.keySet()){
            System.out.println(String.format("키 : %s, 값 : %s", key, tm1.get(key)));
        }
    }
}
