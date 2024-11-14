package a1113;

import java.util.Scanner;

public class QQ1 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

         System.out.print("첫번째 정수를 입력하세요 : ");
         int name = scan.nextInt();
         System.out.print("두 번째 정수를 입력하세요 : ");
         int name2 = scan.nextInt();
        
        System.out.printf("%d + %d = %d\n",name,name2,(name+name2));
        System.out.printf("%d - %d = %d\n",name,name2,(name-name2));
        System.out.printf("%d * %d = %d\n",name,name2,(name*name2));
        System.out.printf("%d / %d = %d\n",name,name2,(name/name2));
        System.out.printf("%d % %d = %d\n",name,name2,(name%name2));
    }
}
