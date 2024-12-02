package homwork.book;

import java.util.ArrayList;
import java.util.Scanner;

// 책 관리자 
public class BookManager {
    private ArrayList<Book> bookList; // 도서 집합
    private ArrayList<Book> bookReservation; // 예약 도서

    public BookManager() {
        bookList = new ArrayList<>(); // 초기 도서 저장 리스트
        bookReservation = new ArrayList<>();

        bookList.add(new Book("인간실격", "다자이 오사무", "1111", 8100));
        bookList.add(new Book("이것이 자바다", "신용권", "1212", 38000));
        bookList.add(new Book("리액트", "이인제", "2222", 33000));
    }

    // 예약 가능 도서 조회 메소드
    public void checkBookList() {
        System.out.println("예약 가능한 도서 조회하기");
        for (Book book : bookList) {
            if (book.isInventory()) {
                System.err.println(book);
            }
        }
    }

    // 도서 예약하기
    public boolean bookReservation(String title) {
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isInventory()) {
                book.fail();
                bookReservation.add(book);
                return true;
            }

        }
        return false;
    }

    // 예약한 도서 목록 보기
    public void bookReservationList() {
        System.out.println("예약한 도서 : ");
        for (Book book : bookReservation) {
            System.out.println(book);
        }
    }

    // 도서 추가하기
    public void addBookList(String newTitle, String newCode, double newPrice) {
        bookList.add(new Book(newTitle, newCode, newPrice));
    }

    // 도서 삭제하기
    public void deleteBookList(String delete) {
        boolean result = false;
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(delete)) {
                if (book.isInventory()) {
                    bookList.remove(book);
                    result = true;
                    break;
                } else { // 예약 중에 있으면 삭제 불가
                    result = false;
                    break;
                }
            }
        }
        if (result) {
            System.out.println("삭제가 완료 되었습니다.");
        } else {
            System.out.println("삭제 도중 오류가 발생했습니다.");
        }
    }

    // 도서 수정
    public void upDateBook(String upname) {
        int i = 0;
        int index = -1;
        int menu = -1;
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        Book newA = new Book();
        System.out.println(upname);
        for (Book a : bookList) {
            i++;
            if (a.getTitle().equals(upname)) {
                index = i - 1;
                newA = a;
            }
            System.out.println(a.getTitle().equals(upname) + " " + a.getTitle() + " " + upname);
        }
        if (index != -1) {
            System.out.println("수정할 도서를 선택 하세요\n 1.도서명 2.저자 3.도서코드 4.책의가격 \n >> ");
            menu = scan.nextInt();
            scan.nextLine();
            while (flag) {
                switch (menu) {
                    case 1:
                        System.out.println("수정할 도서명");
                        newA.setTitle(scan.nextLine());
                        bookList.set(index, newA);
                        flag = false;
                        break;
                    case 2:
                        System.out.println("수정할 저자 이름");
                        newA.setAuthor(scan.nextLine());
                        bookList.set(index, newA);
                        flag = false;
                        break;
                    case 3:
                        System.out.println("수정할 도서 코드");
                        newA.setCode(scan.nextLine());
                        bookList.set(index, newA);
                        flag = false;
                        break;
                    case 4:
                        System.out.println("수정할 도서의 가격");
                        newA.setPrice(scan.nextDouble());
                        bookList.set(index, newA);
                        flag = false;
                        break;
                    default:
                        System.out.println(" 1~ 4번 중으로 입력하세요");
                        break;
                }
            }
        }else{
            System.out.println("찾는 도서가 없어 정보수정이 불가능 합니다.");
        }
    }

    // 예약 도서 조회
    public void informationBook(String bname) {
        for (Book info : bookList) {
            System.out.println(info.toString());
        }
    }

}
