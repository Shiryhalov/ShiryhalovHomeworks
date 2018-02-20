package com.company.hw12;

public class MinChars {
    public static void main(String[] args) {
        String str = "люблю изучать java и11111111 надеюсь что1 вы11 уже1 выздоровели";
        System.out.print("Заданная строка: " + str + "\nСлово с минимальным количеством различных символов: ");
        minChars(str);
    }

    private static void minChars(String str) {
        String[] min = str.split(" ");
        StringBuilder nWord = new StringBuilder();
        String c;
        int diffCh, diffCh1 = str.length();
        for (String word : str.split(" ")) {
            diffCh = 0;
            nWord.setLength(0);
            for (String ch : word.split("")) {
                c = String.valueOf(ch);
                if (nWord.indexOf(c) == -1) {
                    nWord.append(c);
                    diffCh++;
                }
            }
            if (diffCh < diffCh1) {
                diffCh1 = diffCh;
                min[0] = word;
            }
        }
        System.out.println(min[0]);
    }
}
