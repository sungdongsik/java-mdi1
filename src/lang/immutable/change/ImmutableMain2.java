package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj immutableObj = new ImmutableObj(10);

        ImmutableObj add = immutableObj.add(20);

        System.out.println("obj1: " + immutableObj.getValue());
    }
}
