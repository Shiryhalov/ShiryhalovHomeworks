package com.company.hw12;

import java.util.Date;
import java.util.Objects;
import java.text.DateFormat;

public class Employee {
    private String fullName;
    private double salary;
    private Date salaryDate;

    public Employee(String fullName, double salary, Date salaryDate) {
        this.fullName = fullName;
        this.salary = salary;
        this.salaryDate = salaryDate;
    }

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSalaryDate() {
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        return dateFormat.format(salaryDate.getTime());
    }

    public void setSalaryDate(Date salaryDate) {
        this.salaryDate = salaryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary &&
                Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fullName, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", salaryDate=" + salaryDate +
                '}';
    }
}
