package com.company.hw7;

import java.util.Objects;

public class Reader {
    String fullName,bornDate;
    int readerNumber, faculticy;
    long number;

    public Reader(String fullName, String bornDate, int readerNumber, int faculticy, long number) {
        this.fullName = fullName;
        this.bornDate = bornDate;
        this.readerNumber = readerNumber;
        this.faculticy = faculticy;
        this.number = number;
    }

    public Reader() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBornDate() {
        return bornDate;
    }

    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }

    public int getReaderNumber() {
        return readerNumber;
    }

    public void setReaderNumber(int readerNumber) {
        this.readerNumber = readerNumber;
    }

    public int getFaculticy() {
        return faculticy;
    }

    public void setFaculticy(int faculticy) {
        this.faculticy = faculticy;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void takeBook(){
        System.out.println(this.fullName + " взял книгу");
    }

    public void takeBook(int books){
        System.out.println(this.fullName + " взял " + books + " книги");
    }

    public void takeBook(String... arg) {
        System.out.println(this.fullName + " взял книги: ");
        for (String x : arg) {
            System.out.print(x + ", ");
        }
        System.out.println(" ");
    }

    public void takeBook(Book... arg){
        System.out.println(this.fullName + " взял книги: ");
        for (Book x : arg) {
            System.out.print(x.getName() + ", ");
        }
        System.out.println(" ");
    }

    public void returnBook(){
        System.out.println(this.fullName + "вернул книгу");
    }

    public void returnBook(int books){
        System.out.println(this.fullName + " вернул " + books + " книги");
    }

    public void returnBook(Book... arg){
        System.out.println(this.fullName + " вернул книги: ");
        for (Book x : arg) {
            System.out.print(x.getName() + ", ");
        }
        System.out.println(" ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return readerNumber == reader.readerNumber &&
                faculticy == reader.faculticy &&
                number == reader.number &&
                Objects.equals(fullName, reader.fullName) &&
                Objects.equals(bornDate, reader.bornDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fullName, bornDate, readerNumber, faculticy, number);
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fullName='" + fullName + '\'' +
                ", bornDate='" + bornDate + '\'' +
                ", readerNumber=" + readerNumber +
                ", faculticy=" + faculticy +
                ", number=" + number +
                '}';
    }
}
