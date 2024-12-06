package a1206.movie;

import java.util.ArrayList;

public class Seats {
    public static final int MAX_ROW = 5; // 최대 행의 수
    public static final int MAX_COL = 5; // 최대 열의 수
    private String[][] map = new String[MAX_ROW][MAX_COL]; // 좌석의 예매 현황

    public Seats(ArrayList<Reservation> reservations) throws Exception {
        for (int i = 0; i < MAX_ROW; i++) {
            for (int j = 0; j < MAX_COL; j++) {
                map[i][j] = "o"; // 초기 좌석 상태설정(좌석 예매 가능) - 전좌석에 'o'입력
            }
        }

        for (int i = 0; i < reservations.size(); i++) {
            Reservation r = reservations.get(i);
            String seatName = r.getSeatName();
            mark(seatName); // 예매 된 좌석임을 표시
        }

    }

    // 예약 된 좌석 메소드
    public void mark(String seatName) throws Exception {
        char[] temp = seatName.toCharArray(); // 좌석명을 문자 배열로 변환
        // A-1 이런 식의 좌석 번호
        int row = temp[0] - 'A'; // 행의 인덱스 계산 temp[1] = A-1 의 '-'를 의미하기 때문에 필요가 없다.
        int col = temp[2] - '1'; // 열의 인덱스 계산
        if ("x".equals(map[row][col])) {
            throw new Exception("이미 예매된 좌석입니다.");
        }
        map[row][col] = "x";
    }

    public void show() {
        System.out.println("--------------------");
        System.out.println(" S C R E E N");
        System.out.println("--------------------");
        for (int i = 0; i < MAX_ROW; i++) {
            System.out.printf("%c ", 'A' + i);
            for (int j = 0; j < MAX_COL; j++) {
                System.out.printf(" %s", map[i][j]); // 특정 좌석 예매 현황 출력
            }
            System.out.println();
        }
        System.out.println("   1 2 3 4 5");
    }

}
