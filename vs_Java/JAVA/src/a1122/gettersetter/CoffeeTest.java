package a1122.gettersetter;

public class CoffeeTest {
    public static void main(String[] args) {

        Coffee c = new Coffee("아메리카노", 3000);
        // 현재의 커피 이름과 가격을 출력해 보세요
        // 가격을 500원 인상해주세요
        System.out.printf("메뉴의 이름 : %s\n",c.getName());
        System.out.printf("가격은 : %s원\n", c.getPrice());
        System.out.printf("인사 후 가격은 : %s원\n", c.getPrice()+500);


    }
}

class Coffee{

    private String name;    // 직접 name에 접근을 할수가 없다.
    private int price;

    
    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {   // Getter 값을 부를 떄 (사용할 때)
        return name;
    }
    public void setName(String name) {  // setter 값을 정할 때
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    
}