package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        int value = 7;
        Integer integer = Integer.valueOf(value);


        // Wrapper -> primitive
        int i = integer.intValue();
        System.out.println("i = " + i);
        System.out.println("integer = " + integer);
    }
}
