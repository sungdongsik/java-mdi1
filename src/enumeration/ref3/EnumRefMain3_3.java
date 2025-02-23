package enumeration.ref3;


public class EnumRefMain3_3 {
    public static void main(String[] args) {
        int price = 10000;

        printDiscount(Gradle.BASIC, price);
        printDiscount(Gradle.GOLD, price);
        printDiscount(Gradle.DIAMOND, price);
    }

    private static void printDiscount(Gradle gradle, int price){
        System.out.println(gradle.name() + " 등급의 할인 금액: " + gradle.discount(price));
    }
}
