package homwork.book;

import java.util.ArrayList;

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
        System.out.println("예약 가능 도서 조회하기");
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
        for(Book book : bookList){
            if(book.getTitle().equalsIgnoreCase(delete)){
                if(book.isInventory()){
                    bookList.remove(book);
                    result= true;
                    break;
                }else{ // 예약 중에 있으면 삭제 불가
                    result =false;
                    break;
                }
            }
        }
        if (result) {
            System.out.println("삭제가 완료 되었습니다.");
        }else{
            System.out.println("삭제 도중 오류가 발생했습니다.");
        }
    }




}
