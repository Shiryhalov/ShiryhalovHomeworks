package com.company.hw12;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Овёс С.Н.", 3300);
        Employee employee2 = new Employee("Капитан П.С.", 4500);
        Employee employee3 = new Employee("Хвост К.В.", 2100);

        Employee[] employees = new Employee[]{employee1, employee2, employee3};

        Report.generateReport(employees);
    }
}
