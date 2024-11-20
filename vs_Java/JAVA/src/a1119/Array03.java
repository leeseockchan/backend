package a1119;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요 : ");
        int boxsize = scan.nextInt();   // 입력한 숫자 만큼
                                        
        int[] box = new int[boxsize];   // 배열의 크기를 지정
        System.out.println( boxsize+" 개의 배열 숫자를 입력하시오. ");
        for(int i=0; i<box.length; i++){
           box[i] = scan.nextInt();
        }
        for(int i=0; i<box.length; i++){
            System.out.print(box[i]+ " ");
        }

        // 배열의 합계 더하기
        int sum = 0;
        for (int num : box){
            sum += num;
        }
        // 배열의 합계에서 평균값 구하기
        double avg = (double)sum/boxsize;
        
        System.out.println("배열의 합계 : "+sum);
        System.out.printf("평균 값은 : %.2f\n",avg);
    }
}
