package a1118;

public class SubString1 {
    public static void main(String[] args) {
        String ssn = "970204-1234567";
        String firstNum = ssn.substring(0, 6);
        // 0 번째 부터 6번째 전까지를 의미
        System.out.println(firstNum);
        String secondNum = ssn.substring(7);
        //  7번쨰 부터 끝까지를 의미
        System.out.println(secondNum);
        
    }
}
