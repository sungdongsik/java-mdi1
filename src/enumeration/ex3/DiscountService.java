package enumeration.ex3;
public class DiscountService {
    public int discount(Gradle classGradle, int price){
        int discountPercent = 0;

        if(classGradle == Gradle.BASIC){
            discountPercent = 10;
        }else if(classGradle == Gradle.GOLD){
            discountPercent = 20;
        }else if(classGradle == Gradle.DIAMOND){
            discountPercent = 30;
        }else {
            System.out.println("할인 x");
        }


        return price * discountPercent / 100;
    }
}
