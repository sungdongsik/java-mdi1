package enumeration.ex2;

public class ClassGradleEx2_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int discount = discountService.discount(ClassGradle.BASIC, price);
        System.out.println("discount = " + discount);
    }
}
