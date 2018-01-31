package com.company.hw12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Latin {
    public static void main(String[] args) {
        String str = "Люблю изучать Java и hope что you are already выздоровели";
        System.out.println(latin(str));
    }

    private static int latin(String str) {
        String stringPattern = "[a-zA-z]+";
        int i = 0;
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            i++;
        }
        return i;
    }
}
