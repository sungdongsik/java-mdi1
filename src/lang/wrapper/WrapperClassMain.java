package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10); // 미래에 삭제 예정, 대신에 valueOf()를 사용
        Integer integer = Integer.valueOf(10); // -128 ~ 127 자주 사용하눈 숫자 값 재사용, 불변
        Long aLong = Long.valueOf(100);
        Double aDouble = Double.valueOf(100);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integer = " + integer);
        System.out.println("aDouble = " + aDouble);
        System.out.println("aLong = " + aLong);

        int i = integer.intValue();
        System.out.println("i = " + i);

        long l = aLong.longValue();
        System.out.println("l = " + l);

        System.out.println("비교");
        System.out.println("==:" + (newInteger.equals(integer)));

    }
}
