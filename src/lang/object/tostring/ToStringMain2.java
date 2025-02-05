package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog = new Dog("멍멍1", 2);

        System.out.println("ToStringMain2.main");
        System.out.println("car:" + car.toString());
        System.out.println("dog:" + dog.toString());

        System.out.println("ToStringMain2.println");
        System.out.println(car);
        System.out.println(dog);

        System.out.println("ToStringMain2.다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog);

        String i = Integer.toHexString(System.identityHashCode(dog));

        System.out.println(i);
    }
}
