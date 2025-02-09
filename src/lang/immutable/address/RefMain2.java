package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        ImmntableAddress address = new ImmntableAddress("서울");
        ImmntableAddress b = address; // 참조값 대입을 막을 수 있는 방법이 없다.

        System.out.println("a = " + address);
        System.out.println("b = " + b);

        //b.setValue("부산"); // b의 값을 부산으로 변경
        b = new ImmntableAddress("부산");
        System.out.println("a =" + address);
        System.out.println("b =" + b);
    }
}
