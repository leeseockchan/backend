package a1115;

import java.util.Scanner;

public class ArrayMin {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        System.out.print("총개수를 입력하시오:"); 
        int n = scan.nextInt();

        int arr[] = new int[n];
        //  N번 반복 하여 N개의 정수를 입력 받는다. 
        for (int i = 0; i < n; i++) {
            System.out.print(i+1 + "번째 숫자를 입력하세요");
        //  입력 받은 N개의 정수를 배열 arr에 저장한다.
            arr[i] = scan.nextInt();
        }
        //  배열 arr를 반복하여, min 와 i번째 요소를 비교한다.
        int min = Integer.MAX_VALUE;    // int 타입의 최소 값 : -2,147,483,648
        // int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
        //  두 요소 중 더 큰 요소를 변수 min에 대입한다.
                min = arr[i];
            }            
        }
        //  반복이 끝나고, 변수 min를 출력한다.
        System.out.println("최소 값 : "+ min);
        scan.close();

    }
}
