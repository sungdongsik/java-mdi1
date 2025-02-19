package enumeration.ex01;

public class DiscountService {
    public int discount(String gradle, int price){
        int discountPercent = 0;

        if(gradle.equals(StringGrade.BASIC)){
            discountPercent = 10;
        }else if(gradle.equals(StringGrade.GOLD)){
            discountPercent = 20;
        }else if(gradle.equals(StringGrade.DIAMOND)){
            discountPercent = 30;
        }else {
            System.out.println(gradle + ": 할인을 안합니다.");
        }

        return price * discountPercent / 100;
    }
}
