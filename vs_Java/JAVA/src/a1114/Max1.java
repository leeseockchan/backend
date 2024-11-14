import java.util.Scanner;

public class Max1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int num1 = scan.nextInt();
        System.out.print("두 번째 숫자를 입력하세요 : ");
        int num2 = scan.nextInt();
        System.out.print("세 번째 숫자를 입력하세요 : ");
        int num3 = scan.nextInt();
        

        int max = num1;
        if(num2 > max){
            max = num2;
        }
        if(num3 >max){
            max = num3;
        }

        System.out.print("가장 큰 값은 "+max+" 입니다.");

    }
}
