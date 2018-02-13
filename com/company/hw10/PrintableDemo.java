package com.company.hw10;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable book1 = new Book("safs", 230);
        Printable book2 = new Book("dsfsad", 300);
        Printable book3 = new Book("hthgb", 183);
        Printable magazine1 = new Magazine("sdsaf", 40);
        Printable magazine2 = new Magazine("mkkf", 38);

        Printable[] printables = new Printable[]{book1, book2, book3, magazine1, magazine2};

        for (Printable i : printables) {
            i.print();
        }

        System.out.println();
        Book.printBooks(printables);
        System.out.println();
        Magazine.printMagazines(printables);
    }
}
