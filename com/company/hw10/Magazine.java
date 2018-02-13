package com.company.hw10;

public class Magazine implements Printable {
    private String name;
    private int pages;

    public Magazine(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public Magazine() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void print() {
        System.out.println("Печать журнала " + name + ", страниц: " + pages);
    }

    public static void printMagazines(Printable[] printables) {
        for (Printable i : printables) {
            if (i instanceof Magazine) {
                i.print();
            }
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Magazine)) return false;

        Magazine magazine = (Magazine) o;

        if (pages != magazine.pages) return false;
        return name != null ? name.equals(magazine.name) : magazine.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + pages;
        return result;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}
