package com.company.hw12;

import com.company.MethodsForWork;

public class MiddleString {
    public static void middle(String str){
        System.out.println(str.substring((str.length()/2)-1, (str.length()/2)+1));
    }

    public static void main(String[] args){
        String str1 = "string", str2 = "code", str3 = "Practice";
        MiddleString.middle(str1);
        MiddleString.middle(str2);
        MiddleString.middle(str3);
    }
}
