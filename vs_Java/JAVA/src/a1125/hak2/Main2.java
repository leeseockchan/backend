package a1125.hak2;

public class Main2 {
    public static void main(String[] args) {
        // 객체 생성
        Student student1 = new Student("홍길동", 20241234, 90, 85, 92);

        System.out.println("이름 : "+ student1.getName() + "\n학번 : "+student1.getStudnetId() + "\n국어점수 : "+ student1.getKor() + "\t수학 점수 : "+ student1.getMath() + "\t영어 점수 : "+ student1.getEng());
        System.out.printf("평균 : %.2f\n", student1.getAverage());
        // student1.getAverage();   -return 값이 없이 호출하는 방법
        
        Student student2 = new Student();   // 기본 생성자

        student2.setName("야놀자");
        student2.setStudnetId(20241235);
        student2.setKor(90);
        student2.setMath(80);
        student2.setEng(72);
        System.out.println("이름 : "+ student2.getName() + "\n학번 : "+student2.getStudnetId() + "\n국어점수 : "+ student2.getKor() + "\t수학 점수 : "+ student2.getMath() + "\t영어 점수 : "+ student2.getEng());
        System.out.printf("평균 : %.2f", student2.getAverage());
    }
}
