package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!";
        String str2 = "hello, java!";
        String str3 = "Hello, World!";

        System.out.println("equal: " + str1.equals(str2));
        System.out.println("equal: " + str1.equalsIgnoreCase(str2));

        System.out.println("str1 " + str1.compareTo(str3));

        System.out.println("str1 :" + str1.startsWith("Hello"));
    }
}
