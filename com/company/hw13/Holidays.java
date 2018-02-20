package com.company.hw13;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Holidays {
    public static void main(String[] args){
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Calendar [] holidays = {new GregorianCalendar(2017, 0, 7),
                new GregorianCalendar(2017, 1, 14),
                new GregorianCalendar(2017, 1, 23)};
        System.out.println("Ближайшие праздники: ");
        for (Calendar a : holidays){
            System.out.println(dateFormat.format(a.getTime()));
        }
    }
}
