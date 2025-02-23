package enumeration.ref3;


public class EnumRefMain3_4 {
    public static void main(String[] args) {
        int price = 10000;
        Gradle[] values = Gradle.values();

        for (Gradle gradle : values){
            printDiscount(gradle, price);
        }

    }

    private static void printDiscount(Gradle gradle, int price){
        System.out.println(gradle.name() + " 등급의 할인 금액: " + gradle.discount(price));
    }
}
