package a1125.bank;

import java.util.Scanner;

public class BankApplication {
    // 모든 계좌 정보 저장 - 하나의 배열에 저장하므로
    // 새로운 배열을 만들 필요가 없으므로 static을 사용 하였다.
    private static Account[] accountArray = new Account[100];

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("---------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("---------------------------------------------------");
            System.out.print("선택> ");

            int selectNo = Integer.parseInt(scan.nextLine());

            if (selectNo == 1) {
                createAccount();
            } else if (selectNo == 2) {
                accountList();
            } else if (selectNo == 3) {
                deposit();
            } else if (selectNo == 4) {
                withdraw();
            } else if (selectNo == 5) {
                run = false;
            }
            System.out.println("프로그램을 종료합니다. 감사합니다.");
        }
    }

    // 계좌 생성 메소드
    private static void createAccount() {
        System.out.println("-----------");
        System.out.println(" 계좌생성 ");
        System.out.println("-----------");
        System.out.print("계좌번호:");
        String ano = scan.nextLine();

        System.out.print("계좌주:");
        String owner = scan.nextLine();

        System.out.print("초기입금액: ");
        int balance = Integer.parseInt(scan.nextLine());

        Account newAccount = new Account(ano, owner, balance);
        for (int i = 0; i < accountArray.length; i++) {// 0부터 100까지 순회하면서
            if (accountArray[i] == null) {// 비어있는 방이있으면
                accountArray[i] = newAccount;
                System.out.println("결과 : 계좌가 생성되엇습니다.");
                break;
            }
        }
        // accountArray[0] = newAccount("110-110","홍길동",10000)
        // accountArray[1] = newAccount("110-110","홍길동",10000)
    }

    // 계좌 목록 메소드
    private static void accountList() {
        System.out.println("-----------");
        System.out.println(" 계좌생성 ");
        System.out.println("-----------");
        for (int i = 0; i < accountArray.length; i++) {
            Account account = accountArray[i];
            if (account != null) {
                System.out.print(account.getAno());
                System.out.print("      ");
                System.out.print(account.getOwner());
                System.out.print("      ");
                System.out.print(account.getBalance());
                System.out.println();
            }
        }
    }

    // 예금하기 메소드
    private static void deposit() {
        System.out.println("-----------");
        System.out.println("예금");
        System.out.println("-----------");
        System.out.print("계좌번호 : ");
        String ano = scan.nextLine();
        System.out.print("예금액: ");
        int money = Integer.parseInt(scan.nextLine());
        Account account = findAccount(ano); // 일치하는 계좌번호 찾기
        if (account == null) {
            System.out.println("결과 : 일치하는 계좌가 없습니다.");
            return;
        }
        // 현재 계좌 잔액을 getter로 불러와서 예금액(money)를 더하고
        // setBalance로 더한 금액을 넣어주기.
        account.setBalance(account.getBalance() + money);
        System.out.println(money + " 원이 예금 되었습니다.");
    }

    // 계좌번호 일치하는지 확인하는 메소드
    private static Account findAccount(String ano) {
        // 비어있는 객체를 만든다.(반환 되는 내용을 담아갈 객체)
        Account account = null;

        for (int i = 0; i < accountArray.length; i++) {
            // accountArray[i] 배열에 내용이 있다면
            if (accountArray[i] != null) {
                // 배열의 계좌 번호를 dbAno에 대입
                String dbAno = accountArray[i].getAno();
                if (dbAno.equals(ano)) {
                    account = accountArray[i];
                    break;
                }
            }
        }
        return account;
    }

    // 출금하기 메소드
    private static void withdraw() {
        System.out.println("-----------");
        System.out.println("출금");
        System.out.println("-----------");
        System.out.print("계좌번호 : ");
        String ano = scan.nextLine();
        System.out.print("출금액: ");
        int money = Integer.parseInt(scan.nextLine());
        Account account = findAccount(ano); // 일치하는 계좌번호 찾기
        if (account == null) {
            System.out.println("결과 : 일치하는 계좌가 없습니다.");
            return;
        }
        account.setBalance(account.getBalance() - money);
        System.out.println(money + " 원이 출금 되었습니다.");
    }

   
}
