package lang.ex;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";

        StringBuilder stringBuilder = new StringBuilder(str).reverse();


        System.out.println(stringBuilder);
    }
}
