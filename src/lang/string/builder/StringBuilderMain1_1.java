package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        
        sb.append('A');
        sb.append('B');
        sb.append('C');
        sb.append('D');
        sb.append('E');

        System.out.println("sb = " + sb);

        sb.insert(4, "JAVA");

        System.out.println("sb = " + sb);

        sb.delete(4, 8);
        System.out.println("sb = " + sb);

        sb.reverse();
        System.out.println("sb = " + sb);

        String string = sb.toString(); // 불변으로 다시 변경 가능
    }
}
