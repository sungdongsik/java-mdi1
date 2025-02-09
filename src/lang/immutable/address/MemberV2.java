package lang.immutable.address;

public class MemberV2 {

    private String name;

    private ImmntableAddress address;

    public MemberV2(String name, ImmntableAddress address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "MemberV1{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImmntableAddress getAddress() {
        return address;
    }

    public void setAddress(ImmntableAddress address) {
        this.address = address;
    }
}
