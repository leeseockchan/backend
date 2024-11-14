public class Age {
    public static void main(String[] args) {
        int age = 20;
        String result = ((age<13)? "어린이" : (age<=19)? "청소년" : "성인");
        System.out.println("당신은 "+result+ "입니다.");
    }
}
