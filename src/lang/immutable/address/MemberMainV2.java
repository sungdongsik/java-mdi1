package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmntableAddress address = new ImmntableAddress("서울");

        MemberV2 memberA = new MemberV2("회원1", address);
        MemberV2 memberB = new MemberV2("회원2", address);


        System.out.println("memberA" + memberA);
        System.out.println("memberB" + memberB);

        // 회원B의 주소를 부산으로 변경해야함
        //memberB.getAddress().setValue("부산");
        memberB.setAddress(new ImmntableAddress("부산"));

        System.out.println("memberA" + memberA);
        System.out.println("memberB" + memberB);

    }
}
