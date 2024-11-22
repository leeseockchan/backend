package a1122.gettersetter;

public class AccountTest {
    public static void main(String[] args) {
        // 객체 생성
        Account acc = new Account();

        // 인스턴스 멤버 사용
        // acc.balance = 1000;
        acc.setBalance(1000);
        System.out.printf("잔액 : %d ", acc.getBalance());

    }
}

class Account {
    // 필드 선언
    private int balance;

    // 게터 메소드
    public int getBalance() {
        return balance;
    }

    // 세터 메소드
    public void setBalance(int balance) {
        this.balance = balance;
    }


}
