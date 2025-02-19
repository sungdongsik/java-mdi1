package enumeration.ex2;

public class ClassRefMain {
    public static void main(String[] args) {
        System.out.println("class Basic" + ClassGradle.BASIC.getClass());
        System.out.println("class Basic" + ClassGradle.GOLD.getClass());
        System.out.println("class Basic" + ClassGradle.DIAMOND.getClass());

        System.out.println("class Basic" + ClassGradle.BASIC);
        System.out.println("class Basic" + ClassGradle.GOLD);
        System.out.println("class Basic" + ClassGradle.DIAMOND);
    }
}
