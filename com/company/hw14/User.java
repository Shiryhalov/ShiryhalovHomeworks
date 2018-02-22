package com.company.hw14;

public class User {
    private String login, password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User() {
    }

    public class Query {
        public void printToLog() {
            System.out.printf("User %s with password %s has send a query.\n", login, password);
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

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
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User user = new User("admin", "12344321");
        user.createQuery();

        User.Query query1 = user.new Query();
        query1.printToLog();

        User.Query query2 = new User("sysadmin", "pass1234").new Query();
        query2.printToLog();
    }
}