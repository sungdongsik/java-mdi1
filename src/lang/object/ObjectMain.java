package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        String dstring = child.toString();
        System.out.println(dstring);
    }
}
