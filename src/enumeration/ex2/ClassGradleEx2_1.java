package enumeration.ex2;

public class ClassGradleEx2_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int BASIC = discountService.discount(ClassGradle.BASIC, price);
        int GOLD = discountService.discount(ClassGradle.GOLD, price);
        int DIAMOND = discountService.discount(ClassGradle.DIAMOND, price);

        System.out.println("basic = " + BASIC);
        System.out.println("gold = " + GOLD);
        System.out.println("DIAMOND = " + DIAMOND);
    }
}
