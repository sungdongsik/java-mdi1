package enumeration.ex2;

public class DiscountService {
    public int discount(ClassGradle classGradle, int price){
        int discountPercent = 0;

        if(classGradle == ClassGradle.BASIC){
            discountPercent = 10;
        }else if(classGradle == ClassGradle.GOLD){
            discountPercent = 20;
        }else if(classGradle == ClassGradle.DIAMOND){
            discountPercent = 30;
        }else {
            System.out.println("할인 x");
        }


        return price * discountPercent / 100;
    }
}
