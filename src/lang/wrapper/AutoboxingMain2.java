package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        int value = 7;
        Integer integer = value; // 오토 박싱


        // Wrapper -> primitive
        int i = integer;
        System.out.println("i = " + i);
        System.out.println("integer = " + integer);
    }
}
