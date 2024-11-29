package a1126.Hak1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("학생 이름을 입력하세요 : ");
        String name = scan.nextLine();
        System.out.println("학생 학번을 입력하세요 : ");
        String studentId = scan.nextLine();
        System.out.println("학생 성적을 입력하세요 : ");
        int score = scan.nextInt(0);

        //Grade 객체 생성
        Grade grade = new Grade(name, studentId, score);

        // toString 메소드를 통해 학생 정보 및 성적 출력
        System.out.println(grade.toString());

        scan.close();

    }
}
