package a1113;

import java.util.Scanner;

public class Googoodan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("값을 입력 하세요 : ");
        int cap = scan.nextInt();

        for (int i=1; i<10; i++){
            System.out.println(cap + " X "+i+" = "+ (cap*i));
        }
        
        // int value =0;
        // int result = 0;
        // for(int i=1;i<10;i++){
        //     value++;
        //     result = cap * value;
        //     System.out.println(cap + " X "+value+" = "+ result);
        // }
    }
}
