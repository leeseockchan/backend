package a1115;

import java.util.Arrays;
import java.util.Scanner;

public class Jang {
    public static void main(String[] args) {
        // Scanner 사용 하여 String nextLine() 활용

        // 배열 입력하여 추가하는 식으로 구성하기
        // 배열 추가, 배열 삭제, 배열.length
        // 프로그램 종료.
        boolean bogo = true;
        Scanner scan = new Scanner(System.in);
        String[] cart= {" "};
        
        while (bogo) {
            System.out.println("========================================================");
            System.out.println("1. 아이템 추가 | 2. 아이템 삭제 | 3. 카트 확인 | 4. 종료");
            System.out.println("========================================================");
            System.out.print("선택 > ");
            // 메뉴 사항 선택 번호 입력
            int choose = Integer.parseInt(scan.nextLine());
            

            switch (choose) {   

                case 1: // 1.아이템 추가
                System.out.println("추가 할 아이템 > ");
                // 추가할 아이템 글자 입력
                String add = scan.nextLine();
                cart = addWord(cart, add);

                System.out.println(   +"이(가) 카트에 추가 되었습니다.");

                case 2: // 2. 아이템 삭제
                System.out.println("삭제할 아이템 > ");
                // 배열 중 일치하는 것 삭제하기
                String delete = scan.nextLine();
                cart = removeWord(cart, delete);
                System.out.println(delete+"이(가) 카트에서 삭제 되었습니다.");

                case 3: // 3. 카트 확인
                System.out.println("현재 카트 : ["+ Arrays.toString(cart) +"]");
                

                case 4: // 4. 종료
                bogo =false;
                break;

                default:
                System.out.println("카트에 담을 수 없습니다.");
                break;
            }
            System.out.println(" ");
        }
        System.out.println("프로그램을 종료하겠습니다.");
        scan.close();
    }
}
