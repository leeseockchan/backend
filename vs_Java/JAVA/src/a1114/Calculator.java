import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("첫번 째 숫자를 입력 하시오");
        double num1 = scan.nextDouble();
        System.out.print("연산자를 입력 하세요(+,-,*,/): ");
        char operator = scan.next().charAt(0);  //입력된 첫글자 *인덱스0* 문자 삽입

        System.out.print("두번 째 숫자를 입력 하시오");
        double num2 = scan.nextDouble();

        switch(operator){
            case '+':
                System.out.println("결과 : "+(num1+num2));
                break;
            case '-':
                System.out.println("결과 : "+(num1-num2));
                break;
            case '*':
                System.out.println("결과 : "+(num1*num2));
                break;
            case '/':
                if(num2 != 0){
                    System.out.println("결과 : "+(num1/num2));
                }else{
                    System.out.println("0으로는 나눌 수가 없어요!");
                }
                break;
            
            default:
                System.out.println("연산자를 잘못 입력 했어유~");

        }
        scan.close();

    }
}
