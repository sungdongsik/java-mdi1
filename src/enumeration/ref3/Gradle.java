package enumeration.ref3;

public enum Gradle {
    BASIC(10), GOLD(20), DIAMOND(30)
    ;

    private final int discountPercent;

    Gradle(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    // 추가
    public int discount(int price){
        return price * discountPercent / 100;
    }
}
