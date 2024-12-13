package homwork.proexample;

import java.util.Scanner;

public class Customer {

    public static void main(String[] args) {
        Sub suppot = new Sub();

        while (true) {
            suppot.Logo();
            suppot.Menu();
            Scanner scan = new Scanner(System.in);
            System.out.print("메뉴를 선택해 주세요 >>");
            String select = scan.nextLine();

            if (select.equals("1")) { // 단어 추가
                suppot.AddProduct();
            } else if (select.equals("2")) { // 단어 찾기
                suppot.SearchProduct();
            } else if (select.equals("3")) { // 단어 삭제
                suppot.DeleteProduct();
            } else if (select.equals("4")) { // 단어 리스트 목록
                suppot.ListProduct();
            } else if (select.equals("5")) { // 나가기
                suppot.Exit();
                break;
            } else {
                System.out.println("1 ~ 5 까지 숫자만 입력하세요. ");
            }
        }
    }
}
