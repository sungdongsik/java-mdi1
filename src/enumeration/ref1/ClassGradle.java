package enumeration.ref1;

public class ClassGradle {
    public static final ClassGradle BASIC =  new ClassGradle(10);
    public static final ClassGradle GOLD =  new ClassGradle(20);
    public static final ClassGradle DIAMOND =  new ClassGradle(30);

    private final int discountPercent;

    private ClassGradle(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }


}
