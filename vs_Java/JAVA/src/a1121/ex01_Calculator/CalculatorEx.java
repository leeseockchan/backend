package a1121.ex01_Calculator;

public class CalculatorEx {
    public static void main(String[] args) {
        
        //계산기 객체를 생성
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 5;
        double x = 10.25;
        double y= 5.4;
        int arr[] = {1,2,3,4,5};

        int plus = calculator.plus(a,b);
        int minus = calculator.minus(a,b);
        double multipl = calculator.multipl(x,y);
        double division = calculator.division(x,y);
        double remainder = calculator.remainder(x,y);
        int sum = calculator.sum(arr);
        double avg = calculator.avg(arr);

        System.out.println("plus : "+plus);
        System.out.println("minus : "+minus);

        //printf("포맷(형식),변수") :%,X,Y(리터럴)
        // -형식 기호를 사용하여 값을 형식에 따라 표현하는 메소드
        // - X : 양수 크기만틈 칸을 지정하고 오른쪽 정렬
        //        음수 크기 만큼 칸을 지정하고 왼쪽 정렬
        // - Y : 지정한 크기만큼 소수점 아래 자리수를 표현(반올림)
        //        -(리터럴) : %d (정수), %f(실수), %s(문자열)

        System.out.printf("multipl : %5.2f\n",multipl);
        System.out.printf("division: %5.2f\n", division);
        System.out.printf("remainder: %5.2f\n", remainder);
        System.out.println("sum : "+ sum);
        System.out.println("avg : "+ avg);


    }
}
