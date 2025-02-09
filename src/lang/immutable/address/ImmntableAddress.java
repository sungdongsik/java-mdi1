package lang.immutable.address;

public class ImmntableAddress {
    private final String value;

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }

    public ImmntableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
