package com.company.hw12;

public class Report {
    public static void generateReport(Employee[] employees) {
        for (Employee i : employees) {
            System.out.printf("%-18s зароботная плата: %8.2f грн\n", i.getFullName(),
                    i.getSalary());
        }
    }
}
