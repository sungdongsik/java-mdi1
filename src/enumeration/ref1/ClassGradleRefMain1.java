package enumeration.ref1;


public class ClassGradleRefMain1 {
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
