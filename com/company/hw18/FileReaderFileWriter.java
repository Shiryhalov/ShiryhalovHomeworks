package com.company.hw18;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderFileWriter {
    public static void main(String[] args) {
        char[] in = new char[50];
        int size = 0;
        try (FileReader fr = new FileReader("src/com/company/hw18/fileWrite.txt");
             FileWriter fw = new FileWriter("src/com/company/hw18/fileReaderFileWriter.txt")) {

            size = fr.read(in); // read the whole file!
            for (int i = 0; i < size; i++) {
                fw.write(in[i]);
            }


        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
