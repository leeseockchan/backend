package a1126.Doseo;

public class PrintedBook extends Book {

    // 필드 선언
    private int pageCount; // 페이지 수
    private double weight; // 책의 무게

    // 생성자 생성
    public PrintedBook(String title, String author, String iSBN, int pageCount, double weight) {
        super(title, author, iSBN);
        this.pageCount = pageCount;
        this.weight = weight;
    }

    // 오버라이드
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Page Count : " + pageCount);
        System.out.println("Weight : " + weight + " kg");
    }

}
