package lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = "Hello, Java!";
        System.out.println("길이: " + str.length());
        System.out.println("길이: " + str.isEmpty());
        System.out.println("길이: " + str.isBlank());
        System.out.println("길이: " + "                 ".isEmpty());
        System.out.println("길이: " + "                 ".isBlank());

        char c = str.charAt(7);
        System.out.println("c: " + c);
    }
}
