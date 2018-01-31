package com.company.hw8;

import java.util.Objects;

public class Aspirant extends Student{
    private String work;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String work) {
        super(firstName, lastName, group, averageMark);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getScholarship(){
        if (getAverageMark()==5){
            return 200;
        }
        else return 180;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aspirant aspirant = (Aspirant) o;
        return Objects.equals(work, aspirant.work);
    }

    @Override
    public int hashCode() {

        return Objects.hash(work);
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "work='" + work + '\'' +
                '}';
    }
}
