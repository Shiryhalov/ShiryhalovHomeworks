package com.company.hw13;

import com.company.hw12.Employee;

import java.util.Date;

public class EmployeeDemo2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Овёс С.Н.", 3300, new Date(1485000000000L));
        Employee employee2 = new Employee("Капитан П.С.", 4500, new Date(1483000000000L));
        Employee employee3 = new Employee("Хвост К.В.", 2100, new Date(1480000000000L));

        Employee[] employees = new Employee[]{employee1, employee2, employee3};

        FullReport.generateFullReport(employees, "ru", "RU");
        System.out.println();
        FullReport.generateFullReport(employees, "en", "US");
    }
}
