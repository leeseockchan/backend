package a1122;

public class StudentTest {
    public static void main(String[] args) {
        // 객체 생성
        Student park = new Student(2019122104, "Park");
        Student kim = new Student(2019122105, "Kim");
        Student lee = new Student(2019122106, "Lee");
        System.err.printf("Student 객체 의 수 : %d ",Student.count);

    }
}
// 클래스 생성
class Student{
    // 클래스(static) 변수
    static int count = 0;    // 학생 수

    // 인스턴스 변수
    // 필드 선언
    int id;
    String name;

    // 생성자 선언
    public Student(int id, String name) {
        Student.count++;
        this.id = id;
        this.name = name;
    }
}