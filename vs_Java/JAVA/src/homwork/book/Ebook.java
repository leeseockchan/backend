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
            System.out.println("8. 도서 현황 보기");
            System.out.println("9. 종료");
            System.out.print("메뉴 번호를 입력해주세요 > ");
            int select = scan.nextInt();
            scan.nextLine();

            switch (select) {
                case 1:
                    System.out.println("예약 가능한 도서");
                    manager.checkBookList();
                    break;
                case 2:
                    System.out.println("도서 예약하기");
                    System.out.println("예약하시려는 도서의 제목을 입력해주세요");
                    String reserbook = scan.nextLine();
                    if(manager.bookReservation(reserbook)){
                        System.out.println("도서 예약을 진행하겠습니다.");
                    }else{
                        System.out.println("도서가 예약이 불가능하거나 존재하지 않습니다.");
                    }
                    break;
                case 3:
                    System.out.println("예약한 도서 보기");
                    manager.bookReservationList();
                    break;
                case 4:
                    System.out.print("추가를 원하는 도서 이름 입력 \n 도서 제목>> ");
                    String newTitle = scan.nextLine();
                    System.out.print("책의 코드 번호 >> ");
                    String newCode = scan.nextLine();
                    System.out.print("책의 가격 입력 >> ");
                    double newPrice = scan.nextDouble();
                    scan.nextLine();
                    System.out.println(newTitle+" 추가하려는 도서 제목 ");
                    if(newTitle.equals("")){
                        System.out.println("추가하려는 도서 제목입력 \n 도서 제목 >> ");
                        newTitle = scan.nextLine();
                    }
                    manager.addBookList(newTitle, newCode, newPrice);
                    System.out.println("도서 추가 완료");
                    break;
                case 5:
                    System.out.println("삭제를 시작합니다.");
                    System.out.print("삭제를 원하는 도서명을 입력하세요 ");
                    String delete = scan.nextLine();
                    if(delete.equals("")){
                        System.out.println("삭제를 원하시는 도서명을 재입력\n 도서 제목>> ");
                        delete = scan.nextLine();
                    }
                    manager.deleteBookList(delete);
                    System.out.println("삭제 완료 !");
                    break;
                case 6:
                    System.out.println("수정을 시작 합니다.");
                    System.out.print("수정을 원하는 도서명을 적어주세요 ");
                    String upname = scan.nextLine();
                    System.out.println(upname);
                    if(upname.equals("")){
                        System.out.print("추가 수정을 원한다면 도서명을 입력해주세요 \n nema >>");
                    }
                    break;
                case 7:
                    System.out.println();
                    break;
                
                case 8:

                    break;
                case 9: 
                    System.out.println("시스템을 종료합니다.");
                    library = false;
                    scan.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("다시 입력해 주세요");
                    break;
            }
        }
    }
}
