package com.company.hw17.lesson;

public class LoginExample {
    public static void main(String[] args) {
        System.out.println(CheckPassword("12345678", "111111", "111111"));
        System.out.println(CheckPassword("12345678", "111111", "111112"));
        System.out.println(CheckPassword("123456789123456789000", "111111",
                "111111"));
    }

    private static boolean CheckPassword(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Неверный логин");
            }
            if (password.length() > 20 || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Неверный пароль");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            System.out.printf("Логин %s, пароль %s%n", login, password);
        }
        return true;
    }
}
