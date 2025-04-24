package enumeration.time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
        Period of = Period.ofDays(10);
        System.out.println("of: " + of);

        LocalDate of1 = LocalDate.of(2030, 1, 1);
        LocalDate plus = of1.plus(of);
        System.out.println("plus: " + plus);

        LocalDate of2 = LocalDate.of(2023, 1, 1);
        LocalDate of3 = LocalDate.of(2023, 4, 2);
        Period between = Period.between(of2, of3);
        System.out.println("between: " + between.getMonths() + "개월" + between.getDays() + "일");

    }
}
