package enumeration.time;

import java.time.LocalDateTime;

public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime of = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        System.out.println("Year: " + of);
    }
}
