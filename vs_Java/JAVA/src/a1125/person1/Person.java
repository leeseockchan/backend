package a1125.person1;

public class Person {

    // 전체 사람 수를 저장하는 정적변수
    private static int count;

    
    public static int getCount() {
        return count;
    }

    // 필드 선언
    private String name;    // 변수, 필드, 인스턴스 변수
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 생성자 선언
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    // 정적 메소드
    public static int getTotalCount() {
        return count;
    }



}
// 정적변수 (static 변수) - 클래스 변수
// 정적변수는 클래스에 속하고, 객체를 생성하지 않고도
// 클래스 이름으로 직접 접근 할수 있는 변수
// 즉 클래스의 모든 객체가 공유하는 하나의 값을 가진다.

