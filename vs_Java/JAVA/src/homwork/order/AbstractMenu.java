package homwork.order;

import java.util.Scanner;

abstract class AbstractMenu implements Menu {
    protected String menuText; // 기본 문구
    protected Menu prevMenu; // 이전 메뉴
    protected static final Scanner scanner = new Scanner(System.in);

    public AbstractMenu(String menuText, Menu prevMenu) {
        this.menuText = menuText;
        this.prevMenu = prevMenu;
    }

    public void print() {
        System.out.println("\n" + menuText);
    }

    public void setPrevMenu(Menu prevMenu) {
        this.prevMenu = prevMenu;
    }

}
