package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        String numString = String.valueOf(num);
        System.out.println("num:" + numString);
        String boolString = String.valueOf(bool);
        System.out.println("bool: " + boolString);
        String objString = String.valueOf(obj);
        System.out.println("obj" + objString);

        String numString2 = "" + num;
        System.out.println("빈문자열 + num: " + numString2);


        // toCharArray 메서드
        char[] strCharAaary = str.toCharArray();
        for (char c : strCharAaary){
            System.out.print(c);
        }
    }
}
