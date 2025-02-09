package lang.ex;

public class ImmuableMyDateMain {
    public static void main(String[] args) {

        ImmuableMyDate immuableMyDate = new ImmuableMyDate(2024, 1, 1);
        ImmuableMyDate immuableMyDate2 = immuableMyDate;
        System.out.println("date= " + immuableMyDate);

        immuableMyDate = immuableMyDate2.newYear(2025);
        System.out.println("add= " + immuableMyDate);
    }
}
