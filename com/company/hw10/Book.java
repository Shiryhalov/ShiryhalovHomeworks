package com.company.hw10;

public class Book implements Printable {
    private String name;
    private int pages;

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void print() {
        System.out.println("Печать книги " + name + ", страниц: " + pages);
    }

    public static void printBooks(Printable[] printables) {
        for (Printable i : printables) {
            if (i instanceof Book) {
                i.print();
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (pages != book.pages) return false;
        return name != null ? name.equals(book.name) : book.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + pages;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}
