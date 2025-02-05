package lang.object.ex;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(100,20);
        Rectangle rectangle2 = new Rectangle(100,20);

        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle2 == rectangle1);
        System.out.println(rectangle2.equals(rectangle1));
    }
}
