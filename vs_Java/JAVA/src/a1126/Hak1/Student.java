package a1126.Hak1;

public class Student {
    
    // 필드 선언
    private String name;
    private String studentId;

    // 생성자 선언
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    // getter 생성
    public String getName() {
        return name;
    }
    public String getStudentId() {
        return studentId;
    }

    // toString() 메소드 오버라이드
    @Override
    public String toString() {
        return "이름 =" + name + ", 학번 =" + studentId;
    }

}
