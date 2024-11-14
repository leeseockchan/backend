import java.util.Scanner;

public class Celrinder {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        
        System.out.print("궁금한 달을 입력 해보세요 = ");
        int month = scr.nextInt();
        
        if((month >= 3)&&(month <= 5)){
            System.out.println("봄 입니다.");
        }else if((month >= 6)&&(month <=8)){
            System.out.println("여름 입니다.");
        }else if((month >= 9) && (month <= 11)){
            System.out.println("가을 입니다.");
        }else if(month == 12){
            System.out.println("겨울 입니다.");
        }else{
            System.out.println("다시 생각해보시겠어요?");
        }
    }
}
