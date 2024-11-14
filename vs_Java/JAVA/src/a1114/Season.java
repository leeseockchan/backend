import java.util.Scanner;

public class Season {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("계절이 궁금한 달을 입력하세요 = ");
        int month = scan.nextInt();
        
        // switch(month){
        //     case 3:
        //         System.out.println(month+"월은 "+"따듯한 봄 이에요");
        //         break;
        //     case 4:
        //         System.out.println(month+"월은 "+"따듯한 봄 이에요");
        //         break;
        //     case 5:
        //         System.out.println(month+"월은 "+"따듯한 봄 이에요");
        //         break;
        //     case 6:
        //         System.out.println(month+"월은 "+"뜨거운 여름 이에요");
        //         break;
        //     case 7:
        //         System.out.println(month+"월은 "+"뜨거운 여름 이에요");
        //         break;
        //     case 8:
        //         System.out.println(month+"월은 "+"뜨거운 여름 이에요");
        //         break;
        //     case 9:
        //         System.out.println(month+"월은 "+"선선한 가을 이에요");
        //         break;
        //     case 10:
        //         System.out.println(month+"월은 "+"선선한 가을 이에요");
        //         break;
        //     case 11:
        //         System.out.println(month+"월은 "+"선선한 가을 이에요");
        //         break;
        //     case 12:
        //         System.out.println(month+"월은 "+"차가운 겨울 이에요");
        //         break;
        //     case 1:
        //         System.out.println(month+"월은 "+"차가운 겨울 이에요");
        //         break;
        //     case 2:
        //         System.out.println(month+"월은 "+"차가운 겨울 이에요");
        //         break;
        //     default :
        //         System.out.println("잘못 입력 하신거 같아요");
        // }

        switch(month){
            case 3,4,5 -> System.out.println(month+"월은 "+"따듯한 봄 이에요");
            case 6,7,8 -> System.out.println(month+"월은 "+"뜨거운 여름 이에요");
            case 9,10,11 -> System.out.println(month+"월은 "+"선선한 가을 이에요");
            case 12,1,2 -> System.out.println(month+"월은 "+"차가운 겨울 이에요");
            default -> System.out.println("잘못 입력 하신거 같아요");
        }

        scan.close();
    }
}
