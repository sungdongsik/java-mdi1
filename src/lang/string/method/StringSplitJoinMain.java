package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple, Banana,Orange";

        String[] spliStr = str.split(",");

        for (String a : spliStr){
            System.out.println("a: " + a);
        }

        String joinStr = "";
        for (String string : spliStr){
            System.out.println(string);
        }

        for(int i = 0; i < spliStr.length; i++){
            String s = spliStr[i];
            joinStr += s;
            if(i != spliStr.length - 1){
                joinStr += "-";
            }
        }

        System.out.println("join: " + joinStr);

        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println(joinedStr);

        String result = String.join("-", joinedStr);
        System.out.println("result: " + result);
    }
}
