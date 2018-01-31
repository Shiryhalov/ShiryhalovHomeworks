package com.company.hw12;

public class FormatDemo {
    public static void main(String[] args) {
        formatter("Petrov", 5, "physics");
    }
    public static void formatter (String fName, int mark, String subject){
        System.out.printf("%-15s poluchil %-3d po predmetu %-10s", fName, mark, subject);
    }
}
