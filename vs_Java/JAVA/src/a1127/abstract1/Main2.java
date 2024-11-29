package a1127.abstract1;

abstract class GameCharacter {
    // 템플릿 메소드
    // 공통로직을 제공, 세부 구현은 자식이
    public void performAction() {
        prepare();  
        action();   // 추상 메소드로 생성
        finish();
    }

    private void prepare(){
        System.out.println("캐릭터를 준비 합니다.");
    }

    // 추상 메소드 : 구체적인 행동은 자식캐릭터에서 구현
    protected abstract void action();

    // 공통 종료 단계
    private void finish(){
        System.out.println("행동을 마무리 합니다.");
    }
}
// 전사 클래스 
class Warrior extends GameCharacter{

    @Override
    protected void action() {
        System.out.println("전사가 칼을 휘뚜루마뚜루~ ");
    }
}

// 마법사 클래스 
class Mage extends GameCharacter{

    @Override
    protected void action() {
        System.out.println("마법사가 마법봉을 휘뚜루마뚜루~");
    }
}

public class Main2 {
    public static void main(String[] args) {
        GameCharacter warrior = new Warrior();
        GameCharacter mage = new Mage();

        System.out.println("전사 행동 : ");
        warrior.performAction();

        System.out.println("\n마법사 행동 : ");
        mage.performAction();
        
    }
}
