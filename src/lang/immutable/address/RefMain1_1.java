package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address address = new Address("서울");
        Address b = address;

        System.out.println("a = " + address);
        System.out.println("b = " + b);

        b.setValue("부산"); // b의 값을 부산으로 변경

        System.out.println("a =" + address);
        System.out.println("b =" + b);
    }
}
