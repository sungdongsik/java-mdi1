package lang.ex;

public class ImmuableMyDate {

    private final int year;

    private final int month;

    private final int  day;

    public ImmuableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "ImmuableMyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public ImmuableMyDate newYear(int newYear){
        return new ImmuableMyDate(newYear, month, day);
    }

    public ImmuableMyDate newMonth(int newMonth){
        return new ImmuableMyDate(year, newMonth, day);
    }

    public ImmuableMyDate newDay(int newDay){
        return new ImmuableMyDate(year, month, newDay);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
