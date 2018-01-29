package com.company.hw8;

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
}
