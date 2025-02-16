package lang.wrapper;

public class WrapperVsPRIMITIVE {
    public static void main(String[] args) {
        int iterations = 1_000_000_000;
        long startTime, endTime;

        // 기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();

        for (int i = 0; i < iterations; i++){
            sumPrimitive += i;
        }

        endTime = System.currentTimeMillis();

        System.out.println("sum: " + sumPrimitive);
        System.out.println("sum: " + (endTime - startTime));

        Long sumWrapper = 0L;

        startTime = System.currentTimeMillis();

        for (int i = 0; i< iterations; i++){
            sumWrapper += i;
        }

        endTime = System.currentTimeMillis();

        System.out.println("sum: " + sumWrapper);
        System.out.println("sum: " + (endTime - startTime));
    }
}
