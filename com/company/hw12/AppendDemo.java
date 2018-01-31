package com.company.hw12;

public class AppendDemo {
    public static void main(String[] args) {
        int a = 3, b = 56;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a).append(" + ").append(b).append(" = ").append(a + b);
        stringBuilder.append('\n').append(a).append(" - ").append(b)
                .append(" = ").append(a - b);
        stringBuilder.append('\n').append(a).append(" * ").append(b)
                .append(" = ").append(a * b);
        replaceString(stringBuilder);
        replaceString(stringBuilder);
        replaceString(stringBuilder);

        System.out.println(stringBuilder);
    }

    private static void replaceString(StringBuilder stringBuilder) {
        int pos1;
        while ((pos1 = stringBuilder.indexOf("=")) != -1) {
            stringBuilder.replace(pos1, pos1 + 1, "равно");
        }
    }
}
