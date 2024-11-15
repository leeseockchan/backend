package a1115;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        boolean bank = true;
        int total = 0;
        
        Scanner scan = new Scanner(System.in);
        
        while (bank) {
            
            System.out.println("==========================================");
            System.out.println("1 : 예금 | 2 : 출금 | 3 : 잔고 | 4 : 종료");
            System.out.println("==========================================");
            System.out.print("선택 > ");
            int choose = Integer.parseInt(scan.nextLine());
            
            switch (choose) {
                
                case 1:
                    System.out.print("예금액 > ");
                    total += Integer.parseInt(scan.nextLine());
                    break;
                case 2:
                    System.out.print("출금액 > ");
                    total -= Integer.parseInt(scan.nextLine());
                    break;
                case 3:
                    System.out.print("잔고 > ");
                    System.out.println(total);
                    break;
                case 4:
                    bank = false;
                    break;
                default:
                    System.out.println("잘못 입력 하셨습니다.");
                    break;
            }
            System.out.println();
        }
        System.out.println("프로그램을 종료 하겠습니다.");
        scan.close();
    }

}
