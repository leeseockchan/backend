package homwork.book;

// 책 클래스

public class Book {
    // 필드 선언
    private String title; // 제목
    private String author; // 저자
    private String code; // 책의 코드
    private double price; // 책의 가격
    private boolean inventory;    // 책 재고
    




// "1. 예약 가능한 도서 조회");
//             System.out.println("2. 도서 예약하기");
//             System.out.println("3. 예약한 도서 확인하기");
//             System.out.println("4. 도서 추가하기");
//             System.out.println("5. 도서 삭제하기");
//             System.out.println("6. 도서 정보 수정하기");
//             System.out.println("7. 도서 재고 파악하기");
//             System.out.println("8. 종료");
    
    // 생성자 생성
    public Book() {
    }
    public Book(String title, String author, String code, double price) {
        this.title = title;
        this.author = author;
        this.code = code;
        this.price = price;
        this.inventory = true;
    }
    public Book(String title, String code, double price) {
        this.title = title;
        this.code = code;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInventory() {
        return inventory;
    }
    public void setInventory(boolean inventory) {
        this.inventory = inventory;
    }
    public void fail() {
        this.inventory = false;
    }



    @Override
    public String toString() {
        return "책 이름 : " + title + "\t저자 : " + author + "\t책의 코드 : " + code + "\t책의 가격 : " + price + "\t책 구매가능 여부 : "+(inventory ? "구매 가능" : "구매 불가능");
    }
 

}
