package com.company.hw10;

import java.util.Objects;

public class Guitar implements Instrument {
    protected int strings;

    public void play(){
        System.out.println("Играет гитара с " + strings + " струнами");
    }

    public Guitar(int strings) {
        this.strings = strings;
    }

    public Guitar() {
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guitar guitar = (Guitar) o;
        return strings == guitar.strings;
    }

    @Override
    public int hashCode() {

        return Objects.hash(strings);
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "strings=" + strings +
                '}';
    }
}
