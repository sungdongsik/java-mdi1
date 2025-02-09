package lang.immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address address = new Address("서울");
        Address b = address;

        System.out.println("a = " + address);
        System.out.println("b = " + b);

        change(b, "부산");

        System.out.println("a =" + address);
        System.out.println("b =" + b);
    }

    private static void change(Address address , String changeAddress){
        System.out.println("줏고 값을 변경 ->" + changeAddress);
        address.setValue(changeAddress);
    }
}
