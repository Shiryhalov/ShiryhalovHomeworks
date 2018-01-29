package com.company.hw8;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student("Curt", "Cobain", "A", 5);
        Aspirant aspirant1 = new Aspirant("Curt", "Cobain", "A", 4, "Work1");
        Student aspirant2 = new Aspirant("Curt", "Cobain", "A", 5, "Work1");
        System.out.println(student.getFirstName() + " " + student.getLastName());
        System.out.println(aspirant1.getFirstName() + " " + aspirant1.getLastName() + " " + aspirant1.getWork());
        System.out.println(aspirant2.getFirstName() + " " + aspirant2.getLastName());
        Student[] students = {student, aspirant1, aspirant2};
        for (Student student1 : students) {
            System.out.println(student1.getScholarship());
        }
        System.out.println(student.toString());
    }
}
