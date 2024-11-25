package a1125.object;

public class MonsterTest {
    public static void main(String[] args) {
        Monster orc = new Monster("오크", 30);
        Monster skeleton = new Monster("해골", 30);
        Monster.battle(orc, skeleton);

    }
}

class Monster {
    // 필드 선언
    private String name;
    private int hp;
    private static int maxHp = 30; // 모든 몬스터의 최대 최력

    // 생성자 선언
    public Monster(String name, int hp) {
        this.name = name;
        // this.hp = 30;
        this.hp = maxHp;
    }

    public static void battle(Monster a, Monster b) {
        while (a.hp > 0 && b.hp > 0) {
            Monster attacker = (Math.random() < 0.5) ? a : b;
            Monster defender = (attacker == a) ? b : a;
            attacker.attack(defender);
        }
    }

    private void attack(Monster enemy) {
        System.out.printf("[%s]의 공격\t", name);
        enemy.hp = enemy.hp - 10;
        System.out.printf("%s 체력 : %d/(%d)\n", enemy.name, enemy.hp, Monster.maxHp);
    }
}
