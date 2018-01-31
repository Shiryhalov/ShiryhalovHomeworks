package com.company.hw12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaVersions {
    public static void main(String[] args) {
        String regex = "Java\\s+\\d";
        int i=1;
        String s = "Versions: Java 5, Java6, Java  7, Java 8";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println("version " + i + ": " + matcher.group());
            i++;
        }
    }
}
