package com.company.hw13;

import java.util.Arrays;

import com.company.hw12.Employee;

public class Metainf {
    public static void main(String[] args) {
        Class employeeClass = Employee.class;
        System.out.println("Class name " + employeeClass.getName());
        System.out.println("Declared Constructors: "
                + Arrays.toString(employeeClass.getDeclaredConstructors()));
        System.out.println("Constructors: "
                + Arrays.toString(employeeClass.getConstructors()));
        System.out.println("Declared Methods: "
                + Arrays.toString(employeeClass.getDeclaredMethods()));
        System.out.println("Methods: "
                + Arrays.toString(employeeClass.getMethods()));
        System.out.println("Declared Fields: "
                + Arrays.toString(employeeClass.getDeclaredFields()));
        System.out.println("Fields: "
                + Arrays.toString(employeeClass.getFields()));
    }
}
