package homwork.book;

import java.util.Scanner;

public class Ebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BookManager manager = new BookManager(); // 책 관리 객체
        boolean library = true;
        while (library) {
            System.out.println("\n 도서 관리 시스템에 오신 것을 환영 합니다.");
            System.out.println("1. 예약 가능한 도서 조회");
            System.out.println("2. 도서 예약하기");
            System.out.println("3. 예약한 도서 확인하기");
            System.out.println("4. 도서 추가하기");
            System.out.println("5. 도서 삭제하기");
            System.out.println("6. 도서 정보 수정하기");
            System.out.println("7. 도서 재고 파악하기");
            System.out.println("8. 종료");
            System.out.print("메뉴 번호를 입력해주세요 > ");
            int select = scan.nextInt();
            scan.nextLine();

            switch (select) {
                case 1:
                    System.out.println("예약 가능한 도서");
                    manager.checkBookList();
                    break;
                case 2:

                    break;
                case 3:
                
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8: 

                    break;

                default:

                    break;
            }
        }
    }
}
