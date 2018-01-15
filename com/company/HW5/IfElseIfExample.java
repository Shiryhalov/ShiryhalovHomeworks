package com.company.HW5;

public class IfElseIfExample {
    public static void main(String[] args) {
        String str = args.length > 0 ? args[0] : "5";
        if ("1".equals(str)) {
            System.out.println("Monday");
        } else if ("2".equals(str)) {
            System.out.println("Tuesday");
        } else if ("3".equals(str)) {
            System.out.println("Wednesday");
        } else if ("4".equals(str)) {
            System.out.println("Thursday");
        } else if ("5".equals(str)) {
            System.out.println("Friday");
        } else if ("6".equals(str) || "7".equals(str)) {
            System.out.println("Weekend");
        } else {
            System.out.println("Something wrong");
        }
    }
}
