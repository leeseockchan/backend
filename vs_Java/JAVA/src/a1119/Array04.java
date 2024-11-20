package a1119;

public class Array04 {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 8, -3, 6 };

        int max = arr[0];
        int min = arr[0];

        // for(int i = 0; i< arr.length; i++){
        // if(max < arr[i]){
        // max = arr[i];
        // }
        // if(min > arr[i]){
        // min = arr[i];
        // }
        // }

        // forecah문
        for (int num : arr) {
            if (num > max)
                max = num;
        // 문장이 하나 일 경우 중괄호{} 를 생략할 수 있다.
            if (num < min)
                min = num;

        }

        System.out.println("최대 값 : " + max);
        System.out.println("최소 값 : " + min);

    }
}
