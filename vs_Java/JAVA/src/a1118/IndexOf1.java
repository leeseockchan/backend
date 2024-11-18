package a1118;

public class IndexOf1 {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";
        int index = subject.indexOf("프로그래밍");
        // 출력 값 : 3
        // 이유인 즉슥 인덱스 순서로 0,1,2,3 번째에 있다는 뜻이다.
        System.out.println(index);
        String subString = subject.substring(index);
        // 출력 값 : 프로그래밍
        // 인덱스 번ㅇ호 3번부터 끝까지 문자열을 추출하여 subString 변수에 넣어라.
        System.out.println(subString);

        // ================= 인덱스 번호 ==============
        int location = subject.indexOf("자바");
        // "자바"가 있으면 인덱스 번호를 출력하고
        // "자바"가 없을시엔 -1을 반환한다.
        if (location != -1) {
            System.out.println("자바와 관련 된 책이군요");
        } else {
            System.out.println("자바와 관련 없는 책이군요");
        }

        // ============ 참 ,거짓 결과 ==============
        Boolean result = subject.contains("자바");
        // 참/\거짓 으로 결과를 출력 .contains
        // "자바" 가 있으면 true를 출력하지만 없다면 false를 반환한다.
        if (result) {
            System.out.println("자바와 관련 된 책이군요");
        } else {
            System.out.println("자바와 관련 없는 책이군요");
        }
        System.out.println(result);


        
    }
}
