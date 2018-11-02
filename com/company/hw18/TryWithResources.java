package com.company.hw18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) throws IOException {

        try (FileInputStream fileIn = new FileInputStream("src\\com\\company\\hw18\\file.txt");
             FileOutputStream fileOut = new FileOutputStream("src\\com\\company\\hw18\\copied_file.txt")) {


            int a;
            // Копирование содержимого файла file.txt
            while ((a = fileIn.read()) != -1) {
                // Чтение содержимого файла file.txt и запись в copied_file.txt
                fileOut.write(a);
            }
        }
    }
}
