package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        String format = String.format("num: %d, bool: %b, str: %s" ,    num, bool, obj, str);

        System.out.println("format: " + format);
    }
}
