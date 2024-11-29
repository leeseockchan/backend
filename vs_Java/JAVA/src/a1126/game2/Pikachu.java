package a1126.game2;

// 클래스 : 객체들을 정의하는 설계도
public class Pikachu {
    // 멤버 : 변수, 메소드
    private int energy;  // 멤버변수, 인스턴스 변수, 필드
    private String type;
    private int level;

    public int getLevel() {
        return level;
    }

    // 메소드(생성자) 오버로딩 - "메소드 중복 정의"
    public Pikachu(){

    }

    public Pikachu(int energy, String type) {
        this.energy = energy;
        this.type = type;
    }
    
    public Pikachu(int energy, String type, int level) {
        this.energy = energy;
        this.type = type;
        this.level = level;
    }


    public void run(){
        System.out.println("에너지 :: "+energy+"\n속성 :: "+type+"\n레벨 :: "+level);
    }


    public String aAttack() {
        return "10만 볼트";
    }

    public String bAttack() {
        return "전광석화";
    }

    @Override
    public String toString() {
        return "[energy=" + energy + ", type=" + type + ", level=" + level + ", aAttack() = " + aAttack()
                + ", bAttack() = " + bAttack() + "]";
    }
}
