package a1120.Class_Chapter06;

public class StudentEx {

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "홍길동";
        st1.age = 24;
        st1.studentId = "20241120";
        System.out.println("st1 변수가 Student 객체를 참조합니다.");
        System.out.println("이름 : "+ st1.name);
        System.out.println("나이 : "+ st1.age);
        System.out.println("학번 : "+ st1.studentId);

        Student st2 =new Student();
        st2.name = "데드풀";
        st2.age = 41;
        st2.studentId = "20170920";
        System.out.println("st2 변수가 Student 객체를 참조합니다.");
        System.out.println("이름 : "+ st2.name);
        System.out.println("나이 : "+ st2.age);
        System.out.println("학번 : "+ st2.studentId);

    }
    
    


}
