package com.company.hw17.internetMarket;

import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

public class PasswordChecker {
    private Map<String, String> users;

    public PasswordChecker(Map<String, String> users) {
        this.users = users;
    }

    public PasswordChecker() {
    }

    public Map<String, String> getUsers() {
        return users;
    }

    public void setUsers(Map<String, String> users) {
        this.users = users;
    }

    public void downloadUsers() {
        Map<String, String> users1 = new TreeMap<>();
        users1.put("12345", "12345");
        users1.put("RAQ", "777");
        users1.put("Jora147", "8484");
        users1.put("vasya111", "11111");
        users1.put("prikhodkoA", "12101996");
        this.setUsers(users1);
    }

    private boolean findUser(String login, String password) {
        Set<Map.Entry<String, String>> userSet = getUsers().entrySet();
        for (Map.Entry<String, String> i : userSet) {
            if (login.equals(i.getKey()) && password.equals(i.getValue())) {
                return true;
            }
        }
        return false;
    }

    public User checkAuthentication(String login, String password) {
        User user = new User();
        try {
            if (!findUser(login, password)) {
                throw new WrongLoginException("Неверный логин или пароль");
            }
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
            return user;
        }
        user.setLogin(login);
        user.setPassword(password);
        return user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasswordChecker that = (PasswordChecker) o;
        return Objects.equals(users, that.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users);
    }

    @Override
    public String toString() {
        return "PasswordChecker{" +
                "users=" + users +
                '}';
    }
}
