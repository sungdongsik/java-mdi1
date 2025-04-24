package enumeration.time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {
    public static void main(String[] args) {

        for(String a : ZoneId.getAvailableZoneIds()){
            System.out.println(a);
            ZoneId zoneId = ZoneId.of(a);
            System.out.println(zoneId + "|" + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("z: " + zoneId);

        ZoneId of = ZoneId.of("Asia/Seoul");
        System.out.println("of: " + of);
    }
}
