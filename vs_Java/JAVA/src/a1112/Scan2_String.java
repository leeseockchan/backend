package a1112;

import java.util.Scanner;
// alt + shift + O 누를시 생긴다.

public class Scan2_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine(); // 입력을 String으로 가져옵니다.
        System.out.println("입력한 문자열: " + str);
    }
}
