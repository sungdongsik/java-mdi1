package lang.math;

public class MathMain {
    public static void main(String[] args) {
        // 기본 연산 메서드
        System.out.println("max(10, 20): " + Math.max(10, 20)); // 최대값
        System.out.println("max(10, 20): " + Math.min(10, 20)); // 최대값
        System.out.println("max(10, 20): " + Math.abs(-20)); // 절대값

        System.out.println(" ceil(2.1): " + Math.ceil(2.1));
        System.out.println(" ceil(2.1): " + Math.floor(2.1));
        System.out.println(" ceil(2.1): " + Math.round(2.1));


        System.out.println(" ceil(2.1): " + Math.sqrt(2.1));
        System.out.println(" ceil(2.1): " + Math.random());
    }
}
