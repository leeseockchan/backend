public class Switch1 {
    public static void main(String[] args) {
        int time = (int)(Math.random()*4)+8;

            
        switch(time){
            case 8:
                System.out.println("출근 해야 합니다~");
                break;
            case 9:
                System.out.println("회의 해야 합니다~~");
                break;
            case 10:
                System.out.println("업무를 봐야 합니다~");
                break;
            default:
                System.out.println("외근을 나가야 합니다~~");
                break;
        }




        // switch(time){
        //     case 8:
        //         System.out.println("출근 해야 합니다~");
        //         break;
        //     case 9:
        //         System.out.println("회의 해야 합니다~~");
        //         break;
        //     case 10:
        //         System.out.println("업무를 봐야 합니다~");
        //         break;
        //     case 11:
        //         System.out.println("외근을 나가야 합니다~~");
        //         break;
        // }
    }
}
