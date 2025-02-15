package lang.ex;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] a = fruits.split(",");
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

        String join = String.join("->", a);

        System.out.println("a=>" + join);
    }
}
