package com.company.hw13;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class BirthDay {
    public static void main(String[] args){
        Calendar calendar = new GregorianCalendar(1995, 2, 13);
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(dateFormat.format(calendar.getTime()));
        System.out.println("Количество прожитых милисекунд: " + calendar.getTimeInMillis());
        dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(dateFormat.format(calendar.getTime()));
        dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(dateFormat.format(calendar.getTime()));
        dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(dateFormat.format(calendar.getTime()));
    }
}