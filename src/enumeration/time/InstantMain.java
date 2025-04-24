package enumeration.time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("now: " + now);

        ZonedDateTime now1 = ZonedDateTime.now();
        Instant from = Instant.from(now1);
        System.out.println("from: " + from);

        Instant instant = Instant.ofEpochSecond(0);
        System.out.println("ins:: " + instant);

        Instant instant1 = instant.plusSeconds(3600);
        System.out.println("1: " + instant1);

        long epochSecond = instant1.getEpochSecond();
        System.out.println("epoch: " + epochSecond);
    }
}
