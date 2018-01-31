package com.company.hw12;

public class MinChars {
    public static void main(String[] args) {
        String str = "Люблю изучать Java и111 надеюсь что1 вы11 уже1 выздоровели";
        minChars(str);
    }

    private static void minChars(String str) {
        String[] min = str.split(" ");
        for (String word : str.split(" ")) {
            if (word.length() < min[0].length()) {
                min[0] = word;
            }
        }
        System.out.println(min[0]);
    }
}
