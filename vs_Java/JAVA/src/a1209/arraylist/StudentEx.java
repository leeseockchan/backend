package a1209.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 20, "S001"));
        students.add(new Student("Bob", 22, "S002"));
        students.add(new Student("Charlie", 19, "S003"));

        Student s4 = new Student();
        s4.setName("Tom");
        s4.setAge(23);
        s4.setStudentId("S004");
        students.add(s4);

        while (true) {
            System.out.println("----학생관리프로그램-----");
            System.out.println("1.학생 추가하기");
            System.out.println("2.학생 리스트 보여주기");
            System.out.println("3.학생 정보 수정");
            System.out.println("4.학생 정보 삭제");
            System.out.println("5.Exit");
            System.out.print("선택해주세요>>");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // 학생 추가
                    System.out.print("이름을 입력하세요 >> ");
                    String name = sc.nextLine();
                    System.out.print("나이를 입력하세요 >> ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("아이디를 입력하세요 >> ");
                    String id = sc.nextLine();

                    students.add(new Student(name, age, id));
                    System.out.println("학생이 추가 되었습니다.");

                    // Student s5 = new Student();
                    // System.out.print("이름을 입력하세요 >> ");
                    // s5.setName(sc.nextLine());
                    // System.out.print("나이를 입력하세요 >> ");
                    // s5.setAge(sc.nextInt());
                    // System.out.println("아이디를 입력하세요 >> ");
                    // s5.setStudentId(sc.nextLine());
                    // students.add(s5);
                    // System.out.println("학생이 추가 되었습니다.");
                    break;
                case 2:
                    // 학생 리스트 보여주기
                    if (students.isEmpty()) {
                        System.out.println("학생이 없습니다.");
                    } else {
                        for (Student student : students) {
                            System.out.println(student);
                        }
                    }
                    break;
                case 3:
                    // 학생 수정
                    System.out.println("수정할 학생의 id를 입력하세요 >> ");
                    String updateId = sc.nextLine();
                    boolean found = false;
                    for (Student student : students) {
                        if (student.getStudentId().equalsIgnoreCase(updateId)) {
                            System.out.print("새로운 이름 : ");
                            student.setName(sc.nextLine());
                            System.out.print("새로운 나이 : ");
                            student.setAge(sc.nextInt());
                            sc.nextLine();
                            System.out.println("수정이 완료 되었습니다.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("찾는 학생이 존재하지 않습니다.");
                    }
                case 4:
                    // 학생 삭제
                    System.out.println("삭제할 학생의 id를 입력하세요 >> ");
                    String deleteId = sc.nextLine();
                    found = false;
                    for (Student student : students) {
                        if (student.getStudentId().equalsIgnoreCase(deleteId)) {
                            students.remove(student);
                            System.out.println("학생 정보를 삭제했습니다.");
                            found = true;
                            break;
                        }
                    }
                    break;
                case 5:
                    // Exit
                    System.out.println("시스템을 종료합니다.");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못 입력 하였습니다.");
                    break;
            }
        }
    }
}
