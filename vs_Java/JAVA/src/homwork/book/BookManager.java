package homwork.book;

import java.util.ArrayList;

// 책 관리자 
public class BookManager {
    private ArrayList<Book> bookList; // 도서 집합
    private ArrayList<Book> bookReservation; // 예약 도서

    public BookManager(){
        bookList = new ArrayList<>(); // 초기 도서 저장 리스트
        bookReservation = new ArrayList<>(); 

        bookList.add(new Book("인간실격",   "다자이 오사무", "1111", 8100));
        bookList.add(new Book("이것이 자바다",   "신용권", "1212", 38000));
        bookList.add(new Book("리액트",   "이인제", "2222", 33000));
    }

    // 예약 가능 도서 조회 메소드
    public void checkBookList() {
        
    }



}
