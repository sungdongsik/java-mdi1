package enumeration.ref1;


public class DiscountService {
    public int discount(ClassGradle classGradle, int price){

        return price * classGradle.getDiscountPercent() / 100;
    }
}
