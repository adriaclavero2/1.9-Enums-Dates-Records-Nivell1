package Ex1_Enums;

public class WhatDay {

    public static void printDayType(WeekDays day) {
        if (day.isWeekend()) {
            System.out.println(day + " → Weekend");
        } else {
            System.out.println(day + " → Weekday");
        }
    }
}