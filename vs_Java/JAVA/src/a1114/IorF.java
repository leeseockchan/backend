import java.util.Scanner;

public class IorF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("숫자를 입력 하세요 : ");
        double num = scan.nextDouble();

        if (num > 0) {
            System.out.println("입력 값은 양수 입니다.");
        } else if (num < 0) {
            System.out.println("입력 값은 음수 입니다.");
        } else{
            System.out.println("입력한 숫자는 0 입니다.");
        }
    }
}
