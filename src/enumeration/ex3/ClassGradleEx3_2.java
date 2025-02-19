package enumeration.ex3;

public class ClassGradleEx3_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int discount = discountService.discount(Gradle.BASIC, price);
        System.out.println("discount = " + discount);
    }
}
