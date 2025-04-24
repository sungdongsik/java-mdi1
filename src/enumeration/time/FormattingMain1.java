package enumeration.time;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        // 포맷팅: 날짜를 문자로
        LocalDate of = LocalDate.of(2024, 12, 31);
        System.out.println("date: " + of);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");

        // 포맷
        String format = of.format(formatter);
        System.out.println("format: " + format);

        String input = "2030년 01월 01일";
        LocalDate parse = LocalDate.parse(input, formatter);
        System.out.println("parse: " + parse);
    }
}
