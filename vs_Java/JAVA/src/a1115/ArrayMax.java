package a1115;

import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        // 첫 째 줄에 입력할 개수 n을 입력 받고
        // 둘 째 줄에 n개의 정수를 공백을 두고 입력받는다.
        // n개의 정수중 , 최대값을 구하여 출력하시오

        // - 순서도 - 
        // 1. 정수 하나를 입력 받는다.
        // 2. 입력 받은 정수를 변수 n에 대입한다.
        // 3. N번 반복 하여 N개의 정수를 입력 받는다.
        // 4. 입력 받은 N개의 정수를 배열 arr에 저장한다.
        // 5. 배열 arr를 반복하여, max 와 i번째 요소를 비교한다.
        // 6. 두 요소 중 더 큰 요소를 변수 max에 대입한다.
        // 7. 반복이 끝나고, 변수 max를 출력한다

        Scanner scan = new Scanner(System.in);
        System.out.print("총개수를 입력하시오:"); 
        // 1,2 풀이
        int n = scan.nextInt();

        int arr[] = new int[n];
        // 3. N번 반복 하여 N개의 정수를 입력 받는다. 
        for (int i = 0; i < n; i++) {
            System.out.print(i+1 + "번째 숫자를 입력하세요");
        // 4. 입력 받은 N개의 정수를 배열 arr에 저장한다.
            arr[i] = scan.nextInt();
        }
        // 5. 배열 arr를 반복하여, max 와 i번째 요소를 비교한다.
        int max = Integer.MIN_VALUE;    // int 타입의 최소 값 : -2,147,483,648
        // int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
        // 6. 두 요소 중 더 큰 요소를 변수 max에 대입한다.
                max = arr[i];
            }            
        }
        // 7. 반복이 끝나고, 변수 max를 출력한다.
        System.out.println("최대 값 : "+ max);
        scan.close();

    }
}
