package a1126.Doseo;

public class LibraryEx {
    public static void main(String[] args) {
        
        // Ebook 객체 생성
        Ebook eBook = new Ebook("이것이 자바다", "신용권", "2015-1113", 5.6, "PDF");

        //PrintedBook 객체 생성
        PrintedBook printedBook = new PrintedBook("처음만난리액트", "이인제", "2016-0124", 464, 0.8);

        //도서 정보 출력
        System.out.println("Ebook Information : ");
        eBook.displayInfo();
        System.out.println();
        System.out.println("PrintedBook Information : ");
        printedBook.displayInfo();
        System.out.println();
    }
}
