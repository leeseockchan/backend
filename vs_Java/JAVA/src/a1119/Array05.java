package a1119;

import java.util.Scanner;

public class Array05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("배열 크기를 입력하세요: ");
        int size = scan.nextInt();

        int[] arr = new int[size];
        System.out.println("배열 요소를 입력하세요:");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }



        System.out.println(" 원래 배열 : ");
        for (int num : arr) {
            System.out.println(num + " ");
        }

        System.out.println("\n 역순 배열 : ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }


        System.out.println("실제 역순 정렬 배열");
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length -1-i];
            arr[arr.length -1-i] = temp;
        }
        System.out.println("정렬 된 배열을 출력");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
