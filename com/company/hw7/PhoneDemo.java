package com.company.hw7;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone asus = new Phone(380668323932L, "Asus ZenFone 2", 0.2);
        Phone apple = new Phone(380504459070L, "Apple Iphone X", 0.2);
        Phone lenovo = new Phone(380997723132L, "Lenovo A6000", 0.2);

        asus.receiveCall("Ваня Сбербанк");
        System.out.println(apple.getNumber());
        lenovo.receiveCall("Василий Сухофрукты", 380661431415L);
        asus.sendMessage(380504459070L, 380997723132L, 380661431415L, 380501435675L);
        System.out.println("\nСоздано телефонов: " + Phone.counter);
    }
}

