package a1115;

public class WhileSum {
    public static void main(String[] args) {
        
    // 1부터 100까지 합계를 구하시오.
        int a = 1;

        int result=0;
        
        while(a<=100){
            result = a+result;
            a++;

        }
        System.out.println("총합 : "+result);

    }
}
