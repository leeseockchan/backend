package a1205;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class Stream1 {
    public static void main(String[] args) {
        int[] data = { 5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8 };
        // ArrayList 생성 - 짝수만 포함
        ArrayList<Integer> dataList = new ArrayList();
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                dataList.add(data[i]);
            }
        }
        // set을 사용하여 중복 제거
        HashSet<Integer> dataSet = new HashSet<>(dataList);

        // set을 다시 List로 변경
        ArrayList<Integer> distinctList = new ArrayList<>(dataSet);

        // 역순으로 정렬
        distinctList.sort(Comparator.reverseOrder());

        // 순반향으로 정렬
        distinctList.sort(Comparator.naturalOrder());

        // Integer 리스트를 정수 배열로 변환
        int[] result = new int[distinctList.size()];
        for (int i = 0; i < distinctList.size(); i++) {
            result[i] = distinctList.get(i);
        }
        for(int num : result){
            System.out.println(num + " ");
        }

    }
}
// 1. 배열 선언
// 2. 배열을 arrayList 변환 후 짝수로 추출
// 3. arrayList -> HashSet 변환(중복 제거)
// 4. 다시 arrayList 변환 -> 역순 정렬
