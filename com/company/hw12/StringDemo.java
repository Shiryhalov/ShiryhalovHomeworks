package com.company.hw12;

public class StringDemo {
    public static void checkString(String s) {
        System.out.println(s.endsWith("!!!"));
        System.out.println(s.startsWith("I like"));
        System.out.println(s.charAt(s.length() - 1));
        System.out.println(s.lastIndexOf("Java"));
    }

    public static void main(String[] args) {
        String s = "I like Java!!!";
        String s1 = "I hate c++";
        checkString(s);
        System.out.println(" ");
        checkString(s1);
        System.out.println(" ");
        System.out.println(s.replace('a', 'o'));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.substring(7, 11));
    }
}
