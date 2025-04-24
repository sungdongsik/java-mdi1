package enumeration.time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration: " + duration);

        LocalTime of = LocalTime.of(1, 0);
        System.out.println("of: " + of);

        LocalTime plus = of.plus(duration);
        System.out.println("plus: " + plus);

        LocalTime of1 = LocalTime.of(9, 0);
        LocalTime of2 = LocalTime.of(10, 0);

        Duration between = Duration.between(of1, of2);
        System.out.println("차이: " + between.getSeconds());
        System.out.println("근무시간: " + between.toHours() + "시간" + between.toMillisPart() + "분");
    }
}
