package a1115;

import java.util.Scanner;

public class DoWhile1 {
    public static void main(String[] args) {
        System.out.print("메뉴를 선택해 주세요");
        System.out.print("프로그램을 종료 하려면 q를 입력하세요");

        Scanner scan = new Scanner(System.in);
        int menuNumber;
        String menuName;

        do {
            System.out.println("========= 점심 메뉴판 =========");
            System.out.println("1. 서브웨이");
            System.out.println("2. 김치찌개");
            System.out.println("3. 짱깨");
            System.out.println("4. 맥도날드");
            System.out.println("5. 피자");
            System.out.println("6. 냉면");
            System.out.println("7. 육계장");
            System.out.println("8. 뼈다귀해장국");
            System.out.println("9. 라멘");
            System.out.println("10. 천둥식당");
            System.out.print("메뉴 번호 : ");

            menuNumber = scan.nextInt();

            switch (menuNumber) {
                case 1:
                    menuName = "서브웨이";
                    break;
                case 2:
                    menuName = "김치찌개";
                    break;
                case 3:
                    menuName = "짱깨";
                    break;
                case 4:
                    menuName = "맥도날드";
                    break;
                case 5:
                    menuName = "피자";
                    break;
                case 6:
                    menuName = "냉면";
                    break;
                case 7:
                    menuName = "육계장";
                    break;
                case 8:
                    menuName = "뼈다귀해장국";
                    break;
                case 9:
                    menuName = "라멘";
                    break;
                case 10:
                    menuName = "천둥식당";
                    break;

                default:
                    menuName = ("굶음");
                    break;
            }

            if (menuNumber != 0 && menuNumber <= 10) {
                System.out.println(menuName + "을/를 먹었습니다.");
            } else if (menuNumber != 0) {
                System.out.println(menuName);
            }
        } while (menuNumber != 0);
        // 무한루프 : 조건이 항상 trur가 되는 경우 반복이 계속되는 상황
        // - 반드시, 반복문 안에 종료조건을
        System.out.println("메뉴판을 종료합니다.");

        scan.close();
    }
}
