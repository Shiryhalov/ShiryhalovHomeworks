package com.company.hw16;

import java.util.Set;
import java.util.TreeSet;
import java.util.regex.*;

public class RepeatingElements {
    public static void main(String[] args) {
        String numbers = new String("1, 2, 3, 4, 4, 5, 5, 6, 7, 7, 1, 10");
        Set<Integer> result = removeRepeatingNumbers(numbers);
        for (Integer i : result) {
            System.out.print(i + " ");
        }
    }

    private static Set removeRepeatingNumbers(String string) {
        Pattern pat = Pattern.compile(", ");
        String[] numbers = pat.split(string);
        Set<Integer> set = new TreeSet<>();
        for (String s : numbers) {
            set.add(Integer.valueOf(s));
        }
        return set;
    }
}
