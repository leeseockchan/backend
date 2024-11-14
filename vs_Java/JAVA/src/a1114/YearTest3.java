import java.util.Scanner;

public class YearTest3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("원하는 년도를 입력 하시오 = ");
        int year = scan.nextInt();

        if((year % 4 ==0 && year % 100 !=0)||year % 400 ==0){
            System.out.println("윤년 입니다.");
        }else{
            System.out.println("윤년이 아닙니다.");
        }

    }

}
