package a1202.hak_createfile;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDAO {
    private ArrayList<StudentDTO> slist;
    Scanner sc = new Scanner(System.in);
    FileClass file = new FileClass("student", "student_Grade");

    public StudentDAO() {   // 생성 메소드
        slist = new ArrayList<StudentDTO>();
        // 기본 데이터 - 4명의 더미데이터 생성
        StudentDTO s1 = new StudentDTO(0, "테스트1", 11, 100, 90, 80);
        StudentDTO s2 = new StudentDTO(0, "테스트2", 21, 90, 80, 70);
        StudentDTO s3 = new StudentDTO(0, "테스트3", 31, 80, 70, 100);
        StudentDTO s4 = new StudentDTO(0, "테스트4", 41, 75, 86, 90);
        slist.add(s1);
        slist.add(s2);
        slist.add(s3);
        slist.add(s4);
        System.out.println(slist);
    }
    
    private void insert(StudentDTO s) {
        slist.add(s);
    }

    private void delete(int index) {
        slist.remove(index);
    }

    private StudentDTO select(int index) {
        return slist.get(index);
    }

    private void update(int index, StudentDTO s) {
        slist.set(index, s);
    }

    // 학생 추가
    public void userInsert() {
        // System.out.println("< 학생을 추가하기 >");
        // System.out.print("이름 : ");
        // String name = sc.next();
        // System.out.print("나이 : ");
        // int age = sc.nextInt();
        // System.out.print("국어점수 : ");
        // int kor = sc.nextInt();
        // System.out.print("영어점수 : ");
        // int eng = sc.nextInt();
        // System.out.print("수학점수 : ");
        // int math = sc.nextInt();
        // StudentDTO student = new StudentDTO(slist.size(), name, age, kor, eng, math);

        // slist.add(student);
        // System.out.println(slist);

        /* 객체를 만들어 한 것 */
        StudentDTO s = new StudentDTO();
        s.setId(slist.size());
        System.out.println("<학생 추가하기>");
        System.out.print("이름 : ");
        s.setName(sc.next());
        System.out.print("나이 : ");
        s.setAge(sc.nextInt());
        System.out.print("국어점수 : ");
        s.setKor(sc.nextInt());
        System.out.print("영어점수 : ");
        s.setEng(sc.nextInt());
        System.out.print("수학점수 : ");
        s.setMath(sc.nextInt());

        insert(s);
        System.out.println("학생이 추가 되었습니다.");

    }

    // 학생 삭제
    public void userDelete() {
        System.out.println("<학생 정보 삭제>");
        int index = searchIndex();
        if (index == -1) {
            System.out.println("찾으시는 학생이 없습니다.");
        } else {
            String name = slist.get(index).getName();
            delete(index);
            // slist.remove(index);
            System.out.println(name + "학생정보를 삭제하였습니다.");
        }
    }

    // 학생 찾기 메소드
    private int searchIndex() {
        int index = -1;
        System.out.println("학생 이름을 입력해 주세요");
        System.out.print(">> ");
        String name = sc.next();
        for (int i = 0; i < slist.size(); i++) { // slist는 arrayList 배열 이름과 입력한 이름 비교
            if (slist.get(i).getName().equals(name))
                ;
            index = i; // 같은 데이터가 있으면 i를 index에 대입
            break;
        }
        return index;
    }

    // 학생 정보 메소드
    public void userSelect() {
        System.out.println("<학생정보보기>");
        int index = searchIndex();
        if (index == -1) {
            System.out.println("찾는 학생이 없습니다.");
        } else {
            System.out.println(" 이름\t 나이\t 국어\t 영어 \t수학\n" +
                    "-------------------------------------------------");
            StudentDTO s = select(index);
            System.out.println(s);
        }
    }

    // 정보 수정 메소드
    public void userUpdate() {
        System.out.println("<학생 정보 수정>");
        int index = searchIndex();
        if (index == -1) {
            System.out.println("찾는 학생이 없습니다.");
        } else {
            StudentDTO s = new StudentDTO(); // 빈 객체를 만든다.
            s.setId(slist.get(index).getId()); // 기존 인덱스 번호에 해당 리스트에 있는 아이디
            s.setName(slist.get(index).getName());
            s.setAge(slist.get(index).getAge());
            System.out.println("< " + slist.get(index).getName() + "학생의 정보 수정");
            System.out.print("국어점수 : ");
            s.setKor(sc.nextInt());
            System.out.print("영어점수 : ");
            s.setEng(sc.nextInt());
            System.out.print("수학점수 : ");
            s.setMath(sc.nextInt());

            update(index, s);

        }

    }

    // 학생 목록 보기
    public void printAll() {
        System.out.println(" 이름\t\t 나이\t 국어\t 영어 \t수학\n" +
                "-------------------------------------------------");
        for (int i = 0; i < slist.size(); i++) {
            System.out.println(slist.get(i).toString());
        }
    }

    public void dataSave() throws Exception{
        file.create();
        String str = "이름\t\t 나이\t 국어\t 영어\t 수학\n"+
        "------------------------------\n";
        for(int i = 0 ;i < slist.size();i++){
            str += slist.get(i).toString()+"\n";
        }
        file.write(str);
    }

    public void dataLoad(){
        try{
            file.read();
        }catch(Exception e){
            System.out.println("읽을 파일이 없습니다.");
        }
    }

}
