package lang.ex;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] parts = email.split("@");

        System.out.println("id: " + parts[0]);
        System.out.println("domain: " + parts[1]);

    }
}
