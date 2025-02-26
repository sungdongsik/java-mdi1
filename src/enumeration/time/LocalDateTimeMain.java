package enumeration.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime of = LocalDateTime.of(2016, 8, 12, 3, 12, 30);
        System.out.println("nowDt = " + nowDt);
        System.out.println("of = " + of);

        // 날짜와 시간 분리
        LocalDate localDate = of.toLocalDate();
        System.out.println("localDate = " + localDate);
        LocalTime localTime = of.toLocalTime();
        System.out.println("localTime = " + localTime);

        //날짜와 시간 합체
        LocalDateTime of1 = LocalDateTime.of(localDate, localTime);
        System.out.println("of1 = " + of1);

        // 계산(불변)
        LocalDateTime dateTime = of.plusDays(1000);
        System.out.println("dateTime = " + dateTime);

        LocalDateTime dateTime1 = of.plusYears(-20000);
        System.out.println("dateTime1 = " + dateTime1);

        //비교
        System.out.println("이전인가?" + nowDt.isBefore(of));

    }
}
