package lang.system;

import java.util.Arrays;
import java.util.Map;

public class SystemMain {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();

        System.out.println("l = " + l);

        // 현재 시간(나노초)를 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        // 환경 변수를 읽는다. 운영체제가 사용하는 거
        System.out.println("getenv: " + System.getenv());

        // 시스템 속성을 읽는다. 자바가 사용하는 거
        System.out.println("properties = " + System.getProperties());
        System.out.println("java version: " + System.getProperty("java.version"));

        // 배열을 고속으로 복사한다.
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        System.out.println(copiedArray);
        System.out.println("arr: " + Arrays.toString(copiedArray));

        System.exit(0);
        System.out.println("AAa");
    }
}
