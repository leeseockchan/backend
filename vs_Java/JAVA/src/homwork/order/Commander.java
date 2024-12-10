package homwork.order;

public class Commander {
    public static void main(String[] args) {
        System.out.println("발주 프로그램을 실행 하셨습니다.");

        Menu menu - MainHome.getInstance();

        while (menu != null) { // 메뉴가 있으면 반복
            menu.print();   // menu를 출력
            menu = menu.next(); // 사용자 입력후 다음 메뉴로 갱신
        }
        System.out.println("프로그램이 종료 됩니다.");

    }
}

interface Menu{
    void print();   // 메뉴 출력
    Menu next();    // 다음 메뉴로 이동
    // next 이름에 메소드, 메뉴 타입의 객체를 반환

}