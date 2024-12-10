package homwork.order;

public class AdminMenu extends AbstractMenu {

    private static final AdminMenu instance = new AdminMenu(null);
    private static final String ADMIN_MENU_TEXT = // 기본 문구
                    "1: 상품 등록하기\n" +
                    "2: 상품 삭제하기\n" +
                    "3: 상품 목록 보기\n" +
                    "00: 메인 메뉴로 이동\n\n" +
                    "메뉴를 선택하세요: ";

    public AdminMenu(Menu prevMenu) {
        super(ADMIN_MENU_TEXT, prevMenu); // 부모생성자 호출
    }
    public static AdminMenu getInstance() {
        return instance;
    }
    

    
}
