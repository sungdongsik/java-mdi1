package enumeration.ref3;


public class EnumRefMain3_2 {
    public static void main(String[] args) {
        int price = 10000;

        System.out.println("basic = " + Gradle.BASIC.discount(price));
        System.out.println("gold = " + Gradle.GOLD.discount(price));
        System.out.println("DIAMOND = " + Gradle.DIAMOND.discount(price));
    }
}
