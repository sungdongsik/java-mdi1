package enumeration.time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println("nowDate = " + nowDate);
        LocalDate ofDate = LocalDate.of(2013, 10, 11);
        System.out.println("ofDate = " + ofDate);

        //계산(불변)
        LocalDate localDate = ofDate.plusDays(10);
        System.out.println("ofDate = " + localDate);
    }
}
