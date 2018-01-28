package com.company.hw7;

public class ReaderDemo {
    public static void main(String[] args){
        Book book1 = new Book("Война и мир","Л.Н. Толстой");
        Book book2 = new Book("Философия Java","Б. Эккель");
        Book book3 = new Book("Приключения Том Сойера и Гекльберри Финна", "Марк Твен");
        Reader reader1 = new Reader("Иванов В.В.", "01.01.1999", 123123,
                7, 380503123434L);
        Reader reader2 = new Reader("Широкий Д.А.", "12.06.1995", 121212,
                3, 380668329070L);
        Reader reader3 = new Reader("Путин В.В.", "30.11.1959", 344015,
                4, 380998374013L);

        reader1.takeBook(3);
        reader2.takeBook("Энциклопедия", "Три мушкетёра");
        reader2.takeBook(book1, book2);
        reader3.takeBook(book3);
        reader2.returnBook(book1, book2);
    }
}
