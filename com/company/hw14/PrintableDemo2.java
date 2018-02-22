package com.company.hw14;

import com.company.hw10.Printable;

public class PrintableDemo2 {
    public static void main(String[] args){
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Print in a color.");
            }
        };
        printable.print();
    }
}
