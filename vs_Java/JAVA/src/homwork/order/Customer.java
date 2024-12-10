package homwork.order;

import java.time.Instant;

public class Customer {
    private String kind;    // 상품 종류
    private String name;    // 상품명 
    private long code;      // 상품 코드

    
    public String getKind() {
        return kind;
    }
    public String getName() {
        return name;
    }
    
    // 생성자 오버로딩
    public Customer(String kind, String name) {
        this.code = Instant.now().getEpochSecond(); // 타임 스탬프
        this.kind = kind;
        this.name = name;
    }
    public Customer(String kind, String name, long code) {
        this.kind = kind;
        this.name = name;
        this.code = code;
    }


    @Override
    public String toString() {
        return String.format("상품 코드 [%d]=> %s {%s}",code,name,kind);
    }
   
}







// // 상품 종류 3분류
// class kindOf extends Customer{
    //     private String meat;    // 육류
    //     private String fish;    // 어류
    //     private String greengrocery;// 채소류
    
// 상품을 골라 담아 총 합 금액 출력.

    // 관리자 메뉴
// 상품 추가, 상품 삭제, 상품 목록

    // private int price;      // 상품 가격
// }
