package a1120;

public class RoleEx {
    public static void main(String[] args) {
        Role role = Role.ADMIN;

        //역할 출력
        System.out.println("현재 역할 : "+ role);
        System.out.println("일반 사용자 역할 : "+ Role.USER);
        //역할 확인
        if(role ==Role.ADMIN){
            System.out.println("관리자 권한이 있습니다.");
        }else if (role == Role.USER){
            System.out.println("일반 사용자 입니다.");
        }
        // eunm 타입을 쓰는 이유
        // 1. 가독성 ADNIN, USER = 같이 의미
        // 2 안정성
        // String role = "ADMIN" - 오타 가능성이 크다
        // 3. 유지 보수성
        // 값이 변경되거나 추가될 경우, enum 을 사용하면 해당 값으리 정의만 수정

        

    }
}
