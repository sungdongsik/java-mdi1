package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("Basic" + Gradle.BASIC.getClass());
        System.out.println("Basic" + Gradle.GOLD.getClass());
        System.out.println("Basic" + Gradle.DIAMOND.getClass());

        System.out.println("ref BASIC = " + refValue(Gradle.BASIC));
        System.out.println("ref BASIC = " + refValue(Gradle.GOLD));
        System.out.println("ref BASIC = " + refValue(Gradle.DIAMOND));
    }

    private static String refValue(Object gradle){
        return Integer.toHexString(System.identityHashCode(gradle));
    }
}
