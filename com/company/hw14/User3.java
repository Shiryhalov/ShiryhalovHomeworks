package com.company.hw14;

public class User3 {
    private static String login, password;

    static {
        login = "login";
        password = "password";
    }

    public User3() {
    }

    public static class Query {
        public void printToLog() {
            System.out.printf("User %s with password %s has send a query.\n", login, password);
        }
    }

    public static String getLogin() {
        return login;
    }

    public static String getPassword() {
        return password;
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User3{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User3.Query query1 = new User3.Query();
        query1.printToLog();

        Query query2 = new Query();
        query2.printToLog();
    }
}
