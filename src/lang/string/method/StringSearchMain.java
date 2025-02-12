package lang.string.method;

public class StringSearchMain {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java world.";

        System.out.println("문자열에 'Java'가 포함되어 있는지: " + str.contains("Java"));
        System.out.println("문자열에 'Java'가 포함되어 있는지: " + str.indexOf("Java"));
        System.out.println("문자열에 'Java'가 포함되어 있는지: " + str.indexOf("Java", 10));


    }
}
