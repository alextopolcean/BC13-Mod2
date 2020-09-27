package de.alextop.application;

import de.alextop.data.Date;


public class DateApp {


    public static void main(String[] args) {


        System.out.println(new Date(2019, 2, 29).dateValidator() + " => " + Date.displayOutDate());
        System.out.println(new Date(2020, 2, 29).dateValidator() + " => " + Date.displayOutDate());
        System.out.println(new Date(2025, 3, 31).dateValidator() + " => " + Date.displayOutDate());
        System.out.println(new Date(2029, 4, 30).dateValidator() + " => " + Date.displayOutDate());
        System.out.println(new Date(2080, 2, 28).dateValidator() + " => " + Date.displayOutDate());
    }
}
