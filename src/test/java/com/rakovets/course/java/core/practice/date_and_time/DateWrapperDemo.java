package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.Locale;

public class DateWrapperDemo {
    public static void main(String[] args) {
        LocalDate date1 = DateWrapper.getDate(2020, 12, 25);
        System.out.println("LocalDate: " + date1);

        LocalDate date2 = DateWrapper.getChangeLocalDate(date1, 15);
        System.out.println("LocalDate + countMonths: " + date2);

        LocalDate date3 = DateWrapper.getDate(2021, 05, 02);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM, dd, yyyy", Locale.UK);
        String date = DateWrapper.getLocalDateToStringFormat(date3, formatter);
        System.out.println("StringFormatLocalDate: " + date);

        String text = "June, 08, 2020";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MMMM, dd, yyyy", Locale.UK);
        LocalDate date4 = DateWrapper.getStringFormatToLocalDate(text, formatter1);
        System.out.println("StringFormat to LocalDate : " + date4);

        long date5 = DateWrapper.getNumberOfDays(date4, date1);
        System.out.printf("NumberOfDays: %d\n", date5);

        Temporal date6 = DateWrapper.adjustInto(date1, 21);
        System.out.println(date6);

        Temporal date7 = DateWrapper.adjustInto(LocalDate.of(2020, 07, 01));
        System.out.println(date7);
    }
}
