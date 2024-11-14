public class InfinityNaN {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;

        double z = x/y;
        // double z = x%y;
        // System.out.println(z);
        
        // 알맞은 코드
        if(Double.isInfinite(z) || Double.isNaN(z)){
            System.out.println(" 값산출 불가");
        }else{
            System.out.println(z+2);
        }
    }
}
