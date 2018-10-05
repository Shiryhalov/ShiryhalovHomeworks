package com.company.hw16;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ширыхалов Д.", 335, 4, new int[]{5, 3, 4, 4, 4}));
        students.add(new Student("Тупков А.", 331, 1, new int[]{2, 3, 2, 1, 5}));
        students.add(new Student("Приходько А.", 645, 5, new int[]{5, 5, 4, 5, 5}));
        students.add(new Student("Назаров В.", 335, 4, new int[]{3, 3, 5, 4, 4}));
        students.add(new Student("Тарасов А.", 412, 2, new int[]{2, 3, 2, 1, 4}));
        List<Student> goodStudents = nextCourse(students);
        printStudents(goodStudents, 5);
    }

    public static List<Student> nextCourse (List students) {
        List<Student> studentList = new ArrayList<>();
        ListIterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.avMark() >= 3) {
                student.setCourse(student.getCourse() + 1);
                studentList.add(student);
            }
        }
        return studentList;
    }

    public static List<Student> printStudents(List students, int course) {
        List<Student> studentList = new ArrayList<>();
        ListIterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                studentList.add(student);
                System.out.println(student);
            }
        }
        return studentList;
    }
}
