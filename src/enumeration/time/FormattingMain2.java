package enumeration.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        // 포맷팅: 날짜를 문자로
        LocalDateTime now = LocalDateTime.of(2024, 12, 31, 13, 30 ,59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = now.format(formatter);

        System.out.println("날짜와 시간 포맷팅: " + format);
        System.out.println(now);

        // 파싱: 문자를 날짜와 시간으로
        String dateTImeString = "2030-01-01 11:30:00";
        LocalDateTime parse = LocalDateTime.parse(dateTImeString, formatter);
        System.out.println("문자 파싱: " + parse);

    }
}
