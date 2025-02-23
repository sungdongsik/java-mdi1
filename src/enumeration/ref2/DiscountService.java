package enumeration.ref2;

public class DiscountService {
    public int discount(Gradle classGradle, int price){

        return price * classGradle.getDiscountPercent() / 100;
    }
}
