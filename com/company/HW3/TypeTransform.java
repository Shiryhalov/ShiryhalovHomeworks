package com.company.HW3;

public class TypeTransform {
    /**
     * Преобразования byte to ...
     */
    public static short byteToShort(byte a) {
        short b;
        b = a;
        return b;
    }

    public static char byteToChar(byte a) {
        char b;
        b = (char) a;
        return b;
    }

    public static int byteToInt(byte a) {
        int b;
        b = a;
        return b;
    }

    public static long byteToLong(byte a) {
        long b;
        b = a;
        return b;
    }

    public static float byteToFloat(byte a) {
        float b;
        b = a;
        return b;
    }

    public static double byteToDouble(byte a) {
        double b;
        b = a;
        return b;
    }

    /**
     * Преобразования short to ...
     */
    public static byte shortToByte(short a) {
        byte b;
        b = (byte) a;
        return b;
    }

    public static char shortToChar(short a) {
        char b;
        b = (char) a;
        return b;
    }

    public static int shortToInt(short a) {
        int b;
        b = a;
        return b;
    }

    public static long shortToLong(short a) {
        long b;
        b = a;
        return b;
    }

    public static float shortToFloat(short a) {
        float b;
        b = a;
        return b;
    }

    public static double shortToDouble(short a) {
        double b;
        b = a;
        return b;
    }

    /**
     * Преобразования char to ...
     */
    public static byte charToByte(char a) {
        byte b;
        b = (byte) a;
        return b;
    }

    public static short charToShort(char a) {
        short b;
        b = (short) a;
        return b;
    }

    public static int charToInt(char a) {
        int b;
        b = a;
        return b;
    }

    public static long charToLong(char a) {
        long b;
        b = a;
        return b;
    }

    public static float charToFloat(char a) {
        float b;
        b = a;
        return b;
    }

    public static double charToDouble(char a) {
        double b;
        b = a;
        return b;
    }

    /**
     * Преобразования int to ...
     */
    public static byte intToByte(int a) {
        byte b;
        b = (byte) a;
        return b;
    }

    public static short intToShort(int a) {
        short b;
        b = (short) a;
        return b;
    }

    public static char intToChar(int a) {
        char b;
        b = (char) a;
        return b;
    }

    public static long intToLong(int a) {
        long b;
        b = a;
        return b;
    }

    public static float intToFloat(int a) {
        float b;
        b = a;
        return b;
    }

    public static double intToDouble(int a) {
        double b;
        b = a;
        return b;
    }

    /**
     * Преобразования long to ...
     */
    public static byte longToByte(long a) {
        byte b;
        b = (byte) a;
        return b;
    }

    public static short longToShort(long a) {
        short b;
        b = (short) a;
        return b;
    }

    public static char longToChar(long a) {
        char b;
        b = (char) a;
        return b;
    }

    public static int longToInt(long a) {
        int b;
        b = (int) a;
        return b;
    }

    public static float longToFloat(long a) {
        float b;
        b = a;
        return b;
    }

    public static double longToDouble(long a) {
        double b;
        b = a;
        return b;
    }

    /**
     * Преобразования float to ...
     */
    public static byte floatToByte(float a) {
        byte b;
        b = (byte) a;
        return b;
    }

    public static short floatToShort(float a) {
        short b;
        b = (short) a;
        return b;
    }

    public static char floatToChar(float a) {
        char b;
        b = (char) a;
        return b;
    }

    public static int floatToInt(float a) {
        int b;
        b = (int) a;
        return b;
    }

    public static long floatToLong(float a) {
        long b;
        b = (long) a;
        return b;
    }

    public static double floatToDouble(float a) {
        double b;
        b = a;
        return b;
    }

    /**
     * Преобразования double to ...
     */
    public static byte doubleToByte(double a) {
        byte b;
        b = (byte) a;
        return b;
    }

    public static short doubleToShort(double a) {
        short b;
        b = (short) a;
        return b;
    }

    public static char doubleToChar(double a) {
        char b;
        b = (char) a;
        return b;
    }

    public static int doubleToInt(double a) {
        int b;
        b = (int) a;
        return b;
    }

    public static long doubleToLong(double a) {
        long b;
        b = (long) a;
        return b;
    }

    public static double doubleToFloat(double a) {
        float b;
        b = (float) a;
        return b;
    }

    public static void main(String[] arg) {
        byte b = 100;
        short s = 1450;
        char c = 'C';
        int i = 13;
        long l = 1834502;
        float f = 234.5f;
        double d = 3.4;
        System.out.println("Результат работы byte to...:");
        System.out.println(byteToShort(b));
        System.out.println(byteToChar(b));
        System.out.println(byteToDouble(b));
        System.out.println(byteToFloat(b));
        System.out.println(byteToInt(b));
        System.out.println(byteToLong(b));
        System.out.println("\nРезультат работы short to...:");
        System.out.println(shortToByte(s));
        System.out.println(shortToChar(s));
        System.out.println(shortToDouble(s));
        System.out.println(shortToFloat(s));
        System.out.println(shortToInt(s));
        System.out.println(shortToLong(s));
        System.out.println("\nРезультат работы char to...:");
        System.out.println(charToByte(c));
        System.out.println(charToDouble(c));
        System.out.println(charToFloat(c));
        System.out.println(charToInt(c));
        System.out.println(charToLong(c));
        System.out.println(charToShort(c));
        System.out.println("\nРезультат работы int to...:");
        System.out.println(intToByte(i));
        System.out.println(intToChar(i));
        System.out.println(intToDouble(i));
        System.out.println(intToFloat(i));
        System.out.println(intToLong(i));
        System.out.println(intToShort(i));
        System.out.println("\nРезультат работы long to...:");
        System.out.println(longToByte(l));
        System.out.println(longToChar(l));
        System.out.println(longToDouble(l));
        System.out.println(longToFloat(l));
        System.out.println(longToInt(l));
        System.out.println(longToShort(l));
        System.out.println("\nРезультат работы float to...:");
        System.out.println(floatToByte(f));
        System.out.println(floatToChar(f));
        System.out.println(floatToDouble(f));
        System.out.println(floatToInt(f));
        System.out.println(floatToLong(f));
        System.out.println(floatToShort(f));
        System.out.println("\nРезультат работы double to...:");
        System.out.println(doubleToInt(d));
        System.out.println(doubleToByte(d));
        System.out.println(doubleToChar(d));
        System.out.println(doubleToFloat(d));
        System.out.println(doubleToLong(d));
        System.out.println(doubleToShort(d));
    }
}
