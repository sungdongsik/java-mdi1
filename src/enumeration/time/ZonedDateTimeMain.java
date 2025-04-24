package enumeration.time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("now: " + now);

        LocalDateTime of = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        ZonedDateTime of1 = ZonedDateTime.of(of, ZoneId.of("Asia/Seoul"));
        System.out.println("of1: " + of1);

        ZonedDateTime of2 = ZonedDateTime.of(2030, 1, 1, 13, 30, 50, 0, ZoneId.of("Asia/Seoul"));
        System.out.println("of2: " + of2);

        ZonedDateTime utc = of2.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("utc: " + utc);
    }
}
