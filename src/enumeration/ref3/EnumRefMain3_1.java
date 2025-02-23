package enumeration.ref3;


public class EnumRefMain3_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int BASIC = discountService.discount(Gradle.BASIC, price);
        int GOLD = discountService.discount(Gradle.GOLD, price);
        int DIAMOND = discountService.discount(Gradle.DIAMOND, price);

        System.out.println("basic = " + BASIC);
        System.out.println("gold = " + GOLD);
        System.out.println("DIAMOND = " + DIAMOND);
    }
}
