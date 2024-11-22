package a1122.student;

public class StudentEx {
    public static void main(String[] args) {
        Student student1 = new Student("홍길동", 20241234, 90, 85, 92);

        System.out.println(student1.toStr());
        // student1.averageScore();
        System.out.println(student1.averageScore());
        
    }
}
