package lang.string.method;

public class StringChangeMain1 {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java";

        System.out.println("인덱스 7부터의 부분 문자열: " + str.substring(7));
        System.out.println("인덱스 7부터의 부분 문자열: " + str.substring(7, 12));

        System.out.println("결합: " + str.concat("!!!!!!"));

        System.out.println("replace: " + str.replace("Java", "Hi"));
    }
}
