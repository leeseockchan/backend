package a1125.hak2;

public class Student {
    // getter, setter, 생성자를 활용한 연습 문제
    // 문제 1: 학생 클래스 만들기
    // 문제 설명:

    // 학생의 이름, 학번, 세 과목의 점수를 저장하는 Student 클래스를 생성하세요.
    // 각 변수에 대한 private 접근 제한자를 사용하여 정보를 보호하고, getter와 setter 메소드를 통해 값을 조회하고 변경하도록
    // 하세요.
    // 생성자를 이용하여 학생 정보를 초기화하고, 평균 점수를 계산하는 메소드를 추가하세요.

    // 필드 선언
    private String name;
    private int studnetId;
    private int kor, math, eng;

    // 기본 생성자
    public Student (){

    }
    // 생성자 선언
    public Student(String name, int studnetId, int kor, int math, int eng) {
        this.name = name;
        this.studnetId = studnetId;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }

    // 값을 호출 getter
    public String getName() {
        return name;
    }
    // 값을 지정 setter
    public void setName(String name) {
        this.name = name;
    }

    public int getStudnetId() {
        return studnetId;
    }
    public void setStudnetId(int studnetId) {
        this.studnetId = studnetId;
    }

    public int getKor() {
        return kor;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
    }

    public int getEng() {
        return eng;
    }
    public void setEng(int eng) {
        this.eng = eng;
    }

    // 평균 값 메소드
    public double getAverage() {
        double result = ( kor + math + eng ) / 3.0;
        return result;
    }
    // public void getAverage() { -return 값이 없는 메소드-
    //     double result = ( kor + math + eng ) / 3.0;
    //     System.out.println(result);
    // }
    

}
