package de.telran.application;

import de.telran.data.DayOfWeek;
import de.telran.data.Schedule;
import de.telran.data.WeekDay;

import java.util.Arrays;

public class EnumApp {
    public static void main(String[] args) {
        WeekDay weekDay = WeekDay.MONDAY;
        //System.out.println(weekDay);

        DayOfWeek monday = DayOfWeek.MONDAY;
        System.out.println(monday.MONDAY.ordinal());
        System.out.println(DayOfWeek.FRIDAY.ordinal());
        System.out.println(Arrays.toString(DayOfWeek.values()));
        System.out.println(monday.getTitle());
        System.out.println(DayOfWeek.FRIDAY.getTitle());

        Schedule schedule = new Schedule(DayOfWeek.MONDAY);
        schedule.wekeUp();
        schedule.getMenu();

        Schedule[]schedules = new Schedule[]{ new Schedule(DayOfWeek.MONDAY),new Schedule (DayOfWeek.TUESDAY),new Schedule (DayOfWeek.WEDNESDAY),
                new Schedule (DayOfWeek.THURSDAY), new Schedule (DayOfWeek.FRIDAY),new Schedule (DayOfWeek.SATURDAY),new Schedule (DayOfWeek.SUNDAY)};
        for (Schedule s: schedules){
            s.getMenu();
        }

    }
}
