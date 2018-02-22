package com.company.hw14;

public class User2 {
    private final String login = "login", password = "password";

    public User2() {

    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void createQuery() {
        class Query {
            public void printToLog() {
                System.out.printf("User %s with password %s has send a query.", login, password);
            }
        }
        Query query = new Query();
        query.printToLog();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User2 user = (User2) o;

        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        return !(password != null ? !password.equals(user.password) : user.password != null);

    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User2{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User2 user = new User2();
        user.createQuery();
    }
}