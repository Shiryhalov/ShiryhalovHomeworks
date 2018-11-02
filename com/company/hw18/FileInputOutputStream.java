package com.company.hw18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class FileInputOutputStream {
    public static void main(String[] args) {
        try (OutputStream output = new FileOutputStream("src/io/a.txt");
             InputStream input = new FileInputStream("src/io/a.txt")) {
            char[] c = {'a', 'b', 'c'};
            // Создание текстового файла

            for (char i : c) {
                // Запись каждого символа в текстовый файл
                output.write(i);
            }


            int size = input.available();

            for (int j = 0; j < size; j++) {
                // Чтение текстового файла посимвольно
                System.out.print((char) input.read() + " ");
            }

        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}

