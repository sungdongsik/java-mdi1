package enumeration.time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime nowDate = LocalTime.now();
        LocalTime of = LocalTime.of(9, 10, 30);
        System.out.println("nowDate = " + nowDate);
        System.out.println("of = " + of);

        //계산(불변)
        LocalTime localTime = of.plusSeconds(300);
        System.out.println("localTime = " + localTime);

    }
}
