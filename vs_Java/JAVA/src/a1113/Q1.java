package a1113;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

         System.out.print("첫번째 정수를 입력하세요 : ");
         int name = scan.nextInt();
         System.out.print("두 번째 정수를 입력하세요 : ");
         int name2 = scan.nextInt();
        //   첫번 째 방법
        //  System.out.println(name+name2);
        //  System.out.println("======================");
        //  System.out.println(name-name2);
        //  System.out.println("======================");
        //  System.out.println(name*name2);
        //  System.out.println("======================");
        //  System.out.println(name/name2);
        //  System.out.println("======================");
        //  System.out.println(name%name2);
        //  System.out.println("======================");
        
        // 두번 째 방법
        // int result1 = name+name2;
        // int result2 = name-name2;
        // int result3 = name*name2;
        // int result4 = name/name2;
        // int result5 = name%name2;
        // System.out.println(name+"+"+name2+"="+result1);
        // System.out.println(name+"-"+name2+"="+result2);
        // System.out.println(name+"*"+name2+"="+result3);
        // System.out.println(name+"/"+name2+"="+result4);
        // System.out.println(name+"%"+name2+"="+result5);

        // 세번 째 방법
        System.out.println(name+" + "+name2+" = "+(name+name2));
        System.out.println(name+" - "+name2+" = "+(name-name2));
        System.out.println(name+" * "+name2+" = "+(name*name2));
        System.out.println(name+" / "+name2+" = "+(name/name2));
        System.out.println(name+" % "+name2+" = "+(name%name2));
    }
}
