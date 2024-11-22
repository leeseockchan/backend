package a1122.shopping;

public class ProductEx {
    public static void main(String[] args) {
        Product laptop = new Product("노트북", 12000000, 10);
        Product desktop = new Product("데스크탑", -1000000, 5);

        // System.out.println("제품명 : "+ laptop.getName());
        // System.out.println("가격 : "+ laptop.getPrice());
        // System.out.println("재고 : "+ laptop.getPrice());
        System.out.println(laptop.toStr());
        System.out.println(desktop.toStr());

        // 가격 수정
        // laptop.setPrice(-500);
        // System.out.println("수정 된 가격 : "+laptop.getPrice());

        // 재고 추가
        laptop.addStock(5);

        // 상품 판매
        laptop.sellProduct(16);

    }
}
