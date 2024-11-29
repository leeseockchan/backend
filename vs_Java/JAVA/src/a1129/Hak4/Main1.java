package a1129.Hak4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        // 학생수를 입력
        System.out.println("학생 수를 입력하세요 : ");
        int n = sc.nextInt();
        sc.nextLine(); // 개행문자소비

        // 학생 배열 생성
        // Student[] students = new Student[n];

        // 학생 정보 입력
        for (int i = 0; i < n; i++) {
            System.out.print("학생이름: ");
            String name = sc.nextLine();
            System.out.print("학생나이: ");
            int age = sc.nextInt();
            System.out.print("학생학번: ");
            int studentId = sc.nextInt();
            sc.nextLine(); // 개행문자소비

            // students[i] = new Student(name, age, studentId);
            students.add(new Student(name, age, studentId));
        }

        // 정렬 옵션 선택
        System.out.println("정렬 기준을 선택하세요.");
        System.out.println("1. 이름");
        System.out.println("2. 나이");
        System.out.println("3. 학번");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: // 이름 기준
                Collections.sort(students, new NameComparator());
                break;
            case 2: // 나이 기준
                Collections.sort(students, new AgeComparator());
                break;
            case 3:
                Collections.sort(students, new StudentIdComparator());
                break;
            default:
                System.out.println("1~3 중으로 골라주세요");
                break;
        }

        // 정렬된 결과중력
        System.out.println("정렬된 학생 목록:");
        for (Student student : students) {
            System.out.println(student);
        }

    }

}

class Student {
    private String name;
    private int age;
    private int studentId;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStudentId() {
        return studentId;
    }

    public Student(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + "]";
    }

}

// 이름 정렬 메소드
class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
// 나이 정렬 메소드
class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }

}
// 학번 정렬 메소드
class StudentIdComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getStudentId(), o2.getStudentId());
    }

}