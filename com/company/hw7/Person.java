package com.company.hw7;

import java.util.Objects;

public class Person {
    String fullName;
    int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " передвигается");
    }

    public void talk() {
        System.out.println(fullName + " говорит");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(fullName, person.fullName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fullName, age);
    }

    @Override
    public String toString() {
        return String.format("Person: Полное имя %15s, возраст: %3d", fullName, age);
    }
}
