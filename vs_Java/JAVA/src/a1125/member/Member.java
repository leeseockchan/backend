package a1125.member;

public class Member {
    public static void main(String[] args) {
        MemberTest user1 = new MemberTest("홍길동", "hong");
    }
}
class MemberTest{
    // 필드 선언    
    private String name;
    private String id;
    private String password;
    private int age;

    // 생성자 선언
    public MemberTest(String name, String id) {
        this.name = name;
        this.id = id;
    }

   

    

}
