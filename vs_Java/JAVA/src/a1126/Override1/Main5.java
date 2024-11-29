package a1126.Override1;

// 모든 자바 클래스는 Object라는 클래스를 상속한다.
// 보통은 Object 생략
public class Main5 extends Object {

    public static void main(String[] args) {
        Person person = new Person("이순신", 41);
        System.out.println(person);
        // 객체 person -> person.toString() 생략된 형태
        // toString()은 Object에서 상속받은 메소드,
        // 객체의 문자열 표현을 정의하는 메소드
    }
}

class Person {

    // 필드 선언
    private String name;
    private int age;

    // 생성자 선언
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // public String toStr() {
    // return String.format("이름 : %s, 나이 : %d", name, age);
    // }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    // toString()을 오버라이드 하면 객체 정보를 사람이 읽을 수 있는 형태로
    // 출력 할 수 있어 디버깅, 로깅, 출력 등에 매우 유용하다.
    

}