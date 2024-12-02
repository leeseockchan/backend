package a1202.hak;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        // StudentDTO student1 = new StudentDTO(0, "테스트1", 11, 100, 90, 80);
        // StudentDTO student2 = new StudentDTO(0, "테스트2", 21, 90, 85, 92);
        // StudentDTO student3 = new StudentDTO(0, "테스트3", 31, 80, 100, 70);
        // ArrayList<StudentDTO> arrList = new ArrayList();

        // arrList.add(student1);
        // arrList.add(student2);
        // arrList.add(student3);
        // System.out.println(arrList);

        StudentDAO test = new StudentDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. 학생정보 입력");
            System.out.println("2. 학생정보 삭제");
            System.out.println("3. 학생정보 검색");
            System.out.println("4. 학생정보 수정");
            System.out.println("5. 학생 목록 보기");
            System.out.println("6. 파일로 저장하기");
            System.out.println("7. 학생정보 파일 불러오기");
            System.out.println("0. 종료");
            System.out.print(">>");
            int choice;
            
            try{
                choice = sc.nextInt();
            }catch(Exception e){
                choice = -1;
            }
            
            if(choice == 1){
                test.userInsert();
            }else if(choice == 2 ){
                test.userDelete();
            }else if(choice == 3){
                test.userSelect();
            }else if(choice == 4){
                test.userUpdate();
            }else if(choice == 5){
                test.printAll();
            }else if(choice == 0){
                System.out.println("종료 합니다.");
                sc.close();
                System.exit(0);
            }
        }
    }
}
