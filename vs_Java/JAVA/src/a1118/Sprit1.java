package a1118;

public class Sprit1 {
    public static void main(String[] args) {
        String board = "1,자바학습,참조타입 String을 학습합니다.,홍길동";
        // 문자열 배열로 분리

        String[] toekns = board.split(",");
        
        // System.out.println("번호: " + toekns[0]);
        // System.out.println("제목: " + toekns[1]);
        // System.out.println("내용: " + toekns[2]);
        // System.out.println("저자: " + toekns[3]);
        
        for (int i = 0; i < toekns.length; i++) {
            System.out.println(toekns[i]);
        }

    }
}
