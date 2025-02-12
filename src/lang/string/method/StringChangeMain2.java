package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String str = "     Hello, Java! Welcome to Java  ";

        System.out.println("소문 변환: " + str.toLowerCase());
        System.out.println("소문 변환: " + str.toUpperCase());
        System.out.println("소문 변환: " + str.trim());
        System.out.println("소문 변환: " + str.strip());
    }
}
