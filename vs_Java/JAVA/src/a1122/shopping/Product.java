package a1122.shopping;

public class Product {
    // 필드 선언    
    private String name;
    private double price;
    private int stock;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {    // 유효성 검사 - 유효한 값만 필드에 저장 할수 있게 검증
        // 가격이 0 보다 낮을 경우엔 가격을 0으로 지정 해준다.
        if(price < 0){
            this.price = 0;
        }else{
            this.price = price;
        }
        
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if(stock < 0){
            this.stock = 0;
        }else{
            this.stock =stock;
        }
        
    }

    // 생성자 선언
    public Product(String name, double price, int stock) {
        this.name = name;
        setPrice(price);    // 생성자 안에 메소드를 같이 선언 해줄수 있다.
        setStock(stock);       
    }


    public String toStr() {
        return String.format("제품명 : %s , 가격 : %.3f , 재고 : %d",name,price,stock);
    }

    // 재고 추가 메소드
    public void addStock(int amount) {
       if(amount < 0){
        System.out.println("재고 추가 실패 : 음수 값은 허용 되지 않습니다.");
       }else{
        stock += amount;
        System.out.println(amount + "개의 재고가 추가 되었습니다.");
       }
    }

    public void sellProduct(int amount) {
        if(amount > stock){
            System.out.println("판매 실패 : 재고가 부족합니다.");
        }else if(amount <= 0){
            System.out.println("판매 실패 : 수량을 다시 입력해 주세요");
        }else{
            stock -= amount;
            System.out.println(amount + " 개가 판매 되었어요.");
        }
        
    }


}
