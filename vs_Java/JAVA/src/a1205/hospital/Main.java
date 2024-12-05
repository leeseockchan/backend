package a1205.hospital;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PatientManager pm = new PatientManager();

        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n");
        System.out.println(pm.hospital);
        System.out.println("\t\t    어서오세요. JAVA 병원입니다.");
        while (true) {
            System.out.println("\n=========== 메인 메뉴 ===========\n");
            System.out.println("1. 환자 등록");
            System.out.println("2. 등록 정보 보기");
            System.out.println("3. 관리자 메뉴");
            System.out.println("0. 종료\n");
            System.out.print("입력 > ");
            int choice = -1;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자만 입력해주세요");
                sc.next();
                continue;
            }

            switch (choice) {
                case 1:
                    pm.patientAppointment(); // 환자등록
                    break;
                case 2:
                    pm.patientPrint(); // 환자조회
                    break;
                case 3:
                    if (!checkAdminPw()) {
                        System.out.println("권한이 없습니다.");
                        break;
                    }
                    pm.adminMenu(); // 관리자 메뉴
                    break;
                case 0:
                    System.out.println("시스템을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("잘못 입력 하였습니다.");
                    System.out.println("다시 입력해 주세요");
                    break;
            }

        }

    }

    // 관리자 비밀번호
    private static boolean checkAdminPw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("관리자 비밀번호를 입력하세요");

        String adminPw = sc.nextLine();
        return "admin1234".equals(adminPw);
    }

}
