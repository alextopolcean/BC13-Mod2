package de.telran.data;

public enum DayOfWeek {
    MONDAY ("пон"),
    TUESDAY ("вт"),
    WEDNESDAY ("ср"),
    THURSDAY ("чет"),
    FRIDAY ("пят"),
    SATURDAY ("суб"),
    SUNDAY ("вос");

    private String title;

    DayOfWeek(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "DayOfWeek{" +
                "title='" + title + '\'' +
                '}' + super.toString();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
