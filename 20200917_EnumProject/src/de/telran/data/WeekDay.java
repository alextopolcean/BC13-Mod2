package de.telran.data;

public class WeekDay {
    private String titleOfDay;

    public WeekDay(String titleOfDay) {
        this.titleOfDay = titleOfDay;
    }

    public static WeekDay MONDAY = new WeekDay("Понедельник");
    public static WeekDay Tuesday = new WeekDay("Вторник");


    @Override

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "WeekDay{" +
                "titleOfDay='" + titleOfDay + '\'' +
                '}';
    }

    public static void main(String[] args) {
        WeekDay monday = new WeekDay("Понедельник");
        System.out.println(monday);
    }
}
