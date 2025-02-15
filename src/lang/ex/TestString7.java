package lang.ex;

public class TestString7 {
    public static void main(String[] args) {
        String original = "   Hello Java   ";
        String trim = original.trim();
        String strim = original.strip();

        System.out.println("trim: " + trim);
    }
}
