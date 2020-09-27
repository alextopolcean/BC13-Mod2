package de.alextop.data;

public class Date {
    public static int year;
    public static int month;
    public static int day;


    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;

    }

    public boolean evenMonth() {
        if (month % 2 == 0) {
            return true;
        }
        return false;
    }

    public boolean day() {
        if ((day <= 30 && evenMonth()) || (day <= 31 && !evenMonth())) {
            return true;
        }
        return false;
    }

    public boolean year() {
        if (year > 0 && year <= 2900) {
            return true;
        }
        return false;
    }

    private boolean leapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else return year % 4 == 0 || year % 100 == 0;
    }

    public boolean month() {
        if (month > 0 && month <= 12) {
            return true;
        }
        return false;
    }

    public boolean monthFebruary() {
        if (day <= 29 && leapYear(year)) {
            return true;
        }
        if (day <= 28 && !leapYear(year)) {
            return true;
        }
        return false;
    }

    public boolean dateValidator() {
        if (month == 2) {
            return year() && monthFebruary() && day();
        } else {
            return year() && month() && day();
        }
    }

    public static String displayOutDate() {
        return year + "/" + month + "/" + day;

    }
}
