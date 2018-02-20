package com.company.hw13;

import com.company.hw12.Employee;
import java.util.Locale;
import java.util.ResourceBundle;

public class FullReport {
    public static void generateFullReport(Employee[] employees, String language, String country) {
        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("fullReport", current);
        System.out.println(rb.getString("str1"));
        for (Employee i : employees) {
            System.out.printf("%-18s зароботная плата: %8.2f грн, выдана %6s\n", i.getFullName(),
                    i.getSalary(), i.getSalaryDate());
        }
    }
}
