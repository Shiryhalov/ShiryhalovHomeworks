package com.company.hw12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554";
        System.out.println("Заданная строка:\n" + str + "\n\n"
                + "Слова-палиндромы, состоящие только из цифр:");
        isPalindrome(str);
    }

    private static void isPalindrome(String str) {
        String stringPattern = "\\d{3,}";
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            if (str.substring(matcher.start(), matcher.end())
                    .equals(new StringBuilder(str.substring(matcher.start(), matcher.end()))
                            .reverse().toString())) {
                System.out.println(str.substring(matcher.start(), matcher.end()));
            }
        }
    }
}
