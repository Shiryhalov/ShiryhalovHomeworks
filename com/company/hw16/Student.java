package com.company.hw16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class Student {
    private String name;
    private int group;
    private int course;
    private int[] marks;

    public Student(String name, int group, int course, int[] marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public double avMark() {
        double mark = 0;
        for (int i : getMarks()) {
            mark += i;
        }
        return mark / marks.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return group == student.group &&
                course == student.course &&
                Objects.equals(name, student.name) &&
                Arrays.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(name, group, course);
        result = 31 * result + Arrays.hashCode(marks);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
