package com.company.hw17.internetMarket;

public class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException() {
    }

    @Override
    public String toString() {
        return "WrongLoginException{} " + super.toString();
    }
}
