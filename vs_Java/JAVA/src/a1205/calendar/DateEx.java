package a1205.calendar;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateEx {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();  // 현재 날짜와 시간
        System.out.println("기본 ISO 형식: " + now);  // 2024-12-05T16:38:27.496349800

        // 커스텀 포맷
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시mm분ss초");
        String formattedDate = now.format(formatter);
        System.out.println("포맷팅된 날짜: " + formattedDate);
    }
}