package lang.object.tostring;

public class ObjectPrinter {
    public static void print(Object o){
        String string = "객체 정보 출력: " + o.toString();

        System.out.println(string);
    }
}
