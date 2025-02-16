package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        //Random random = new Random();
        Random random = new Random(1);

        int i = random.nextInt();
        System.out.println("i = " + i);

        double v = random.nextDouble();
        System.out.println("v = " + v);

        boolean b = random.nextBoolean();
        System.out.println("b = " + b);

        //범위 조회
        int i1 = random.nextInt(10);// 0 ~ 9
        System.out.println("i1 = " + i1);

        int i2 = random.nextInt(10) + 1;// 1 ~ 10까지 출력
        System.out.println("i2 = " + i2);
    }
}
