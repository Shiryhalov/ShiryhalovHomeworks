package com.company.hw18;

import java.io.*;

public class BufferedFileCopying {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src\\io\\file.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("src/io/fileOut.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                bw.write(s);
                bw.newLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
